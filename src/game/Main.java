package game;

public class Main {
    public static void main(String[] args) {
        // 랜덤 숫자 생성  - 배열로 랜덤 3번 받아서 생성 ? 랜덤 한 번 받고 3자리 정수로 만들지?  >> 배열로
        MakeRandom makeRandom = new MakeRandom();
        int[] answer = makeRandom.makeAnswer();
        System.out.println("----answerNums : " + makeRandom.answerNums );

        // 숫자 입력받기
        GetInputValue getInputValue = new GetInputValue();
        getInputValue.checkValue();
        // 입력받은 숫자 -> 배열로 변경
        int[]  getValue = getInputValue.chageToArr();

        // compare
        BaseballRull baseballRull = new BaseballRull();
        baseballRull.compare(answer, getValue);

    }
}
