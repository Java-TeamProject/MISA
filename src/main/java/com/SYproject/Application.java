package com.SYproject;

public class Application {
    public static void main(String[] args) {
        int day=0;
        Student student = new Student(100, 0, 0, 0);

        while(true) {

            Start start = new Start();
            start.start(student);
            AfterFix afterFix = new AfterFix();
            afterFix.AfterFixEvent(student);
            day++;
            if(day>14)break;
        }

        Ending ending = new Ending(student);
        ending.resultEnding();

    }
}
