# \[Java\] 01. 변수 ( variable ) 와 자료형

---

  
  

## 01\. 변수 (variable) 란?

데이터를 저장하기 위해 할당받은 메모리 공간의 이름이다.

즉, 변수란 데이터를 저장할 수 있는 메모리 공간을 의미하며, 저장된 값은 변경될 수 있다.  
  

```
int age = "26";
String name = "NeuLyeo";
```

  
  
  
  

### 1 )변수 이름 생성 규칙

**변수의 이름은 해당 변수에 저장될 데이터의 의미를 잘 나타내는 것이 좋다.**  
  

> 변수명 작성 규칙
> 
> -   문자, 숫자 \_ , $ 사용가능
> -   숫자로 시작 X
> -   대문자와 소문자 구분
> -   공백 사용 X
> -   예약어 사용 X

### 2 )표기법

표기법에는 여러 종류가 존재하지만 Java 크게 2가지를 사용한다.  
  
  
  

#### 파스칼 표기법 (PascalCase)

파스칼 표기법은 첫 글자를 대문자로 구성하며 단어가 합성될 때마다 각 단어의 첫 글자를 대문자로 표기하는 방법이다.

자바에서는 **클래스**의 명명 규칙인 첫 글자를 대문자로 한다는 규칙에 캐멀 표기법이 합쳐진 형태이다.  
  

```
ex) class MainTitle     class CircleTest     class UserStatus
```

  
  
  

#### 캐멜 표기법 (camelCase : 낙타 표기법)

캐멀 표기법은 두 단어 이상의 변수명을 표현할 때 두 번째 단어부터 첫 글자를 대문자로 표기하는 방법이다.

캐멀 표기법은 자바에서 시작된 것으로 **변수명** 작성할 때 단어마다 단어의 첫 글자를 대문자로 표기하는 것이다.

이 표기법은 각 단어의 첫 글자가 대문자로 표기되어 꼭 낙타의 등처럼 보여 캐멀 표기법으로 불리게 되었다고 알고 있는 사람들이 많지만 이는 사실과 다르다.  
  

```
addNum     helloWorld     userName
```

  
  

-   **변수 이름도** 번째로 오는 의미 있는 단어의 앞 글자는 대문자이다.
-   : 맨 앞 글자를 소문자로 한다.

```
 String myName;             //--(○)

 String MyName;             //--(Χ)
```

  
  

-   **메서드 이름**두 번째로 오는 의미 있는 단어의 앞 글자는 대문자이다. 단, 메서드의 이름은 가급적 동사로 시작할 수 있도록 명명하는 것이 좋다.
-   (변수 이름의 명명법과 동일한 방법)
-   : 맨 앞 글자를 소문자로 한다.

```
public String createMyName() {}   //--(○)

public String createmyname() {}   //--(Χ)

public String myName() {}         //--(동사가 아닌 명사라 추천하지 않음)
```

  
  
  
  
  

---

## 02\. 자료형 (Data Tyoe)

자바에서 변수는 타입에 따라 크게 다음과 같이 구분할 수 있습니다.

-   기본형(primitive type) 변수
-   참조형(reference type) 변수  
      
    

```
Java Data Type 
ㄴ Primitive Type
    ㄴ Boolean Type**(boolean)**
    ㄴ Numeric Type
        ㄴ Integral Type
            ㄴ Integer Type**(short, int, long)**
            ㄴ Floating Point Type**(float, double)**
        ㄴ Character Type**(char)**
ㄴ Reference Type
    ㄴ Class Type
    ㄴ Interface Type
    ㄴ Array Type
    ㄴ Enum Type
    ㄴ etc.
```

  
  

### 1 ) 기본형 (Primitive Type)

기본형은 다음과 같은 특징을 가집니다.  
  

-   자바에서 기본 자료형은 반드시 사용하기 전에 선언 Declared 되어야 합니다.
-   OS에 따라 자료형의 길이가 변하지 않습니다.
-   **비객체** 타입입니다. 따라서 `null` 값을 가질 수 없습니다.

  
  

#### 숫자 (Number)

숫자 형태의 자료형에는 정수 /실수 / 2진수, 8진수, 16진수 등이 있다.  
  

| Type | Bits | Range of Values |
| --- | --- | --- |
| int | 32bits | \-2^31 ~ 2^31-1 (-2147483648 ~ 2147483647) |
| long | 64bits | \-2^63 ~ 2^63-1 (-9223372036854775808 ~ 9223372036854775807) |
| float | 32bits | 0x0.000002P-126f ~ 0x1.fffffeP+127f |
| double | 64bits | 0x0.0000000000001P-1022 ~ 0x1.fffffffffffffP+1023 |

  
  

#### 부울 (Boolean)

참과 거짓을 나타내는 자료형이다.  
  

| Type | Bits | Range of Values |
| --- | --- | --- |
| boolean | 1bit | true, false |

#### 문자 (Character)

한 개의 문자 표현에 사용되는 자료형이다.  
  

| Type | Bits | Range of Values |
| --- | --- | --- |
| char | 16bits | \\u0000 ~ \\uffff (0 ~ 2^15-1)   \* 자바에서 unsgined로 동작하는 자료형 |

  
  
  
  

### 2 ) 참조형 (Reference Type)

참조형은 기본적으로 `java.lang.Object`를 상속받으면 참조형이 된다.

참조형에는 클래스형 Class Type / 인터페이스형 Interface Type / 배열형 Array Type 이 있다.

  
  

#### Class Type

클래스형은 기본형과 다르게 객체를 참조하는 형태이다.  
  
  

##### Class Type - 문자열 (String)

문자들로 이루어진 집합이다.  
  

```
String str1 = "Hello World";
String str1 = "Let's try it today";
```

String 클래스는 조금 특별하다.

이 클래스는 참조형에 속하지만 기본적인 사용은 **기본형**처럼 사용한다.

그리고 **불변하는 immutable** 객체이다.

String 클래스에는 값을 변경해 주는 메서드들이 존재하지만 해당 메서드를 통해 데이터를 바꾼다 해도 새로운 String 클래스 객체를 만들어 내는 것이다.

일반적으로 기본형 비교는 `==`연산자를 사용하지만 String 객체 간의 비교는. equals() 사용해야 한다.  
  
  

##### Class Type - Wrapper Class

래퍼 클래스는 기본형을 클래쓰로 감싼 형태이다.  
  

| 기본형 | 대응 래퍼 클래스 |
| --- | --- |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Char |
| boolean | Boolean |

  
  

#### Interface Type

```
interface MyInterface<T> {
    void add(T value);
}
```

인터페이스를 만들게 되면 새로운 참조 자료형을 만드는 것과 같다.

  
인터페이스도 자료형이기 때문에 자료형으로 자신을 구현한 객체의 주소를 가질 수 있다.

  
하지만 인터페이스에 정의된 메서드만 사용할 수 있다.  
  
  

#### 배열 (Arraye Type)

많은 수의 데이터를 담을 수 있는 자료형이다.

  
배열은 기본형으로도 만들 수 있고 참조형으로도 만들 수 있다.  
  

```
public class ArrayType {
    public static void main(String[] args) {
        int [] i = new int[2];
        Long [] l = new Long[2];
        Object[][] o = null;
    }
}
```

  
  

#### 리스트 (List)

배열과 같이 여러 데이터를 담을 수 있는 자료형이다.  
여러 함수를 제공한다.  
  

```
ArrayList l1 = new ArrayList();
l1.add(1);
```

#### 맵 (Map)

key, value 형태로 데이터를 저장하는 자료형이다.  
  

```
HashMap<String,String> map1 = new HashMap<String,String>();//HashMap생성 
HashMap<String,String> map2 = new HashMap<>();//new에서 타입 파라미터 생략가능 
HashMap<String,String> map3 = new HashMap<>(map1);//map1의 모든 값을 가진 HashMap생성
HashMap<String,String> map4 = new HashMap<>(10);//초기 용량(capacity)지정
HashMap<String,String> map6 = new HashMap<String,String>(){{//초기값 지정 
    put("a","b"); 
}};
```

  
  

#### 제네릭스 (Generics)

자료형을 명시적으로 지정하여 내가 사용하고 싶은 데이터 타입만을 사용할 수 있게 한다.  
제한적일 수 있지만 안정성을 높여주고 형변환을 줄여준다.  
  

```
public class Generics {

    public static void main(String[] args) { 
        // String 객체만 다룬다.
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("박지성");
        arrList.add("손흥민");
        arrList.add("기성용");
        for(int i=0; i<arrList.size(); i++){
            System.out.println("arrList : " + arrList.get(i));
        }
        // int형 객체만 다룬다.
        List<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(456);
        list.add(789);
        for(int i=0; i<list.size(); i++){
            System.out.println("list : " + list.get(i));
        }
    }
}
```