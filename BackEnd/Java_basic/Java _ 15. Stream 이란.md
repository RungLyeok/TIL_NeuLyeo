# \[ Java \] 스트림 ( Stream ) 이란?



Java에서 스트림(Stream)은 람다를 활용할 수 있는 기술 중  하나이다,

스트림은 `데이터의 흐름` 이다. 배열 또는 컬렉션 인스턴스에 함수 여러 개를 조합해서  원하는 결과를 필터링하고 가공된 결과를 얻을 수 있다.

또한 람다식을 이용해 코드의 양을 줄이고 간결하게 표현할 수 있다.

즉, 배열과 컬렉션을 함수형으로 처리할 수 있다.


## 생성하기
### 배열 스트림
```
String[] arr = new String[]{"a", "b", "c"}; // 배열 생성
Stream<String> stream = Arrays.stream(arr); // 스트림 생성
Stream<String> stream2 = Arrays.Strea(arr, 1, 3) // [b, c]
```

### 컬렉션 스트림
컬렉션 타입(_Collection, List, Set_)의 경우 인터페이스에 추가된 디폴트 메소드 `stream` 을 이용해서 스트림을 만들 수 있다.

```
List<String> list = Arrays.asList("a", "b", "c"); // list 생성
Stream<String> stream = list.stream(); // 스트림 생성
```

### Stream.builder()
빌더 (Builder)를 사용하면 스트림에 직접 원하는 값을 넣을 수 있다.
마지막에 `build()` 메소드로 스트림을 리턴해야 한다.

```
Stream<String> builderStream = 
	Stream.<String>builder().add("a").add("b").add("c").build(); 
	// [a, b, c]
```

### Stream.generate()
`generate` 메소드를 이용하면 `Supplier<T>` 에 해당하는 람다로 값을 넣을  있다.
`Supplier<T>` 는 인자는 없고 리턴값만 있는 함수형 인터페이스다.
람다에서 리턴하는 값이 들어갑니다.
이 때 생성되는 스트림은 크기가 정해져있지 않고 무한(_infinite_)하기 때문에 특정 사이즈로 최대 크기를 제한해야 한다.

```
Stream<String> generatedStream =   
  Stream.generate(() -> "gen").limit(5); // [gen, gen, gen, gen, gen]
```

### Stream.iterate()
초기값과 해당 값을 다루는 람다를 이용해서 스트림에 들어갈 요소를 만든다.

특정사이즈로 제한해야 한다.
```
Stream<Integer> iteratedStream =   
  Stream.iterate(10, n -> n + 2).limit(5); // [10, 12, 14, 16, 18]
```

### 기본 타입형 스트림
`range` 와  `rangeClosed` 의 차이는 마지막 값이 포함되었는지의 차이이다.

```
IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4]  
LongStream longStream = LongStream.rangeClosed(1, 5); // [1, 2, 3, 4, 5]
```

`Random` 클래스와 스트림을 이요하여 쉽게 난수를 생성할 수 있다.

```
DoubleStream doubles = new Random().doubles(3); // 난수 3개 생성
```

### 문자열 스트림
```

```
## reference
https://futurecreator.github.io/2018/08/26/java-8-streams/


