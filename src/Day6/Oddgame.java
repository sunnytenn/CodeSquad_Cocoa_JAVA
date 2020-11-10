package Day6;
import java.util.Scanner;

public class Oddgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("닉네임을 설정해주세요:");
        String playerName = sc.nextLine();
        int playerAsset = 100;
        int opponentAsset = 120;
        int numStage = 1;
        for (int i = 1; i <= 8; i++) {
            System.out.println("1.홀, 2.짝 중에 번호를 선택해주세요");
            int InsertNum = Integer.parseInt(sc.nextLine());
            boolean res = false;
            switch (InsertNum) {
                case 1:
                    System.out.println("홀 선택");
                    res = guessNum(InsertNum);
                    if (res) {
                        System.out.println("오홍나이스");
                    } else {
                        System.out.println("졌어...");
                    }
                    break;
                case 2:
                    System.out.println("짝 선택");
                    res = guessNum(InsertNum);
                    if (res) {
                        System.out.println("오홍나이스");
                    } else {
                        System.out.println("졌어...");
                    }
                    break;
                default:
                    System.out.println("잘못클릭했어");
//                    i-- 하고 원래 반복문 돌아가게 만들기
            }
        }
    }
    //player class , opponent class(random num 여기서 player 값을 분별해주는)
    private static boolean guessNum (int InsertNum)
    {
            boolean res =false;
            int randomResult = (int) (Math.random() * 20)+1;
            System.out.println("숫자 공개: "+randomResult);
            if(InsertNum==1) { res = randomResult % 2 !=0 ;}
            if(InsertNum==2) { res = randomResult % 2 ==0;}
        return res;


    }

    private static

}
