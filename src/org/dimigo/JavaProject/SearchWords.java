package org.dimigo.JavaProject;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SearchWords {

    public static void doInformationFind()  {
        try {
            System.out.println("필요한 단어를 입력하십시오.");
            //다른언어와 한국어를 백과사전에 찾게함
            Scanner sc = new Scanner(System.in);
            String text;
            while( ("").equals(text=sc.nextLine()) );

            String changedText = NaverTranslator.getTranslatedWords(text);
            System.out.println(findInformation(text));
            if (changedText != text)
                System.out.println(findInformation(changedText)); //changed==text일때는 text가 한국어또는 모르는 언어일때
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("오류 발생");
        }
    }

    private static String findInformation(String words) throws Exception {

        String clientId = "QMRXJw8dimyqrirTa9Tx";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "16LbSspLb1";//애플리케이션 클라이언트 시크릿값";
        StringBuffer response = new StringBuffer();


        try {

            String query = URLEncoder.encode(words, "UTF-8");

            String apiURL = "https://openapi.naver.com/v1/search/encyc.json?query="+query;
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            //System.out.println(response.toString());

        } catch (Exception e) {
        }

        System.out.printf(words+" : ");
        String s;
        try {
            s = parseInformation(response.toString());
        }catch(Exception e)
        {
            s="검색 결과 없음 ";
        }
        return s;
    }
    private static String parseInformation(String json) throws Exception
    {
            Map<String, Object> map = new ObjectMapper().readValue(json, Map.class);
            List<Map<String, String>> list= (List<Map<String,String>>)map.get("items");

            StringBuilder sb = new StringBuilder("\n");
            boolean hasData=false;

            int i=0;


            for(Map<String, String> information : list)
            {

            String description = information.get("description").replaceAll("&#60;","").replaceAll("&#62;","").replaceAll("\\<.*?>","").replaceAll("&quot;","").replace("[","").replace("]","");
            if( !("ko".equals(DetectLangs.getLanguage(description) )) ) continue; //설명이 한국어가 아닐때 다음
            String link = information.get("link");

            hasData=true;
            sb.append("\t"+description+"\n").append("\t\t\t\t\t"+link+"\n");

            ++i; if(i==3) break; //3개만 출력하게
        }
        if(!hasData) return "검색 결과 없음 "; //검색결과가 없을때

        return sb.toString();
    }
}
