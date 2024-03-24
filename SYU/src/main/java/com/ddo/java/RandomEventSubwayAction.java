package com.ddo.java;

public class RandomEventSubwayAction {
    public void randomEventSubwayAction(int hp){
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
}
