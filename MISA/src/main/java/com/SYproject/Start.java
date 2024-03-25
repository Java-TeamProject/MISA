package com.SYproject;

import java.util.Random;
import java.util.Scanner;

public class Start {
    public void start (Student player){
//        System.out.print("닉네임을 입력해주세요: ");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        EventTxt eventTxt = new EventTxt();
//
//            // 캐릭터 생성
//            int day =1;  // 14일간 게임 진행
//            System.out.println("Day " + day); // 날짜 출력
//
//            // 캐릭터 상태 출력
//            if (day % 4 == 0) {
//                eventTxt.displayStats(player);
//            }

            // 아침 이벤트 실행
            Morning morning = new Morning();
            morning.runMonrningEvent(player);

    }


    public int morningClassRandomEvent() {
        Random rand = new Random();
        String[] events = {
                "Zzzzzz..... 컥! 어... 몇...시지? 오늘은 대충 들을까?", // -10 지능
                "오.... 오늘 수업 느낌 있는데?? 좀 더 집중해볼까?", // +10 지능
                "아... 교수님... 왜 갑자기 쪽지 시험을 OTL..ㅠㅠㅠㅠㅠ ", // 인망 변화 없음
                "교수님이 깜짝 퀴즈를 내셨다. 급히 공부해야겠다...", // -10 지능
                "긴 수업으로 인해 배고파진다." // -10 체력
        };

        // 극악의 확률로 돌발 이벤트 발생
        if (rand.nextInt(10) == 0) {
            String event = events[rand.nextInt(events.length)];
            System.out.println(event);

            // 이벤트에 따른 변화를 반환
            if (event.equals("Zzzzzz..... 컥! 어... 몇...시지? 오늘은 대충 들을까?")) {
                return -10; // 지능 감소
            } else if (event.equals("오.... 오늘 수업 느낌 있는데?? 좀 더 집중해볼까?")) {
                return 10; // 지능 증가
            } else if (event.equals("교수님이 깜짝 퀴즈를 내셨다. 급히 공부해야겠다...")) {
                return -10; // 지능 감소
            } else if (event.equals("긴 수업으로 인해 배고파진다.")) {
                return -10; // 체력 감소
            }
        }
        return 0; // 이벤트 발생 안 함
    }


}
