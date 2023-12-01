# \[ Linear Data Structure\ ] 연결리스트 ( Linked List )
## 연결 리스트 ( Linked List )
선형 리스트의 단점 ( 고정 크기의 순서 배열 )을 보완한 자료구조 이다.

- 동적으로 크기를 바꿀 수 있다.
- 삭제, 삽입 등에 데이터 이동이 필요 없다.

데이터 및 링크( 포인터 )에 의해 비 연속적( 비 순차적 )으로 연결된 선형 자료구조이다.

### 연결 리스트 특징
- 포인터로 연결되어 있다.
	- 원소들이 메모리 내 어느 위치에도 가능하다.
	- 동적으로 노드의 삽입과 삭제가 용이하다
		- 항목의 삭제, 삽입 시에 데이터 이동이 필요 없다.
	- 원 소 끝 포인터는 null을 가르킨다.
	  
- 크기가 가변적이다.
	- 메모리가 허용하는 만큼 커질 수 있다.
	- 메모리 공간 사용이 효율적이나, 포인터를 위해 추가 메모리가 필요하다.

- 상대적으로 구현이 어렵다. 
	- 포인터의 저장 필요성 때문에, 저장 공간이 더 필요하다.
	- 하지만 저장 공간에 틈이 없게 할 수 있어, 전체적으로 보면 절약된다.
	  
-  다른 자료구조( 추상자료형 )의 기반이 된다.
	- 큐, 스택, 해시 테이블 등

### 연결 리스트 기본 구조
#### 노드 
[노드 : 데이터 , 링크] 가 하나의 단위로써 저장 된다.

![](https://i.imgur.com/s1Wfx3T.png)

```
class Node {  
    int data;  // 데이터
    Node next; // 링크
  
    // 생성자  
    Node() {}  
    Node(int data, Node next) {  
        this.data = data;  
        this.next = next;  
    }  
}
```

연결 리스트의 링크 변수
- 연결 리스트의 첫번째 원소를 가리키지만, 연결 리스트 전체를 가르키기도 한다.
- 전체를 가르키는 경우에는, 대문자로 시작하는 변수명을 쓴다.

연결 리스트의 처음과 끝 노드
- 리스트의 처음 노드 : 헤드( head ) 노드
- 리스트의 끝 노드 : 테일( Tail ) 노드, 엔드( End ) 노드
- 데이터 없이 시작, 끝 만을 가르킨다.

### 연결 리스트의 형태
#### 단순 연결 리스트 ( Singly Linked List )
노드들을 한 줄로 연결 시킨 자료구조

- 각 노드 마다, 값( 데이터 )및 다음 링크를 갖고 있다.
- 단방향 연결 : 각 원소( 노드 )에 단방향 단일 링크를 갖는다.
- 노드 링크는 다음 노드를 가리킨다.
- 마지막 노드의 링크는 null 값을 갖는다.
#### 이중 연결 리스트 ( Doubly Linked List )
노드를 양방향으로 연결 시킨 자료 구조

- 후행 노드 및 선행 노드 모두를 가리킬 수 있다.
	- 모든 노드 마다 2개의 링크를 갖는다.
- 순방향, 양방향 탐색이 가능하다.
#### 원형 연결 리스트 ( Circularyly Linked List )
마지막 노드의 링크가 리스트의 처음 노드를 가리킨다.

단순 연결리스트의 처음과 끝을 연결하면 원형 리스트가 된다.

### 연결리스 시간 복잡도

| Operation | Average Case | Worst Case |
|:---------:|:------------:|:----------:|
|   read ( 접근 )    |     O(n)     |    O(n)    |
|  search ( 탐색 )  |     O(n)     |    O(n)    |
|  insert ( 삽입 ) |     O(1)     |    O(1)    |
|  delete ( 삭제 ) |     O(1)     |    O(1)    |

원하는 노드에 접근 / 탐색 + 삽입, 삭제 : O(n + 1)
가장 앞에 접근 + 삽입, 삭제 : O(1+ 1)
가장 뒤에 접근 + 삽입, 삭제 : O(1+ 1)

## Java _ LinkedList 사용 방법

LinkedList를 사용하기 위해서 패키지를 명시하여 가져와야 한다.

```
import java.util.LinkedList;
```

### LinkedList 생성
```
// 타입설정
LinkedList<Integer> list = new LinkedList<>();

// 생성과 동시에 초기값 설정
LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1,2));
```

### LinkedList 요소 추가 / 삽입
| 메서드               | 설명                                                   |
| -------------------- | ------------------------------------------------------ |
| addFirst( Object obj ) | LinkedList의 맨 앞에 객체(obj)를 추가                  |
| addLast( Object obj )  | LinkedList의 맨 뒤에 객체(obj)를 추가                  |
| add( Object obj )                | LinkedList의 마지막에 객체를 추가한다. (성공하면 true) |
| add( int index, Object element )   |     지정된 위치(index)에 객체를 저장한다.      |

### LinkedList 요소 삭제
| 메서드             | 설명                                       |
| ------------------ | ------------------------------------------ |
| removeFirst( )     | 첫번째 노드를 제거                         |
| removeLast( )      | 마지막 노드를 제거                         |
| remove( )          | LinkedList의 첫 번째 요소를 제거           |
| remove( nt index ) | 지정된 위치(index)에 있는 객체를 제거한다. |
|         remove( Object obj )           |     지정된 객체를 제거한다. (성공하면 true)                                       |
|        clear( )            |         LinkedList를 완전히 비운다.                                   |

### LinkedList 요소 검색
| 메서드                 | 설명                                                      |  
| ---------------------- | --------------------------------------------------------- | 
| size( )                | LinkedList에 저장된 객체의 개수를 반환한다.               |    
| isEmpty( )             | LinkedList가 비어있는지 확인한다.                         |     |
| contains( Object obj ) | 지정된 객체(obj)가 LinkedList에 포함되어 있는지 확인한다. |     
| indexOf( Object obj )  | 지정된 객체(obj)가 저장된 위치를 찾아 반환한다.           |     

### LinkedList 요소 반환 , 변경
| 메서드                 | 설명                                                      |  
| ---------------------- | --------------------------------------------------------- | 
| get( int index )               | 지정된 위치(index)에 저장된 객체를 반환한다.               |    
| set(int index, Object obj)         | 지정한 위치(index)의 객체를 주어진 객체로 바꾼다.

## reference
https://inpa.tistory.com/entry/JAVA-%E2%98%95-LinkedList-%EA%B5%AC%EC%A1%B0-%EC%82%AC%EC%9A%A9%EB%B2%95-%EC%99%84%EB%B2%BD-%EC%A0%95%EB%B3%B5%ED%95%98%EA%B8%B0
http://www.ktword.co.kr/test/view/view.php?nav=2&no=3559&sh=%EC%97%B0%EA%B2%B0%EB%A6%AC%EC%8A%A4%ED%8A%B8