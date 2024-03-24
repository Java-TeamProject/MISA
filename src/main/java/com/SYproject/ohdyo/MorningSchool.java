package com.ddo.java;


import java.util.Random;
import java.util.Scanner;

public class MorningSchool {
    public void morningSchoolEvent(Student player){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // 체력이 6 미만인 경우
        if (player.getHp() < 6) {
            System.out.println("체력이 부족하여 잠들었습니다.");
            sc.close();
            return; // 메서드 종료
        }
        // 오전 수업 중 돌발 이벤트 발생
        player.morningClassRandomEvent();

        System.out.println("오전 수업이 다가왔습니다!!");
        FixedEvent fixedEvent = new FixedEvent();
        for (String event : fixedEvent.morningStudyFEvent) {
            System.out.println(event);
        }
        System.out.print("할 일을 선택해주세요~ : ");
        int choice = sc.nextInt();

        // 문제를 푸는 경우 (2번 선택)
        if (choice == 2) {
            // 랜덤한 사칙연산 문제 생성
            int num1 = rand.nextInt(10) + 1; // 1 이상 10 이하의 난수
            int num2 = rand.nextInt(10) + 1; // 1 이상 10 이하의 난수
            int result = 0;
            String operator = "";
            int operatorChoice = rand.nextInt(4); // 0부터 3까지의 난수 생성

            switch (operatorChoice) {
                case 0:
                    operator = "+";
                    result = num1 + num2;
                    break;
                case 1:
                    operator = "-";
                    result = num1 - num2;
                    break;
                case 2:
                    operator = "*";
                    result = num1 * num2;
                    break;
                case 3:
                    operator = "/";
                    result = num1 / num2;
                    break;
            }

            // 문제 출력
            System.out.println("문제를 풀어주세요:");
            System.out.print(num1 + " " + operator + " " + num2 + " = ");
            int answer = sc.nextInt();

            // 정답 확인 및 처리
            if (answer == result) {
                System.out.println("정답입니다!");
                // 체력이 6 이상인 경우
                if (player.getHp() >= 6) {
                    // 체력이 10 이상이면 지능을 5 증가
                    if (player.getHp() >= 10) {
                        player.setIntelligence(player.getIntelligence() + 5);
                    } else { // 체력이 6 이상 10 미만인 경우 지능을 4 증가
                        player.setIntelligence(player.getIntelligence() + 4);
                    }
                }
            } else {
                System.out.println("오답입니다. 공부를 좀 더 해주세요.");
            }
        } else if (choice == 1){
            System.out.println("흠냐흠냐 잘잤다..");
            // 체력과 지능 감소
            player.setHp(player.getHp() - 2);
            player.setIntelligence(player.getIntelligence() - 2);
        }
        else if (choice == 3) {
            // 50%의 확률로 정글님 사랑해요 메시지 출력
            if (rand.nextBoolean()) {
                System.out.println("정글님 사랑해요!!!!!!!!! ... 승급에 성공했다.");
                player.setHp(player.getHp() + 5); // 체력 증가
                player.setIntelligence(player.getIntelligence() + 5); // 지능 증가
            } else {
                System.out.println("아 우리 서포터 왜 이래!!! ... 강등 당했다.");
                player.setHp(player.getHp() - 2); // 체력 감소
                player.setIntelligence(player.getIntelligence() - 2); // 지능 감소
            }
        } else if (choice==4) {
            System.out.println("몰폰하냐고 죽는줄 알았네..");
            // 체력과 지능 감소
            player.setHp(player.getHp() - 2);
            player.setIntelligence(player.getIntelligence() - 2);
        }

        // 점심으로 넘겨줄 data
        Data data = new Data(player);
        System.out.println(data.getPlayer().getHp() + " " + data.getPlayer().getIntelligence());
    }

}
