#${cocoa}
{학습 내용 정리하는 github: https://github.com/sunnytenn/CodeSquad_Cocoa_JAVA}
> 오늘의 공부 목표는? 
>> 1. Lucas에 업로드 된 알고리즘 level 1 문제 풀기 
>> 2. 부족한 공부하기 method, class 완전 이해해서 써먹기 

### 코드 오류 난 부분 수정 
#### 1008 sol2.java 
실수로 취급해야한다고 생각해서 float을 사용했던 채점결과 오답
검색 후 double로 해야 정답처리가 난다고 한다. 

##### doble / float의 차이?
https://wikidocs.net/204
>> "이둘의 차이는 표현할 수 있는 숫자 범위의 차이이다."
>>double : 15 자리/ float : 7자리 

#### 8958 sol5.java
nextLine()으로 하니깐 마지막 값이 나오지 않았다. 
next()으로 하니깐 마지막 줄이 계산이 되었다. 

##### next() / nextLine()의 차이는?
next() 는 공백, 줄바꿈, 탭을 기준으로 읽고 
nextLine()은 줄바꿈 직전의 문자를 읽는다고 한다. 
->System.out.println(testcase[0]); 으로 확인해보니깐 결과가 
공백으로 나왔다. 즉 공백을 인식해서 첫번째 배열에 넣는 바람에 마지막 배열이 들어가지지 않았던 것..
next() 사용해서 공백 엔터단위로 구분을 시켜 값들만 배열에 들어갈 수 있게 해야겠다. 
>>의문점은 다른 사람들은 nextLine() 사용했던데 나랑 차이가 뭐지..

https://www.acmicpc.net/board/view/53817
 
