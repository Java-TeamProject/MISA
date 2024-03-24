package com.ddo.java;

public class RandomEventTaxiAction {

    public void randomEventTaxiAction(int hp){
        UnFixedEvent ufe = new UnFixedEvent();
        Student player = new Student();
        int delay = 1000;
        int i=0;
        for(i =0; i<3; i++){
            try{
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int random = (int) (Math.random()*2+1);
            if(i==0){
                System.out.println("콜 택시 부르는 중~");
                if(random==1){
                    System.out.println(ufe.getUfeEvent(1));
                    player.setHp(hp+5);
                }
            } else if(i==1){
                System.out.println("콜 택시 기다리는 중~");
                if(random==1){
                    System.out.println(ufe.getUfeEvent(7));
                    player.setHp(hp - 10);
                    break;
                }
            } else if(i==2){
                System.out.println("택시타고 학교 도착~!");
                player.setHp(hp+10);
            }
        }
        if(i==1){
            System.out.println("어찌저찌 지각은 면했다 ㅠㅠ");
        }
    }


}
