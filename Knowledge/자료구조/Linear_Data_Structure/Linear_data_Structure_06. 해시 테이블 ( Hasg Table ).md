# \[ Linear Data Structure \]  해시 테이블 ( Hash Table )
## 해시 테이블 ( Hash Table ) 이란?
데크(Deque)는 Double-Ended Queue의 줄임말로, 양쪽 끝에서 데이터를 추가/반환/삭제할 수 있는 형태의 자료구조이다.

스택(Stack)과 큐(Queue)의 특징을 모두 갖고 있다.  

배열(Array)로도 구현 가능하지만 이중 연결 리스트(Double Linked List)로 구현하는 것이 효율이 좋다.

### 데크 특징
![](https://i.imgur.com/BqFaK1t.png)

- 자료의 추가, 삭제가 양쪽 끝에서 모두 가능
	- 큐, 스택의 특징을 모두 갖는다.
		- 큐 : 자료 삭제는 front / 추가는 rear 에서 만 가능
		- 스택 : 자료 삭제 / 추가 모두 top 에서 만 가능

- 양쪽 2개의 포인트를 가진다.
	- 이중 연결 리스트로 구현한다.
	  
-  데크 구분
	- 입력제한 데크 ( Scroll ) : 한 쪽의 입력을 제한한 데크
	- 출력제한 데크 ( Shelf ) : 한 쪽의 출력을 제한한 데크

### 데크 용도
양방향으로 데이터 처리가 필요한 경우에 사용한다

- 스크롤
- 윈도우 화면 관리
- 웹 브라우저의 방문 기록





## Java _ Deque 사용 방법
Deque는 `new Deque()` 로 선언이 안된다.

따라서 `new ArrayDeque()` , `new LinkedList()` 등으로 선언해줘야  한다.

```
import java.util.ArrayDeque;  
import java.util.Deque;

// Deque 선언
Deque deque = new ArrayDeque();

// Deque<Integer> deque = new LinkedList<>();
```

### Deque data 입력 / 삽입
![](https://i.imgur.com/FyyFh6W.png)


- add()  
    마지막에 원소 삽입  
    용량 초과 시 예외 발생
- addFirst()  
    맨 앞에 원소 삽입  
    용량 초과 시 예외 발생
- addLast()  
    마지막에 원소 삽입  
    용량 초과 시 예외 발생
    
    
- offer()  
    마지막에 원소 삽입  
    삽입 성공 시 true, 용량 제한에 걸리는 경우 false 반환
- offerFirst()  
    맨 앞에 원소 삽입  
    삽입 성공 시 true, 용량 제한에 걸리는 경우 false 반환
- offerLast()  
    마지막에 원소 삽입  
    삽입 성공 시 true, 용량 제한에 걸리는 경우 false 반환
    

```
deque.add(1);
// [1]

deque.addFirst(2);  
// [2, 1]

deque.addLast(3);  
// [2, 1, 3]

deque.offer(4);  
// [2, 1, 3, 4]

deque.offerFirst(5);  
// [5, 2, 1, 3, 4]

deque.offerLast(6);  
// [5, 2, 1, 3, 4, 6]
```

### Deque data 삭제
![](https://i.imgur.com/IIWWoPc.png)


- remove()  
    맨 앞의 원소 제거 후 해당 원소를 리턴  
    데크가 비어있는 경우 예외 발생
- removeFirst()  
    맨 앞의 원소 제거 후 해당 원소를 리턴
    데크가 비어있는 경우 예외 발생
- removeLast()  
   마지막 원소 제거 후 해당 원소를 리턴
    데크가 비어있는 경우 예외 발생
    
- poll  
    맨 앞의 원소 제거 후 해당 원소를 리턴
    데크가 비어있는 경우 null 리턴
- pollFirst()  
    맨 앞의 원소 제거 후 해당 원소를 리턴
    데크가 비어있는 경우 null 리턴
- pollLast()  
    마지막 원소 제거 후 해당 원소를 리턴
    데크가 비어있는 경우 null 리턴

```
System.out.println(deque.remove());
// 5, [2, 1, 3, 4, 6]

System.out.println(deque.removeFirst());  
// 2, [1, 3, 4, 6]

System.out.println(deque.removeLast());  
// 6, [1, 3, 4]

System.out.println(deque.poll());  
// 1, [3, 4]

System.out.println(deque.pollFirst()); 
// 3, [4]

System.out.println(deque.pollLast());  
// 4
```

### Deque data 확인

![](https://i.imgur.com/pCq92vm.png)

- getFirst()  
    맨 앞의 원소를 리턴  
    데크가 비어있는 경우 예외 발생
- getLast()  
    마지막 원소를 리턴
    데크가 비어있는 경우 예외 발생
    
- peek()  
    맨 앞의 원소를 리턴  
    데크가 비어있는 경우 null 리턴
- peekFirst()  
    맨 앞의 원소를 리턴  
    데크가 비어있는 경우 null 리턴
- peekLast()  
    마지막 원소를 리턴  
    데크가 비어있는 경우 null 리턴

### 기타 메서드
- contains(x)  
    데크에 x와 동일한 원소가 있는지 true 혹은 false 반환  
- size()  
    덱의 원소 개수 리턴  
- iterator()  
    데크의 반복자(iterator) 반환
- isEmpty()  
    데크가 비어있는지 true 혹은 false 반환
## ✒️ 참고 문헌
https://cocoon1787.tistory.com/795
https://crazykim2.tistory.com/581