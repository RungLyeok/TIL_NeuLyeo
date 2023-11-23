# \[ Java \] 스트림 ( Stream ) 이란?



Java에서 스트림(Stream)은 람다를 활용할 수 있는 기술 중 하나이다,

스트림은 `데이터의 흐름` 이다. 배열 또는 컬렉션 인스턴스에 함수 여러 개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있다.

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

컬렉션 타입(_Collection, List, Set_)의 경우 인터페이스에 추가된 디폴트 메소드 `stream` 을 이용해서 스트림을 만들 수 있다.

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

`generate` 메소드를 이용하면 `Supplier<T>` 에 해당하는 람다로 값을 넣을 있다.

  
`Supplier<T>` 는 인자는 없고 리턴값만 있는 함수형 인터페이스다.

  
람다에서 리턴하는 값이 들어간다.

  
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

`range` 와 `rangeClosed` 의 차이는 마지막 값이 포함되었는지의 차이이다.

```
IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4] 

LongStream longStream = LongStream.rangeClosed(1, 5); // [1, 2, 3, 4, 5]
```

  
`Random` 클래스와 스트림을 이요하여 쉽게 난수를 생성할 수 있다.

```
DoubleStream doubles = new Random().doubles(3); // 난수 3개 생성
```

### 문자열 스트림

문자열(Stream) 을 `chars` 메소드를 통해 intstream으로 변환

```
IntStream charsStream =   

  "Stream".chars(); // [83, 116, 114, 101, 97, 109]
```

정규식으로 문자열을 자르고, 각 요소들로 스트림을 생성

```
Stream<String> stringStream =   

  Pattern.compile(", ").splitAsStream("Eric, Elena, Java");  

  // [Eric, Elena, Java]
```

### 파일 스트림

`Files` 클래스의 `lines`메소드는 해당 파일의 각 라인, 스트링을 스트림으로 생성한다.

```
Stream<String> lineStream =   

  Files.lines(Paths.get("file.txt"), Charset.forName("UTF-8"));
```

### 스트림 연결하기

`Stream.concat` 메소드를 이용하여 두 스트림을 연결한 스트림을 생성할 수 있다.

```
Stream<String> stream1 = Stream.of("a", "b", "c");

Stream<String> stream2 = Stream.of("1", "2", "3");  

Stream<String> concat = Stream.concat(stream1, stream2);  

// [a, b, c, 1, 2, 3]
```

### 병렬 스트림 ( Parallel Stream )

`parallelStream` 메소드를 사용해서 병렬 스트림을 쉽게 생성할 수 있다.

```
// 병렬 스트림 생성  
Stream<Product> parallelStream = productList.parallelStream();  

// 병렬 여부 확인  
boolean isParallel = parallelStream.isParallel();

// 배열을 이용해 병렬 스트림 생성
Arrays.stream(arr).parallel();

// parallel() 메소드를 사용해서 처리
IntStream intStream = IntStream.range(1, 150).parallel();  
boolean isParallel = intStream.isParallel();
```

시퀀셜(_sequential_) 모드로 돌리고 싶다면 `sequential` 메소드를 사용한다.

```
IntStream intStream = intStream.sequential();  

boolean isParallel = intStream.isParallel();
```

## 가공하기

스트림을 내가 원하는 것만 뽑아내는 과정

가공 단계를 **중간 작업(_intermediate operations_)**이라고 하는데,

이러한 작업은 스트림을 리턴하기 때문에 **여러 작업을 이어 붙여서(_chaining_)** 작성할 수 있다.

```
List<String> list = Arrays.asList("apple", "banana", "cherry", "kiwi");
```

아래 나오는 예제 코드는 위 리스트를 대상으로 한다.

### Filtering

필터 ( Filter )는 스트림 내 요소들을 하나씩 평가하여 걸러낸다.

```
Stream<String> stream = 

    // 요소에 a가 들어있는 스트림만 리턴
    list.stream().filter(el -> el.contains("a"));  // [apple, banana]
```

### Mapping

#### Map

맵 ( Map )은 스트림 내 요소들을 하나씩 특정 값으로 변환한다.

값을 변환하기 위해 람다를 인자로 받는다.

```
Stream<String> stream =   

    // 스트림을 toUpperCase 메소드를 이용하여 대문자로 변환하여 리턴
    list.stream()map(String::toUpperCase);// [APPLE, BANANA, CHERRY, KIWI]
```

#### flatMap

`flatMap` 은 중첩 구조를 한 단계 제거하고 단일 컬렉션으로 만들어주는 역할을 한다.

이러한 작업을 **플래트닝(_flattening_)**이라고 한다.

```
// 2차원 배열 [[a], [b]]
List<List<String>> list =   
      Arrays.asList(Arrays.asList("a"),
                    Arrays.asList("b"));  

// 2차원 배열을 1차원 배열로 만들어 리턴한다.
List<String> flatList =   
    list.stream().flatMap(Collection::stream).collect(Collectors.toList()); 
// [a, b]
```

### Sorting

인자 없이 호출시 오름차순으로 정렬한다.

```
IntStream.of(14, 11, 20, 39, 23)  
  .sorted()
  .boxed()  
  .collect(Collectors.toList());  
// [11, 14, 20, 23, 39]
```

Comparator를 인자로 넘겨 역순으로 정렬한 코드

```
lang.stream()  
  .sorted()  
  .collect(Collectors.toList());  
// [Go, Groovy, Java, Python, Scala, Swift]  

lang.stream()  
  .sorted(Comparator.reverseOrder())  
  .collect(Collectors.toList());  
// [Swift, Scala, Python, Java, Groovy, Go]
```

문자열 길이를 기준으로 정렬

```
lang.stream()  
  .sorted(Comparator.comparingInt(String::length))  
  .collect(Collectors.toList());  
// [Go, Java, Scala, Swift, Groovy, Python]  

lang.stream()  
  .sorted((s1, s2) -> s2.length() - s1.length())  
  .collect(Collectors.toList());  
// [Groovy, Python, Scala, Swift, Java, Go]
```

### peek

스트림에 특정 작업을 수행 할 뿐 결과에 영향을 미치지 않는다.

중간에 결과를 확인하는 용도로 사용할 수 있다.

```
int sum = IntStream.of(1, 3, 5, 7, 9)  
  .peek(System.out::println)  
  .sum();
```

## 결과 만들기

가공한 스트림을 가지고 내가 사용할 결과값으로 만들어내는 단계이다.

따라서 스트림을 끝내는 최종 작업(_terminal operations_)이다.

### Calculating

최소, 최대, 합, 평균 등 기본형 타입으로 결과를 만들어낼 수 있다.

```
long count = IntStream.of(1, 3, 5, 7, 9).count(); // 5  

long sum = LongStream.of(1, 3, 5, 7, 9).sum(); // 25
```

만약 스트림이 비어 있는 경우 `count` 와 `sum` 은 0을 출력한다.

하지만 평균, 최소, 최대의 경우에는 표현할 수가 없기 때문에 Optional 을 이용해 리턴한다.

```
OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min(); // OptionalInt[1]

OptionalInt max = IntStream.of(1, 3, 5, 7, 9).max();  // OptionalInt[9]

OptionalInt max1 = IntStream.of().max(); // OptionalInt.empty
```

스트림에서 바로 `ifPresent` 메소드를 이용해서 Optional 을 처리할 수 있다.

```
DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5)  
  .average()  
  .ifPresent(System.out::println);
```

### Reduction

`reduce` 메소드는 총 세 가지의 파라미터를 받을 수 있습니다.

-   accumulator : 각 요소를 처리하는 계산 로직. 각 요소가 올 때마다 중간 결과를 생성하는 로직.
-   identity : 계산을 위한 초기값으로 스트림이 비어서 계산할 내용이 없더라도 이 값은 리턴.
-   combiner : 병렬(_parallel_) 스트림에서 나눠 계산한 결과를 하나로 합치는 동작하는 로직.

인자가 하나만 있는 경우

두 값을 더하는 람다를 넘겨주고 있다.

```
OptionalInt reduced =   
    IntStream.range(1, 4) // [1, 2, 3] 
    .reduce((a, b) -> { return Integer.sum(a, b); }  
);
// reduced = OptionalInt[6]
```

2개의 인자를 받는 경우

10은 초기값, 스트림 내 값을 더해서 16이 된다.

```
int reducedTwoParams =  
IntStream.range(1, 4) // [1, 2, 3]  
.reduce(10, Integer::sum); // method reference
//reducedTwoParams = 16
```

3개의 인자를 받는 경우

  
combiner는 병렬 처리 시 각자 다른 쓰레드에서 실행한 결과를 마지막에 합치는 단계이다.

  
따라서 병렬 스트림에서만 동작한다.

```
Integer reducedParallel = Arrays.asList(1, 2, 3)  
        .parallelStream()  
        .reduce(10,  
                Integer::sum,  
                (a, b) -> {  
                    System.out.println("combiner was called");  
                    return a + b;  
                });
// combiner was called
// combiner was called
// reducedParallel = 36
```

### Collecting

다음과 같은 간단한 리스트 사용, Product 객체는 수량과 이름을 가지고 있다.

```
class Product{  
    int amount;  
    String name;  

    Product(int amount, String name){  
        this.amount = amount;  
        this.name = name;  
    }  

    public String getName() {  
        return this.name;  
    }  
    public int getAmount() {  
        return this.amount;  
    }  
}

List<Product> productList =   
  Arrays.asList(new Product(23, "apple"),  
                new Product(14, "banana"),  
                new Product(13, "orange"),  
                new Product(23, "kiwi"),  
                new Product(13, "cherry"));
```

#### Collectors.toList()

스트림에서 작업한 결과를 담은 리스트로 반환

`map` 으로 각 요소의 이름을 가져온 후 `Collectors.toList` 를 이용해서 리스트로 결과를 가져온다.

```
List<String> collectorCollection =  
     productList.stream()  
        .map(Product::getName)  
        .collect(Collectors.toList());  
// collectorCollection = [apple, banana, orange, kiwi, cherry]]
```

#### Collectors.joining()

`Collectors.joining` 은 세 개의 인자를 받는다.

이를 이용하면 간단하게 스트링을 조합할 수 있다.

-   delimiter : 각 요소 중간에 들어가 요소를 구분시켜주는 구분자
-   prefix : 결과 맨 앞에 붙는 문자
-   suffix : 결과 맨 뒤에 붙는 문자

```
String listToString =  
        productList.stream()  
            .map(Product::getName)  
            .collect(Collectors.joining(", ", "<", ">"));
// listToString = <apple, banana, orange, kiwi, cherry>
```

#### Collectors.averageingInt()

숫자 값(_Integer value_ )의 평균(_arithmetic mean_) 반환한다.

```
Double averageAmount =   
     productList.stream()  
        .collect(Collectors.averagingInt(Product::getAmount));  
// averageAmount = 17.2
```

#### Collectors.summingInt()

숫자값의 합(_sum_)을 반환

```
Integer summingAmount =   
    productList.stream()  
        .collect(Collectors.summingInt(Product::getAmount));
// summingAmount = 86

// IntStream 으로 바꿔주는 `mpaToInt` 메소드를 사용하면 간단히 표현 가능
Integer summingAmount1 =  
        productList.stream()  
            .mapToInt(Product::getAmount)  
            .sum()
```

#### Collectors.summarizingInt()

-   개수 _getCount()_
-   합계 _getSum()_
-   평균 _getAverage()_
-   최소 _getMin()_
-   최대 _getMax()_

을 모두 반환 한다.

```
IntSummaryStatistics statistics =  
        productList.stream()  
            .collect(Collectors.summarizingInt(Product::getAmount));
// statistics = IntSummaryStatistics{count=5, sum=86, min=13, average=17.200000, max=23}
```

#### Collectors.groupingBy()

특정 조건으로 요소들을 그룹지을 수 있다.

인자는 함수형 인터페이스를 받는다.

수량을 기준으로 그룹핑 해보았다.

```
Map<Integer, List<Product>> collectorMapOfLists =  
    productList.stream()  
        .collect(Collectors.groupingBy(Product::getAmount));

// 결과
{23=[Product{amount=23, name='apple'},   
     Product{amount=23, name='kiwi'}],   
 13=[Product{amount=13, name='orange'},   
     Product{amount=13, name='cherry'}],   
 14=[Product{amount=14, name='banana'}]}
```

#### Collectors.partitioningBy()

`partitioningBy` 은 함수형 인터페이스 Predicate 를 받는다.

Predicate 는 인자를 받아서 boolean 값을 리턴한다.

```
Map<Boolean, List<Product>> mapPartitioned =   
  productList.stream()  
  .collect(Collectors.partitioningBy(el -> el.getAmount() > 15));

// 결과
{false=[Product{amount=14, name='banana'},   
        Product{amount=13, name='orange'},   
        Product{amount=13, name='cherry'}],   
 true=[Product{amount=23, name='apple'},   
       Product{amount=23, name='kiwi'}]}
```

#### Collectors.collectingAndThen()

특정 타입으로 결과를 `collect` 한 이후에 추가 작업이 필요한 경우에 사용한다.

`Collectors.toSet` 을 이용해서 결과를 Set 으로 collect 한 후 수정불가한 Set 으로 변환하는 작업을 추가로 실행하는 코드이다.

```
Set<Product> unmodifiableSet =   
    productList.stream()  
        .collect(Collectors.collectingAndThen(Collectors.toSet(),  
                                        Collections::unmodifiableSet));
```

#### Collector.of()

이 외에 필요한 로직이 있다면 직접 collector 를 만들 수도 있다.

다음 코드에서는 collector 를 하나 생성한다.

컬렉터를 생성하는 supplier 에 LinkedList 의 생성자를 넘겨준다.

그리고 accumulator 에는 리스트에 추가하는 `add` 메소드를 넘겨주고 있다.

따라서 이 컬렉터는 스트림의 각 요소에 대해서 LinkedList 를 만들고 요소를 추가하게 된다.

마지막으로 combiner 를 이용해 결과를 조합하는데, 생성된 리스트들을 하나의 리스트로 합치고 있다.

```
Collector<Product, ?, LinkedList<Product>> toLinkedList =   
    Collector.of(LinkedList::new,   
                 LinkedList::add,   
                (first, second) -> {  
                 first.addAll(second);  
                 return first;  
               });
```

### Matching

조건식 람다 Predicate 를 받아서 해당 조건을 만족하는 요소가 있는지 체크한 결과를 리턴한다.

-   하나라도 조건을 만족하는 요소가 있는지(_anyMatch_)
-   모두 조건을 만족하는지(_allMatch_)
-   모두 조건을 만족하지 않는지(_noneMatch_)

```
List<String> list = Arrays.asList("apple", "banana", "kiwi");  

boolean anyMatch = list.stream()  
        .anyMatch(name -> name.contains("a"));    
//anyMatch = true, a가 하나라도 들어있으면 true

boolean allMatch = list.stream()  
        .allMatch(name -> name.length() > 5); 
// allMatch = false, 모두 크키가 5를 초과해야 true

boolean noneMatch = list.stream()  
        .noneMatch(name -> name.endsWith("s"));  
// noneMatch = true, 모두 끝 단어가 s가 아니면 true
```

### Iterating

`foreach` 는 요소를 돌면서 실행되는 최종 작업이다.

보통 `System.out.println` 메소드를 넘겨서 결과를 출력할 때 사용한다.

`peek` 과는 중간 작업과 최종 작업의 차이가 있다.

```
list.stream().forEach(System.out::println);
// apple
// banana
// kiwi
```

## reference

[https://futurecreator.github.io/2018/08/26/java-8-streams/](https://futurecreator.github.io/2018/08/26/java-8-streams/)