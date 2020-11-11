package Day8;
import java.util.Scanner;

class Player {
    String name = "";
    int money = 100;
    int betMoney;
    Scanner sc = new Scanner(System.in);
}
class Opponent{
    int money =120;
}

//1. player class
//2. opponent class
//3. round 진행하면서 비교하는 class
// 여기서 비교하는거 진행하고, 머니
//4. 모든 stage 반복되는 main

class game {
    Scanner sc = new Scanner(System.in);
    Player player;
    Opponent opponent;
    int numStage=0;
}

//    player 의 선택은?
    public choiceNumber(){
        int InsertNum =0;
        System.out.println("1. 홀 2. 짝이니깐 둘 중 하나의 번호 입력 :");
        sc

    }
//서로 값 비교해서 맞는지 아닌지 알려주는 것
    public boolean guessNum(int InsertNum){
        boolean res = false;
        int randomResult = (int) (Math.random() * 20) + 1;
        System.out.println("숫자 공개: " + randomResult);
        if (InsertNum == 1) {
            res = randomResult % 2 != 0;
        }
        if (InsertNum == 2) {
            res = randomResult % 2 == 0;
        }
        return res;
//        res는 참이란 뜻
    }




    public void betyourmoney(){
        System.out.println("베팅할 금액 설정");
        int bettingMoney = Integer.parseInt(sc.nextLine());
        if (bettingMoney > Math.min(player.money, opponent.money)) {
            System.out.println(Math.min(player.money, opponent.money) + "이 금액 적게 베팅 하세요");
    }
}


public class OddEvenGame {
    public static void main(String[] args) {

    }
}
