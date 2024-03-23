package com.SYproject;

public class Ending {
    private final int resultHp;
    private final int resultIntelligence;
    private final int ResultMoney;
    private final int resultFame;
    private final int resultHiddenAbility;


    public Ending(Student student){
        resultHp=student.getHp();
        resultIntelligence=student.getIntelligence();
        resultFame=student.getFame();
        ResultMoney= student.getMoney();
        resultHiddenAbility = student.getHiddenAbility();

    }

    public int getResultHp() {
        return resultHp;
    }

    public int getResultIntelligence() {
        return resultIntelligence;
    }

    public int getResultMoney() {
        return ResultMoney;
    }

    public int getResultFame() {
        return resultFame;
    }

    public int getResultHiddenAbility() {
        return resultHiddenAbility;
    }

    public void resultEnding(){
        if(getResultIntelligence()>=1000&&getResultFame()>=1000) {
            System.out.println("진 엔딩 : 대기업 취업!");

        }else if (getResultIntelligence()>=800&&getResultFame()>=800&&getResultHiddenAbility()==1) {
                System.out.println("히든 엔딩 : 대학원생");


        } else if (getResultIntelligence()>=800&&getResultIntelligence()>= getResultFame()) {
            System.out.println("노말 엔딩A : 무사히 졸업");



        } else if (getResultFame()>=800&&getResultIntelligence()< getResultFame()) {
            System.out.println("노말 엔딩B : 혈연 다음은 학연!");


        }else {
            System.out.println("배드 엔딩 : 대학교 5학년...");
        }

        System.out.println("축하합니다 엔딩에 도달하셨군요!");
        System.out.println("게임의 결과를 정산합니다!");
        System.out.println("플레이어 캐릭터의 최종 체력 : "+getResultHp());
        System.out.println("플레이어 캐릭터의 최종 소지금 : "+getResultMoney());
        System.out.println("플레이어 캐릭터의 최종 지능 : "+getResultIntelligence());
        System.out.println("플레이어 캐릭터의 최종 인망 : "+getResultFame());
        System.out.println("플레이어 캐릭터의 히든 선택지 : "+getResultHiddenAbility());
    }
}
