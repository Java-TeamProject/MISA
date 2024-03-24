package com.ddo.java;

public class RandomEventWalkingAction {
    public void randomEventWalkingAction(int hp){
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
                    System.out.println(ufe.getUfeEvent(4));
                    player.setHp(hp-5);
                }
            } else {
                System.out.println("학교에 도착했다!");
            }
        }

        player.setHp(hp-10);
    }
}
