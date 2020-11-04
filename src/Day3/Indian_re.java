package Day3;
//        pieceyear.equals("0")
import java.util.Scanner;
    public class Indian_re {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("생년월일을 입력해 주세요>");
            String birthyeardate = sc.nextLine();
            sc.close();
            int pieceyear = Integer.parseInt(birthyeardate.substring(3,4));
            int piecemonth = Integer.parseInt(birthyeardate.substring(4,6));
            int piecedate = Integer.parseInt(birthyeardate.substring(6, 8));
            piecemonth--;
            piecedate--;
            String[] yearname = {"시끄러운", "푸른", "적색", "조용한", "웅크린", "백색", "지혜로운", "용감한", "날카로운", "욕심 많은"};
            String[] monthname = {"늑대", "태양","양","매","황소","불꽃","나무","달빛","말","돼지","하늘","바람"};
            String[] dayname = {"와 함께 춤을","의 기상","은(는) 그림자속에"," "," "," ","의 환생","의 죽음","아래에서","를(을) 보라","이(가) 노래하다.","~의 그림자",
                                "의 일격", "에게 쫓기는 남자","의 행진","의 왕","의 유령","을 죽인자.", "는(은) 맨날 잠잔다.","처럼..","의 고향","의 전사","은(는) 나의친구",
                                "의 노래","의 정령","의 파수꾼","의 악마", "와(과)같은 사나이", "를(을) 쓰러트린자","의 혼","은(는) 말이없다."};

            System.out.println("당신의 이름은"+" "+ yearname[pieceyear]+" "+monthname[piecemonth]+" "+dayname[piecedate]+"입니다");

        }
    }