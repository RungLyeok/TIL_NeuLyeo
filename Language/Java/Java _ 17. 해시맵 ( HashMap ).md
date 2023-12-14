# \[ Java \] 해시맵 ( HashMap )
## 해시맵 ( HashMap ) 이란?
- 맵 : **키( Key ) 와 값( Value ) 두 쌍으로 데이터를 보관하는 자료구조**이다.
  
- 해싱( Hashing ) : 키가 해시 함수를 거쳐 해시 코드로 매핑되는 과정
  
- 해시 함수( Hash function ) : 임의의길이 데이터를 고정 길이 데이터로 매핑하는 함수

![](https://i.imgur.com/GNPRGFT.png)

### 해시맵 특징 
- Key, Value 두 쌍으로 데이터를 저장한다.
- Key는 유일해야 한다. ( 중복 X )
- 데이터의 검색 속도가 빠르다.
- 대용량 데이터 관리에 좋다.

### HashTable vs HashMap
HashMap 과 HashTable은 같은 자료구조이지만 자바에서 차이가 존재한다.
또한 HashMap과 HashTable의 사용 방법은 비슷하다.

- Thread-safe 여부
	- HashTable : Thread-safe O
	- HashMap : Thread-safe X
	- 따라서 멀티 스레드 환경이 아니라면 HashMap의 성능이 더 좋다.
	  
- Null 값 허용 여부
	- HashTable : Null 값 허용 X
	- HashMap : Null 값 허용 O
	  
- Enumeration 여부
	- HashTable : not fail-fast Enumeration을 제공 O
	- HashMap : Enumeration을 제공 X
	  
- HashMap은 보조 해시를 사용
	- HashTable에 비해 해시 충돌 발생 감소

## HashMap 사용
HashMap은 Map을 상속받아 key, value 형태를 가지게 된다.

```
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] ar) {
	
		// 해시 맵 선언 <키 자료형, 값 자료형>
		Map<String,Integer> map = new HashMap();
		
	}
}
```

### HashMap data 입력 / 삽입
#### map.put( Key,  Value )
```
map.put("A", 100);
map.put("B", 101);
map.put("C", 102);
		
//중복 key, 최신 value로 업데이트
map.put("C", 103);
		
System.out.println(map);
// {A=100, B=101, C=103}
```

### HashMap data 삭제
#### map.remove( Key )
```
// 인자로 주어진 Key가 있으면 data를 삭제 후 value 반환
System.out.print(map.remove("B"));
// 101

// 인자로 주어진 Key가 없으면 null 반환
System.out.print(map.remove("B"));
// null
```

#### map.remove( Key, Value )
```
// 인자로 주어진 Key, Value data가 있으면 data 삭제 후 true 반환
System.out.print(map.remove("C", 103));
// true

// 인자로 주어진 Key, Value data가 없으면 false 반환
System.out.print(map.remove("C", 103));
// false
```

### HashMap data 확인
#### map.get( Key )
```
// 인자로 주어진 Key와 매핑이 되는 value 반환
System.out.print(map.get("A"));
// 100

// 인자로 주어진 Key가 없으면 null 반환
System.out.print(map.get("B"));
// null
```

### HashMap data 변경
#### map.replace( Key, Value )
```
// 인자로 주어진 Key와 매핑이 되는 value 변경 후 기존 value 반환
System.out.print(map.replace("A", 110));
// 100


// 인자로 주어진 Key가 없으면 null 반환
System.out.print(map.replace("B", 110));
// null
```

### HashMap data 순회
#### map.forEach((key, value) -> { } ) 
```
map.put("B", 101);
map.put("C", 102);

map.forEach((key, value) -> {
	System.out.print("key = " + key);
	System.out.println(", value = " + value);
});
// key = A, value = 110
// key = B, value = 101
// key = C, value = 102
```

### 기타 메서드
- clear( ) : 모든 data 삭제
- isEmpty( ) : HashMap이 비어있는지 확인, 비어있으면 true 반환
- containsKey( Key ) : HashMap에 Key 여부 확인, 있으면 true 반환
- containsValue( Value ) : HashMap에 Value 여부 확인, 있으면 true 반환


## reference
https://abcdefgh123123.tistory.com/335
https://devlog-wjdrbs96.tistory.com/253
https://reakwon.tistory.com/151
https://gre-eny.tistory.com/97