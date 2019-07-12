package org.dimigo.JavaProject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class DetectLangs {

    public static String getLanguage(String text) throws Exception {
        String clientId = "E5vLpHXR1eswsLAaTlBw";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "oVC7Dj4Ipe";//애플리케이션 클라이언트 시크릿값";
        StringBuffer response = new StringBuffer();
        try {
            String query;
            if("".equals(text)) query = URLEncoder.encode("Hello everyone, my name is John Cena.", "UTF-8");
            query = URLEncoder.encode(text, "UTF-8");

            String apiURL = "https://openapi.naver.com/v1/papago/detectLangs";
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            // post request
            String postParams = "query=" + query;
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
           // System.out.println(e);
        }

        return parseLangCode(response.toString()); // 친것의 언어 종류를 NaverTranslator에 보냄

    }

    private static String parseLangCode(String json) throws Exception {

        String langCode = json.replaceAll("\\{\"langCode\"[:]\"","");
               langCode = langCode.replaceAll("\"\\}","");
        return langCode;
    }
}