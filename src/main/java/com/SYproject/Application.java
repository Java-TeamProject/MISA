package com.SYproject;

public class Application {
    public static void main(String[] args) {
        Student player = new Student(100,0,0,0);
        Start start = new Start();
        start.start(player);

        LunchTimeEvent lunchTiemeEvent = new LunchTimeEvent();
        lunchTiemeEvent.lunchTimeEvent(player);

        AfternoonClass afternoonClass = new AfternoonClass();
        afternoonClass.afternoonFEStart(player);
    }
}
