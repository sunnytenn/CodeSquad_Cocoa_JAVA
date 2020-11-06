package Day5;
import java.util.Scanner;
//백준 8958번 풀기
public class Sol05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String quizResult = sc.nextLine();
        int quizScore=0;
        int finalScore=0;
        for(int i=0; i < quizResult.length(); i++ ){
            if(quizResult.charAt(i) == 'O') {
                quizScore++;
            }
            if(quizResult.charAt(i)=='X'){
                quizScore=0;
            }
            finalScore += quizScore;
        }
        System.out.println(finalScore);
        }
    }
