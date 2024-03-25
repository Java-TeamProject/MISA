package com.SYproject;

public class EventTxt {

    //FE
    private String[] wakeUpFEvent =
            { /* 고정 이벤트 */
                    /* 아침 기상 때 일어날 고정 이벤트 (선택형)*/
                    "1. 걸어간다",
                    "2. 버스를 버슈웅",
                    "3. 전철을 탄다.",
                    "4. 택시를 탄다.",
            };

    public String[] morningStudyFEvent =
            {
                    /* 오전 수업 떄 일어날 고정 이벤트 (선택형)*/
                    "1. 피곤하니 잔다.",
                    "2. 수업을 듣는다.",
                    "3. 교수님 몰래 롤을 하며 랭크를 올린다.",
                    "4. 무지성 SNS쇼츠 도파민에 중독된다."
            };

    public void getwakeUpFEvent(){
        for(int i=0; i< wakeUpFEvent.length; i++){
            System.out.println(wakeUpFEvent[i]);
        }
    }

    public void getMorningStudyFEvent(){
        for(int i=0; i< morningStudyFEvent.length; i++){
            System.out.println(morningStudyFEvent[i]);
        }
    }

    public String[] getWakeUpFEvent() {
        return wakeUpFEvent;
    }

    public void setWakeUpFEvent(String[] wakeUpFEvent) {
        this.wakeUpFEvent = wakeUpFEvent;
    }

    public void setMorningStudyFEvent(String[] morningStudyFEvent) {
        this.morningStudyFEvent = morningStudyFEvent;
    }

    //UFE
    private String[] ufEvent =
            {       /* 인덱스 0~3 까지는 7시~10시까지 일어날 돌발 이벤트*/
                    /* 전체적으로 짝수는 마이너스 홀수는 플러스 텍스트다.*/
                    "눈 떠 보니... 8시 반~~?? 뛰어야 하나...ㅠ ", //0
                    "여유롭게 일어나서 아침밥 야무지게 먹을까?", //1
                    "아 똥이 안나온다 유산균좀 먹을걸 ㅠㅠ",  //2
                    "커피 사가면서 아침수업 빡집중 해볼까?", //3
                    "아! ㅠㅠ 가다가 넘어졌어 ㅠㅠㅠㅠ",//4
                    "버스가 눈앞에서 버슈우웅~~~", //5
                    "눈 앞에서 지하철이 가버렷!!!", //6
                    "돈 더 써서 택시 탔는데... 왜 막히는 거야 ㅠㅠㅠㅠ", //7

                    /* 인덱스 4~6번 까지는 10~13시 오전 수업때 일어날수 있는 돌발 이벤트*/
                    "Zzzzzz..... 컥! 어... 몇...시지? 오늘은 대충 들을까?",
                    "오.... 오늘 수업 느낌 있는데?? 좀 더 집중해볼까?",
                    "아... 교수님... 왜 갑자기 쪽지 시험을 OTL..ㅠㅠㅠㅠㅠ ",
            };

    public void getUfeInformation(){
        for(int i=0; i<ufEvent.length; i++){
            System.out.println(ufEvent[i]);
        }
    }

    public String getUfeEvent(int num){
        return ufEvent[num];
    }

    public void displayStats(Student student) {
        System.out.println("체력: " + student.getHp());
        System.out.println("지능: " + student.getIntelligence());
        System.out.println("소지금: " + student.getMoney());
        System.out.println("인망: " + student.getFame());
        System.out.println("히든 능력치 '교수님의 선택': " + student.getHiddenAbility());
    }
}
