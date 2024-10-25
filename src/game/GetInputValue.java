package game;

import java.util.Scanner;

public class GetInputValue {
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    boolean flag2 = true;
    int getValue = 0;
    int[] changedArr = new int[3];


    void checkValue() {
        while (flag) {
            System.out.println("0과 중복된 숫자를 제외한 세자리 숫자를 입력해주세요 :)");
            boolean hasInt = sc.hasNextInt();
            if (hasInt) {
                int getNumber = sc.nextInt();
                // 일단 숫자가 3개라서 하드코딩함. => 한번 더 수정
                if (100 < getNumber && getNumber < 1000) {
                    int last = getNumber % 10;
                    int middle = getNumber / 10 % 10;
                    int first = getNumber / 10 / 10 % 10;
                    if (first != middle && first != last && middle != last) {
                        changedArr[0] = first;
                        changedArr[1] = middle;
                        changedArr[2] = last;
                        flag = false;
                        break;
                    } else {
                        System.out.println("중복된 숫자는 허용하지 않습니다.");
                    }
                } else {
                    System.out.println("숫자가 너무 많습니다. 세자리 숫자를 입력해주세요. ");
                }
            } else {
                System.out.println("숫자가 아닌 것이 입력되었습니다. 숫자를 입력해주세요.");
                sc.next();
            }
        }
    }

//    int[] chageToArr() {
//        while (flag2) {
//            for (int i = 2; i >= 0; i--) {
//                changedArr[i] = getValue % 10;
//                getValue = getValue / 10;
//                if (getValue < 1) {
//                    flag2 = false;
//                    break;
//                }
//            }
//        }
//        return changedArr;
//    }

}
