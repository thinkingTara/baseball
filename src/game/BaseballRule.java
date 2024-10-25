package game;

import java.util.ArrayList;

public class BaseballRule {

    int[] changedArr;
    ArrayList<Integer> answerList;
    int countStrike = 0;
    int countBall = 0;
    int countOut = 0;

    // 생성자
    public BaseballRule(ArrayList<Integer> answerList, int[] changedArr) {
        this.answerList = answerList;
        this.changedArr = changedArr;
    }

    // 정답과 입력값 비교
    int compare() {
        for (int i = 0; i < changedArr.length; i++) {
            if (answerList.contains(changedArr[i])) {
                int index = answerList.indexOf(changedArr[i]);
                if (index == i) {
                    System.out.println("---- index == i : " + index);
                    countStrike++;
                } else {
                    countBall++;
                    System.out.println("countball : " + countBall);
                }
            } else {
                countOut++;
            }
        }
        System.out.println("스트라이크 :" + countStrike + "  볼 : " + countBall + " 아웃: " + countOut);
        return countStrike;
    }
}
