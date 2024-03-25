package com.SYproject;

public class Ending {
    private final int resultHp;
    private final int resultIntelligence;
    private final int ResultMoney;
    private final int resultFame;
    private final int resultHiddenAbility;
    public  String resultname;


    public Ending(Student student){
        resultHp=student.getHp();
        resultIntelligence=student.getIntelligence();
        resultFame=student.getFame();
        ResultMoney= student.getMoney();
        resultHiddenAbility = student.getHiddenAbility();
        resultname= student.getName();

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

        /*아스키코드 아트 객체 생성*/
        After_EndingASCIICodeArt art=new After_EndingASCIICodeArt();

        /*진엔딩 : 대기업 취업!*/
        if(getResultIntelligence()>=1000&&getResultFame()>=1000) {
            art.endingGood();//cg 출력

            System.out.println("4학년 1학기까지 흘러가는 대로 대학생활을 했던 나는 이번 학기, 누구보다 열심히 살았다."+'\n'+
                    "학업에 집중해 모든 과목을 A+ 학점을 받았고, 내 주위 사람들 후배,친구,선배,교수님에게 존경하는 사람이라고 불릴 수 있을 정도로 인간관계도 좋아졌다." +'\n'+
                    "그 때문이었을까, 졸업하자마자 우리나라에서 가장 큰 대기업에 이력서를 넣은 난 학교에서의 경험을 통해 당당히 합격했다." +'\n'+
                    "신이 존재한다면, 나를 이 길로 이끌어준 신에게 감사를 표한다.");

            System.out.println();
            System.out.println("진 엔딩 : 대기업 취업!");
            System.out.println();
            System.out.println();
            calculateResult();




            /*히든엔딩 : 대학원생*/
        }else if (getResultIntelligence()>=800&&getResultFame()>=800&&getResultHiddenAbility()==1) {
            art.endingSlave();//cg 출력

            System.out.println("졸업할 날이 얼마 안남았던 때, 이번 학기에 뵙고 친해진 교수님에게 연락이 왔다." +'\n'+
                    "교수님은 나에게 \"내가 학교 생활을 유심히 지켜봤는데, 학생만큼 성실한 학생은 본적이 잘 없네.\" 라고 하시며 " +'\n'+
                    "\"내가 이번에 진행할 연구가 있는데 같이 해보지 않겠나?\" 라고 제안을 주셨다. 연구 주제를 살펴본 나는 이번 학기에 큰 도움을 주시고" +
                    "편하게 대해 주셨던 그 교수님과 같이 하는 연구는 충분히 해볼만한 가치가 있다고 생각했다."+'\n'+ "그리고 나는 대학원생이 되었다." +'\n'+
                    "이 선택이 옳은 선택일지는 모르겠지만, 나에게 성공을 위한 밑거름이 될 것이다.");

            System.out.println();
            System.out.println("히든 엔딩 : 대학원생");
            System.out.println();
            System.out.println();
            calculateResult();

            /*노말엔딩 A : 무사히 졸업*/
        } else if (getResultIntelligence()>=800&&getResultIntelligence()>= getResultFame()) {
            art.endingA();//cg 출력

            System.out.println("졸업할 때가 다가왔다. 전 학기에는 학점이 불안정해 졸업을 못할 수도 있을 것 같다고 생각했다."+'\n'+
                    "그렇기 때문에 어느 때보다 학업에 집중하였고, 졸업 조건 학점을 넘어 괜찮은 학점으로 졸업 할 수 있게 되었다."+'\n'+
                    "마지막 학기를 통해 누구든지 굳센 마음을 가지고 노력한다면 목표한 바를 이룰 수 있다는 것을 깨달았다."+'\n'+
                    "나에게는 아직 많은 도전과 시련이 남아있다. 하지만 나는 모두 잘 이겨내어 성공을 이룰 수 있다고 생각한다");

            System.out.println();
            System.out.println("노말 엔딩A : 무사히 졸업");
            System.out.println();
            System.out.println();
            calculateResult();



            /*노말엔딩 B : 혈연 다음은 학연!*/
        } else if (getResultFame()>=800&&getResultIntelligence()< getResultFame()) {
            art.endingB();//cg 출력

            System.out.println("졸업할 때가 다가왔다. 전 학기에는 사람들과 인연도 없고, 몇몇 친구 말고는 얘기도 잘 하지 못했다."+'\n'+
                    "그렇기 때문에 졸업하기 전 사람들과 많은 인연을 만들고자, 성격을 바꾸고 많은 사람들과 만나고 많은 활동을 했다."+'\n'+
                    "그 결과, 졸업할 때가 되니 많은 친구들과 선배들이 자신이 일하는 곳에서 같이 일해볼 생각이 없냐는 제한이 많이 들어왔다."+'\n'+
                    "비록 높은 연봉의 일터는 아니었지만, 나를 필요로 하는 사람들이 있다는 점이 나의 학교 생활은 헛되지 않았다는 것을 보여줬다."+'\n'+
                    "사람들과의 인연이 좋은 결과를 만들어준 다는 깨달았고, 향후에도 사람들과의 인연이 좋은 결말을 가직고 올거라고 생각하였다..");

            System.out.println();
            System.out.println("노말 엔딩B : 혈연 다음은 학연!");
            System.out.println();
            System.out.println();
            calculateResult();



            /*배드엔딩 : 대학교 5학년*/
        }else {
            art.endingBad();
            System.out.println("졸업 할 때가 되었다. 문제는 학교 생활을 열심히 하지 못한 걸까. 졸업 요건을 맞추지 못했다...."+'\n'+
                    "다른 친구들은 모두 졸업하고, 나혼자 학교에 남아 강제 5학년을 다니며 졸업요건을 다시 채우게 되었다."+'\n'+
                    "같이 얘기하며 학교를 같이 다니던 몇 없는 친구마저 졸업을 하며 나는 혼자가 되었다. 어디서부터 선택을 잘못한 것일까"+'\n'+
                    "집근처 편의점에서 사온 소주를 마시며 생각해본다. 오늘따라 술이 너무 쓰다.");

            System.out.println();
            System.out.println("배드 엔딩 : 대학교 5학년...");
            System.out.println();
            System.out.println();
            calculateResult();
        }
    }

        /*캐릭터 능력치 정산*/
        public void calculateResult() {

            System.out.println("축하합니다. 엔딩에 도달하셨군요!");
            System.out.println("게임의 결과를 정산합니다!");
            System.out.println("플레이어 캐릭터 "+resultname+"의 능력치");
            System.out.println("플레이어 캐릭터의 최종 체력 : " + getResultHp());
            System.out.println("플레이어 캐릭터의 최종 소지금 : " + getResultMoney());
            System.out.println("플레이어 캐릭터의 최종 지능 : " + getResultIntelligence());
            System.out.println("플레이어 캐릭터의 최종 인망 : " + getResultFame());
            System.out.println();
            System.out.println("게임의 결과에 만족하지 못하셨나요?");
            System.out.println("이 게임은 능력치에 따른 엔딩이 여러 개 존재하며 히든엔딩 또한 존재합니다!");
            System.out.println("아직 확인 못한 엔딩이 있다면 다시 한번 도전해 봅시다!");
            System.out.println("그리고 저희 게임을 플레이 해주신 플레이어분들 진심으로 감사드립니다.");
        }
}
