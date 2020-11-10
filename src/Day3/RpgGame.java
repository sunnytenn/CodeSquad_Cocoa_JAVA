package Day3;
import java.util.Scanner;
//11 * 11 배열 초기화
//화면 중앙에는 캐릭터 위치: 5, 5의 자리
//임의의 장소에 몬스터 위치
//임의의 장소에 1개의 지뢰를 배치한다. 단 지뢰는 플레이어가 밟기 전까지 화면에 표시하지 않는다.
// >> if 써서 위치가 일치하면 print 되게 ?
//콘솔 입력으로 WASD 중 하나의 키를 입력받고 엔터를 누르면 캐릭터가 상좌하우로 이동함
//캐릭터가 지뢰를 밟으면 사망
//캐릭터가 몬스터의 위치까지 이동하면 몬스터가 사라지고 정해진 점수 획득
//점수 획득시 새로운 몬스터와 지뢰를 배치한다. 단 지뢰의 갯수는 2배 증가시킨다.
//매 턴마다 현재 배열의 상태를 화면에 출력. 단 밟지 않은 지뢰는 표시하지 않는다.
//똑같이 구현하지 않아도 되니 재미있는 게임을 만들어 보자.
public class RpgGame {
    public static void main(String[] args) {
    int[][] map = new int[11][11];

//   일단 map 생성 11 11 배열
    int locx=0;
    int locy=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("콘솔 입력: w, a, s, d");
    String key = sc.next();
    if (key == "w") {
        locy += 1;
    }
    if (key == "a") {
        locx -= 1;
    }
    if (key == "s") {
        locy -= 1;
    }
    if (key == "d") {
        locx += 1;
    }
    System.out.println(locx + "," + locy);
}
}
