package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        String[] questions={"가장 좋아하는 음식?",
                            "가장 좋아하는 지역은?",
                            "가장 좋아하는 학교는?"};
        String[] answers={"피자","대구","디미고"};

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("------------------");
            System.out.printf("메뉴 선택 => ");
            int menu=scanner.nextInt();
            switch(menu)
            {
                case 1:
                    int rand=new Random().nextInt(3);
                    System.out.printf(questions[rand]+" ");
                    String ans=scanner.next();
                    if(answers[rand].equals(ans)) System.out.println("정답입니다!");
                    else System.out.println("틀렸습니다!");
                    break;
                case 2:
                    StringBuilder sb=new StringBuilder();
                    for(int i=0; i<3; i++) sb.append(questions[i]+" "+answers[i]+"입니다.\n");
                    System.out.printf(sb.toString());
                    break;
                case 9:
                    System.out.println("Bye~");
                    break;
                default:  System.out.println("없는 메뉴입니다."); break;
            }
            if(menu==9) break;
        }
    }
}
