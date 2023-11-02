# Java_basic
<br>
<br>

---
---
<br>
<br>

## 1. Java_변수와 자료형
### 01. 변수란?
데이터를 저장하는 메모리 공간에 붙여준 이름이다.

```
int age = "26";
String name = "NeuLyeo";
```
<br>
<br>

#### 1) 변수 이름 규칙
변수 이름을 작성하는 데에는 규칙이 있다.

> **변수명 작성 규칙**
> 1. 문자, 숫자 _ , $ 사용가능
> 2. - 숫자로 시작 X
> 3. 대문자와 소문자 구분
> 4. 공백 사용 X
> 5. 예약어 사용 X

<br>
<br>

#### 2) 표기법

표기법에는 여러 종류가 존재하지만 Java 크게 2가지를 사용한다.

##### 카멜 표기법 (camelCase)

가장 앞의 단어는 소문자, 그 후 단어들은 대문자로 표기한다.
보통 변수, 메소드 이름 작성에 사용 된다.
<br>

##### 파스칼 표기법 (PascalCase)

모든 단어의 첫 문자를 대문자로 표기한다.
Java의 클래스를 작성할 때 사용한다.
<br>
<br>
<br>

### 02. 자료형 (Data Tyoe)

자바의 자료에는 기본형Primitive Type과 참조형Reference Type이 있습니다. 일반적인 분류는 다음처럼 가집니다.

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

<br>
<br>

#### 1) 기본형 (Primitive Type)
기본형은 다음과 같은 특징을 가집니다.

> - 자바에서 기본 자료형은 반드시 사용하기 전에 선언Declared되어야 합니다.
> - OS에 따라 자료형의 길이가 변하지 않습니다.
> - **비객체** 타입입니다. 따라서 `null` 값을 가질 수 없습니다.

##### 숫자 (Number)
숫자 형태의 자료형에는 정수 /실수 / 2진수,8진수, 16진수 등이 있다.

```
Type        Bits      Range of Values
----------------------------------------------------------------------------------
int         32bits    -2^31 ~ 2^31-1 (-2147483648 ~ 2147483647)
long        64bits    -2^63 ~ 2^63-1 (-9223372036854775808 ~ 9223372036854775807)
float       32bits    0x0.000002P-126f ~ 0x1.fffffeP+127f
double      64bits    0x0.0000000000001P-1022 ~ 0x1.fffffffffffffP+1023
```

<br>

##### 부울 (Boolean)

참과 거짓을 나타내는 자료형이다.

```
Type        Bits      Range of Values
----------------------------------------------------------------------------------
boolean      1bit     true, false
```

<br>

##### 문자 (Character)
한 개의 문자 표현에 사용되는 자료형이다.
```
Type        Bits      Range of Values
----------------------------------------------------------------------------------------
char        16bits    \u0000 ~ \uffff (0 ~ 2^15-1) * 자바에서 unsgined로 동작하는 자료형
```

<br>
<br>

#### 2) 참조형 (Reference Type)
참조형은 기본적으로 `java.lang.Object`를 상속 받으면 참조형이 된다.
참조형에는 클래스형Class Type / 인터페이스형Interface Type / 배열형Array Type 이 있다.

<br>

##### Class Type

클래스형은 기본형과 다르게 객체를 참조하는 형태이다.
<Br>

###### Class Type - 문자열 (String)

문자들로 이루어진 집합이다.

```
String str1 = "Hello World";
String str1 = "Let's try it today";
```

String 클래스는 조금 특별하다. 이 클래스는 참조형에 속하지만 기본적인 사용은 **기본형**처럼 사용한다. 그리고 **불변하는**immutable 객체이다. 
String 클래스에는 값을 변경해주는 메소드들이 존재하지만 해당 메소드를 통해 데이터를 바꾼다 해도 새로운 String 클래스 객체를 만들어 내는 것이다.

일반적으로 기본형 비교는 `==`연산자를 사용하지만 String 객체간의 비교는 `.equals()` 메소드를 사용해야 합니다.
<br>

###### Class Type - Wrapper Class

래퍼 클래스는 기본형을 클래쓰로 감싼 형태이다.


```
기본형   대응 래퍼 클래스
byte     Byte
short    Short
int      Integer
long     Long
float    Float
double   Double
char     Char
boolean  Boolean
```
<br>

##### Interface Type

```
interface MyInterface<T> {
	void add(T value);
}
```

인터페이스를 만들게 되면 새로운 참조 자료형을 만드는 것과 같다.
인터페이스도 자료형이기 때문에 자료형으로 자신을 구현한 객체의 주소를 가질 수 있다.
하지만 인터페이스에 정의된 메소드만 사용할 수 있다.
<br>

##### 배열 (Arraye Type)
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
<br>

##### 리스트 (List)
배열과 같이 여러 데이터를 담을 수 있는 자료형이다.
여러 메소드를 제공 한다.

```
ArrayList l1 = new ArrayList();
l1.add(1);
```
<Br>

##### 맵 (Map)
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
<br>

##### 제네릭스 (Generics)

자료형을 명시적으로 지정하여 내가 사용하고 싶은 데이터 타입만을 사용할 수 있게 한다.
제한적일 수 있지만 안정성을 높여주고 형변환을 줄여준다.

```
public class Generics {

    public static void main(String[] args) { 
	    // String 객체만 다룬다.
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("박지성");
        arrList.add("손흥민");
        arrList.add("기성용");
        for(int i=0; i<arrList.size(); i++){
            System.out.println("arrList : " + arrList.get(i));
        }
		// int형 객체만 다룬다.
        List<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(456);
        list.add(789);
        for(int i=0; i<list.size(); i++){
            System.out.println("list : " + list.get(i));
        }
    }
}
```
<br>
<br>
<br>

### 03. 여러가지 연산자

- 프로그램에서 데이터를 처리하여 결과를 산출하는 것을 연산(operation)이라 한다.
- 연산에 사용되는 표시나 기호를 연산자(operator)라고 한다.
- 연산되는 데이터는 피연산자(operand)라고 한다.  
    예) 산술연산 +, -, *, /, %

#### 1) 항과 연산자
- 단항 연산자 : 항이 1개 /  num--
- 이항 연산자 : 항이 2개 / 1 + 1
- 삼항 연산자 : 항이 3개 ? (1 > 0) ? 1:0

<br>
<br>

#### 2) 대입 연산자, 복합 대입 연산자
특정한 상수 값이나 변수 값 또는 객체를 변수에 전달하여 기억시킬 때 사용하는 연산자이다.

```
int num = 1000;
```


대입 연산자와 다른 연산자를 조합한 연산자

| 구분        | 연산자 | 설명                                                    |
| ----------- | ------ | ------------------------------------------------------- |
| 대입 연산자 | =      | 연산자를 중심으로 오른쪽 변수값을 왼쪽 변수에 대입한다. |
|             | +=     | 왼쪽 변수에 더하면서 대입한다.                          |
|             | -=     | 왼쪽 변수값에서 빼면서 대입한다.                        |
|             | *=     | 왼쪽 변수에 곱하면서 대입한다.                          |
|             | /=     | 왼쪽 변수에 나누면서 대입한다.                          |
|             | %=     | 왼쪽 변수에 나머지 값을 구하면서 대입한다.              |
<br><br>

#### 3) 산술 연산자
가장 기본이 되는 연산자로 4칙 연산(+, -, *, /)과 나머지 값을 구하는 나머지 연산자(%)가 있다.

| 구분        | 연산자 | 설명                                  |
| ----------- | ------ | ------------------------------------- |
| 산술 연산자 | +      | 두 수에 대한 덧셈                     |
|             | -      | 두 수에 대한 뺄셈                     |
|             | *      | 두 수에 대한 곱셈                     |
|             | /      | 두 수에 대한 나눗셈                   |
|             | %      | 두 수를 나눈 후 그 나머지를 반환한다. |
<br><br>

#### 4) 증감 연산자

증감연산자는 피연산자의 값을 1씩 증가 또는 감소시키는 연산자이다. 증감 연산자가 변수 앞에 위치하느냐 변수 뒤에 위치하느냐에 따라 결과 값이 달라진다.

| 구분        | 연산자 | 설명                                                  |
| ----------- | ------ | ----------------------------------------------------- |
| 증감 연산자 | x++    | 먼저 해당 연산을 수행한 후 피연산자의 값을 1증가 시킴 |
|             | ++x    | 먼저 피연산자의 값을 1증가 시킨 후 해당 연산을 수행함 |
|             | x--    | 먼저 해당 연산을 수행한 후 피연산자의 값을 1감소 시킴 |
|             | --x    | 먼저 피연산자의 값을 1감소 시킨 후 해당 연산을 수행함 |
<br><br>

#### 5) 관계 연사자
변수나 상수의 값을 비교할 때 쓰이는 연산자로서 결과가 항상 true 또는 false인 논리값(boolean)이어야 한다.

| 구분        | 연산자 | 설명                        |
| ----------- | ------ | --------------------------- |
| 비교 연산자 | >      | 크다                        |
|             | <      | 작다                        |
|             | >=     | 크거나 같다                 |
|             | <=     | 작거나 같다                 |
|             | ==     | 피연산자들의 값이 같다      |
|             | !=     | 피연산자들의 값이 같지 않다 |
<br>
<br>

#### 6) 논리 연산자
논리 연산자는 피연산자의 값이 true나 false인 논리 값을 가지고 다시 한번 조건 연산하는 연산자이다. 

논리 연산자의 종류(1)

| 연산자 | 의미         | 설명                                                |
| ------ | ------------ | --------------------------------------------------- |
| &      | and (논리곱) | 주어진 조건들이 모두 true일 때만 true를 나타낸다.   |
| \|     | or (논리합)  | 주어진 조건들 중 하나라도 true이면 true를 나타낸다. |
| !      | not (부정)   | true는 false로 false는 true로 나타낸다.             |


논리 연산자의 종류(2)

| 구분 | 설명                                                                                |
| ---- | ----------------------------------------------------------------------------------- |
| &&   | 선조건이 true일 때만 후조건을 실행하며 선조건이 false이면 후조건을 실행하지 않는다. |
| \|\|   | 선조건이 true이면 후조건을 실행하지 않으며 선조건이 false일 때만 후조건을 실행한다. |
<br><br>

#### 7) 2진수, 8진수, 16진수
컴퓨터에서 데이터 표현을 위해 사용한다.

java.lang.Integer의 toBinaryString(), toOctalString(), toHexaString() 메소드를 이용하여

10진수를 2진수, 8진수, 16진수 문자열로 변환할 수 있습니다.

| 리턴 타입     | 클래스            | 메소드                    | 설명             |
| ------------- | ----------------- | ------------------------- | ---------------- |
| static String | java.lang.Integer | **toBinaryString(int i)** | 10진수 -> 2진수  |
| static String | java.lang.Integer | **toOctalString(int i)**  | 10진수 -> 8진수  |
| static String | java.lang.Integer | **toHexaString(int i)**   | 10진수 -> 16진수 |

```
int num = 10;
String binary = Integer.toBinaryString(num); // 10진수 -> 2진수
String octal = Integer.toOctalString(num); // 10진수 -> 8진수
String hexaDecimal = Integer.toHexString(num); // 10진수 -> 16진수
```

결과
```
10진수 : 10
2진수 : 1010
8진수 : 12
16진수 : a
```
<br>
<br>

#### 2의 보수
2의 보수는 **1의 보수에 1을 더하는 것이다.**

![](https://i.imgur.com/TyH9t4O.png)
<br>
<br>

#### 8) 비트 연산자
피연산자 즉 연산의 대상이 되는 값들을 내부적으로 bit단위로 변경한 후 연산을 수행하는 연산자이다.

| 구분        | 연산자 | 설명                                                      |
| ----------- | ------ | --------------------------------------------------------- |
| 비트 연산자 | &      | 비트 단위의 AND                                           |
|             | \|     | 비트 단위의 OR                                            |
|             | ^      | XOR (배타적 OR)                                           |
|             | ~      | 단항 연산자 이며, 비트를 반전한다. 0은 1로 1은 0으로 만듬 |

![](https://i.imgur.com/PzQD11i.png)
<br><br>

#### 10) 비트 이동 연산자
시프트 연산자는 bit단위의 연산처리를 하며 자료의 가공을 위해 오른쪽 또는 왼쪽으로 이동하여 값에 대한 변화를 일으키는 연산자입니다.

| 구분          | 연산자 | 설명                                                      |
| ------------- | ------ | --------------------------------------------------------- |
| 시프트 연산자 | >>     | bit값을 오른쪽으로 이동 (빈 자리는 부호값으로 대입) 한다. |
|               | <<     | bit값을 왼쪽으로 이동 (빈 자리는 0으로 대입) 한다.        |
|               | >>>    | bit값을 오른쪽으로 이동 (빈 자리는 0으로 대입) 한다.      |
<br>
<br>
<br>

### 04. 조건문
조건문은 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문이다.
#### 1) 조건문 - if
조건의 참, 거짓에 따라 서로 다른 작업을 수행한다.

조건이 참(ture) 이면 if 내부의 '수행문'이 실행 되며
거짓(false) 이면 다음 조건문으로 넘어간다.

```
if (조건문1) {
	조건문 1을 만족시 실행
} else if (조건문2) {
	조건문 2를 만족시 실행
} else {
	조건문에 해당 안될 때 실행
}
```
<br>
<br>

#### 2) 조건문 - switch
먼저 '식'을 계산하고 그 결과 값과 일치하는 case문으로 분기한다.
case문의 '실행할 문장'을 실행한 후 break를 만나면 switch문을 벗어난다.
어떠한 case 문도 분기하지 못한 경우 default 문으로 이동한다.
default 문은 생략 가능, 실행문장은 {}으로 둘러싸지 않는다.

```
switch (입력값) {
	case 값1:
		실행할 내용1;
		break;
	case 값2:
		실행할 내용2;
		break;
	default:
		실행할 내용3;
		break;
}
```


