package game;

import java.util.Scanner;

public class GetInputValue {
    Scanner sc = new Scanner(System.in);
    boolean flag = true;
    boolean flag2 = true;
    int getValue = 0;
    int[] changedArr = new int[3];


    int checkValue() {
        System.out.println("게임을 시작합니다. 세자리 숫자를 입력해주세요. ");
        while (flag) {
            boolean hasInt = sc.hasNextInt();
            if (hasInt) {
                int getNumber = sc.nextInt();
                if (100 < getNumber && getNumber < 1000) {
                    getValue = getNumber;
                    flag = false;
                    break;
                } else {
                    System.out.println("세자리 숫자를 입력해주세요. ");
                }
            } else {
                System.out.println("숫자를 입력해주세요.");
                sc.next();
            }
        }
        return getValue;
    }

    int[] chageToArr() {
        while (flag2) {
            for (int i = 2; i >= 0; i--) {
                changedArr[i] = getValue % 10;
                System.out.println(changedArr[i]);
                getValue = getValue / 10;
                if(getValue <1) {
                    flag2= false;
                    break;
                }
            }
        }
        return changedArr;
    }

}
