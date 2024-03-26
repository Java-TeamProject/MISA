package com.SYproject;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=1;
        Student student = new Student(100, 0, 0, 0);
        System.out.print("이름을 입력하세요 : ");
        student.setName(sc.nextLine());


        while(true) {
            System.out.println();
            System.out.println("Day"+day);
            System.out.println();
            Start start = new Start();
            start.start(student);
            LunchTimeEvent lunchTimeEvent= new LunchTimeEvent();
            lunchTimeEvent.lunchTimeEvent(student);
            AfternoonClass afternoonClass= new AfternoonClass();
            afternoonClass.afternoonFEStart(student);
            AfterFix afterFix = new AfterFix();
            afterFix.AfterFixEvent(student);
            day++;
            if(day>3)break;
        }

        Ending ending = new Ending(student);
        ending.resultEnding();

    }
}
