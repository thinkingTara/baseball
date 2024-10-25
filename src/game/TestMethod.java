package game;

public class TestMethod {
    boolean flag1 = true;
    boolean flag2 = true;
    int[] answerNums = new int[3];

    void makerandom() {
        int answer0 = (int) (Math.random() * 10);
        if (answer0 != 0) {
            answerNums[0] = answer0;
        }

        int answer1 = (int) (Math.random() * 10);
        while (flag1) {
            for (int a : answerNums) {
                System.out.println("aaaaa " + a);
                if (a != answer1) {
                    answerNums[1] = answer1;
                    flag1 = false;
                    break;
                } else {
                    answer1 = (int) (Math.random() * 10);
                }
            }
        }
        int answer2 = (int) (Math.random() * 10);
        while (flag2) {
            for (int a : answerNums) {
                System.out.println("---- a  " + a);
                if (a != answer2) {
                    answerNums[2] = answer2;
                    flag2 = false;
                    break;
                } else {
                    answer2 = (int) (Math.random() * 10);
                }
            }

        }

    }
}
