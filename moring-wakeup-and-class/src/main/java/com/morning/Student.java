package com.morning;

public class Student {
    /*static을 사용하지 않을려는 이유
    * ex. 이 게임이 학생 유저가 여러명이라면
    * 학생의 hp는 모든 플레이어들이 똑같다는 가정일 때
    * static이 적합 -> 모든 학생들이 같은 hp값을 공유하게 사용하는게 올바름
    * 학생 혼자일때는 굳이 값을 공유하기 위해 static으로 묶을 필요가 없다.*/
    private String name;
    private int hp;
    private int intelligent;
    private int future;
    private int money;

    private int time; // 임의로 시간을 지정해 코드로 쓰기위해 이재혁이 만든 변수

    public int getTime(){
        return time;
    }

    public void setTme(int time){
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getIntelligent() {
        return intelligent;
    }

    public void setIntelligent(int intelligent) {
        this.intelligent = intelligent;
    }

    public int getFuture() {
        return future;
    }

    public void setFuture(int future) {
        this.future = future;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
