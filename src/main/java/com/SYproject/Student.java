package com.SYproject;

public class Student {
        private int hp; // 체력
        private int intelligence; // 지능
        private int money; // 소지금
        private int fame; // 인망
        private int hiddenAbility; // 히든 능력치


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
}
