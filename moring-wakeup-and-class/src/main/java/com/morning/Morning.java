package com.morning;

import java.util.Map;
import java.util.Scanner;

public class Morning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //객체 생성
        FixedEvent fe = new FixedEvent();
        UnfixedEvent ufe = new UnfixedEvent();
        Student std = new Student();

        //시간 설정 && 체력 설정(임의입니다)
        int time =7;
        int hp = 30;
        std.setTme(time);
        std.setHp(hp);

        //돌발 이벤트 변수

        // 딜레이 시간 표현
        int delay = 1000;


        // 아침기상이후 이벤트 출력 문
        if(std.getTime()>=7 && std.getTime()<=10){
            fe.getwakeUpFEvent();
            System.out.print("무엇을 타고 갈 건지 선택해주세요 : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("'걸어간다'를 선택했습니다.");
                    for(int i=0; i<3; i++){
                        try{
                            Thread.sleep(delay);
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                        int random = (int) (Math.random()*2 +1);
                        if(i==0){
                            System.out.println("걸어갈려고 준비중...");
                            if(random ==1){
                                System.out.println(ufe.getUfeEvent(1));
                                std.setHp(hp + 10);
                            }
                        } else if(i==1){
                            System.out.println("걸어가는 중...");
                            if(random==1){
                                System.out.println(ufe.getUfeEvent(4));
                                std.setHp(hp-5);
                            }
                        } else {
                            System.out.println("학교에 도착했다!");
                        }
                    }

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
