# \[ Linear Data Structure \]  스택 ( Stack )
## 스택 ( Stack ) 이란?
일반적으로, 차곡차곡 쌓아둔 모양 / 형태의 자료구조를 의미한다.

스택은 마지막에 저장한 데이터를 가장 먼저 꺼내는 특징이 있다. ( 후입선출 )

이러한 자료구조를 **LIFO( Last In FIrts Out )** 라고 한다.

### 스택 특징
- 후입선출 ( LIFO ) 구조 : 마지막에 들어온 데이터가 가장 먼저 나가는 구조
  
- 단방향 입출력 구조 : 데이터의 들어오는 방향과 나가는 방향이 같다.
	- 리스트의 top에서 데이터가 들어오고 나간다.
  
- 데이터를 하나씩만 넣고 뺄 수 있다.
	- 추가 ( push )
	- 삭제 ( pop )

### 스택 용도
주로, 왔던 길을 되돌아갈 때 유용하다.
- 수식 / 표현식 평가
  
- 깊이 우선 탐색 ( DFS )에 이용된다.
  
- 함수, 재귀 호출시 복귀 

- 문자열 의 역순 출력

- 프로그램 내 괄호 열기 및 닫기 


## Java _ Stack 사용 방법
자바는 java.util.Stack 클래스를 통해 제공하고 있다.

```
import java.util.Stack;
```

### 주요 메서드

| 메서드            | 설명                                                                                                                           |
| ----------------- | ------------------------------------------------------------------------------------------------------------------------------ |
| empty()           | Stack이 비어있는지 알려준다                                                                                                    |
| push(Object item) | Stack에 객체(item)를 저장한다                                                                                                  |
| pop()             | Stack의 맨 위에 저장된 객체를 꺼낸다<br>  비어있을 경우 EmptyStackException 발생                                               |
| peek()            | Stack의 맨 위에 저장된 객체를 반환<br>   pop과 달리 Stack에서 객체를 꺼내지는 않는다<br>비어있을 경우 EmptyStackException 발생 |
| search(Object o)  | Stack에서 주어진 객체(o)를 찾아서 그 위치를 반환 <br>못 찾을 경우 -1을 반환  <br>배열과 달리 위치는 0이 아닌 1부터 시작       |


#### push( )

![](https://i.imgur.com/ALTHEuA.png)

```
Stack stack = new Stack();

stack.push(1);  
stack.push(2);  
stack.push(3);  
stack.push(4);    

System.out.println(stack); // [1, 2, 3, 4]
```

#### pop( )

최상단에 있는 데이터를 빼온다. 

그 데이터는 stack에서 삭제된다.

![](https://i.imgur.com/BBIYfOb.png)


```
System.out.println(stack.pop());  
// 4 

System.out.println(stack);
// [1, 2, 3]
```

#### peek( )

최상단의 데이터를 반환한다.

stack에서 데이터가 삭제되지 않는다.

```
System.out.println(stack.peek());  
// 3

System.out.println(stack);  
// [1, 2, 3]
```


#### contains( ), search( )

```
System.out.println(stack.contains(1));  
// true : 요소의 유무를 논리값으로 알려준다.

System.out.println(stack.search(1));
// 3 : 1이라는 요소가 3번째에 출력됨을 의미한다./
```

#### size( )
스택의 크기를 확인한다.
```
System.out.println(stack.size());
// 3
```

#### clear( )

스택의 모든 요소를 삭제한다. 

```
stack.clear();  

System.out.println(stack);
// []
```

#### empty( )

스택이 비어있는지 확인한다.

```
System.out.println(stack.empty());
// true
```

비어있는 상태에서 pop( ), peek( )을 하면 오류가 나타나는 것을 확인할 수 있다.

```
System.out.println(stack.pop());

// Exception in thread "main" java.util.EmptyStackException
```

## ✒️ 참고 문헌
https://inpa.tistory.com/entry/JCF-%F0%9F%A7%B1-Stack-%EA%B5%AC%EC%A1%B0-%EC%82%AC%EC%9A%A9%EB%B2%95-%EC%A0%95%EB%A6%AC
http://www.ktword.co.kr/test/view/view.php?nav=2&no=1306&sh=%EC%8A%A4%ED%83%9D