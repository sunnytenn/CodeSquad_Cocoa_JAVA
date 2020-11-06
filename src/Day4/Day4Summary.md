#${cocoa}
{학습 내용 정리하는 github: https://github.com/sunnytenn/CodeSquad_Cocoa_JAVA}
 
#### STACK 
LIFO 형식으로 쌓여가고 마지막에 쌓인것에 영향 받는다고 생각하면 된다. 함수 지역변수 

-heap는 객체로 new를 통해 생성함 

#### static 
static 모두에게 하나로 공통적으로 한번에 들어가는것 
public int : 인스턴스 
static int : 클래스 변수
멤버변수 = 인스턴스변수 + 클래스 변수를 의미한다.
주소값을 저장하고있다


####call by reference 와 call by value 
-call by reference 참조의 형태이다. 이후에 값이 변하면 그대로 변하게된다 진짜 값을 보내는게 아니라 address를 받은것
-call by value 메서드 호출시에 사용되는 인자의 메모리에 저장된 값을 복사해서 보내는 것이다. main에는 영향 x
>>파이썬 플젝 진행중에 이걸 생각 못해서 계산식을 넣어도 적용이 안된적이 있었다. 유의해야할듯.
>
##### array shuffle 
package Day4;

public class ArrayShuffle {
    final static int SIZE =16;
            //상수는 변하지않는다는걸 보여주기 위해서 왕대문자로 써야한다.
    public static void shuffle(int[] a){
    }

    public static void main(String[] args) {
        int[]a=new int[SIZE];
        for(int 1=0 ; i<a.length; i++){
            a[i]=1+
            System.out.println(i):
        }
    }
}
