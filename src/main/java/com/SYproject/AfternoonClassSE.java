package com.SYproject;

import java.util.Random;
import java.util.Scanner;

public class AfternoonClassSE {

        public static void main(String[] args) {
            Random random = new Random();
            Scanner sc = new Scanner(System.in);

            System.out.println("<오후수업 돌발이벤트>");

            // 랜덤으로 이벤트 선택
            int eventChoice = random.nextInt(3) + 1;

            switch (eventChoice) {
                case 1:
                    fatigueEvent(sc);
                    break;
                case 2:
                    assignmentEvent(sc);
                    break;
                case 3:
                    professorQuestionEvent(sc);
                    break;
                default:
                    System.out.println("잘못된 이벤트입니다.");
            }

            sc.close();
        }

        // 피로 이벤트
        private static void fatigueEvent(Scanner sc) {
            System.out.println("피로 이벤트 발생!");

            System.out.println("1-1. 커피 마시기 : 체력 +10");
            System.out.println("1-2. 잠자기 : 체력 +20, 지능 -20");
            System.out.println("1-3. 집에 가기 : 체력 +50, 지능 -50");

            // 선택지 입력 안내
            System.out.print("선택지를 고르세요: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("커피 마시기를 선택하셨습니다.");
                    modifyStudentStatus(10, 0, 0);
                    break;
                case 2:
                    System.out.println("잠자기를 선택하셨습니다.");
                    modifyStudentStatus(20, 0, -20);
                    break;
                case 3:
                    System.out.println("집에 가기를 선택하셨습니다.");
                    modifyStudentStatus(50, 0, -50);
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }

        // 과제 이벤트
        private static void assignmentEvent(Scanner sc) {
            System.out.println("과제 이벤트 발생!");

            System.out.println("2-1. 수업시간에 하기 : 체력 -20, 지능 +30");
            System.out.println("2-2. 미루기 : 체력 +30, 지능 -20");
            System.out.println("2-3. 친구랑 같이 하기 : 인망 +20, 지능 +15");

            // 선택지 입력 안내
            System.out.print("선택지를 고르세요: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("수업시간에 하기를 선택하셨습니다.");
                    modifyStudentStatus(-20, 0, 30);
                    break;
                case 2:
                    System.out.println("미루기를 선택하셨습니다.");
                    modifyStudentStatus(30, 0, -20);
                    break;
                case 3:
                    System.out.println("친구랑 같이 하기를 선택하셨습니다.");
                    modifyStudentStatus(0, 20, 15);
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }

        // 교수님 질문 이벤트
        private static void professorQuestionEvent(Scanner sc) {
            System.out.println("교수님 질문 이벤트 발생!");

            System.out.println("3-1. 대답 하기 : 체력 -20, 지능 +30");
            System.out.println("3-2. 대답 포기 : 체력 +30, 지능 -20");
            System.out.println("3-3. 역질문 하기 : 체력 +10, 지능 +10");

            // 선택지 입력 안내
            System.out.print("선택지를 고르세요: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("대답 하기를 선택하셨습니다.");
                    modifyStudentStatus(-20, 0, 30);
                    break;
                case 2:
                    System.out.println("대답 포기를 선택하셨습니다.");
                    modifyStudentStatus(30, 0, -20);
                    break;
                case 3:
                    System.out.println("역질문 하기를 선택하셨습니다.");
                    modifyStudentStatus(10, 0, 10);
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }

        // 학생의 상태 수정
        private static void modifyStudentStatus(int hpChange, int fameChange, int intelligenceChange) {
            Student student = new Student(0, 0, 0, 0); // 초기값 설정
            student.setHp(student.getHp() + hpChange); // 체력 변경
            student.setFame(student.getFame() + fameChange); // 인망 변경
            student.setIntelligence(student.getIntelligence() + intelligenceChange); // 지능 변경

            // 변경된 상태 출력
            System.out.println("체력: " + student.getHp());
            System.out.println("인망: " + student.getFame());
            System.out.println("지능: " + student.getIntelligence());
        }
    }


