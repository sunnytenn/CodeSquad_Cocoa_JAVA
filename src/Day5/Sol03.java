package Day5;
import java.util.Scanner;
//백준 2438번 풀기
public class Sol03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int keyboard = sc.nextInt();
        for (int i = 1; i <= keyboard; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
