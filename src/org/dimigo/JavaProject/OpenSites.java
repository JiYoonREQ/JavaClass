package org.dimigo.JavaProject;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class OpenSites {
    public static void openWebSite() {

        try {
            Scanner sc = new Scanner(System.in);
            boolean isFinished = false;

            StringBuilder dummy=new StringBuilder(); //이상한 URL을 제거하여 파일을 다시 쓰기 위해 사용
            BufferedReader br = new BufferedReader(new FileReader("src\\org\\dimigo\\JavaProject\\sites.txt"));
            dummy.append(br.readLine()+"\n"); dummy.append(br.readLine()+"\n");

            String[] str = new String[1000];
            URI[] uri = new URI[1000];
            int line=0;
            StringBuilder sb=new StringBuilder(); //직접찾기 메뉴의 문자열을 담음

            for(; (str[line]=br.readLine())!=null;) //잘못된 url을 잡음 + sb에 텍스트를 입력함
            {
                String[] uriString = str[line].split(" ");
                try {
                    uri[line] = new URI(uriString[0]);

                    URL url= uri[line].toURL();
                    url.openConnection().connect();

                    if(uriString.length<=1) {continue;} //url에 대응하는 제목이 없는 경우 넘어감

                    dummy.append(str[line]+"\n");

                    sb.append(""+line+" : "+uriString[1]);
                    for(int i=2; i<uriString.length; i++)
                        sb.append(" "+uriString[i]);
                    sb.append("\n");
                    line++;
                }catch(URISyntaxException e){//URI 생성할때 발생하는 오류
                }catch(IllegalArgumentException e) {//URI가 완전한 형식이 아닐때 발생
                }catch(UnknownHostException e) {//ip를 알지 못하는 호스트일 경우
                }
            }
            br.close();
            FileWriter fw=new FileWriter("src\\org\\dimigo\\JavaProject\\sites.txt");
            fw.write(dummy.toString());
            fw.close();

            sb.append("EXIT. 나가기"+"\n");
            sb.append("MODIFY. 수정하기"+"\n");

            System.out.println("원하시는 사이트를 숫자로 입력해주세요.");

            System.out.println(sb.toString());


            while(true) {
                String input;
                while (("").equals(input = sc.nextLine())) ; //enter만 치면 다음으로 넘어가지 않게 함

                for(int i=0; i<line; i++)
                {
                    if(String.valueOf(i).equals(input))
                    {
                        Desktop.getDesktop().browse(uri[i]);
                        isFinished=true;
                        break;
                    }
                }

                if("EXIT".equalsIgnoreCase(input)) isFinished=true;
                if(isFinished) break;
                if("MODIFY".equalsIgnoreCase(input)) {modifyData(); openWebSite(); return;}
                System.out.println("\n\n\n\n");
                System.out.println(sb.toString());
            }


        }catch (IOException e){
            System.out.println("파일이 없어");
            e.printStackTrace();
        }
    }

    private static void modifyData() throws IOException{
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            BufferedReader br = new BufferedReader(new FileReader("src\\org\\dimigo\\JavaProject\\sites.txt"));
            StringBuilder fileSB=new StringBuilder(), dummy=new StringBuilder();

            String[] str=new String[1000];
            int n=0;

            dummy.append(br.readLine()+"\n");
            dummy.append(br.readLine()+"\n");
            fileSB.append(dummy.toString());

            while((str[n]=br.readLine())!=null)
            {
                dummy.append(n+". "+str[n]+"\n");
                fileSB.append(str[n]+"\n");
                n++;
            }
            System.out.println(dummy);

            System.out.println("ADD. 추가하기");
            System.out.println("DELETE. 삭제하기");
            System.out.println("EXIT. 나가기");

            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("exit")) break;
            else if(input.equalsIgnoreCase("add"))
            {
                System.out.println("입력할 사이트의 URL과 제목을 쓰세요");
                input=scanner.nextLine();
                fileSB.append(input);
            }
            else if(input.equalsIgnoreCase("delete"))
            {
                System.out.printf("지울 사이트의 번호를 쓰세요 -->  ");
                input=scanner.nextLine();
                boolean find=false;
                if("0".equals(input)) {System.out.println("지울 수 없는 사이트 입니다..."); find=true;}
                else
                    for(int i=1; i<n; i++)
                        if(String.valueOf(i).equals(input))
                            {
                                fileSB=new StringBuilder(fileSB.toString().replaceAll("\n"+str[i],""));
                                System.out.println("지웠습니다.");
                                find=true;
                                break;
                            }
                if(find==false)
                {
                    System.out.println("잘못된 입력입니다.");
                }
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    System.out.println("멈추기 오류남");
                }

            }

            br.close();
            FileWriter fw=new FileWriter("src\\org\\dimigo\\JavaProject\\sites.txt");
            fw.write(fileSB.toString());
            fw.close();
        }
    }
}
