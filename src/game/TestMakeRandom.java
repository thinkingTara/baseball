package game;

import java.util.ArrayList;

public class TestMakeRandom {

    // 1차 시도 : 하나하나 어떻게 들어갈지 하드코딩
    boolean flag1 = true;
    boolean flag2 = true;
    int[] answerNums = new int[3];

    // 1차 시도 : 하나하나 어떻게 들어갈 지 하드코딩
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

    // 2차 시도 : 뭘하려고 했는지 까먹음. while문으로 하면 편한데,,for로 해서 배열[] 순서에 따라 넣으려고해서 복잡해짐
    int[] makeAnswer01() {
        // 동적 배열 makeNums생성
        ArrayList<Integer> makeNums = new ArrayList<Integer>();

        // 변수 makeNumber 랜덤값으로 생성 후 int로 변환
        int makeNumber = (int) (Math.random() * 10);

        // 만들어진 값이 0이 아닐 때 동적배열에 담기.  0이면 다시 랜덤생성
        if (makeNumber != 0) {
            // 밑에 for문의 answerNums 으로 재현한 부분을 -> makeNums동적배열로 변경하려다 멈췄음
            if (makeNums.size() != 3) {
                for (int i = 0; i < makeNums.size() + 1; i++) {
                    if (makeNums.contains(makeNumber)) {

                    }
                }
            }
            // 중복확인. makeNums(동적배열)에 담겨있는 값과 makeNumber (랜덤생성으로 만든 값)을 비교
            // 동적배열에 있는 값을 for문으로 비교하려니 어려워서 answerNum 의 길이로 비교.anwerNum 배열에 순서대로 넣음
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

    // git에 커밋한 2차시도 버전의 makeAnswer() 메소드. 3차시도거로 변경해야해서 이곳에 옮겨놓음
    boolean flag = true;

    //    int[] answerNums = new int[3];
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


    // 3차 시도 : 동적배열로 다시 구현. for문을 while문으로 변경하니까 쉬워짐.
    // int first = 랜덤으로 int 1개 생성  -> first !=0; *3
    ArrayList<Integer> genArr = new ArrayList<>();

    void generateNumber() {
        while (genArr.size() != 3) {
            int genNum = (int) (Math.random() * 10);
            if (genNum != 0 && !genArr.contains(genNum)) {
                genArr.add(genNum);
                System.out.println("genArr.size() : " + genArr.size() + " genArr : " + genArr);
            }
        }
    }


}
