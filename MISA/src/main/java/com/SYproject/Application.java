package com.SYproject;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=1;
        Student student = new Student(100, 0, 0, 0);
        System.out.print("이름을 입력하세요 : ");
        student.setName(sc.nextLine());
        System.out.println("반갑습니다. " + student.getName() + "님!");
        System.out.println("당신은 지금 마지막 학기만 남겨둔 4학년 2학기 취준생입니다.");
        System.out.println("마지막 학교 생활을 시작하면서 다양한 상황들과 선택들이 당신을 기다리고 있습니다.");
        System.out.println("사이버 삼육대학교에서 당신의 미래를 펼쳐보세요.");

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
            if(day>14)break;
        }

        Ending ending = new Ending(student);
        ending.resultEnding();


        }

    }

