package Day3;
public class method {
    public void method1() {
        System.out.println("m1이 실행됨");
    }
    public void method2(int x) {
        System.out.print(x + "를 이용한 m2 실행");
    }

    public int method() {
        System.out.println("m3실행");
        return 10;
//        10이란 값을 돌려준다.
    }
        public void method4 ( int x, int y){
            System.out.println(x + y + "method4 실행");
        }
        public int method5 ( int y){
            System.out.println(y + "이용한 5 실행");
            return y * 2;
        }
    }