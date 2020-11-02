
package day1;
import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        System.out.print("시작단");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.print("끝단");
        int e = sc.nextInt();
        int i, j;
        for (i = s; i <= e; i++) {
            System.out.println(i + "단");
            for (j = 1; j < 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }
}