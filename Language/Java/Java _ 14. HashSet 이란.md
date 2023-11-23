# \[ Java \] HashSet 이란?


HashSet은 Set 인터페이스에서 지원하는 구현 클래스이다.

때문에 Set의 성질을 그대로 상속받는 다는 것이 특징이다.

## HashSet 특징

-   중복 허용 안함: 같은 요소를 중복해서 추가할 수 없다.
-   순서 보장 안함: HashSet은 요소들의 순서가 없다.  
      
    
-   널(null) 값 허용: HashSet에는 하나의 널 값만 저장할 수 있다.

## HashSet 구현 및 주요 메서드

### HashSet 생성

```
// 타입을 지정 가능
HashSet<String> hsset = new HashSet<String>();

// 타입을 생략하여 사용 가능 -> 빈 HashSet생성 시 사용
HashSet<String> hsset1 = new HashSet<>();  

// 초기 용량(Capacity) 설정
HashSet<String> hsset2 = new HashSet<>(10); 

 // animal의 모든 값을 가진 HashSet 생성 
HashSet<String> hsset3 = new HashSet<>(animals1);

//초기값 지정 가능
HashSet<String> hsset4 = new HashSet<>(Arrays.asList("tiger", "lion", "fox")); 
```

### HashSet 요소 추가

Hash에 add() 메소드를 호출하여 값을 추가 가능하다.

  
중복 값을 허용하지 않아 같은 값을 2번 하더라도 1번만 들어간다.

```
hsset.add("tiger");
hsset.add("tiger");
hsset.add("lion");
hsset.add("fox");

System.out.println("hsset : " + hsset); // {tiger, lion, fox}
```

### HashSet 요소 삭제

```
hsset.remove("tiger");
hsset.remove("fox");

System.out.println("hsset : " + hsset); // { lio }
```

### HashSet 요소 확인

```
if (hsset.contains("tiger")) {
    System.out.println("data가 존재합니다.");
} else {
    System.out.println("data가 존재하지 않습니다."); // 출력
}
```

### HashSet 크기 확인

```
int size = hsset.size();

System.out.println(size); // 1
```

## HashSet 사용 사례

-   배열이나 리스트에서 중복된 값을 제거하는데 활용
-   집합에 관련된 다양한 연산 ( 교집합, 합집합, 차집합 ) 을 제공
-   데이터의 순서가 중요하지 않는 상황에서 유용하게 활용

## reference

 [자바 HashSet개념 및 클래스 메서드 예제 정리 - IT장군 Need Action

자바 프로그래밍을 하다보면 다양한 데이터를 관리하고 조작해야 할 때가 있습니다. 그러한 상황에서 효율적으로 데이터를 관리하기 위한 컬렉션 프레임워크가 필요한데, 그 중 하나가 바로 Has

needactionblog.com](https://needactionblog.com/%EC%9E%90%EB%B0%94-hashset%EA%B0%9C%EB%85%90-%EB%B0%8F-%ED%81%B4%EB%9E%98%EC%8A%A4-%EB%A9%94%EC%84%9C%EB%93%9C-%EC%98%88%EC%A0%9C-%EC%A0%95%EB%A6%AC/)