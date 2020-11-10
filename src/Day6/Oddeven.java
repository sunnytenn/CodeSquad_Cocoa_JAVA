package Day6;
import java.util.Scanner;
// 1,2 외의 안된다는것이 뜨게
public class Oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("닉네임을 설정해주세요:");
        String playerName = sc.nextLine();
        int playerAsset = 100;
        int opponentAsset = 120;
        int numStage = 1;
        for (int i = 1; i <= 8; i++) {
            boolean isvalid=false;
            int InsertNum;
            do {
                System.out.println("1.홀, 2.짝 중에 번호를 선택해주세요");
                InsertNum = Integer.parseInt(sc.nextLine());
                if(!(InsertNum==1 && InsertNum==2)){
                    isvalid=true;
                }
                else{
                    isvalid=false;
                }
            }while(isvalid);
            switch (InsertNum) {
                case 1:
                    System.out.println("홀 선택");
                    boolean a = guessNum(InsertNum);
                    if (a) {
                        System.out.println("오홍나이스");
                    } else {
                        System.out.println("졌어...");
                    }
                    break;
                case 2:
                    System.out.println("짝 선택");
                    a = guessNum(InsertNum);
                    if (a) {
                        System.out.println("오홍나이스");
                    } else {
                        System.out.println("졌어...");

                    }
                    break;
            }
        }
    }

//player class , opponent class(random num 여기서 player 값을 분별해주는)
        private static boolean guessNum (int InsertNum){
            int randomNum = 1 + (int) (Math.random() * 20);
            if (randomNum % 2 == 1) {
                if(InsertNum == 1){
                    return true;
                }
            }
            if (randomNum % 2 == 0){
                if (InsertNum == 2) {
                    return true;
                }
            }
            return false;
        }

    }


