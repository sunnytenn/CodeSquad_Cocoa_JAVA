package Day5;
import java.util.Scanner;
//백준 8958번 풀기
public class Sol05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] testcase= new String[sc.nextInt()];

        for (int i = 0; i < testcase.length; i++) {
            testcase[i] = sc.next();
//            nextline이라고 쳐서 맨아래의 테스트에 대한 점수가 나오지 않았다.
// https://www.acmicpc.net/board/view/53817

        }
        sc.close();

            for(int i=0; i < testcase.length; i++){

                int quizScore = 0;
                int finalScore = 0;

                for (int j = 0; j < testcase[i].length(); j++) {
                    if (testcase[i].charAt(j) == 'O') {
                        quizScore++;
                    }
                    if (testcase[i].charAt(j) == 'X') {
                        quizScore = 0;
                    }
                    finalScore += quizScore;
                }
                System.out.println(finalScore);
        }
    }
}
