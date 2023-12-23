# \[ Non Linear Data Structure \] 트리 ( Tree )

## 트리란? ( Tree )

트리( Tree )는 노드들이 가지처럼 연결된 비선형 자료구조이다.

다음과 같이 나무를 거꾸로 뒤집어 놓은 모양과 유사하다.

![](https://i.imgur.com/2mCyIt5.png)

트리는 트리 내에 다른 하위 트리가 있고 그 하위 트리 안에는 또 다른 하위 트리가 있는 재귀적 자료구조이기도 하다.

컴퓨터의 directroy구조가 트리 구조의 대표적인 예 이다.

![](https://i.imgur.com/cQinngI.png)

### 배열 예시

```
// 배열 선언
// type[] name = new type[size]
int[] arr = new int[5];

// 선언 + 초기화
int[] arr1 = {1, 2, 3, 4, 5};

//elements : 1, 2, 3 ,4 ,5
//index :    0, 1, 2, 3 ,4 
//size : 5


// 2차원 배열
int[][] arr2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}}
```

-   연속된 메모리 공간에 데이터들이 순차적으로 저장되어 있다.
-   인덱스는 0부터 시작한다.
-   각 요소는 인덱스를 통해서 다룰 수 있다.

### 배열 특징

-   **많은 수의 데이터**를 다룰 때 사용하는 자료 구조
-   각 데이터를 인덱스와 **1 : 1 대응**하도록 구성
-   데이터가 메모리 상에 **연속적**으로 저장
-   크기가 고정적이다. 공간이 낭비되거나 데이터의 재배치가 필요할 수 있다.
-   메모리는 배열이 선언될 때 (컴파일할 때) Stack영역에 할당한다.

#### 배열 장점

-   인덱스를 이용하여 데이터에 빠르게 접근 가능 하다.
-   간단하고 사용하기 쉽다.

#### 배열 단점
-   데이터의 추가/삭제가 번거롭다
    -   미리 **최대 길이를 정해서 생성**해야 한다.
    -   가변 길이 배열은 배열의 크기를 변경할 때마다 새로운 배열을 생성한다.
    -   데이터 삭제 시, 크기는 고정되어 있기 때문에, 빈 공간을 유지한다.

### 배열 시간 복잡도

| Operation | Average Case | Worst Case |
|:---------:|:------------:|:----------:|
|   read ( 접근 )    |     O(1)     |    O(1)    |
|  search ( 탐색 )  |     O(n)     |    O(n)    |
|  insert ( 삽입 ) |     O(n)     |    O(n)    |
|  delete ( 삭제 ) |     O(n)     |    O(n)    |


### 배열 사용하는 경우

-   순차적인 데이터를 저장하며 값보다는 순서가 중요할 때
-   다차원 데이터를 다룰 때
-   어떤 특정 요소를 빠르게 읽어야 할 때
-   데이터 사이즈가 자주 바뀌지 않으면서 요소가 자주 추가되거나 삭제되지 않을 때

## Array List

배열 ( Array )은 정적인 크기를 가지므로 크기를 변경할 수 없다.

만약 크기를 동적으로 변경해야 하면 Array List와 같은 동적 배열을 사용할 수 있다.

### Array List의 특징

1.  동적 크기 조정 : 초기화 할 때 크기를 지정할 필요가 없다.
2.  참조 타입 ( reference type )만 원소로 저장할 수 있다.
3.  데이터 중복이 가능하며, null값도 허용한다.
4.  요소 추가와 삭제 : 요소를 추가 및 삭제 메서드를 제공한다.
    -   add() : 리스트의 끝에 요소 추가 또는 특정 인덱스에 요소를 삽입한다.
    -   remove() : 특정 인덱스나, 특정 값에 해당하는 요소를 삭제한다.
5.  자료를 대량으로 추가 및 삭제 시 내부 처리 작업이 늘어나 성능이 떨어진다.

### Array List 주요 메서드

-   **.add((index), val)**: 순서대로 리스트를 추가, 배열 사이즈 초과 시 초기 설정된 사이즈만큼 자동으로 사이즈가 증가함, 인덱스를 추가로 지정해 주면 해당 인덱스에 값을 삽입
-   **.get(index)**: 해당 인덱스의 값 반환
-   **.set(index, val)**: 인덱스로 값 변경
-   **.indexOf(val)**: 값을 제공하면 해당 값의 첫 번째 인덱스를 반환
-   **.lastindexOf(val)**: 해당 값의 마지막 인덱스 반환
-   **.remove(index or val)**: 해당 인덱스의 값 or 해당 값 중 첫 번째 값 삭제
-   **.contains(val)**: 해당 값이 배열에 있는지 검색해서 true / false 반환
-   .containsAll(val1, val2...): argument로 제공한 컬렉션의 모든 값이 포함되어 있는지 여부를 true / false로 반환
-   .toArray(): ArrayList 타입의 인스턴스를 일반 배열 타입으로 반환, 저장할 배열 타입에 맞춰 자동 형변환, 배열 크기 또한 자동으로 맞춰서 바꿔줌
-   **.clear()**: 값 모두 삭제
-   **.isEmpty()**: 비었으면 true, 하나라도 값이 있으면 false 반환
-   .addAll(arr2): 두 컬렉션을 합침
-   .retainAll(arr2): argument로 제공한 컬렉션 내에 들어있는 값을 제외하고 모두 지워줌
-   **.removeAll(arr2)**: argument로 제공한 컬렉션 내에 들어있는 값과 일치하는 값을 모두 지워줌, retainAll() 메서드와 반대
-   **.size()**: 요소 개수 반환

## Java \_ 배열 사용 방법

### 배열 선언

```
// size 지정
int[] num = new int[5]
```

### 배열 값 할당

```
num[0] = 1;
num[1] = 2;
num[2] = 3;
num[3] = 4;
num[4] = 5;
```

### 배열 특정 요소 확인 및 수정

배열의 index = 2인 값을 수정 및 확인하는 예시

```
num[2] = 10
System.out.print(num[2]); // 10
```

### 배열 크기 확인

```
System.out.print(num.length); // 5
```

### 배열 반복문

```
for (int i = 0; i < num.length; i++){
    System.out.println(num[i]);
}

for (int el : num) {
    System.out.println("el : " + el);
}
```

### 2차원 배열

```
System.out.println("== 2차원 배열 ==");  
    int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};  
    System.out.println(arr2[0][1]); // 2 

    // 2차원 배열 출력  
    for(int[] row: arr2) {  
        for(int item: row) {  
            System.out.println("item = " + item);  
        }  
     }   
```

## Java \_ ArrayList 사용 방법

### Array List 생성

```
ArrayList list = new ArrayList(Arrays.asList(1, 2, 3));  
System.out.println("list = " + list); // list = [1, 2, 3]
```

### Array List 원소 추가

```
list.add(4);  
list.add(5);  
System.out.println("list = " + list); // list = [1, 2, 3, 4, 5]
```

### Array List 원소 제거

```
// 원소 제거 (인덱스)
list.remove(2);  
System.out.println("list = " + list); // list1 = [1, 2, 4, 5]

// 원소 제거 (값)  
list.remove(Integer.valueOf(2));  
System.out.println("list = " + list); // list = [1, 4, 5]
```

### Array List 2차원 배열

```
ArrayList list2d = new ArrayList();  
ArrayList list1d1 = new ArrayList(Arrays.asList(1, 2, 3));  
ArrayList list1d2 = new ArrayList(Arrays.asList(4, 5, 6));  

list2d.add(list1d1);  
list2d.add(list1d2);  

System.out.println("list1d1 = " + list1d1); // list1d1 = [1, 2, 3]  
System.out.println("list1d2 = " + list1d2); // list1d2 = [4, 5, 6]
System.out.println("list2d = " + list2d); // list2d = [[1, 2, 3], [4, 5, 6]]
```

## reference

[https://yoongrammer.tistory.com/43](https://yoongrammer.tistory.com/43)  
[https://hoehen-flug.tistory.com/28](https://hoehen-flug.tistory.com/28)  
[https://da2uns2.tistory.com/entry/Java-ArrayList-%EC%82%AC%EC%9A%A9%EB%B2%95%EA%B3%BC-%EC%A3%BC%EC%9A%94-%EB%A9%94%EC%86%8C%EB%93%9C](https://da2uns2.tistory.com/entry/Java-ArrayList-%EC%82%AC%EC%9A%A9%EB%B2%95%EA%B3%BC-%EC%A3%BC%EC%9A%94-%EB%A9%94%EC%86%8C%EB%93%9C)