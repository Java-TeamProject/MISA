package com.ddo.java;

public class Data {
    // 마지막 오전 수업이 끝나고 점심으로 넘겨주 data
    private Student player;

    public Data(Student player) {
        this.player = player;
    }

    public Student getPlayer() {
        return player;
    }

    public void setPlayer(Student player) {
        this.player = player;
    }
}
