package com.ddo.java;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Start start = new Start();
        Student player = new Student(30,30,100,0);
        start.start(player);
    }
}


