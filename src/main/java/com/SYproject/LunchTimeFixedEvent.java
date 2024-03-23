package com.SYproject;

import java.util.Scanner;

public class LunchTimeFixedEvent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 학생 정보 초기화
        Student student = new Student(0, 0, 0, 0); // 초기값 설정



        System.out.println("점심시간 이벤트에 오신 것을 환영합니다!");

        // 선택지 출력
        System.out.println("1. 밥 먹기");
        System.out.println("2. 커피 마시기");
        System.out.println("3. 시간 활용");
        System.out.println("4. 양치하기");

        // 선택지 입력 안내
        System.out.print("선택지를 고르세요: ");
        int choice = sc.nextInt();

        // 선택지에 따라 이벤트 처리
        switch (choice) {
            case 1:
                String art = "🍚";
                System.out.println(art);
                System.out.println("1-1. 밥 혼자 먹기 : 체력 +30, 인망 -20");
                System.out.println("1-2. 밥 같이 먹기 : 체력 -20, 인망 +30");
                System.out.println("1-3. 밥 안먹기 : 체력 -10");
                System.out.print("선택지를 고르세요: ");
                int lunchOption = sc.nextInt();
                switch (lunchOption) {
                    case 1:
                        System.out.println("밥 혼자 먹기를 선택하셨습니다.");
                        student.setHp(student.getHp() + 30);
                        student.setFame(student.getFame() - 20);
                        break;
                    case 2:
                        System.out.println("밥 같이 먹기를 선택하셨습니다.");
                        student.setHp(student.getHp() - 20);
                        student.setFame(student.getFame() + 30);
                        break;
                    case 3:
                        System.out.println("밥 안먹기를 선택하셨습니다.");
                        student.setHp(student.getHp() - 10);
                        break;
                    default:
                        System.out.println("잘못된 선택지입니다.");
                }
                break;
            case 2:
                String art2 = "☕";
                System.out.println(art2);
                System.out.println("2-1. 커피 혼자 마시기 : 체력 +30, 인망 -20");
                System.out.println("2-2. 커피 같이 마시기 : 체력 -20, 인망 +30");
                System.out.println("2-3. 커피 안마시기 : 체력 -10");
                System.out.print("선택지를 고르세요: ");
                int coffeeOption = sc.nextInt();
                switch (coffeeOption) {
                    case 1:
                        System.out.println("커피 혼자 마시기를 선택하셨습니다.");
                        student.setHp(student.getHp() + 30);
                        student.setFame(student.getFame() - 20);
                        break;
                    case 2:
                        System.out.println("커피 같이 마시기를 선택하셨습니다.");
                        student.setHp(student.getHp() - 20);
                        student.setFame(student.getFame() + 30);
                        break;
                    case 3:
                        System.out.println("커피 안마시기를 선택하셨습니다.");
                        student.setHp(student.getHp() - 10);
                        break;
                    default:
                        System.out.println("잘못된 선택지입니다.");
                }
                break;
            case 3:
                String art3 = "\uD83D\uDD66";
                System.out.println(art3);
                System.out.println("3-1. 잠 자기: 체력 +30, 인망 -20, 지능 -20");
                System.out.println("3-2. 공부 하기: 체력 -20, 인망 -20, 지능 +30");
                System.out.println("3-3. 유튜브 보기: 체력 +10");
                System.out.print("선택지를 고르세요: ");
                int timeOption = sc.nextInt();
                switch (timeOption) {
                    case 1:
                        System.out.println("잠 자기를 선택하셨습니다.");
                        student.setHp(student.getHp() + 30);
                        student.setFame(student.getFame() - 20);
                        student.setIntelligence(student.getIntelligence() - 20);
                        break;
                    case 2:
                        System.out.println("공부 하기를 선택하셨습니다.");
                        student.setHp(student.getHp() - 20);
                        student.setFame(student.getFame() - 20);
                        student.setIntelligence(student.getIntelligence() + 30);
                        break;
                    case 3:
                        System.out.println("유튜브 보기를 선택하셨습니다.");
                        student.setHp(student.getHp() + 10);
                        break;
                    default:
                        System.out.println("잘못된 선택지입니다.");
                }
                break;
            case 4:
                String art4 = "\uD83E\uDEA5";
                System.out.println(art4);
                System.out.println("4-1. 양치하기: 체력 -10, 인망 +20");
                System.out.println("4-2. 양치 안하기: 체력 +20, 인망 -10");
                System.out.println("4-3. 가글만 사용하기: 인망 +10");
                System.out.print("선택지를 고르세요: ");
                int brushOption = sc.nextInt();
                switch (brushOption) {
                    case 1:
                        System.out.println("양치하기를 선택하셨습니다.");
                        student.setHp(student.getHp() - 10);
                        student.setFame(student.getFame() + 20);
                        break;
                    case 2:
                        System.out.println("양치 안하기를 선택하셨습니다.");
                        student.setHp(student.getHp() + 20);
                        student.setFame(student.getFame() - 10);
                        break;
                    case 3:
                        System.out.println("가글만 사용하기를 선택하셨습니다.");
                        student.setFame(student.getFame() + 10);
                        break;
                    default:
                        System.out.println("잘못된 선택지입니다.");
                }
                break;
            default:
                System.out.println("잘못된 선택지입니다.");
        }


            // 결과 출력
        System.out.println("체력: " + student.getHp());
        System.out.println("지능: " + student.getIntelligence());
        System.out.println("인망: " + student.getFame());
    }

}
