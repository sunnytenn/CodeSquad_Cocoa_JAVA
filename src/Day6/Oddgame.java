package Day6;

import java.util.Scanner;

public class Oddgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("닉네임을 설정해주세요:");
        String playerName = sc.nextLine();
        int playerAsset = 100;
        int opponentAsset = 120;
//        할당을 계속 하도록 하는 부분을 추가해야함 (메소드)
        int numStage = 0;
//        while true 대신에 8보다 작을때 작동하는걸로 해보기
        int round = 0;
//        패배할때 종료 되는거 + 이길때 다음 라운드 넘어가는 메소드 추가하기
//        게임진행 메소드 + 패배라운드 메소드 분리
//
        while (numStage <= 8) {
            while (true) {
                System.out.println("1.홀, 2.짝 중에 번호를 선택해주세요");
                int InsertNum = Integer.parseInt(sc.nextLine());
                boolean res = false;
                switch (InsertNum) {
                    case 1:
                        System.out.println("홀 선택");
                        res = guessNum(InsertNum);
                        if (res) {
                            System.out.println("오홍나이스");
                            playerAsset += betyourmoney(playerAsset, opponentAsset);
                            opponentAsset -= betyourmoney(playerAsset, opponentAsset);
                        } else {
                            System.out.println("틀림");
                            playerAsset -= betyourmoney(playerAsset, opponentAsset);
                            opponentAsset += betyourmoney(playerAsset, opponentAsset);
                        }
                        break;
                    case 2:
                        System.out.println("짝 선택");
                        res = guessNum(InsertNum);
                        if (res) {
                            System.out.println("오홍나이스");
                            playerAsset += betyourmoney(playerAsset, opponentAsset);
                            opponentAsset -= betyourmoney(playerAsset, opponentAsset);
                        } else {
                            System.out.println("틀림");
                            playerAsset -= betyourmoney(playerAsset, opponentAsset);
                            opponentAsset += betyourmoney(playerAsset, opponentAsset);
                        }
                        break;

                    if (opponentAsset <= 0) {
                        numStage += 1;
                        System.out.println("다음 라운드로 넘어갑니다");
                        opponentAsset = (int) (playerAsset * Math.pow(1.2, numStage));
                    }
                    if (playerAsset <= 0) {
                        System.out.println("졌어...");
                        break;
                    }
                    if (numStage == 8) {
                        System.out.println("전 라운드 종료");
                        break;
                    }
                }
            }
        }
    }

    private static int betyourmoney(int playerAsset, int opponentAsset) {
        Scanner sc = new Scanner(System.in);
        int bettingMoney = Integer.parseInt(sc.nextLine());
        if (bettingMoney > Math.min(playerAsset, opponentAsset)) {
            System.out.println(Math.min(playerAsset, opponentAsset) + "이 금액 적게 베팅 하세요");
            return bettingMoney;
        }


    }

    //player class , opponent class(random num 여기서 player 값을 분별해주는)
    private static boolean guessNum(int InsertNum) {
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


    }

}
