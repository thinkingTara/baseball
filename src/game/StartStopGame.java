package game;

import java.util.ArrayList;
import java.util.Scanner;

public class StartStopGame {

    boolean flag = true;
    int strikeTotal = 0;
    ArrayList<Integer> answerList;
    int[] getValue;

    Scanner sc = new Scanner(System.in);
    int start = 1;
    int record = 2;
    int stop = 3;

    void welcome(){
        flag = true;
        System.out.println("숫자 야구입니다. 해당번호를 입력해주세요");
        System.out.println("1.게임시작  2.아직 누르지마세요  3.종료");
        int scNum = sc.nextInt();
        if(scNum == start) {
            startGame();
        }else if (scNum == record) {
            System.out.println("Not Yet :(");
        } else if(scNum == stop) {
            System.out.println("게임을 시작하지 않고 종료되었습니다.");
        }

    }

    void startGame(){
        // 랜덤 숫자 생성  - 배열로 랜덤 3번 받아서 생성 ? 랜덤 한 번 받고 3자리 정수로 만들지?  >> 배열로
        MakeRandom makeRandom = new MakeRandom();
        answerList = makeRandom.generateNumber();
        System.out.println("answerNums : " + answerList.toString());

        // 정답이 아니라면 계속 입력받기
        while (flag) {
            if (strikeTotal != 3) {
                // 숫자 입력받기
                GetInputValue getInputValue = new GetInputValue();
                getInputValue.checkValue();
                // 입력받은 숫자 -> 배열로 변경
                getValue = getInputValue.changedArr;

                // 정답과 입력값 비교
                BaseballRule baseballRull = new BaseballRule(answerList, getValue);
                strikeTotal = baseballRull.compare();
            } else {
                System.out.println("All Strike !! 정답입니다. 수고하셨습니다.");
                flag = false;
                welcome();
                break;
            }
        }
    }

    void stopGame(){

    }
}
