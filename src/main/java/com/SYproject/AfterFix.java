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
        //오후 타임 시작 멘트
        System.out.println("< 오후 5시 오후 수업 종료 >");
        System.out.println("드디어 오늘의 모든 수업이 끝났습니다!");
        System.out.println("수업 듣느라 고생한 당신, 오후 시간을 어떻게 보낼까요?");

        //오후에 뭐할지 선택 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 미래 발전을 위한 공부를 한다." +
                "2. 대학사람들과 시시콜콜 이야기를 나누며 재밌는 술자리를 갖는다." +
                "3. 오늘 하루 고생 많았으니 집에 가서 유튜브를 보며 휴식을 취한다." +
                "4. 내일을 위해 일찍 잠에 든다.");
        int num = sc.nextInt();

        //선택사항에 맞춰 출력
        switch (num){
            case 1:
                //공부 선택
                System.out.println("공부를 선택하셨군요! 당신은 씻고 바로 의지 넘치게 책상 앞에 앉았습니다.");
                System.out.println("공부 중...");
                if(std.getHp()<50){
                    System.out.println("오늘 하루 너무 지쳤던 당신은 공부하다 잠이 들어버렸습니다.");
                    System.out.println("체력이 20 오릅니다.");
                    std.setHp(std.getHp() - 20);
                    System.out.println("체력 : "+std.getHp()+" 소지금 : "+std.getMoney()+" 지능 : "+std.getIntelligence()+" 인망 : "+std.getFame());
                }else{
                    System.out.println("목표량까지 공부를 완수했습니다! 대단해요!");
                    System.out.println("지능 30 올랐지만 공부에 너무 열중한 나머지 체력이 10 떨어졌습니다.");
                    std.setIntelligence(std.getIntelligence() +30);
                    std.setHp(std.getHp() - 10);
                    System.out.println("체력 : "+std.getHp()+" 소지금 : "+std.getMoney()+" 지능 : "+std.getIntelligence()+" 인망 : "+std.getFame());
                }
                break;

            case 2:
                //대학사람들과 약속 선택
                System.out.println("대학사람들과의 약속 장소로 향합니다. 선후배들과 오랜만에 만나는 자리라 몹시 설레고 긴장하고 있습니다!");
                System.out.println("술자리 중...");

                // 각 단계별 확률 설정
                double[] percent1 = {0.3, 0.4, 0.3}; // 각각 20%, 50%, 30%의 확률로 술을 마심

                // 단계별 메시지 설정
                String[] messages = {"기분 좋을 만큼 마셨네요! 체력이 -10, 인망 20 증가합니다!",
                        "알딸딸한 정도로 마셨네요. 다행히 무사히 집에 도착했습니다. 체력이 -20, 인망 20 증가합니다.",
                        "자리가 너무 즐거웠던 탓에 술 조절을 못했네요! 결국 만취한 당신은 집에 꾸역꾸역 오는 바람에 체력 -30, 인망 20 증가합니다."};

                // 각 단계별 체력 회복량 설정
                int[] updateHp = {-10, -20, -30}; // 선택사항에 따라 체력 깎임

                //각 단계별 인망량 설정
                int[] updateintel = {+20, +20, +20};

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
                        System.out.println("체력 : "+std.getHp()+" 소지금 : "+std.getMoney()+" 지능 : "+std.getIntelligence()+" 인망 : "+std.getFame());
                        break;
                    }
                    // randomNum -= probabilities[i]; // 현재 단계의 확률만큼 값을 감소시켜 다음 단계의 비교를 위해 준비
                }

                //돌발이벤트 자리

                break;

            case 3:
                System.out.println("피곤한 몸을 이끌고 집에 온 당신, 푹신한 침대에 누워 유튜브를 시청합니다.");
                System.out.println("힐링 중...");
                //돌발이벤트
                System.out.println("충분한 휴식을 취한 당신은 맘 편히 잡니다. (체력 +20)");
                std.setHp(std.getHp() + 20);
                System.out.println("체력 : "+std.getHp()+" 소지금 : "+std.getMoney()+" 지능 : "+std.getIntelligence()+" 인망 : "+std.getFame());

                break;

            case 4:
                System.out.println("집에 오자마자 씻고 누운 당신, 내일을 위해 이른 잠자리에 듭니다.");
                System.out.println("꿈나라 여행 중 ...");
                // 꿈나라 여행 중의 확률 설정
                double dreamPercent = 0.1; // 10%의 확률로 꿈나라 여행

                // Random 객체 생성
                Random dreamRandom = new Random();

                // 0부터 1 사이의 난수 생성
                double dreamRandomNum = dreamRandom.nextDouble();

                // 꿈나라 여행 확률에 따라 결말 선택
                if (dreamRandomNum < dreamPercent ) {
                    // 악몽을 꾸는 경우
                    System.out.println("꿈 속에서 악몽을 꿔서 체력이 적게 회복됩니다. (체력 +10)");
                    std.setHp(std.getHp() + 10);
                    System.out.println("체력 : "+std.getHp()+" 소지금 : "+std.getMoney()+" 지능 : "+std.getIntelligence()+" 인망 : "+std.getFame());
                } else {
                    // 좋은 꿈을 꾸는 경우
                    System.out.println("푹 잠을 자서 체력이 많이 회복됩니다. (체력 +30)");
                    std.setHp(std.getHp() + 30);
                    System.out.println("체력 : "+std.getHp()+" 소지금 : "+std.getMoney()+" 지능 : "+std.getIntelligence()+" 인망 : "+std.getFame());
                }
            default:
                System.out.println("보기에 있는 숫자를 입력해주세요.");
                //돌발이벤트 자리
                break;

        }
    }
}

/*해야할거
 * 1. 수치가 정상적으로 작동하는지
 * 2. 3번 선택지 늘리기
 * 3. 너무 단순한 것 같으면 다른거 추가하기*/
