# \[ Linear Data Structure \]  해시 테이블 ( Hash Table )
## 해시 테이블 ( Hash Table ) 이란?
해시 테이블이란 해시함수를 사용하여 변환한 값을 index로 삼아 (key, value)로 저장하는 자료구조이다.

키를 통해 해당 데이터에 빠르게 접근할 수 있다.

### 해싱( Hashing )
해싱이란 key를 특정 계산식인 해시함수( Hash Function )에 넣어 나온 결과를 사용하여 고정된 크기의 값으로 변환하는 작업을 말한다.

### 해시 테이블 특징
![](https://i.imgur.com/eJ4tlRe.png)

- key : 해시 테이블 접근을 위한 입력 값
- hash function : 키를 해시 값으로 매핑하는 연산
- hasg value : 해시 테이블이 인덱스
- hash table : key - value 를 연관시켜 저장하는 데이터 구조

#### 장점
1. 빠른 검색 및 삽입 
	   Hash Table은 해시 함수를 사용해 데이터를 저장하므로 데이터에 접근하는 데 상수 시간(O(1))이 소요된다. 따라서 매우 빠른 검색과 삽입이 가능하다.
   
2. 유연한 크기 조정 
	   Hash Table은 데이터의 개수에 따라 자동으로 크기를 조정할 수 있다. 이를 통해 메모리 공간의 효율성을 유지하면서도 높은 성능을 유지할 수 있다.
   
3. 다양한 용도로 활용 가능 
	   Hash Table은 캐싱, 데이터베이스 인덱싱, 중복 검사 등에 사용될 수 있다.

#### 단점
1. 해시 충돌  
	   서로 다른 키가 동일한 해시 값에 매핑될 수 있는 해시 충돌이 발생할 수 있다. 충돌이 자주 발생하면 검색 및 삽입 연산의 성능이 저하될 수 있다. 충돌을 해결하기 위해 충돌 해결 방법을 선택해야 한다.
	   
2. 메모리 사용량 
	   Hash Table은 해시 버킷과 해시 함수를 사용하기 때문에 일정한 메모리 공간을 필요로 하다. 특히 데이터의 수가 많을 경우 메모리 사용량이 증가할 수 있다.
	   
3. 순서의 무작위성 
	   Hash Table은 키의 해시 값을 기반으로 데이터를 저장하기 때문에 데이터의 순서가 무작위로 보여진다. 데이터를 순차적으로 접근하는 것이 필요한 경우에는 Hash Table보다는 다른 자료구조를 고려하는 것이 좋다.



### 해시 테이블 용도
- 검색이 많이 필요한 경우
- 저장, 삭제, 읽기가 빈번하게 일어나는 경우
- 캐쉬 구현 ( 중복 확인이 쉽기 때문 )
	- 캐시는 데이터나 값을 미리 복사해 놓는 임시 장소를 말한다.

### 해시 충돌

![](https://i.imgur.com/qzjkWyC.png)

해시 충돌이란 서로 다른 key값이 해시 함수를 통해 나온 해시 값이 동일한 경우를 말한다.

해시 함수 자체의 문제보다는 해시 테이블 크기의 물리적 한계로 인한 경우가 많다.

#### 해결 - 개방 주소법 ( Open Address )
해시 충돌 시 , 테이블에서 비어 있는 공간의 hash를 찾아 데이터를 저장하는 방법이다.

hash와 value가 1 : 1 관계를 유지한다.

비어 있는 공간을 탐색하는 방법에 따라 분류 한다.
##### 개방 주소법 - 선형 탐사법 ( Linear Probing )
빈 공간을 순차적으로 탐사하는 방법이다.

충돌 발생 지점 부터 이후의 빈 공간을 순서대로 탐사한다.

일차 군집화 문제 발생
	반복된 충돌 발생 시 해당 지점 주변에 데이터가 몰려있는 경우가 발생한다.
##### 개방 주소법 - 제곱 탐사법 ( Quadratic Probing )
빈 공간을 n제곱만큼의 간격을 두고 탐사하는 방법이다.

충돌 발생 지점 부터 이후의 빈 공간을 n제곱 간격으로 탐사한다.

일차 군집화 문제를 일부 보완 하지만 이차 군집화 문제가 발생할 수 있다.
##### 개방 주소법 - 이중 해싱 ( Double Hasing )
해싱 함수를 이중으로 사용하는 방법이다.

최초 해시를 구할 때 해시 함수1를 사용한다.

충돌 발생시 해시 함수2를 사용하여 탐사의 이동 간격을 구한다.

선형 탐사, 제곱 탐사에 비해 데이터가 골고루 분포된다.
#### 해결 - 분리 연결법 ( Separate Chainning )
해시 테이블을 연결 리스트로 구성한다.

충돌이 발생하면 테이블 내의 다른 위치를 탐색하는 것이 아닌

연결 리스트를 이용하여 해당 테이블에 데이터를 연결한다.








## Java _ Hashtable 사용 방법
Hashtable은 Map을 상속받아 key, value 형태를 가지게 된다.

```
import java.util.Hashtable;  
import java.util.Map;

// 기본 해시 테이블 사용 방법 <key, value>
Hashtable<String, Integer> ht = new Hashtable();
```

### Hashtable data 입력 / 삽입
put( key, value ) 메서드를 이용하여 data를 넣을 수 있다.

```
ht.put("key1", 10);  
ht.put("key2", 20);  
ht.put("key3", 30);

// 해시 테이블 출력  
for (Map.Entry<String, Integer> item: ht.entrySet()) {  
    System.out.println(item.getKey() + " - " + item.getValue());  
}

// key3 - 30
// key2 - 20
// key1 - 10
```

### Hashtable data 삭제
remove( key ) 메서드를 이용하여 data를 삭제할 수 있다.

```
ht.remove("key3");  

for (Map.Entry<String, Integer> item: ht.entrySet()) {  
    System.out.println(item.getKey() + " - " + item.getValue());  
}
// key2 - 20
// key1 - 10
```

### Hashtable data 확인
get( key ) 메서드를 이용하여여 값을 확인할 수 있다.

```
System.out.println(ht.get("key1"));  
// 10

System.out.println(ht.get("key2"));
// 20
```

### Hash function 이용
해시 테이블의 크기 (  n ) 만큼 % 하는 해쉬 함수를 만든다.

```
public static int getHash(int key) {  
    return key % 5;  
}

// data 추가
ht2.put(getHash(1), 10);  
ht2.put(getHash(2), 20);  
ht2.put(getHash(3), 30);  
ht2.put(getHash(4), 40);  
ht2.put(getHash(5), 50);

for (Map.Entry<Integer, Integer> item: ht2.entrySet()) {  
    System.out.println(item.getKey() + " - " + item.getValue());  
}
// 4 - 40
// 3 - 30
// 2 - 20
// 1 - 10
// 0 - 50
```

### Hash 충돌
Hash 충돌이 발생하면 기존 값 위에 추가하는 값을 집어 넣는다.
```
ht2.put(getHash(6), 60);  

for (Map.Entry<Integer, Integer> item: ht2.entrySet()) {  
    System.out.println(item.getKey() + " - " + item.getValue());  
}
// 4 - 40
// 3 - 30
// 2 - 20
// 1 - 60
// 0 - 50
```

### 기타 메서드
- size( ) 
	- 해시 테이블에 있는 키의 수를 리턴한다.
	  
- keys( )
	- 해시 테이블에있는 키의 리스트를 반환한다.
	  
- elements( )
	- 해시 테이블에 있는 값의 리스트를 반환한다.

- clear( )
	- 해시 테이블을 삭제한다.

그 외의 다른 메서드는 아래 링크에서 확인 할 수 있다.
http://cris.joongbu.ac.kr/course/java/api/java/util/Hashtable.html 

## ✒️ 참고 문헌
https://you88.tistory.com/36
http://cris.joongbu.ac.kr/course/java/api/java/util/Hashtable.html