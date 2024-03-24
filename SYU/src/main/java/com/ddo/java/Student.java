package com.ddo.java;

import java.util.Random;


public class Student {
    private int hp; // 체력
    private int intelligence; // 지능
    private int money; // 소지금
    private int fame; // 인망
    private int hiddenAbility; // 히든 능력치

    public Student() {

    }

    public Student(int hp){
        this.hp = hp;
    }
    // 생성자
    public Student(int hp, int intelligence, int money, int fame) {
        this.hp = hp;
        this.intelligence = intelligence;
        this.money = money;
        this.fame = fame;
        this.hiddenAbility = 0; // 초기값 설정
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getFame() {
        return fame;
    }

    public void setFame(int fame) {
        this.fame = fame;
    }

    public int getHiddenAbility() {
        return hiddenAbility;
    }

    public void setHiddenAbility(int hiddenAbility) {
        this.hiddenAbility = hiddenAbility;
    }

    // 오전 수업 전 돌발 이벤트
    public int morningRandomEvent() {
        Random rand = new Random();
        String[] events = {
                "눈 떠 보니... 8시 반~~?? 뛰어야 하나...ㅠ", // 체력 감소
                "여유롭게 일어나서 아침밥 야무지게 먹을까?", // 체력 증가
                "버스가 눈앞에서 버슈우우웅~~택시를 타야하나....ㅠ", // 소지금 감소
                "커피 사가면서 아침수업 빡집중 해볼까?" // 체력 증가
        };

        // 극악의 확률로 돌발 이벤트 발생
        if (rand.nextInt(10) == 0) {
            String event = events[rand.nextInt(events.length)];
            System.out.println(event);

            // 이벤트에 따른 변화를 반환
            if (event.equals("눈 떠 보니... 8시 반~~?? 뛰어야 하나...ㅠ")) {
                return -10; // 체력 감소
            } else if (event.equals("여유롭게 일어나서 아침밥 야무지게 먹을까?")) {
                return 10; // 체력 증가
            } else if (event.equals("버스가 눈앞에서 버슈우우웅~~택시를 타야하나....ㅠ")) {
                return -1000; // 소지금 감소
            } else if (event.equals("커피 사가면서 아침수업 빡집중 해볼까?")) {
                return 10; // 체력 증가
            }
        }
        return 0; // 이벤트 발생 안 함
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

    // 주요 능력치 출력 메서드
    public void displayStats() {
        System.out.println("체력: " + hp);
        System.out.println("지능: " + intelligence);
        System.out.println("소지금: " + money);
        System.out.println("인망: " + fame);
        System.out.println("히든 능력치 '교수님의 선택': " + hiddenAbility);
    }
}
