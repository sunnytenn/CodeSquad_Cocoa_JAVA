#${cocoa}
{학습 내용 정리하는 github: https://github.com/sunnytenn/CodeSquad_Cocoa_JAVA}
##프로그래머스 문제 
https://coding-factory.tistory.com/551
https://lktprogrammer.tistory.com/113
https://programmers.co.kr/learn/courses/17/lessons/805

### ArrayList 
1. ArrayList 객체 만들기 
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

array에 대해 알고 있어야한다.
array 생성하기 위해서는 선언해줘야함 

ArrayList<Integer> arrayList = new ArrayList<>();

추가는 array.add()
지정도 가능

array 안에 비어져있는지 여부 확인하는 법 
array.isEmpty()


####자바 length size 사용법 및 차이 
1. length는 배열의 길이 
int[] , double[], string[]

2. length() 문자열 길이

3. size() 파악 컬렉션 프레임 워크
ArrayList<Integer> arrayList = new ArrayList<>();
전체 객체 수를 내보낸다. 

###what is 컬렉션 프레임 워크 
배열의 비효율적 문제(크기가 고정된다는 점, 더 넓은 메모리 저장 불가하다는 점)
