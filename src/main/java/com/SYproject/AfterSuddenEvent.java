package com.SYproject;

import java.util.Scanner;

public class AfterSuddenEvent{
    int many=30;
    int common=20;
    int few=10;

    public AfterSuddenEvent(){

    }

    Scanner sc=new Scanner(System.in);

    /*고정 대학사람들과 재밌는 술자리 선택 이벤트 연계 선배와의 술자리 돌발 이벤트*/
    public void meetCollegeSenior(Student student) {
        System.out.println();
        System.out.println("돌발 이벤트 발생!");
        System.out.println("친구들과 술을 마시고 집을 가는 도중 졸업 후 취업한 친한 선배를 만났다. \n" +
                "그 친한 선배가 나에게 끝나고 나랑 따로 술을 더 마시자고 한다.");
        System.out.println();
        System.out.println("1. 친한 선배와 술을 좀 더 같이 마신다. 당연히 사주시겠지..? (체력 -20, 인망 +20)");
        System.out.println("2. 거절하고 그대로 집으로 돌아가자. (능력치 변동 없음)");

        do {
            System.out.print("입력 : ");
            int num = sc.nextInt();
            if(num==1){
                if(student.getHp()<20){
                    System.out.println("체력이 모자랍니다. 다른 선택지를 골라주세요.");
                    continue;
                }
                System.out.println();
                System.out.println("\"그러죠 뭐. 술은 선배님이 사주는 거죠?\"\n\"당연히 내가 사줘야지! 오늘 아주 먹고 죽자! 너한테 사회생활의 무서움을 알려주지.\"\n" +
                        "당신은 오랜만에 만난 선배와 못다한 이야기를 하며 밤 늦게 시간을 보냈습니다.");
                System.out.println("체력 -20, 인망 +20");
                student.setHp(student.getHp()-common);
                student.setFame(student.getFame()+common);
                System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
              break;
            }
            else if(num==2){
                System.out.println("\"저도 같이 선배님하고 같이 마시고 싶은데 아쉽게도 내일 학교도 가야되고 밤이 늦어서 먼저 들어갈게요. 미안해요\"\n"+
                "\"아, 그래? 그러면 어쩔 수 없지\"\n당신은 선배의 제안을 거절한채 집으로 다시 돌아갑니다.");
                System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                break;
            }else{
                System.out.println("선택지외 숫자를 입력하셨습니다. 다시 입력해주세요.");
            }

        }while(true);
    }

    /*유튜브로 통한 휴식 시간 선택 이벤트 연계 게임 하기 돌발 이벤트*/
    public void playGameWell(Student student){
        System.out.println();
        System.out.println("돌발 이벤트 발생!");
        System.out.println("유튜브를 보면서 휴식중에 내가 하는 게임의 프로게이머의 슈퍼플레이 영상을 보았다.\n" +
                "영상을 보니 나도 이렇게 할 수 있을 거 같다는 자신감이 생긴다. 게임을 조금만 해볼까?");
        System.out.println();
        System.out.println("1. 내 안에 게이머의 혼이 불탄다. 이 정도는 나도 할 수 있을 것 같다. 게임하러가자! \n(50프로 확률로 게임을 패배, 승리" +
                "한다. 패배시 체력 –20, 승리시 체력 +30)");
        System.out.println("2. 내 주제에 이렇게 어떻게 하냐 괜히 게임했다가 기분만 상하지 말고 유튜브나 계속 보자 (변동 수치 없음)");

        do {
            System.out.print("입력 : ");
            int num = sc.nextInt();
            if(num==1){
                System.out.println();
                int game=(int)(Math.random()*2);
                switch (game){
                    case 0 :
                        System.out.println("당신의 활약으로 팀을 승리로 이끌었습니다! 같은 팀원들이 사실 프로게이머 아니냐고 호들갑을 떱니다.\n" +
                                "당신은 기분이 너무 좋아져, 하루의 피로가 날아갑니다.");
                        System.out.println("체력 +30");
                        student.setHp(student.getHp()+many);
                        System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                        break;
                    default:
                        System.out.println("당신의 판단으로 인해 팀이 패배했습니다. 같은 팀원들이 부모님의 안부를 묻습니다.\n" +
                                "당신은 게임을 괜히 했다는 생각을 합니다. 컨디션이 전보다 훨씬 안좋아졌습니다.");
                        System.out.println("체력 -20");
                        student.setHp(student.getHp()-common);
                        System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                        break;
                }
                break;
            }
            else if(num==2){
                System.out.println("당신은 다른 유튜브 영상으로 넘어가면서 침대에서 유튜브를 보며 계속 휴식을 취합니다.");
                System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                break;
            }else{
                System.out.println("선택지외 숫자를 입력하셨습니다. 다시 입력해주세요.");
            }

        }while(true);
    }


    /*일찍 잠드는 선택 이벤트 연계 옆집의 죽을 것같은 목소리 돌발 이벤트*/
    public void emergencyRescue(Student student){
        System.out.println();
        System.out.println("돌발 이벤트 발생!");
        System.out.println("잠을 자고 있는데 평소에 잘 알고 지내던 옆집에서 죽을 듯한 목소리가 들린다. 119를 부르고 응급실에 데려가야 할까?");
        System.out.println();
        System.out.println("1. 잠을 뒤로 하고, 응급실에 데려간다. (체력 -10, 인망 +20)");
        System.out.println("2. 잠꼬대하는 거겠지 잠이나 자자. (변동 수치 없음)");

        do {
            System.out.print("입력 : ");
            int num = sc.nextInt();
            if(num==1){
                if(student.getHp()<10){
                    System.out.println("체력이 모자랍니다. 다른 선택지를 골라주세요.");
                    continue;
                }
                System.out.println();
                System.out.println("당신은 상황이 심상치 않음을 느꼈고, 옆집 문앞으로가 문을 두드리기 시작했습니다. \n " +
                        "\"저기요! 괜찮으세요?!\" 아무 반응이 없자 119를 불렀고 안에는 경련을 일으키는 옆집 사람이 있었습니다.\n" +
                        "당신은 그를 구급차에 태워 응급실로 향했고, 옆집 사람의 상태는 호전되었습니다.\n" +
                        "옆집 사람의 가족은 당신에게 고마움을 표합니다. 비록 잠은 못 잤지만, 당신은 옆집 사람을 구했습니다.");
                System.out.println("체력 -10, 인망 +20");
                student.setHp(student.getHp()-few);
                student.setFame(student.getFame()+common);
                System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());

                break;
            }
            else if(num==2){
                System.out.println("잠꼬대라 생각한 당신은 다시 잠에 빠져듭니다. 시간이 조금 지나자 옆집에서 소리가 사라졌습니다.");
                System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                break;

            }else{
                System.out.println("선택지외 숫자를 입력하셨습니다. 다시 입력해주세요.");
            }

        }while(true);
    }


}
