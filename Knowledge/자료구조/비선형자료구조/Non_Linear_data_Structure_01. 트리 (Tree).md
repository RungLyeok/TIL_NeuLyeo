# \[ Non Linear Data Structure \] 트리 ( Tree )

## 트리란? ( Tree )

트리( Tree )는 노드들이 가지처럼 연결된 비선형 자료구조이다.

트리는 노드와 링크로 구성된 자료구조 이다. (그래프의 일종, Cycle 없음)

다음과 같이 나무를 거꾸로 뒤집어 놓은 모양과 유사하다.

![](https://i.imgur.com/2mCyIt5.png)

트리는 트리 내에 다른 하위 트리가 있고 그 하위 트리 안에는 또 다른 하위 트리가 있는 계층적 자료구조이기도 하다.

컴퓨터의 directroy구조가 트리 구조의 대표적인 예 이다.

### 사용 사례

#### 계층 적 데이터 저장
- 트리는 데이터를 계층 구조로 저장하는 데 사용됩니다. 
- 예를 들어 파일 및 폴더는 계층적 트리 형태로 저장됩니다.


#### 효율적인 검색 속도
- 효율적인 삽입, 삭제 및 검색을 위해 트리 구조를 사용합니다.

#### 힙( Heap )
- 힙도 트리로 된 자료 구조입니다.


#### 데이터 베이스 인덱싱
- 데이터베이스 인덱싱을 구현하는데 트리를 사용합니다.
- 예) B-Tree, B+Tree, AVL-Tree..

#### Trie
- 사전을 저장하는 데 사용되는 특별한 종류의 트리입니다.

## 트리의 구조, 특징
### 트리의 구조
![](https://i.imgur.com/bcI27E8.png)


- 노드 ( node ) : 트리 구조의 자료 값을 담고 있는 단위
- 간선 ( edge ) : 노드를 연결하는 선 (link, branch 라고도 부름)

- 루트 노드 ( root node ) : 부모가 없는 노드, 가장 위의 노드, 트리는 하나의 루트 노드만을 가진다.
- 단말 노드 ( leaf node ) : 자식이 없는 노드, ‘말단 노드’ 또는 ‘잎새 노드’ 라고도 부른다.
- 내부 ( internal ) 노드 : 단말 노드를 제외한 모든 노드
- 형제 ( sibling ) : 같은 부모를 가지는 노드

- 노드의 크기 ( size ) : 자신을 포함한 모든 자손 노드의 개수
- 노드의 깊이 ( depth ) : 루트에서 어떤 노드에 도달하기 위해 거쳐야 하는 간선의 수
- 노드의 레벨 ( level ) : 트리의 특정 깊이를 가지는 노드의 집합
- 노드의 차수 ( degree ) : 하위 트리 개수 / 간선 수 (degree) = 각 노드가 지닌 가지의 수

- 트리의 차수 ( degree of tree ) : 트리의 최대 차수
- 트리의 높이 ( height ) : 루트 노드에서 가장 깊숙히 있는 노드의 깊이

### 트리의 특징
- 데이터를 순차적으로 저장하지 않기 때문에 비선형 자료구조이다.

- 노드 간에 부모 자식 관계를 갖는 계층적 자료구조이다.
	- 모든 자식 노드는 하나의 부모 노드만 갖는다.

- 트리는 DAG( Directed Acyclic Graphs, 방향성이 있는 비순환 그래프 )의 한 종류이다.
	 -  loop나 circuit이 없다. 당연히 self-loop도 없다.
	 - Acyclic 즉, 사이클이 없다.

- **노드가 N개인 트리는 항상 N-1개의 간선( edge )을 가진다.**
	- 즉, 간선은 항상 (정점의 개수 - 1) 만큼을 가진다.

- **하나의 노드에서 다른 노드로 가는 경로는 유일**하다.

- 하나의 루트 노드와 0개 이상의 하위 트리로 구성되어 있다.
	- 부모-자식 관계이므로 흐름은 top-bottom 아니면 bottom-top으로 이루어진다.
- 하나의 간선을 끊으면 2개의 Sub-Tree로 분린된다.

- 순회는 Pre-order, In-order 아니면 Post-order로 이루어진다. 이 3가지 모두 DFS/BFS 안에 있다.

- 트리는 이진 트리, 이진 탐색 트리, 균형 트리(AVL 트리, red-black 트리), 이진 힙(최대힙, 최소힙) 등이 있다.


## 이진 트리 ( Binary Tree )
- 각 노드는 최대 2개의 자식을 가질 수 있다.
- 자식 노드는 좌우를 구분한다.

![](https://i.imgur.com/yUmFbhy.png)

### 이진 트리 종류
#### 포화 이진 트리 ( Perfect binary tree )
모든 레벨에서 노드들이 꽉 채워져 있는 트리

모든 말단 노드는 같은 높이, 레벨을 갖는다.

모든 내부 노드가 두 개의 자식 노드를 가진다.

![](https://i.imgur.com/aWLkMHq.png)

#### 완전 이진 트리 ( Complete binary tree )
마지막 레벨을 제외하고 노드들이 모두 채워져 있는 트리

마지막 레벨은 꽉 차 있지 않아도 되지만 노드가 왼쪽에 있어야 한다.

![](https://i.imgur.com/KEuCWr2.png)


#### 정 이진 트리 ( Full binary tree )
모든 노드가 0개 또는 2개의 자식 노드를 갖는 트리

![](https://i.imgur.com/prpIUED.png)

#### 편향 트리 (= 사향 트리 ) ( Skewed binary tree )
한쪽으로 기울어진 트리

![](https://i.imgur.com/2fwkDEO.png)

#### 균형 이진 트리 ( Balanced binary tree)
모든 노드의 좌우 서브 트리 높이가 1이상 차이 나지 않는 트리

![](https://i.imgur.com/1Esg4Lt.png) ![](https://i.imgur.com/KyvQyHZ.png)

### 이진 트리 특징
- 포화 이진 트리의 높이가 h일 때, 노드의 수는 ![equation](https://latex.codecogs.com/svg.image?%202^{h+1}-1) 개
- 포화( or 완전 ) 이진 트르의 노드가 N개 일 때, 높이는 logN
- 이진 트리의 노드가 N개 일 떄, 최대 가능 높이는 N

## 이진 트리 순회
모든 노드를 빠뜨리거나 중복하지 않고 방문하는 연산

 - DFS : 전위, 중위, 후위 순회
 - BFS : 레벨 순회
### 전위 순회 ( Preorde Traversal )
방문 순서 : 현재 -> 왼쪽 -> 오른쪽

![](https://i.imgur.com/1TjEOaE.png)


### 중위 순회 ( Inorder Traversal )
방문 순서 : 왼쪽 -> 현재 -> 오른쪽

![](https://i.imgur.com/lT7Qa7y.png)

### 후위 순회 ( Postorder Traversal )
방문 순서 : 왼쪽 -> 오른쪽 -> 현재

![](https://i.imgur.com/yr6w4ja.png)

### 레벨 순회 ( Levelorder Traversal )
방문 순서 : 위쪽 레벨 부터 왼쪽 -> 오른쪽 

![](https://i.imgur.com/Bm3eCai.png)


## 트리 구현
### 배열
레벨 순회 순으로 배열에 구성

![](https://i.imgur.com/YHKSlqL.png)

### 연결 리스트
값과 간선을 관리하기 위한 노드로 연결리스트 구성

## 트리와 그래프의 차이
![](https://i.imgur.com/rqHQs0s.png)


## reference
https://gmlwjd9405.github.io/2018/08/12/data-structure-tree.html