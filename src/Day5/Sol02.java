package Day5;
//백준 1008번 풀기
import java.util.Scanner;
public class Sol02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
//        float을 넣었다가 틀렸다. double이란다.
        sc.close();
        if(A > 0 && B < 10){
            System.out.println(A/B);
        }
    }

}
