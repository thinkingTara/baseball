package game;

public class TestBaseball {

    // git에 올라간 1차 작성 (24.10.25)
    int[] answerNums;
    int[] changedArr;

    // 생성자
//    public BaseballRule(int[] answerNums, int[] changedArr) {
//        this.answerNums = answerNums;
//        this.changedArr = changedArr;
//    }

    int countStrike = 0;
    int countBall = 0;
    int countOut = 0;
    boolean flag = true;
    GetInputValue getInputValue = new GetInputValue();

    int ballCompare() {
        for (int i = 0; i < answerNums.length; i++) {
            for (int j = 0; j < changedArr.length; j++) {
                if (answerNums[i] == changedArr[j]) {
                    if (i == j) {
                        countStrike++;
                    } else {
                        countBall++;
                    }
                }
            }
        }
        if (countStrike == 0 && countBall == 0) {
            countOut = 3;
        } else if (countStrike == 1 && countStrike == 1) {
            countOut = 1;
        } else {
            countOut = 2;
        }

        System.out.println("스트라이크 :" + countStrike + "  볼 : " + countBall + " 아웃: " + countOut);
        return countStrike;
    }

}
