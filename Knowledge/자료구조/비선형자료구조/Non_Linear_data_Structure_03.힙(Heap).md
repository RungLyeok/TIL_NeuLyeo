# \[ Non Linear Data Structure \] 힙 ( Heap )

## 힙 ( Heap )

힙은 `우선순위 큐` 구현, `힙 정렬`을 하기 위해 사용하는 자료구조이다.

힙은 `이진 힙( Binary Heap )`이라고 불리기도 한다.


- 우선순위 큐를 위해 고안된 완전 이진 트리 형태의 자료구조
  
- 여러 값 중, 최대값과 최소값을 빠르게 찾아내도록 만들어진 자료구조
  
- 반 정렬 상태를 유지  
    ex. 부모 노드의 키 값이 자식 노드의 키 값보다 항상 큼 / 작음
    
- 이진탐색트리(BST)와 달리 중복된 값이 허용된다.
  
- 완전 이진 트리 상태를 유지
	- 항상 왼쪽부터 채워지는 트리( 왼쪽 자식이 없는데 오른쪽 자식 값이 있을 수 없다. )

![](https://i.imgur.com/z3nu6K7.png)

### 우선순위 큐 ( Priority Queue )
-  Queue : FIFO(First Out First In ) 형식의 자료구조
  
- 우선순위 큐는 큐에 우선순위라는 개념을 접목시킨 자료구조이다.

- 따라서, 우선순위 큐는 먼저 들어오는 데이터가 아니라, 우선순위가 높은 데이터가 먼저 나가는 형태의 자료구조이다

### Heap 의 종류
#### 최대 힙 (max heap)
- 부모 노드의 키 값이 자식 노드의 키 값보다 크거나 같은 완전 이진 트리
  
- key( 부모 노드 ) >= key( 자식 노드 )

![](https://i.imgur.com/nFWcPS2.png)


#### 최소 힙 (min heap)
- 부모 노드의 키 값이 자식 노드의 키 값보다 작거나 같은 완전 이진 트리
  
- key( 부모 노드 ) <= key( 자식 노드 )

![](https://i.imgur.com/oXdvFqG.png)

## Heap 의 데이터 입력 / 삭제 개념
### 데이터 입력
- 입력 하는 새 노드를 우선순위가 가장 낮다는 가정 후 맨 끝 위치에 저장
  
- 부모 노드와 크기를 비교하여 위치를 수정

- 올바른 위치까지 2번 과정을 반복한다.

![](https://i.imgur.com/2wKx2jB.png)

### 데이터 삭제
- 루트 노드를 반환( 삭제 ) 후, 마지막 노드를 루트 노드로 이동
  
- 루트 노드의 자식 노드의 우선순위를 비교 후
  
- 힙의 구조를 완성 까지 2번 과정 반복 

![](https://i.imgur.com/EnNCv5F.png)


![](https://i.imgur.com/GmqKNSV.png)




## reference
https://velog.io/@bada308/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%ED%9E%99heap%EC%9D%B4%EB%9E%80
https://you88.tistory.com/33
https://dokuny-devlog.tistory.com/37