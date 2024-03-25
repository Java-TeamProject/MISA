package com.SYproject;

import java.util.Random;
import java.util.Scanner;

public class AfternoonClass {
    static Scanner sc=new Scanner(System.in);
    //고정 이벤트
    public void afternoonFEStart(Student student){


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
                int ran1 = (int)(Math.random()*2+1);
                if(ran1==1) {
                    afternoonSEStart(student);
                } else {
                    doClass(student);
                }
                break;
            case 2:
                int ran2 = (int)(Math.random()+2+1);
                if(ran2==1){
                    afternoonSEStart(student);
                }else {
                    doProject(student);
                }
                break;
            case 3:
                doStudy(student);
                break;
            case 4:
                doWriting(student);
                break;
            default:
                System.out.println("올바른 활동을 선택해주세요.");
                System.out.print("다시 선택해주세요 : ");
        }
        System.out.println("[체력] : "+student.getHp()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());

    }

    // 수업 활동 처리 메서드
    public static void doClass(Student student) {


        System.out.println("1. 3시간 풀강");
        System.out.println("2. 1시간 빨리 끝남");
        System.out.println("3. 휴강");

        System.out.print("수업 시간을 선택하세요:");
        boolean isTrue = true;
        do {
            int classChoice = sc.nextInt();
            switch (classChoice) {
                case 1:
                    if (student.getHp() > 30) {
                        // 체력 -30, 지능 +30
                        student.setHp(student.getHp() - 30);
                        student.setIntelligence(student.getIntelligence() + 30);
                        isTrue = false;
                        break;
                    } else {
                        System.out.println("체력이 너무 적어 선택할수 없습니다.");
                        System.out.print("다시 선택해주세요 : ");
                        break;
                    }

                case 2:
                    // 체력 +20, 지능 -20
                    student.setHp(student.getHp()+20);
                    student.setIntelligence(student.getIntelligence()-20);
                    isTrue=false;
                    break;
                case 3:
                    // 체력 +50, 지능 -50
                    student.setHp(student.getHp()+50);
                    student.setIntelligence(student.getIntelligence());
                    isTrue=false;
                    break;
                default:
                    System.out.println("올바른 수업 활동을 선택해주세요.");
                    System.out.print("다시 선택해주세요 : ");
            }
        }while(isTrue);
        System.out.println("[체력] : "+student.getHp()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());

    }

    // 프로젝트 활동 처리 메서드
    public static void doProject(Student student) {

        System.out.println("1. 팀장");
        System.out.println("2. 팀원");
        System.out.println("3. 잠수");

        System.out.print("프로젝트 활동을 선택하세요:");

        boolean isTrue = true;
        do {
            int projectChoice = sc.nextInt();
            switch (projectChoice) {
                case 1:
                    if(student.getHp()>30) {
                        // 체력 -30, 인망 +30
                        student.setHp(student.getHp()-30);
                        student.setFame(student.getFame()+30);
                        isTrue = false;
                        break;
                    } else {
                        System.out.println("체력이 적어 선택할수 없습니다!");
                        System.out.print("다른 선택지를 골라주세요 : ");
                        break;
                    }
                case 2:
                    if(student.getHp()>15) {
                        // 체력 -15, 인망 +15
                        student.setHp(student.getHp()-15);
                        student.setIntelligence(student.getIntelligence()+15);
                        isTrue = false;
                        break;
                    }
                case 3:
                    // 체력 +50, 인망 -50
                    student.setHp(student.getHp()+50);
                    student.setIntelligence(student.getIntelligence()-50);
                    isTrue=false;
                    break;
                default:
                    System.out.println("올바른 프로젝트 활동을 선택해주세요.");
            }
        }while(isTrue);
        System.out.println("[체력] : "+student.getHp()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
    }

    // 공부 활동 처리 메서드
    public  void doStudy(Student student) {


        System.out.println("1. 잠자기");
        System.out.println("2. 질문하기");
        System.out.println("3. 도망가기");

        System.out.print("공부 활동을 선택하세요:");
        boolean isTrue = true;
        do {
            int studyChoice = sc.nextInt();

            switch (studyChoice) {
                case 1:
                    // 체력 +20, 지능 -20
                    student.setHp(student.getHp()+20);
                    student.setIntelligence(student.getIntelligence()-20);
                    isTrue = false;
                    break;
                case 2:
                    // 체력 -20, 지능 +20
                    if(student.getHp()>20) {
                        student.setHp(student.getHp()-20);
                        student.setIntelligence(student.getIntelligence()+20);
                        isTrue = false;
                        break;
                    } else{
                        System.out.println("체력이 낮아 선택할수 없습니다.");
                        System.out.print("다시 선택해주세요 : ");
                        break;
                    }
                case 3:
                    // 체력 +30, 지능 -30
                    student.setHp(student.getHp()+30);
                    student.setIntelligence(student.getIntelligence()-30);
                    isTrue=false;
                    break;
                default:
                    System.out.println("올바른 공부 활동을 선택해주세요.");
                    System.out.print("다시 선택해주세요 : ");
            }
        }while(isTrue);

    }

    // 필기 활동 처리 메서드
    public  void doWriting(Student student) {

        System.out.println("1. 모두 다 필기");
        System.out.println("2. 절반만 필기");
        System.out.println("3. 필기 포기");

        System.out.print("필기 활동을 선택하세요:");
        boolean isTrue = true;
        do {
            int writingChoice = sc.nextInt();
            switch (writingChoice) {
                case 1:
                    if(student.getHp()>30) {
                        // 체력 -30, 지능 +30
                        student.setHp(student.getHp()-30);
                        student.setIntelligence(student.getIntelligence()+30);
                        isTrue = false;
                        break;
                    } else {
                        System.out.println("체력이 낮아 선택할 수 없습니다!");
                        System.out.print("다시 선택해주세요 : ");
                        break;
                    }
                case 2:
                    if(student.getHp()>15) {
                        // 체력 -15, 지능 +15
                        student.setHp(student.getHp()-15);
                        student.setIntelligence(student.getIntelligence()+15);
                        isTrue=false;
                        break;
                    }
                case 3:
                    // 체력 +30, 지능 -30
                    student.setHp(student.getHp()+30);
                    student.setIntelligence(student.getIntelligence()-30);
                    isTrue=false;
                    break;
                default:
                    System.out.println("올바른 필기 활동을 선택해주세요.");
                    System.out.print("다시 입력해주세요 : ");
            }
        }while(isTrue);
        System.out.println("[체력] : "+student.getHp()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());

    }

    // 돌발 이벤트
    public void afternoonSEStart(Student student) {
        Random random = new Random();


        System.out.println("<오후수업 돌발이벤트>");

        // 랜덤으로 이벤트 선택
        int eventChoice = random.nextInt(3) + 1;

        switch (eventChoice) {
            case 1:
                fatigueEvent(student,sc);
                break;
            case 2:
                assignmentEvent(student,sc);
                break;
            case 3:
                professorQuestionEvent(student,sc);
                break;
            default:
                System.out.println("잘못된 이벤트입니다.");
                System.out.print("다시 입력하세요 : ");
        }
        System.out.println("[체력] : "+student.getHp()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());

    }

    // 피로 이벤트
    private  void fatigueEvent(Student student,Scanner sc) {
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
                modifyStudentStatus(student,10, 0, 0);
                break;
            case 2:
                System.out.println("잠자기를 선택하셨습니다.");
                modifyStudentStatus(student,20, 0, -20);
                break;
            case 3:
                System.out.println("집에 가기를 선택하셨습니다.");
                modifyStudentStatus(student,50, 0, -50);
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }

    // 과제 이벤트
    private void assignmentEvent(Student student, Scanner sc) {
        System.out.println("과제 이벤트 발생!");

        System.out.println("2-1. 수업시간에 하기 : 체력 -20, 지능 +30");
        System.out.println("2-2. 미루기 : 체력 +30, 지능 -20");
        System.out.println("2-3. 친구랑 같이 하기 : 인망 +20, 지능 +15");

        // 선택지 입력 안내
        System.out.print("선택지를 고르세요: ");

        boolean isTrue = true;
        do {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (student.getHp() > 20) {
                        System.out.println("수업시간에 하기를 선택하셨습니다.");
                        modifyStudentStatus(student, -20, 0, 30);
                        isTrue=false;
                        break;
                    } else{
                        System.out.println("체력이 너무 적어 선택할수 없습니다!");
                        System.out.print("다른 선택을 해주세요 : ");
                        break;
                    }
                case 2:
                    System.out.println("미루기를 선택하셨습니다.");
                    modifyStudentStatus(student, 30, 0, -20);
                    isTrue = false;
                    break;
                case 3:
                    System.out.println("친구랑 같이 하기를 선택하셨습니다.");
                    modifyStudentStatus(student, 0, 20, 15);
                    isTrue = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }while(isTrue);
    }

    private  void professorQuestionEvent(Student student,Scanner sc) {
        System.out.println("교수님 질문 이벤트 발생!");

        System.out.println("3-1. 대답 하기");
        System.out.println("3-2. 대답 포기");
        System.out.println("3-3. 역질문 하기");

        // 선택지 입력 안내
        System.out.print("선택지를 고르세요: ");
        boolean isTrue = true;
        do {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if(student.getHp()>20) {
                        System.out.println("대답 하기를 선택하셨습니다.");
                        modifyStudentStatus(student, -20, 0, 30);
                        isTrue=false;
                        break;
                    }
                    else{
                        System.out.println("체력이 적어 선택할수 없습니다.");
                        System.out.print("다른 선택지를 골라주세요 : ");
                    }
                case 2:
                    System.out.println("대답 포기를 선택하셨습니다.");
                    modifyStudentStatus(student, 30, 0, -20);
                    isTrue=false;
                    break;
                case 3:
                    System.out.println("역질문 하기를 선택하셨습니다.");
                    modifyStudentStatus(student, 10, 0, 10);
                    isTrue=false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
                    System.out.print("다른 선택지를 골라주세요 : ");
            }
        }while(isTrue);
    }

    // 학생의 상태 수정
    private  void modifyStudentStatus(Student student, int hpChange, int fameChange, int intelligenceChange) {
        student.setHp(student.getHp() + hpChange); // 체력 변경
        student.setFame(student.getFame() + fameChange); // 인망 변경
        student.setIntelligence(student.getIntelligence() + intelligenceChange); // 지능 변경

    }
}
