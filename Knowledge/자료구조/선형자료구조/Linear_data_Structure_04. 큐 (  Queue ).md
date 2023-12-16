# \[ Linear Data Structure \]  큐 ( Queue )
## 큐 ( Queue ) 이란?
큐는 한쪽 끝에서 삽입되고, 다른 한쪽 끝에서 삭제되는 리스트 구조이다.

큐는 먼저 집어 넣은 데이터가 먼저 나오는 특징이 있다. **( 후입선출 )**

이러한 자료구조를 **FIFO ( First In FIrts Out )** 라고 한다.

### 큐 특징
![](https://i.imgur.com/aaPFuFf.png)


- 데이터의 입력, 출력이 정해진 위치에서만 가능하다.
	- 자료 추가( 삽입, 입력 )는 끝( rear )에서 만 가능하다.
	- 자료 반환( 삭제, 출력 )은 처음( front )에서 만 가능하다.
  
- 전후 / 선후 관계가 1 : 1 이다.
	- 선형자료구조 이다.
  
- 입출력 순서 / 처리 방법에 따라 큐를 구분할 수 있다.
	- **일반적인 큐 ( Genaral Queue )** : 삽입된 순서에 따라 삭제된다.
		- FIFO ( 선입선출 : 먼저들어간 것이, 먼저 처리된다. )
	- **우선순위 큐 ( Priority Queue )** : 임의 순서로 삽입되거나, 일정 순서로 삭제/출력/제거 된다.
		- 입력은 임의 순서
		- 출력은 일정한 / 정해진 순서를 갖는다.
	

### 큐 용도
데이터가 입력된 순서대로 처리하는 상황에 이용한다.

- 너비 우선 탐색( BFS, Breadth-First Search ) 구현
  
- 캐시( Cache ) 구현
  
- 우선순위가 같은 작업 예약 ( 인쇄 대기열 )

- 프로세스 관리




## Java _ Queue 사용 방법
자바에서 큐는 LinkedList를 활용하여 생성한다.

따라서 Queue 와 LinkedList를 import해야 한다.

```
import java.util.LinkedList; //import

import java.util.Queue; //import

// Queue 생성 
Queue<Integer> queue = new LinkedList<>(); 

Queue<String> queue = new LinkedList<>(); 
```

### 주요 메서드
#### Enqueue : add( ) / offer( )
Queue에 data를 삽입한다.

![](https://i.imgur.com/o3qxo0P.png)

```
Queue queue = new LinkedList();

queue.add(1);  
queue.add(2);  
queue.add(3);  
queue.offer(4);  
queue.offer(5);  

System.out.println(queue);
// [1, 2, 3, 4, 5]
```

#### Dequeue : remove( ) / poll( )
Queue의 front에 있는 데이터를 반환 후 삭제한다.

![](https://i.imgur.com/FA5uFcw.png)

```
System.out.println(queue.poll());
// 1
System.out.println(queue);  
// [2, 3, 4, 5]
  
System.out.println(queue.remove());  
// 2
System.out.println(queue);
// [3, 4, 5]
```

#### peek( )
front의 데이터를 반환한다.

queue에서 데이터가 삭제되지 않는다.

```
System.out.println(queue.peek()); 
// 3 
System.out.println(queue);
// [3, 4, 5]
```


#### contains( )

```
System.out.println(queue.contains(1));  
// false : 요소의 유무를 논리값으로 알려준다.
```

#### size( )
스택의 크기를 확인한다.
```
System.out.println(queue.size());
// 3
```

#### clear( )

스택의 모든 요소를 삭제한다. 

```
queue.clear();  

System.out.println(stack);
// []
```

#### empty( )

스택이 비어있는지 확인한다.

```
System.out.println(queue.empty());
// true
```

비어있는 상태에서 remove( ), peek( )을 하면 오류가 나타나는 것을 확인할 수 있다.

poll( )은 null 을 반환한다.

```
System.out.println(queue.poll());
// null

System.out.println(queue.remove());
// Exception in thread "main" java.util.NoSuchElementException
```

## ✒️ 참고 문헌
http://www.ktword.co.kr/test/view/view.php?nav=2&no=443&sh=%ED%81%90
https://gmlwjd9405.github.io/2018/08/02/data-structure-queue.html#google_vignette
https://coding-factory.tistory.com/602#google_vignette