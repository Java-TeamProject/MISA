package com.SYproject;

import java.util.Random;
import java.util.Scanner;

public class AfterFix {

        /*1.	공부 (체력에 따라)
                결말 (1) 공부하다 잠들었다. 아침 된다. (체력 up)
                (침대 선택지와 수치 차이 두기)
                결말 (2) 공부 끝 (체력 down, 지능 up)
          2.	대학사람과 약속(술)
                        결말 (1) 확률로 술 마심 정도 정해서 결말 정하기
                (체력 down, 인망 up)
                        -> 돌발이벤트 여부
          3.	휴식시간 (유튜브 보기)
                -> 돌발이벤트 여부
          4.	잠 (확률 10퍼 정도?)
                결말 (1) 악몽을 꿔서 체력이 적게 올라갔다.
                결말 (2) 푹 잘 자서 체력 많이 올라갔다.
*/
    public static void AfterFixEvent(Student std){
        AfterSuddenEvent afterSuddenEvent=new AfterSuddenEvent();

        //오후 타임 시작 멘트
        System.out.println();
        System.out.println("< 오후 5시 오후 수업 종료 >");
        System.out.println();
        System.out.println("드디어 오늘의 모든 수업이 끝났다!");
        System.out.println("수업 듣느라 고생했는데 오후 시간을 어떻게 보내면 좋을까?");

        //오후에 뭐할지 선택 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 미래 발전을 위한 공부를 한다.");
        System.out.println("2. 대학사람들과 시시콜콜 이야기를 나누며 재밌는 술자리를 갖는다.");
        System.out.println("3. 오늘 하루 고생 많았으니 집에 가서 유튜브를 보며 휴식을 취한다.");
        System.out.println( "4. 내일을 위해 일찍 잠에 든다.");
        System.out.print("입력 : ");
        int num = sc.nextInt();
        System.out.println();

        //선택사항에 맞춰 출력
        switch (num){
            case 1:
                //공부 선택
                System.out.println("공부를 하기로한 나는 씻고 바로 의지 넘치게 책상 앞에 앉았다.");
                System.out.println();
                System.out.println("공부 중...");
                System.out.println();
                if(std.getHp()<50){
                    System.out.println("오늘 하루 너무 힘들었다ㅠㅠ 결국 공부하다 꿈나라로~");
                    System.out.println("[체력] -20");
                    System.out.println();
                    std.setHp(std.getHp() - 20);
                    System.out.println("[체력] : "+std.getHp()+" [지능] : "+std.getIntelligence()+" [인망] : "+std.getFame());
                }else{
                    System.out.println("목표량까지 공부를 완수 완료! 내 자신 대단해!!");
                    System.out.println("지능 30 올랐지만 공부에 너무 열중한 나머지 체력이 10 떨어졌다...");
                    System.out.println("[지능] : +30 , [체력] : -10");
                    System.out.println();
                    std.setIntelligence(std.getIntelligence() +30);
                    std.setHp(std.getHp() - 10);
                    System.out.println("[체력] : "+std.getHp()+" [지능] : "+std.getIntelligence()+" [인망] : "+std.getFame());
                }
                break;

            case 2:
                //대학사람들과 약속 선택
                System.out.println("대학사람들과의 약속 장소로 룰루랄라 가는중");
                System.out.println("선후배들과 오랜만에 만나는 자리라 몹시 두근두근 거리고 긴장감 Max~!");
                System.out.println();
                System.out.println("술자리 중...");
                System.out.println();
                // 각 단계별 확률 설정
                double[] percent1 = {0.3, 0.4, 0.3}; // 각각 20%, 50%, 30%의 확률로 술을 마심

                // 단계별 메시지 설정
                String[] messages = {"기분 좋을 만큼 마셨다 딱 좋아! [체력] : -10, [인망] : +20 ",
                        "아.. 조금 알딸딸한데? 그래도 집에는 가야지. [체력] : -20, [인망] : +20",
                        "너무 재밌어서 술 조절 완전 실패ㅠㅠ 친구한테 데려다 달라해야겠다.. [체력] : -30, [인망] : +10"};

                // 각 단계별 체력 회복량 설정
                int[] updateHp = {-10, -20, -30}; // 선택사항에 따라 체력 깎임

                //각 단계별 인망량 설정
                int[] updateintel = {+20, +20, +10};

                // Random 객체 생성
                Random random = new Random();

                // 0부터 1 사이의 난수 생성
                double randomNum = random.nextDouble();

                // 각 단계별 확률을 비교하여 어느 단계에 해당하는지 결정
                for (int i = 0; i < percent1.length; i++) {
                    if (randomNum < percent1[i]) {
                        System.out.println(messages[i]);
                        // 해당 단계의 체력 회복량을 적용
                        std.setHp(std.getHp() + updateHp[i]);
                        std.setIntelligence(std.getIntelligence()+updateintel[i]);

//                        //돌발이벤트 발생
//                        if(0==(int)(Math.random()*3)){
//                            afterSuddenEvent.meetCollegeSenior(std);
//                        }

                        System.out.println("[체력] : "+std.getHp()+" [지능] : "+std.getIntelligence()+" [인망] : "+std.getFame());
                        break;
                    }
                    // randomNum -= probabilities[i]; // 현재 단계의 확률만큼 값을 감소시켜 다음 단계의 비교를 위해 준비
                }
//                if(0==(int)(Math.random()*3)){
                    afterSuddenEvent.meetCollegeSenior(std);
//                }
//                if(Math.random() < 1.0/3.0){
//                    afterSuddenEvent.meetCollegeSenior(std);
//                }


                break;

            case 3:
                System.out.println("피곤한 몸을 이끌고 집에 와서 푹신한 침대에 누워 유튜브를 본다.");
                System.out.println();
                System.out.println("힐링 중...");
                System.out.println();

//                // 돌발이벤트 확률 설정
//                double randomPercent3 = 0.3; // 30%의 확률로 돌발이벤트 발생
//
//                Random random3 = new Random();
//                // 0부터 1 사이의 난수 생성
//                double RandomNumber3 = random3.nextDouble();
//
//                // 돌발이벤트 확률에 따라 실행 선택
//                if (RandomNumber3 < randomPercent3) {
//                    //돌발이벤트 자리
                    afterSuddenEvent.playGameWell(std);
//                }

                //돌발이벤트
                System.out.println();
                System.out.println("충분한 휴식을 취한 당신은 맘 편히 잔다. [체력] : +20");
                std.setHp(std.getHp() + 20);
                System.out.println("[체력] : "+std.getHp()+" [지능] : "+std.getIntelligence()+" [인망] : "+std.getFame());
                System.out.println();
                break;

            case 4:
                System.out.println("집에 오자마자 씻고 누워서, 내일을 위해 이른 잠자리에 든다.");
                System.out.println();
                System.out.println("꿈나라 여행 중 ...");
                System.out.println();
//                // 돌발이벤트 확률 설정
//                double randomPercent4 = 0.3; // 30%의 확률로 돌발이벤트 발생
//
//                Random random4 = new Random();
//                // 0부터 1 사이의 난수 생성
//                double RandomNumber4 = random4.nextDouble();
//
//                // 돌발이벤트 확률에 따라 실행 선택
//                if (RandomNumber4 < randomPercent4) {
//                    //돌발이벤트 자리
                afterSuddenEvent.emergencyRescue(std);
//                }
                // 꿈나라 여행 중의 확률 설정
                double dreamPercent = 0.1; // 10%의 확률로 꿈나라 여행

                // Random 객체 생성
                Random dreamRandom = new Random();

                // 0부터 1 사이의 난수 생성
                double dreamRandomNum = dreamRandom.nextDouble();

                // 꿈나라 여행 확률에 따라 결말 선택
                if (dreamRandomNum < dreamPercent ) {
                    // 악몽을 꾸는 경우
                    System.out.println("꿈 속에서 악몽을 꿔서 체력이 적게 회복된다. [체력] +10");
                    std.setHp(std.getHp() + 10);
                    System.out.println("[체력] : "+std.getHp()+" [지능] : "+std.getIntelligence()+" [인망] : "+std.getFame());
                    System.out.println();
                } else {
                    // 좋은 꿈을 꾸는 경우
                    System.out.println("푹 잠을 자서 체력이 많이 회복된다. [체력] +30");
                    std.setHp(std.getHp() + 30);
                    System.out.println("[체력] : "+std.getHp()+" [지능] : "+std.getIntelligence()+" [인망] : "+std.getFame());
                    System.out.println();
                }
            default:
                System.out.println("보기에 있는 숫자를 입력해주세요.");
                break;


        }
    }
}

