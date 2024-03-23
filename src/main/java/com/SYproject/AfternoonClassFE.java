package com.SYproject;

import java.util.Scanner;

public class AfternoonClassFE {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 사용자에게 입력 안내 메시지 출력

            System.out.println("1. 수업");
            System.out.println("2. 프로젝트");
            System.out.println("3. 공부");
            System.out.println("4. 필기");

            System.out.print("어떤 활동을 하시겠습니까? : ");
            int choice = sc.nextInt();

            // 선택된 활동에 따라 체력, 인망, 지능 조절
            switch (choice) {
                case 1:
                    doClass(sc);
                    break;
                case 2:
                    doProject(sc);
                    break;
                case 3:
                    doStudy(sc);
                    break;
                case 4:
                    doWriting(sc);
                    break;
                default:
                    System.out.println("올바른 활동을 선택해주세요.");
            }
        }

        // 수업 활동 처리 메서드
        public static void doClass(Scanner sc) {

            System.out.println("1. 3시간 풀강");
            System.out.println("2. 1시간 빨리 끝남");
            System.out.println("3. 휴강");

            System.out.print("수업 시간을 선택하세요:");
            int classChoice = sc.nextInt();

            switch (classChoice) {
                case 1:
                    // 체력 -30, 지능 +30
                    decreaseHealth(30);
                    increaseIntelligence(30);
                    break;
                case 2:
                    // 체력 +20, 지능 -20
                    increaseHealth(20);
                    decreaseIntelligence(20);
                    break;
                case 3:
                    // 체력 +50, 지능 -50
                    increaseHealth(50);
                    decreaseIntelligence(50);
                    break;
                default:
                    System.out.println("올바른 수업 활동을 선택해주세요.");
            }
        }

        // 프로젝트 활동 처리 메서드
        public static void doProject(Scanner sc) {

            System.out.println("1. 팀장");
            System.out.println("2. 팀원");
            System.out.println("3. 잠수");

            System.out.print("프로젝트 활동을 선택하세요:");
            int projectChoice = sc.nextInt();

            switch (projectChoice) {
                case 1:
                    // 체력 -30, 인망 +30
                    decreaseHealth(30);
                    increasePopularity(30);
                    break;
                case 2:
                    // 체력 -15, 인망 +15
                    decreaseHealth(15);
                    increasePopularity(15);
                    break;
                case 3:
                    // 체력 +50, 인망 -50
                    increaseHealth(50);
                    decreasePopularity(50);
                    break;
                default:
                    System.out.println("올바른 프로젝트 활동을 선택해주세요.");
            }
        }

        // 공부 활동 처리 메서드
        public static void doStudy(Scanner sc) {

            System.out.println("1. 잠자기");
            System.out.println("2. 질문하기");
            System.out.println("3. 도망가기");

            System.out.print("공부 활동을 선택하세요:");
            int studyChoice = sc.nextInt();

            switch (studyChoice) {
                case 1:
                    // 체력 +20, 지능 -20
                    increaseHealth(20);
                    decreaseIntelligence(20);
                    break;
                case 2:
                    // 체력 -20, 지능 +20
                    decreaseHealth(20);
                    increaseIntelligence(20);
                    break;
                case 3:
                    // 체력 +30, 지능 -30
                    increaseHealth(30);
                    decreaseIntelligence(30);
                    break;
                default:
                    System.out.println("올바른 공부 활동을 선택해주세요.");
            }
        }

        // 필기 활동 처리 메서드
        public static void doWriting(Scanner sc) {
            System.out.println("1. 모두 다 필기");
            System.out.println("2. 절반만 필기");
            System.out.println("3. 필기 포기");

            System.out.println("필기 활동을 선택하세요:");
            int writingChoice = sc.nextInt();

            switch (writingChoice) {
                case 1:
                    // 체력 -30, 지능 +30
                    decreaseHealth(30);
                    increaseIntelligence(30);
                    break;
                case 2:
                    // 체력 -15, 지능 +15
                    decreaseHealth(15);
                    increaseIntelligence(15);
                    break;
                case 3:
                    // 체력 +30, 지능 -30
                    increaseHealth(30);
                    decreaseIntelligence(30);
                    break;
                default:
                    System.out.println("올바른 필기 활동을 선택해주세요.");
            }
        }

        // 체력 증가 메서드
        public static void increaseHealth(int amount) {
            System.out.println("체력이 " + amount + " 증가했습니다.");
        }

        // 체력 감소 메서드
        public static void decreaseHealth(int amount) {
            System.out.println("체력이 " + amount + " 감소했습니다.");
        }

        // 인망 증가 메서드
        public static void increasePopularity(int amount) {
            System.out.println("인망이 " + amount + " 증가했습니다.");
        }

        // 인망 감소 메서드
        public static void decreasePopularity(int amount) {
            System.out.println("인망이 " + amount + " 감소했습니다.");
        }

        // 지능 증가 메서드
        public static void increaseIntelligence(int amount) {
            System.out.println("지능이 " + amount + " 증가했습니다.");
        }

        // 지능 감소 메서드
        public static void decreaseIntelligence(int amount) {
            System.out.println("지능이 " + amount + " 감소했습니다.");
        }
    }


