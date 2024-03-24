package com.ddo.java;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.print("닉네임을 입력해주세요: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        // 캐릭터 생성
        Student player = new Student(100, 50, 200, 0);
        for (int day = 1; day <= 14; day++) { // 14일간 게임 진행
            System.out.println("Day " + day); // 날짜 출력
            // 캐릭터 상태 출력
            if (day % 4 == 0) {
                player.displayStats();
            }

            // 아침 이벤트 실행
            Morning morning = new Morning();
            morning.runMonrningEvent(player);
        }
    }
}


