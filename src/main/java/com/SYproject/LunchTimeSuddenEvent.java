package com.SYproject;

import com.SYproject.Student;

import java.util.Random;
import java.util.Scanner;

public class LunchTimeSuddenEvent {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("<점심시간 돌발이벤트>");

        // 랜덤으로 이벤트 선택
        int eventChoice = random.nextInt(3) + 1;

        switch (eventChoice) {
            case 1:
                professorMeetingEvent(sc);
                break;
            case 2:
                leaveSchoolEvent(sc);
                break;
            case 3:
                lunchActivityEvent(sc);
                break;
            default:
                System.out.println("잘못된 이벤트입니다.");
        }

        sc.close();
    }

    // 교수님 만남 이벤트
    private static void professorMeetingEvent(Scanner sc) {
        System.out.println("교수님 만남 이벤트 발생!");

        System.out.println("1-1. 인사만 하기 : 체력, 인망 히든이벤트!!(비밀이지롱~)");
        System.out.println("1-2. 같이 점심 식사 하기 : 체력, 인망 히든이벤트!!(비밀이지롱~)");
        System.out.println("1-3. 같이 커피만 마시기 : 체력, 인망 히든이벤트!!(비밀이지롱~)");

        // 선택지 입력 안내
        System.out.print("선택지를 고르세요: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("인사만 하기를 선택하셨습니다.");
                modifyStudentStatus(50, -30, 0);
                break;
            case 2:
                System.out.println("같이 점심 식사 하기를 선택하셨습니다.");
                modifyStudentStatus(-30, 50, 0);
                break;
            case 3:
                System.out.println("같이 커피만 마시기를 선택하셨습니다.");
                modifyStudentStatus(-15, 25, 0);
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }

    // 학교 밖으로 나가기 이벤트
    private static void leaveSchoolEvent(Scanner sc) {
        System.out.println("학교 밖으로 나가기 이벤트 발생!");

        System.out.println("2-1. 병원 가기 : 체력 +30");
        System.out.println("2-2. 친구 만나기 : 인망 +30");
        System.out.println("2-3. 스터디카페 가기 : 지능 +30");

        // 선택지 입력 안내
        System.out.print("선택지를 고르세요: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("병원 가기를 선택하셨습니다.");
                modifyStudentStatus(30, 0, 0);
                break;
            case 2:
                System.out.println("친구 만나기를 선택하셨습니다.");
                modifyStudentStatus(0, 30, 0);
                break;
            case 3:
                System.out.println("스터디카페 가기를 선택하셨습니다.");
                modifyStudentStatus(0, 0, 30);
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }

    // 점심 활동 이벤트
    private static void lunchActivityEvent(Scanner sc) {
        System.out.println("점심 활동 이벤트 발생!");

        System.out.println("3-1. 운동 하기 : 체력 +20, 지능 -10");
        System.out.println("3-2. 점심 특강 듣기 : 체력 -10, 지능 +20");
        System.out.println("3-3. 동아리 회의 하기: 체력 -10, 인망 +20");

        // 선택지 입력 안내
        System.out.print("선택지를 고르세요: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("운동 하기를 선택하셨습니다.");
                modifyStudentStatus(20, 0, -10);
                break;
            case 2:
                System.out.println("점심 특강 듣기를 선택하셨습니다.");
                modifyStudentStatus(-10, 0, 20);
                break;
            case 3:
                System.out.println("동아리 회의 하기를 선택하셨습니다.");
                modifyStudentStatus(-10, 20, 0);
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }

    // 학생의 상태 수정
    private static void modifyStudentStatus(int hpChange, int fameChange, int intelligenceChange) {
        Student student = new Student(0, 0, 0, 0); // 초기값 설정// 학생 객체 생성
        student.setHp(student.getHp() + hpChange); // 체력 변경
        student.setFame(student.getFame() + fameChange); // 인망 변경
        student.setIntelligence(student.getIntelligence() + intelligenceChange); // 지능 변경
        // 변경된 상태 출력
        System.out.println("체력: " + student.getHp());
        System.out.println("인망: " + student.getFame());
        System.out.println("지능: " + student.getIntelligence());

    }
}
