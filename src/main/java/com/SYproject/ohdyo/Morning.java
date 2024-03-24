package com.ddo.java;

import java.util.Scanner;

public class Morning {

    public void runMonrningEvent(Student player){
        Scanner sc = new Scanner(System.in);
        FixedEvent fe = new FixedEvent();
        UnFixedEvent ufe = new UnFixedEvent();

        // 시간 설정 및 체력 설정
        int hp = 30;
        player.setHp(hp);

        // 아침기상 이후 이벤트 출력
        fe.getwakeUpFEvent();
        player.morningRandomEvent();
        System.out.print("어떻게 갈건지 선택해주세요 : ");


        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                RandomEventWalkingAction walk = new RandomEventWalkingAction();
                walk.randomEventWalkingAction(hp);
                break;
            case 2:
                RandomEventBusAction bus = new RandomEventBusAction();
                bus.randomEventBusAction(hp);
                break;
            case 3:
                RandomEventSubwayAction subway = new RandomEventSubwayAction();
                subway.randomEventSubwayAction(hp);
                break;
            case 4:
                RandomEventTaxiAction taxi = new RandomEventTaxiAction();
                taxi.randomEventTaxiAction(hp);
                break;
        }
        MorningSchool morningSchool = new MorningSchool();
        morningSchool.morningSchoolEvent(player);


    }
}

