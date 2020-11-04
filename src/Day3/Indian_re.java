package Day3;
//        pieceyear.equals("0")
import java.util.Scanner;
    public class Indian_re {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("생년월일을 입력해 주세요>");
            String birthyeardate = sc.nextLine();
            sc.close();
            int pieceyear = Integer.parseInt(birthyeardate.substring(3));
            int piecemonth = Integer.parseInt(birthyeardate.substring(4,6));
            int piecedate = Integer.parseInt(birthyeardate.substring(6, 8));
            piecemonth--;
            piecedate--;
            String[] yearname = {"시끄러운", "말 많은", "푸른", "적색", "조용한", "웅크린", "백색", "지혜로운", "용감한", "날카로운", "욕심 많은"};
            String[] monthname = {"의 뜻이 있는", "의 멋진"};
            String[] dayname = {"의 멋진", "의 뛰어난"};
            System.out.println("당신의 이름은"+yearname[pieceyear]+monthname[piecemonth]+dayname[piecedate]);

        }
    }