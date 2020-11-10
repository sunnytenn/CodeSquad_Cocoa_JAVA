package Day3;

public class MyClassExam {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();
//       Myclass를 메소들 활용하기 위해서 myclass생성하기
        myclass.method1();
        myclass.method2(10);
        int value= myclass.method3();
        System.out.println("m3이 리턴한 값"+value);

    }
}
