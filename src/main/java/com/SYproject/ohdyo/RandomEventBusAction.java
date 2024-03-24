package com.ddo.java;

public class RandomEventBusAction {
    public void randomEventBusAction(int hp){
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
}
