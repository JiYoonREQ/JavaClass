package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Handler;

public class BasicException {
    public static void main(String[] args){
        //uncheckedException(null);
        //checkedException();

        String id = null;

        try{validate(id);}
        catch(Exception e){e.getMessage();}
    }

    private static void validate(String id) throws Exception {

        try {
            if (id == null || "".equals(id)) {
                Exception e = new Exception("ID를 입력하세요.");
                throw e;
            }
            if (id.length() < 8) {
                throw new Exception("8자 이상 입력하세요.");
            }
    }
        catch(Exception e){
            e.getMessage(); ////////////////////얘 왜  처리가 안돼는데
            throw e;
        }
    }

    //컴파일러가 강제적으로 예외처리를 요구 않함
    private static void uncheckedException(String s) {

        try {
            System.out.println(s.length()); //NullPointerException 객체 생성'
            System.out.println(Integer.parseInt("123a"));
        } catch(NullPointerException npe) {
            System.out.println("문자열이 입력되지 않았습니다.");
            npe.printStackTrace();
        } catch(NumberFormatException nfe)
        {
            System.out.println("숫자를 입력하세요");
        } catch(Exception e)
        {
            System.out.println("알 수 없는 오류 발생");
        }
    }
    private static void checkedException() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String str;
            while((str = br.readLine())!= null)
            {
                System.out.println(str);
            }
        }catch(FileNotFoundException fnfe)
        {
            System.out.println("파일이 없음");
        }catch(IOException  ioe)
        {
            System.out.println("파일 읽기 중 오류");
        }
    }
}
