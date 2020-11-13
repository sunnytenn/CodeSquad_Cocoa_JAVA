package Day10;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.*;

class Programmer01 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer ={};
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i=0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                a1.add(arr[i]);
            }
        }
        if (a1.isEmpty()) {
            a1.add(-1);
        }
        answer = new int[a1.size()];
        for(int j=0; j < answer.length; j++){
            answer[j]=a1.get(j);
        }
        Arrays.sort(answer);

        return answer;

    }
}



