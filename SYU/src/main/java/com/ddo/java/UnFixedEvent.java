package com.ddo.java;

public class UnFixedEvent {
    private String[] ufEvent =
            {       /* 인덱스 0~3 까지는 7시~10시까지 일어날 돌발 이벤트*/
                    /* 전체적으로 짝수는 마이너스 홀수는 플러스 텍스트다.*/
                    "눈 떠 보니... 8시 반~~?? 뛰어야 하나...ㅠ ", //0
                    "여유롭게 일어나서 아침밥 야무지게 먹을까?", //1
                    "아 똥이 안나온다 유산균좀 먹을걸 ㅠㅠ",  //2
                    "커피 사가면서 아침수업 빡집중 해볼까?", //3

                    /* 인덱스 4~6번 까지는 10~13시 오전 수업때 일어날수 있는 돌발 이벤트*/
                    "Zzzzzz..... 컥! 어... 몇...시지? 오늘은 대충 들을까?", //4
                    "오.... 오늘 수업 느낌 있는데?? 좀 더 집중해볼까?", //5
                    "아... 교수님... 왜 갑자기 쪽지 시험을 OTL..ㅠㅠㅠㅠㅠ ", //6
            };

    public void getUfeInformation(){
        for(int i=0; i<ufEvent.length; i++){
            System.out.println(ufEvent[i]);
        }
    }

    public String getUfeEvent(int num){
        return ufEvent[num];
    }
}
