package com.ddo.java;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.print("닉네임을 입력해주세요: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("반갑습니다. " + name + "님!");
        System.out.println("당신은 지금 마지막 학기만 남겨둔 4학년 취준생입니다.");
        System.out.println("마지막 학교 생활을 시작하면서 다양한 상황들과 선택들이 당신을 기다리고 있습니다.");
        System.out.println("사이버 삼육대학교에서 당신의 미래를 펼쳐보세요.");

        int delay = 1000;
        int i = 0;
        for (i = 0; i < 4; i++) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // 캐릭터 생성
            Student player = new Student(100, 50, 200, 0);
            for (int day = 1; day <= 14; day++) { // 14일간 게임 진행
                System.out.println();
                System.out.println("Day " + day); // 날짜 출력

                // 캐릭터 상태 출력
                if (day % 4 == 0) {
                    player.displayStats();
                }

                // 아침 이벤트 실행
                Morning.runMorningEvent(player);
            }
        }
    }




    public static void randomEventTaxiAction(int hp){
        UnFixedEvent ufe = new UnFixedEvent();
        Student player = new Student();
        int delay = 1000;
        int i=0;
        for(i =0; i<3; i++){
            try{
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int random = (int) (Math.random()*2+1);
            if(i==0){
                System.out.println("콜 택시 부르는 중~");
                if(random==1){
                    System.out.println(ufe.getUfeEvent(1));
                    player.setHp(hp+5);
                }
            } else if(i==1){
                System.out.println("콜 택시 기다리는 중~");
                if(random==1){
                    System.out.println(ufe.getUfeEvent(7));
                    player.setHp(hp - 10);
                    break;
                }
            } else if(i==2){
                System.out.println("택시타고 학교 도착~!");
                player.setHp(hp+10);
            }
        }
        if(i==1){
            System.out.println("어찌저찌 지각은 면했다 ㅠㅠ");
        }
    }
    public static void randomEventSubwayAction(int hp){
        UnFixedEvent ufe = new UnFixedEvent();
        Student player = new Student();
        int delay = 1000;
        int i=0;
        for( i=0; i<3; i++){
            try{
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int random = (int) (Math.random()*2+1);
            if(i==0){
                System.out.println("지하철 타러 갈 준비중~~~");
                if(random==1){
                    System.out.println(ufe.getUfeEvent(1));
                    player.setHp(hp +5);
                }
            }else if(i==1){
                System.out.println("지하철 타러 가는 중~~~");
                if(random==1){
                    System.out.println(ufe.getUfeEvent(6));
                    player.setHp(hp-5);
                    System.out.println("다음 지하철 기다리는중... ㅠ");
                    break;
                }
            } else if(i==2){
                System.out.println("지하철 타고 학교 도착!");
                player.setHp(hp + 5);
            }
        }
        if(i==1){
            System.out.println("지하철 타고 무사히 학교 도착...");
        }
    }
    public static void randomEventBusAction(int hp) {
        UnFixedEvent ufe = new UnFixedEvent();
        Student player = new Student();
        int delay = 1000;
        int i=0;
        for ( i = 0; i < 3; i++) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int random = (int) (Math.random()*2 +1);
            if(i ==0){
                System.out.println("버스 타러 가는중...");
            } else if( i==1){
                if(random ==1){
                    System.out.println(ufe.getUfeEvent(5));
                    System.out.println("갑자기 어지러워지기 시작했다...");
                    player.setHp(hp -5);
                    System.out.println("다음 버스를 기다리자...");
                    break;
                }
            } else if (i==2){
                System.out.println("버스타고 학교 도착!");
                player.setHp(hp+5);
            }
        }
        if(i==1){
            System.out.println("학교에 무사히 도착했다...");
        }
    }
    public static void randomEventWalkingAction(int hp){
        UnFixedEvent ufe = new UnFixedEvent();
        Student player = new Student();
        int delay = 1000;

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
                    player.setHp(hp + 10);
                }
            } else if(i==1){
                System.out.println("걸어가는 중...");
                if(random==1){
                    System.out.println(ufe.getUfeEvent(5));
                    player.setHp(hp-5);
                }
            } else {
                System.out.println("학교에 도착했다!");
            }
        }

        player.setHp(hp-10);
    }
    public static class Morning {
        // 아침 이벤트
        public static void runMorningEvent(Student player) {
            Scanner sc = new Scanner(System.in);
            FixedEvent fe = new FixedEvent();
            UnFixedEvent ufe = new UnFixedEvent();

            // 시간 설정 및 체력 설정
            int hp = 30;
            player.setHp(hp);

            // 아침기상 이후 이벤트 출력
            fe.getwakeUpFEvent();
            player.morningRandomEvent();

            int choice;
            // 사용자가 1에서 4 사이의 올바른 선택을 할 때까지 반복하여 입력을 받음
            while (true) {
                choice = sc.nextInt();
                if (choice >= 1 && choice <= 4) {
                    break;
                } else {
                    System.out.println("잘못된 선택입니다. 1에서 4 사이의 숫자를 입력해주세요.");
                }
            }

            switch (choice) {
                case 1:
                    randomEventWalkingAction(hp);
                    break;
                case 2:
                    randomEventBusAction(hp);
                    break;
                case 3:
                    System.out.println("'전철'을 선택했습니다.");
                    System.out.println("전철을 탑니다.");
                    player.setHp(hp + 5);
                    break;
                case 4:
                    System.out.println("'택시'를 선택했습니다.");
                    System.out.println("택시를 탑니다.");
                    player.setHp(hp + 10);
                    break;
            }
            MorningSchool.MorningSchoolEvent(player);
        }
    }


    public class MorningSchool {
        public static void MorningSchoolEvent(Student player) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();

            // 체력이 5이하인 경우
            if (player.getHp() <= 5) {
                System.out.println("아 너무 힘들어서 자버렸다..ㅠ 큰일났네");
                player.setHp(player.getHp() + 20); // 체력 증가
                player.setIntelligence(player.getIntelligence() - 10); // 지능 감소
                sc.close();
                return; // 메서드 종료
            }
            // 오전 수업 중 돌발 이벤트 발생
            player.morningClassRandomEvent();
            System.out.println();
            System.out.println("할 일을 선택하세요: ");
            FixedEvent fixedEvent = new FixedEvent();
            for (String event : fixedEvent.morningStudyFEvent) {
                System.out.println(event);
            }

            int choice;
            // 사용자가 1에서 4 사이의 올바른 선택을 할 때까지 반복하여 입력을 받음
            while (true) {
                choice = sc.nextInt();
                if (choice >= 1 && choice <= 4) {
                    break;
                } else {
                    System.out.println("잘못된 선택입니다. 1에서 4 사이의 숫자를 입력해주세요.");
                }
            }

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
                        // 체력이 10 이상이면 지능을 20 증가
                        if (player.getHp() >= 10) {
                            player.setIntelligence(player.getIntelligence() + 20);
                        } else { // 체력이 6 이상 10 미만인 경우 지능을 10 증가
                            player.setIntelligence(player.getIntelligence() + 10);
                        }
                    }
                } else {
                    System.out.println("오답입니다. 공부를 좀 더 해주세요.");
                    player.setIntelligence(player.getIntelligence() - 10);
                }
            } else if (choice == 1) {
                if (rand.nextBoolean()) {
                    System.out.println("흠냐흠냐.. 잘잤다");
                    player.setHp(player.getHp() + 20); // 체력 증가
                } else {
                    System.out.println("아.. 교수님께 들켜서 혼났다.");
                    player.setHp(player.getHp() - 10); // 체력 감소
                    player.setIntelligence(player.getIntelligence() - 10); // 지능 감소
                }
            }
            // 게임 - 3번 선택
            else if (choice == 3) {
                // 50%의 확률로 정글님 사랑해요 메시지 출력
                if (rand.nextBoolean()) {
                    System.out.println("정글님 사랑해요!!!!!!!!! ... 승급에 성공했다.");
                    player.setHp(player.getHp() + 10); // 체력 증가
                    player.setIntelligence(player.getIntelligence() + 10); // 지능 증가
                } else {
                    System.out.println("아 우리 서포터 왜 이래!!! ... 강등 당했다.");
                    player.setHp(player.getHp() - 20); // 체력 감소
                    player.setIntelligence(player.getIntelligence() - 10); // 지능 감소
                }
                // 쇼츠 - 4번 선택
            } else if (choice==4) {
                if (rand.nextBoolean()) {
                    System.out.println("몰폰은 역시 짜릿해");
                    player.setHp(player.getHp() + 10); // 체력 증가
                } else {
                    System.out.println("모르고 소리를 크게 틀어버렸다.. 너무 부끄러워");
                    player.setHp(player.getHp() - 10); // 체력 감소
                    player.setFame(player.getFame() - 10); // 인망 감소
                }
            }

        }

    }
}
