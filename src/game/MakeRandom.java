package game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MakeRandom {

    ArrayList<Integer> genArr = new ArrayList<>();

    ArrayList<Integer> generateNumber(){
        // 동적배열.size() 3이 아닐 때 랜덤값을 담음
        while( genArr.size() != 3) {
            int genNum = (int)(Math.random() * 10);
            // 랜덤생성한 수가 0이 아니고 동적배열이 랜덤수를 안 가지고 있을 때 동적배열에 담음
            if( genNum != 0 && !genArr.contains(genNum)){
                genArr.add(genNum);
            }
        }
        return genArr;
    }
    // ArrayList 를 int[] 로 변환해야할까?



}
