package game;

public class BaseballRull {

    int countStrike = 0;
    int countBall = 0;
    int countOut = 0;

    // 정답과 입력값 비교
    void compare(int[] answerNums, int[] changedArr) {

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
        } else if (countStrike == 1 || countBall == 1) {
            countOut = 2;
        } else {
            countOut = 1;
        }

        System.out.println("스트라이크 :" +countStrike +"  볼 : "+countBall + " 아웃: " +countOut );
    }
}
