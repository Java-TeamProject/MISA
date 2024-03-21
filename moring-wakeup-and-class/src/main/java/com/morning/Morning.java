package com.morning;

import java.util.Scanner;

public class Morning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //객체 생성
        FixedEvent fe = new FixedEvent();
        UnfixedEvent ufe = new UnfixedEvent();
        Student std = new Student();
        //시간 설정 && 체력 설정
        int time =7;
        int hp = 30;
        std.setTme(time);
        std.setHp(hp);
        // 아침기상이후 이벤트 출력 문
        if(std.getTime()>=7 && std.getTime()<=10){
            fe.getwakeUpFEvent();
            System.out.print("무엇을 타고 갈 건지 선택해주세요 : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("'걸어간다'를 선택했습니다.");
                    System.out.println("걸어갑니다~~");
                    std.setHp(hp-10);
                    break;
                case 2:
                    System.out.println("'버스를 버슈웅'을 선택했습니다.");
                    System.out.println("버스를 버슈웅~~");
                    std.setHp(hp+5);
                    break;
                case 3:
                    System.out.println("'전철'을 선택했습니다.");
                    System.out.println("전철을 탑니다.");
                    std.setHp(hp + 5);
                    break;
                case 4:
                    System.out.println("'택시'를 선택했습니다.");
                    System.out.println("택시를 탑니다.");
                    std.setHp(hp +10);
                    break;
            }

            System.out.println(std.getHp());

        }


    }
}
