package org.dimigo.JavaProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("원하는 메뉴를 선택하십시오.");
        System.out.println();
        System.out.println("1. 지식 찾기");
        System.out.println("2. 직접 찾기");
        System.out.println("3. 종료 하기");

        boolean isGoing=true; //프로그램이 진행중인가
        boolean isCorrect=true;
        //메뉴
        while (true) {

            Scanner scanner = new Scanner(System.in);
            String menuInput = scanner.nextLine();

            if("".equals(menuInput)) continue;

            switch(menuInput)
            {
                case "1": SearchWords.doInformationFind(); break;
                case "2": OpenSites.openWebSite(); break;
                case "3": isGoing=false; break;
                default : isCorrect=false; break;
            }

            if(!isGoing) break; //메뉴를 나감


            if(isCorrect) {
                System.out.println("\n\nEnter을 눌러주세요...");
                scanner.nextLine();
                System.out.println("\n\n\n\n\n");
            } else{
                isCorrect=true;
                System.out.println("\n\n\n\n\n");
                System.out.println("제대로 된 메뉴를 선택해 주세요");
            }


            System.out.printf("원하는 메뉴를 선택하십시오.");
            System.out.println();
            System.out.println("1. 지식 찾기");
            System.out.println("2. 직접 찾기");
            System.out.println("3. 종료 하기");
        }



        System.out.println("\n\n\n\n\n\n\n\n\n이용해주셔셔 감사합니다.");
    }
}
