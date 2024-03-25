package com.SYproject;

import java.util.Random;

public class RandomEvent {

    //버스 선택지
    public void randomEventBusAction(Student student){
        EventTxt eventTxt = new EventTxt();
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
                System.out.println();
                System.out.println("버스 타러 가는중...");
                System.out.println();
            } else if( i==1){
                if(random ==1){
                    System.out.println(eventTxt.getUfeEvent(5));
                    System.out.println("갑자기 어지러워지기 시작했다...");
                    student.setHp(student.getHp() -5);
                    System.out.println("다음 버스를 기다리자...");

                    System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                    System.out.println();
                    break;
                }
            } else if (i==2){
                System.out.println("버스타고 학교 도착!");
                student.setHp(student.getHp()+5);
                System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                System.out.println();
            }
        }
        if(i==1){
            System.out.println("학교에 무사히 도착했다...");
            System.out.println();
        }
    }

    //전철 선택지
    public void randomEventSubwayAction(Student student){
        EventTxt eventTxt = new EventTxt();
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
                System.out.println();
                System.out.println("지하철 타러 갈 준비중~~~");
                System.out.println();
                if(random==1){
                    System.out.println(eventTxt.getUfeEvent(1));
                    student.setHp(student.getHp() +5);
                    System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                    System.out.println();
                }
            }else if(i==1){

                System.out.println("지하철 타러 가는 중~~~");
                if(random==1){
                    System.out.println(eventTxt.getUfeEvent(6));
                    student.setHp(student.getHp()-5);
                    System.out.println("다음 지하철 기다리는중... ㅠ");
                    System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                    System.out.println();
                    break;
                }
            } else if(i==2){
                System.out.println("지하철 타고 학교 도착!");
                student.setHp(student.getHp() + 5);
                System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                System.out.println();
            }
        }
        if(i==1){
            System.out.println("지하철 타고 무사히 학교 도착...");
            System.out.println();
        }
    }

    //택시 선택지
    public void randomEventTaxiAction(Student student){
        EventTxt eventTxt = new EventTxt();

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
                System.out.println();
                System.out.println("콜 택시 부르는 중~");
                System.out.println();
                if(random==1){
                    System.out.println(eventTxt.getUfeEvent(1));
                    student.setHp(student.getHp()+5);
                    System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                    System.out.println();
                }
            } else if(i==1){
                System.out.println("콜 택시 기다리는 중~");
                System.out.println();
                if(random==1){
                    System.out.println(eventTxt.getUfeEvent(7));
                    student.setHp(student.getHp() - 10);
                    System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                    System.out.println();
                    break;
                }
            } else if(i==2){
                System.out.println("택시타고 학교 도착~!");
                student.setHp(student.getHp()+10);
                System.out.println("1[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                System.out.println();
            }
        }
        if(i==1){
            System.out.println("어찌저찌 지각은 면했다 ㅠㅠ");
            System.out.println("1[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());

            System.out.println();
        }
    }

    //걸어가는 선택지
    public void randomEventWalkingAction(Student student){
        EventTxt eventTxt = new EventTxt();

        int delay = 1000;
        for(int i=0; i<3; i++){
            try{
                Thread.sleep(delay);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            int random = (int) (Math.random()*2 +1);
            if(i==0){
                System.out.println();
                System.out.println("걸어갈려고 준비중...");
                System.out.println();
                if(random ==1){
                    System.out.println(eventTxt.getUfeEvent(1));
                    student.setHp(student.getHp() + 10);
                    System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                    System.out.println();
                }
            } else if(i==1){
                System.out.println("걸어가는 중...");
                System.out.println();
                if(random==1){
                    System.out.println(eventTxt.getUfeEvent(4));
                    student.setHp(student.getHp()-5);
                    System.out.println("[체력] : "+student.getHp()+" [소지금] : "+student.getMoney()+" [지능] : "+student.getIntelligence()+" [인망] : "+student.getFame());
                    System.out.println();
                }
            } else {
                System.out.println("학교에 도착했다!");
                System.out.println();
            }
        }

        student.setHp(student.getHp()-10);
    }

    public int morningRandomEvent() {
        Random rand = new Random();
        System.out.println("흐암... 잘잤다~~~");
        System.out.println("학교를 어떻게 가야할까?");
        String[] events = {
                "눈 떠 보니... 8시 반~~?? 뛰어야 하나...ㅠ", // 체력 감소
                "여유롭게 일어나서 아침밥 야무지게 먹을까?", // 체력 증가
                "커피 사가면서 아침수업 빡집중 해볼까?" // 체력 증가
        };
        System.out.println();

        // 극악의 확률로 돌발 이벤트 발생
        if (rand.nextInt(10) == 0) {
            String event = events[rand.nextInt(events.length)];
            System.out.println(event);

            // 이벤트에 따른 변화를 반환
            if (event.equals("눈 떠 보니... 8시 반~~?? 뛰어야 하나...ㅠ")) {
                System.out.println();
                return -10; // 체력 감소
            } else if (event.equals("여유롭게 일어나서 아침밥 야무지게 먹을까?")) {
                System.out.println();
                return 10; // 체력 증가
            } else if (event.equals("버스가 눈앞에서 버슈우우웅~~택시를 타야하나....ㅠ")) {
                System.out.println();
                return -1000; // 소지금 감소
            } else if (event.equals("커피 사가면서 아침수업 빡집중 해볼까?")) {
                System.out.println();
                return 10; // 체력 증가
            }
        }
        return 0; // 이벤트 발생 안 함
    }

}
