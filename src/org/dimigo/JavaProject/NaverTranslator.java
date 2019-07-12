package org.dimigo.JavaProject;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.net.URL;
import java.util.Map;

public class NaverTranslator {

    public static String getTranslatedWords(String words) throws Exception{
        String clientId = "E5vLpHXR1eswsLAaTlBw";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "oVC7Dj4Ipe";//애플리케이션 클라이언트 시크릿값";
        StringBuffer response = new StringBuffer();
        try {
           // String words = "Hello everyone, my name is John Cena.";
            //String words = "ありがとうございます。";
           // String words = "здраствуйте ";
           // String words = "*"; //word가 공백일때도 생각
            String detectLanguage = DetectLangs.getLanguage(words);
            if("ko".equals(detectLanguage)) return words; //한국어일 때 나감
            if("unk".equals(detectLanguage)) return words; //아무것도아닐 때 나감

            String text = URLEncoder.encode(words, "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            // post request
            String postParams = "source="+detectLanguage+"&target=ko&text="+text;

            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(postParams);
            wr.flush();
            wr.close();
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

        } catch (Exception e) {
            //System.out.println(e); //탐지 불가 언어일때
        }

        //파싱이 제대로 안됏네
        return parseMeaning(response.toString());
    }
    private static String parseMeaning(String json)
    {
        try {
            Map<String, Object> map = new ObjectMapper().readValue(json, Map.class);
            Map<String, Object> map2 = (Map<String, Object>)map.get("message");
            Map<String, Object> map3 = (Map<String, Object>)map2.get("result");
            return map3.get("translatedText").toString();

        }catch(IOException e)
        {
            return ".";
        }
    }
}