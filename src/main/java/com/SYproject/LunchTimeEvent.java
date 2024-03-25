package com.SYproject;
import java.util.Random;
import java.util.Scanner;

public class LunchTimeEvent {
    public void lunchTimeEvent(Student student) {

        Scanner sc = new Scanner(System.in);

        System.out.println("점심시간이다~~ 뭐할까??");

        System.out.println("1. 밥 먹기");
        System.out.println("2. 커피 마시기");
        System.out.println("3. 시간 활용");
        System.out.println("4. 양치하기");
        System.out.println();
        System.out.print("선택지를 고르세요:");
        System.out.println();
        int choice = sc.nextInt();

        // 선택지에 따라 이벤트 처리
        switch (choice) {
            case 1:
                String art = "🍚";
                System.out.println(art);
                System.out.println("1. 밥 혼자 먹기");
                System.out.println("2. 밥 같이 먹기");
                System.out.println("3. 밥 안먹기");
                System.out.println();
                System.out.print("선택지를 고르세요: ");
                System.out.println();
                int lunchOption = sc.nextInt();
                switch (lunchOption) {
                    case 1:
                        System.out.println("밥 혼자 먹기를 선택하셨습니다.");
                        System.out.println();
                        student.setHp(student.getHp() + 30);
                        break;
                    case 2:
                        System.out.println("밥 같이 먹기를 선택하셨습니다.");
                        System.out.println();
                        student.setHp(student.getHp() - 20);
                        student.setFame(student.getFame() + 30);
                        break;
                    case 3:
                        System.out.println("밥 안먹기를 선택하셨습니다.");
                        System.out.println();
                        student.setHp(student.getHp() - 10);
                        break;
                    default:
                        System.out.println("잘못된 선택지입니다.");
                        System.out.println();

                }
                break;
            case 2:
                String art2 = "☕";
                System.out.println(art2);
                int rand2 = (int) (Math.random() * 2 + 1);
                if (rand2 == 1) {
                    lunchTimeRandomEvent(student);
                    break;
                }

                System.out.println("1. 커피 혼자 마시기");
                System.out.println();
                System.out.println("2. 커피 같이 마시기");
                System.out.println();
                System.out.println("3. 커피 안마시기");
                System.out.println();
                System.out.print("선택지를 고르세요: ");
                System.out.println();
                int coffeeOption = sc.nextInt();
                switch (coffeeOption) {
                    case 1:
                        System.out.println("커피 혼자 마시기를 선택하셨습니다.");
                        System.out.println();
                        student.setHp(student.getHp() + 30);
                        student.setFame(student.getFame() - 20);
                        break;
                    case 2:
                        System.out.println("커피 같이 마시기를 선택하셨습니다.");
                        System.out.println();
                        student.setHp(student.getHp() - 20);
                        student.setFame(student.getFame() + 30);
                        break;
                    case 3:
                        System.out.println("커피 안마시기를 선택하셨습니다.");
                        System.out.println();
                        student.setHp(student.getHp() - 10);
                        break;
                    default:
                        System.out.println("잘못된 선택지입니다.");
                        System.out.println();
                }
                break;
            case 3:
                String art3 = "\uD83D\uDD66";
                System.out.println(art3);
                int rand3 = (int) (Math.random() * 2 + 1);
                if (rand3 == 1) {
                    lunchTimeRandomEvent(student);
                    break;
                }
                System.out.println("1. 잠 자기");
                System.out.println("2. 공부 하기");
                System.out.println("3. 유튜브 보기");
                System.out.println();
                System.out.print("선택지를 고르세요: ");
                System.out.println();
                int timeOption = sc.nextInt();
                switch (timeOption) {
                    case 1:
                        System.out.println("잠자기를 선택하셨습니다.");
                        System.out.println();

                        student.setHp(student.getHp() + 30);
                        student.setFame(student.getFame() - 20);
                        student.setIntelligence(student.getIntelligence() - 20);
                        break;
                    case 2:
                        System.out.println("공부 하기를 선택하셨습니다.");
                        System.out.println();

                        student.setHp(student.getHp() - 20);
                        student.setFame(student.getFame() - 20);
                        student.setIntelligence(student.getIntelligence() + 30);
                        break;
                    case 3:
                        System.out.println("유튜브 보기를 선택하셨습니다.");
                        System.out.println();

                        student.setHp(student.getHp() + 10);
                        break;
                    default:
                        System.out.println("잘못된 선택지입니다.");
                        System.out.println();

                }
                break;
            case 4:
                String art4 = "\uD83E\uDEA5";
                System.out.println(art4);
                int rand4 = (int) (Math.random() * 2 + 1);
                if (rand4 == 1) {
                    lunchTimeRandomEvent(student);
                    break;
                }
                System.out.println("1. 양치하기");
                System.out.println("2. 양치 안하기");
                System.out.println("3. 가글만 사용하기");
                System.out.print("선택지를 고르세요: ");
                System.out.println();
                int brushOption = sc.nextInt();
                switch (brushOption) {
                    case 1:
                        System.out.println("양치하기를 선택하셨습니다.");
                        System.out.println();
                        student.setHp(student.getHp() - 10);
                        student.setFame(student.getFame() + 20);
                        break;
                    case 2:
                        System.out.println("양치 안하기를 선택하셨습니다.");
                        System.out.println();
                        student.setHp(student.getHp() + 20);
                        student.setFame(student.getFame() - 10);
                        break;
                    case 3:
                        System.out.println("가글만 사용하기를 선택하셨습니다.");
                        System.out.println();
                        student.setFame(student.getFame() + 10);
                        break;
                    default:
                        System.out.println("잘못된 선택지입니다.");
                        System.out.println();
                }
                break;
            default:
                System.out.println("잘못된 선택지입니다.");
                System.out.println();
        }
    }

    public void lunchTimeRandomEvent(Student student) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("<점심시간 돌발이벤트>");

        // 랜덤으로 이벤트 선택
        int eventChoice = random.nextInt(3) + 1;

        switch (eventChoice) {
            case 1:
                professorMeetingEvent(sc, student);
                break;
            case 2:
                leaveSchoolEvent(sc, student);
                break;
            case 3:
                lunchActivityEvent(sc, student);
                break;
            default:
                System.out.println("잘못된 이벤트입니다.");
        }
    }

    private static void professorMeetingEvent(Scanner sc, Student student) {

        System.out.println("교수님 : 어~ 000아 뭐하니?");

        System.out.println("1. 인사만 하기 : 안녕하세요 교수님 식사 맛있게 하세요~!(점수는 비밀이지롱~)");
        System.out.println("2. 같이 점심 식사 하기 : 안녕하세요 교수님 밥 같이 먹어요!(점수는 비밀이지롱~)");
        System.out.println("3. 같이 커피만 마시기 : 안녕하세요 교수님!! 저랑 커피 마셔요!(점수는 비밀이지롱~)");
        // 선택지 입력 안내
        System.out.print("선택지를 고르세요: ");
        int choice = sc.nextInt();
        System.out.println();


        switch (choice) {
            case 1:
                System.out.println("인사만 하기를 선택하셨습니다.");
                System.out.println();
                modifyStudentStatus(student, 50, -30, 0);
                break;
            case 2:
                System.out.println("같이 점심 식사 하기를 선택하셨습니다.");
                System.out.println();
                modifyStudentStatus(student, -30, 50, 0);
                break;
            case 3:
                System.out.println("같이 커피만 마시기를 선택하셨습니다.");
                System.out.println();
                modifyStudentStatus(student, -15, 25, 0);
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                System.out.println();

        }
    }

    private static void leaveSchoolEvent(Scanner sc, Student student) {
        System.out.println("오늘은 미루 개인사정을 해볼까?");
        System.out.println("1. 병원 가기");
        System.out.println("2. 친구 만나기");
        System.out.println("3. 스터디카페 가기");

        // 선택지 입력 안내
        System.out.print("선택지를 고르세요: ");
        int choice = sc.nextInt();
        System.out.println();

        // 사용자가 1에서 4 사이의 올바른 선택을 할 때까지 반복하여 입력을 받음

        switch (choice) {
            case 1:
                System.out.println("병원 가기를 선택하셨습니다.");
                System.out.println();

                modifyStudentStatus(student, 30, 0, 0);
                break;
            case 2:
                System.out.println("친구 만나기를 선택하셨습니다.");
                System.out.println();

                modifyStudentStatus(student, 0, 30, 0);
                break;
            case 3:
                System.out.println("스터디카페 가기를 선택하셨습니다.");
                System.out.println();
                modifyStudentStatus(student, 0, 0, 30);
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                System.out.println();

        }
    }

    private static void lunchActivityEvent(Scanner sc, Student student) {
        System.out.println("아... 뭔가 오늘은 다른게 하고 싶어!");

        System.out.println("1. 운동 하기");
        System.out.println("2. 점심 특강 듣기");
        System.out.println("3. 동아리 회의 하기");

        // 선택지 입력 안내
        System.out.print("선택지를 고르세요: ");
        System.out.println();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("운동 하기를 선택하셨습니다.");
                System.out.println();
                modifyStudentStatus(student, 20, 0, -10);
                break;
            case 2:
                System.out.println("점심 특강 듣기를 선택하셨습니다.");
                System.out.println();
                modifyStudentStatus(student, -10, 0, 20);
                break;
            case 3:
                System.out.println("동아리 회의 하기를 선택하셨습니다.");
                System.out.println();
                modifyStudentStatus(student, -10, 20, 0);
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                System.out.println();
        }
    }

    private static void modifyStudentStatus (Student student,int hp, int fame, int intelligence){

        student.setHp(student.getHp() + hp); // 체력 변경
        student.setFame(student.getFame() + fame); // 인망 변경
        student.setIntelligence(student.getIntelligence() + intelligence); // 지능 변경


    }
}

