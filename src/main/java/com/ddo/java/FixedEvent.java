package com.ddo.java;


public class FixedEvent {
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
}
