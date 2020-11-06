package Day5;
import java.util.Scanner;
//백준 2920번 풀기
public class Sol04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dajangjo = new int[8];
        for (int i = 0; i < dajangjo.length; i++) {
            dajangjo[i] = sc.nextInt();
        }
        sc.close();

        String result = "";
//        그대로 출력하면 그냥 다 프린팅 될뿐 하나의 값을 뽑아내게 하려면
//        하나의 변수에 넣어줘야한다. 그 변수 넣어주는걸
        for (int i = 0; i < dajangjo.length-1; i++) {
            if (dajangjo[i]==dajangjo[i+1]-1) {
                result = "ascending";
            }
            else if (dajangjo[i]==dajangjo[i+1]+1) {
                result = "descending";
            }
            else {
                result = "mixed";
                break;
//                break를 왜 추가해야하는걸까? 계속 돌아가는걸까?
            }
        }
        System.out.println(result);
    }
}