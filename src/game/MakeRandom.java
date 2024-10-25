package game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MakeRandom {

    boolean flag = true;
    int[] answerNums = new int[3];

    int[] makeAnswer() {
        // 동적 배열 makeNums생성
        ArrayList<Integer> makeNums = new ArrayList<Integer>();

        // 변수 makeNumber 랜덤값으로 생성 후 int로 변환
        int makeNumber = (int) (Math.random() * 10);

        // 만들어진 값이 0이 아닐 때 동적배열에 담기.  0이면 다시 랜덤생성
        if (makeNumber != 0) {

            // 중복확인. makeNums(동적배열)에 담겨있는 값과 makeNumber (랜덤생성으로 만든 값)을 비교
            for (int i = 0; i < answerNums.length; i++) {
                // 동적배열의 사이즈가 3보다 작을 때 동적배열에 값을 담음
                if (makeNumber == answerNums[i]) {
                    makeNumber = (int) (Math.random() * 10);
                    i -= 1;
                } else {
                    if (makeNums.size() != 3) {
                        answerNums[i] = makeNumber;
                        makeNums.add(makeNumber);
                        System.out.println("answerNums [" + i + "]" + answerNums[i]);
                        makeNumber = (int) (Math.random() * 10);
                    } else {
                        break;
                    }

                }
            }
        }


        return answerNums;

    }
}
