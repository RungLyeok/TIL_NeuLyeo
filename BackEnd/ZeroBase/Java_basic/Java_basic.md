## 10. 추상 클래스
<Br>

### 01. 추상 클래스

추상 클래스(Abstract Class)는 추상 메서드를 선언해 놓고 상속을 통해 자식 클래스에서 메서드를 완성하도록 유도하는 클래스이다. 

이러한 특성 탓에 **미완성 설계도**라고 표현하기도 한다.

실체클래스의 공통적인 부분( 변수, 메서드 )를 추출해서 선언한 클래스이다.

추상클래스는 **객체를 생성할 수 없다**. 실체가 없고 구체적이지 않기 때문에

추상클래스와 실체클래스는 상속관계이다.

```
abstract class 클래스{ 
	...
	public abstract void 메서드(); 
}
```

추상 클래스는 추상 메서드를 가지지 않아도 괜찮다. 다만, 추상 메서드를 하나라도 가진다면 그 클래스는 추상 클래스가 된다.

추상 메서드를 선언했다면 자식 클래스는 해당 메서드를 반드시 구현하도록 강제된다.

또한 JAVA는 다중 상속을 지원하지 않기 때문에 여러 개의 추상 클래스를 상속할 수 없다.
<Br>

#### 추상클래스 사용 목적
1. 공통된 필드와 메서드를 통일할 목적
2. 실체클래스 구현시, 시간절약
3. 규격에 맞는 실체클래스 구현
<br>
<br>
<br>

### 02. 추상 메소드

추상클래스에 존재하는 메소드를 상속받은 자식클래스에서 반드시 오버라이딩 해야하는 메소드 이다.

추상메소드는 선언만하고 구현 내용이 없다.

```
abstract void print();
```

<br>
<br>
<br>
<br>

---
## 11. 인터페이스
<br>

### 01. 인터페이스

인터페이스도 추상 클래스와 비슷하게 다른 클래스를 작성하는데 도움을 주는 목적으로 작성한다.

다만 인터페이스는 추상 클래스보다 추상화 정도가 높아 추상 클래스와 다르게 구현부가 있는 일반 메서드, 일반 변수 멤버 등을 가질 수 없다. 

즉, 인터페이스는 구현된 게 아무것도 없는 **기본 설계도**라고 할 수 있다.

인터페이스 또한 인스턴스를 생성할 수 없다.

```
interface 인터페이스{
    public static final 상수 = 값;
    public abstract void 메서드();
}
```

**모든 멤버 변수는 public static final, 즉 상수이다.** 
public static final은 자동으로 컴파일 시 생성되므로 생략가능 하다.

**모든 메서드는 public abstract, 즉 추상 메서드이다.** 
마찬가지로 public abstract는 생략 가능하다.

다만, Java 8에서부터는 다음과 같이 디폴트 메서드와 정적 메서드를 사용할 수 있다.

디폴트 메서드 :

```
public interface Default{     
        // 디폴트 메소드 : 실행 내용까지 작성 가능
        public default void 메서드(){
   
            ... // 구현 내용
            
        }
}
```

정적 메서드 :

```
public interface Static{   
        // 정적 메소드
        public static void 메서드(){
            ... // Static.메서드() 와 같이 호출 가능
        }
 }
```
<br>
<br>
<br>

### 02. 추상클래스와 인터페이스의 차이

|             |                                         추상클래스                                          | 인터페이스                                             |
| ----------- |:-------------------------------------------------------------------------------------------:| ------------------------------------------------------ |
| 다중상속    |                                           불가능                                            | 가능                                                   |
| 추상 메서드 |                                          0개 이상                                           | 전부                                                   |
| 일반 메서드 |                                            가능                                             | 불가능. 다만 Java8부터는 디폴트, 정적 메서드 구현 가능 |
| 필드        |                                  일반 변수, 상수 모두 가능                                  | 상수(static final)만 가능                              |
| 상속 키워드 |                                           extends                                           | implements                                             |
| 접근 제어자 |                                          제한 없음                                          | public                                                 |
| 공통점      | 1. 인스턴스를 생성할 수 없다.  <br>2. 상속받은 클래스는 반드시 추상 메서드를 구현해야 한다. |                                                        |


![](https://i.imgur.com/MDrN5H3.png)
<br>
<br>

#### 추상클래스

- 사람 is kind of 포유류
- 포유류 is kind of 생물체
- 조류 is kind of 생물체

##### 명확한 계층 구조 추상화
추상 클래스는 이를 상속받을 각 객체들의 공통점을 찾아 추상화시켜 놓은 것으로, 상속 관계를 타고 올라갔을 때 같은 부모 클래스를 상속하며 부모 클래스가 가진 기능들을 구현해야 할 경우 사용한다.

##### 중복 멤버 통합
추상 클래스를 이용하면 중복 멤버 변수의 통합이 가능하다. 인터페이스는 일반 멤버 변수를 선언하지 못하고 상수만 선언할 수 있기 때문에 이러한 중복 멤버 변수의 통합이 불가능하다. static final 상수를 선언한다면 각 클래스에서 값의 변경이 불가능할 것이다.
<br>
<br>

#### 인터페이스

- 박쥐 is able to 날기
- 독수리 is able to 날기
- 사람 is able to 수영
- 펭귄 is able to 수영

##### 자유로운 관계 묶음
인터페이스는 상속 관계를 타고 올라갔을 때 다른 조상 클래스를 상속하더라도, 같은 기능이 필요할 경우 사용한다. 클래스와 별도로 구현 객체가 같은 동작을 한다는 것을 보장하기 위해 사용한다.
##### 다중 상속이 필요한 경우

<br>
<br>
<br>
<br>

---
## 12. 내부 클래스
<br>

### 01. 내부 클래스란

내부 클래스(inner class)란 하나의 **클래스 내부에 선언된 또 다른 클래스**를 의미한다.

**내부에 정의된다는 점을 제외하고는 일반적인 클래스와 다르지 않다.** 우리가 어느 클래스에 변수나 상수가 필요하다면 클래스 멤버로서 클래스 내에서 선언하여 사용해 왔듯이, 선언 주체를 변수에서 클래스로 바꾼다면 그것이 내부 클래스인 것이다.

이처럼 내부 클래스는 **보통 두 클래스가 서로 긴밀한 관계**가 있거나, **하나의 클래스 또는 메소드에서만 사용되는 클래스**일 때 이용되는 기법이다.
<br>
<br>

#### 내부클래스 장점
1. 클래스를 논리적으로 그룹화
2. 타이트한 캡슐화의 적용
3. 가독성, 유지 관리 향상
<br>
<br>

#### 내부클래스 특징
1. 내부 클래스에서 외부 클래스 멤버에 접근가능
2. 외부에서는 내부 클래스에 접근 불가
<br>
<br>
<br>

### 02. 내부 클래스 종류

| **내부 클래스**                  | **특징**                                                                                                                                                                                                                                                                                             |
| -------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 인스턴스 클래스 (instance class) | 외부 클래스의 멤버변수 선언 위치에 선언하며, 외부 클래스의 인스턴스 멤버처럼 다뤄진다.  <br>주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용될 목적으로 선언된다.                                                                                                                             |
| 스태틱 클래스 (static class)     | 외부 클래스의 멤버변수 선언 위치에 선언하며, 외부 클래스의 static 멤버처럼 다뤄진다.  <br>다만 주의할점은 static이라고 해서 new 생성자 초기화를 못하는 건 아니다.  <br>즉, 일반적인 static 필드 변수나 static 메서드와 달리, staic 내부 클래스는 같은 static이지만 메모리 구조나 기능이 전혀 다르다. |
| 지역 클래스 (local class)        | 외부 클래스의 메서드나 초기화블럭 안에 선언하며, 선언된 메서드 블록 영역 내부에서만 사용될 수 있다.                                                                                                                                                                                                  |
| 익명 클래스 (anonymous class)    | 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스이다.  <br>주로 클래스를 일회용으로 사용할때 자주 이용된다.                                                                                                                                                                                 |
<br>
<br>

#### 인스턴스 클래스
- 클래스의 멤버 변수 선언부에 위치하고 static 키워드가 없는 내부 클래스
- 외부 클래스의 멤버로 취급되기 때문에 외부 클래스의 객체 먼저 생성한 후 내부 클래스의 객체를 생성이 가능하다
- 인스턴스 클래스 내부에는 instance 멤버만 선언할 수 있다. (static 멤버는 선언 불가)
- 주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용될 목적으로 선언된다.
<br>
<br>

#### 스태틱 클래스
- static 키워드가 붙은 내부 클래스
- 단, 일반적인 static 필드 변수나 static 메서드와 똑같이 생각하면 안된다.
- static 클래스 내부에는 instance 멤버와 static 멤버 모두 선언 할 수 있다.
- 그러나 일반적인 static 메서드와 동일하게 외부 클래스의 인스턴스 멤버에는 접근이 불가하고, 정적(static) 멤버에만 접근할 수 있다.

static 클래스는 static 이라고 해서 메모리에 한번만 로드되는 객체 개념이 아니다.

즉, 내부 인스턴스 클래스 처럼 외부 인스턴스를 먼저 선언하고 초기화해야 하는 선수 작업 필요 없이, **내부 클래스의 인스턴스를 바로 생성**할 수 있다는 차이점만 존재한다.

내부 클래스를 이용하는데, 내부 클래스에서 바깥 외부의 인스턴스를 사용할 일이 없다면 **static 클래스로 선언**해주어야 한다. 
<br>
<br>

#### 지역 클래스
- 메소드 내부에 위치하는 클래스 (지역 변수와 같은 성질을 지님)
- **지역 변수처**럼 해당 메서드 내부에서만 한정적으로 사용된다. (해당 메소드 실행 외에는 클래스 접근 및 사용 불가)
- 접근제한자와 static을 붙일 수 없다.  
    메소드 내부에서만 사용되므로 접근을 제한할 필요가 없고, 원래 메소드 내에는 static 멤버를 선언할 수 없기 때문이다.
<br>
<br>

#### 익명 클래스
- 익명 클래스는 클래스 **이름이 존재하지 않는 이너 클래스다.** 
- 단 하나의 객체만을 생성하는 **일회용 클래스**
- 클래스의 **선언과 동시에 객체를 생성**
- 익명 클래스는 생성자가 존재하지 않는다.
- 익명 클래스는 기존에 존재하는 클래스를 메서드 내에서 일회용으로 클래스 내부 구성을 선언하여 필요한 메서드를 재정의 하여 사용하는 기법이다

```
public class Main {
    public static void main(String[] args) {
    	// Object 클래스를 일회성으로 익명 클래스로 선언하여 변수 o 에 저장
        Object o = new Object() {
            @Override
            public String toString() {
                return "내 마음대로 toString 바꿔보리기 ~";
            }
        };
		
        // 익명 클래스의 객체의 오버라이딩한 메서드를 사용
        String txt = o.toString();
        System.out.println(txt); // 내 마음대로 toString 바꿔보리기 ~
    }
}
```


<br>
<br>
<br>
<br>

---
## 13. 자바 입출력
<br>
<br>

### 01. 자바 입출력과 스트림
<br>

#### 스트림이란?
자바에서 모든 입출력은 스트림(Stream)을 통해 이루어진다. 

입출력 장치는 매우 다양하여 장치에 따라 입출력 부분을 일일이 다르게 구현하면 프로그램 호환성이 떨어질 수 밖에 없다.
이런 문제를 해결하기 위해 자바는 입출력 장치와 무관하고 일관성 있게 프로그램을 구현할 수 있도록 일종의 가상 통로인 스트림을 제공한다.

자료를 읽어 들이려는 소스(source)와 자료를 쓰려는 대상(target)에 따라 각각 다른 스트림 클래스를 제공한다.
<br>
<br>

#### 입, 출력 스트림
어떤 대상으로부터 자료를 읽어 들일 때 사용하는 스트림이 입력 스트림이다.  

편집 화면에 사용자가 쓴 글을 파일에 저장할 때는 출력 스트림을 사용한다.

스트림은 단방향으로 자료가 이동하기 때문에 입력과 출력을 동시에 할 수 없다. 

| **종류**        | **예시**                                                          |
| --------------- | ----------------------------------------------------------------- |
| **입력 스트림** | FileInputStream, FileReader, BufferInputStream, BufferReader 등   |
| **출력 스트림** | FileOutputStream, FileWriter, BufferOutputStream, BufferWriter 등 |

<br>
<br>

#### 바이트 스트림
원래 자바의 스트림은 바이트(Byte)단위로 자료의 입출력이 이루어진다. 그러므로 그림, 동영상, 음악 파일 등 대부분 파일은 바이트 단위로 읽거나 쓰면 된다. 

그런데 자바에서 하나의 문자를 나타내는 Char형은 2바이트이기 때문에 1바이트만 읽으면 한글과 같은 문자는 깨져버리고 만다.  

따라서 입출력 중 가장 많이 사용하는 자료인 문자를 위해 문자 스트림을 별도로 제공한다.  

즉 읽어 들이는 자료형에 따라 바이트용과 문자용 스트림이 있다.

| **종류**          | **예시**                                                                   |
| ----------------- | -------------------------------------------------------------------------- |
| **바이트 스트림** | FileInputStream, FileOutputStream, BufferInputStream, BufferOutputStream등 |
| **문자 스트림**   | FileReader, FileWriter, BufferReader, BufferWriter 등                      |

<br>
<br>

#### 기반, 보조 스트림
기반 스트림은 읽어 들일 곳(소스)나 써야할 곳(대상)에서 직접 읽고 쓸 수 있으며 입출력 대상에 직접 연결되어 생성되는 스트림이다.

보조 스트림은 직접 읽고 쓰는 기능은 없으며, 항상 다른 스트림을 포함하여 생성된다.

| **종류**        | **예시**                                                                            |
| --------------- | ----------------------------------------------------------------------------------- |
| **기반 스트림** | FileInputStream, FileOutputStream, FileReader, FileWriter등                         |
| **보조 스트림** | InputStreamReader, OutputStreamWriter, BufferedInputStream, BufferedOutputStream 등 |
<br>
<br>
<br>

### 02. 콘솔 입력
#### System.in
```
System.out.print("입력 : ");  
int a = System.in.read() - '0'; // 아스키코드 값만큼 빼서 숫자로 변환  
System.out.println("a = " + a);  
System.in.read(new byte[System.in.available()]);  
// System.in 은 엔터값 까지 받아오기 때문에 엔터값을 제거 해야 한다.
```
<br>
<br>

#### InputStreamReader
```
InputStreamReader reader = new InputStreamReader(System.in);  
// 배열의 크기 만큼만 문자열을 받는다.  
char[] c = new char[3];  
System.out.print("입력 : ");  
reader.read(c);  
System.out.println(c);
```
<br>
<br>

#### BufferedReader
``` 
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
System.out.print("입력 : ");  
String s1 = br.readLine();  
System.out.println("s1 = " + s1);
```
<br>
<br>

#### Scanner
```
		//1-2. Scanner  
        System.out.println("== Scanner ==");  
        Scanner sc = new Scanner(System.in);  
        System.out.print("입력1 : ");  
        System.out.println(sc.next());  
        sc.nextLine();  
  
        System.out.print("입력2 : ");  
        System.out.println(sc.nextInt());  
        sc.nextLine();  
  
        System.out.println("입력3 : ");  
        System.out.println(sc.nextLine());  
  
//      참고) 정수, 문자열 변환  
        int num = Integer.parseInt("12345");  
        String str = Integer.toString(12345);
```
<br>
<br>
<br>

### 03. 콘솔 출력

```
//      2. 출력  
        System.out.println("Hello");  
        System.out.println("World");  
  
        System.out.print("Hello");  
        System.out.print("World");  
        System.out.println();  
  
        System.out.printf("Hello");  
        System.out.printf("World");  
        System.out.println();  
  
        String s = "자바";  
        int number = 3;  
  
        System.out.println(s + "는 언어 선호도 " + number +"위 입니다.");  
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number);  
  
        System.out.printf("%d\n", 10); //정수  
        System.out.printf("%o\n", 10); //8진수  
        System.out.printf("%x\n", 10); //16진수  
        System.out.printf("%f\n", 5.2f); // float  
        System.out.printf("%c\n", 'a'); //char  
        System.out.printf("%s\n", "안녕하세요"); //String  
  
        // 줄 정렬  
        System.out.printf("%-5d\n", 123);  
        System.out.printf("%5d\n", 1234);  
        System.out.printf("%5d\n", 12345);  
  
        System.out.printf("%.2f\n", 1.123);  
        System.out.printf("%.2f\n", 1.126);
```
<br>
<br>
<br>

### 04. 파일 출력
<br>

#### 파일 쓰기
<br>

##### FileWriter

```
// 파일 경로 설정
FileWriter fw = new FileWriter("./memo.txt");  
String memo = "1줄 입니다."\n";  
fw.write(memo);  
  
memo = "2줄 작성 중 입니다.\n";  
fw.write(memo);  
  
// 파일 쓰기가 끝나면 항상 종료 해야한다.  
fw.close();

//파일 이어 쓰기
FileWriter fw2 = new FileWriter("./memo.txt", true);  
memo = "파일을 이어 쓰는 중 입니다.\n";  
fw2.write(memo);  
fw2.close();
```
<br>

##### PrintWriter
```
PrintWriter pw = new PrintWriter("memo.txt");  
memo = "1줄 작성 중입니다.";  
pw.println(memo);  
  
memo = "2번 작성 중입니다.";  
pw.println(memo);  
pw.close();

//파일 이어 쓰기
PrintWriter pw2 = new PrintWriter(new FileWriter("./memo.txt", true));  
memo = "3줄 이어 쓰기 입니다.\n";  
pw2.println(memo);  
pw2.close();
```
<br>
<br>

#### 파일 입력
```
BufferedReader br = new BufferedReader(new FileReader("./memo.txt"));  
  
while  (true) {  
    String line = br.readLine();  
    if (line == null) {  
        break;  
    }  
    System.out.println(line);  
}  
br.close();
```


<br>
<br>
<br>
<br>

---
## 14. 예외 처리
<br>

### 01. 오류 종류
<br>

#### 논리 에러 (Logic Error)
논리적 에러는 이른바 **'버그'** 라고 생각하면 된다.

프로그램이 실행하고 작동하는데는 아무런 문제가 없는 오류이지만, 결과가 예상과 달라 사용자가 의도한 작업을 수행하지 못하게 되어 서비스 이용에 지장이 생길 수 있다.

논리적 오류는 컴퓨터 입장에서는 프로그램이 멀쩡히 돌아가는 것이니 에러 메시지를 알려주지 않는다. 따라서 개발자는 프로그램의 전반적인 코드와 알고리즘을 체크 필요가 있다.
<br>
<br>

#### 컴파일 에러 (Complillation Error)
컴파일 에러는 컴파일 단계에서 오류 발견하면 컴파일러가 에러 메시지 출력해주는 것을 말한다.

컴파일 에러 발생의 대표적인 원인으로 **문법 구문 오류(syntax error)**를 들 수 있다.

컴파일 에러는 그렇게 심각하게 볼 오류 종류는 아니다.

왜냐하면 컴파일 에러가 있다는 것은, 곧 컴파일이 안된다는 의미이며, 이는 즉 프로그램이 만들어지지 않아 프로그램 실행 자체가 불가하기 때문이다.
<br>
<br>

#### 런타임 에러 (Runtime Error)
컴파일 에러를 꼼꼼하게 잡아 컴파일에는 문제가 없더라도, 프로그램 실행 중에 에러가 발생해서 잘못된 결과를 얻거나,  혹은 외부적인 요인으로 기계적 결함으로 프로그램이 비정상적으로 종료될 수 있다.

이것이 우리가 집중적으로 파헤쳐 봐야 할 **실행 오류(런타임 에러)** 이다.

대체로 개발 시 설계 미숙(논리적)으로 발생하는 에러가 대부분이며, 런타임 에러 발생 시 프로그래머가 역추적해서 원인 확인해야 한다.


자바 프로그래밍에서는 실행 시(runtime) 발생할 수 있는 오류를 '**에러(error)**'와 '**예외(exception)**' 두가지로 구분 하였다.

- 에러(error) : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
- 예외(exception) : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
<br>
<br>
<br>

### 02. 예외 (Exception)

대부분의 예외(Exception)는 개발자가 구현한 로직에서 발생한 실수나 사용자의 영향에 의해 발생한다. 

그래서 예외는 에러와 달리 문제가 발생하더라도 이에 대한 **대응 코드**를 미리 작성해 놓음으로써 어느정도 프로그램의 비정상적인 종료 혹은 동작을 막을 수 있다.

자바에서 다루는 모든 예외 오류는 **Exception 클래스**에서 처리한다.

![](https://i.imgur.com/PaPG1wW.png)

![](https://i.imgur.com/MM1AZFW.png)
<br>
<br>
<br>

### 02. 예외 처리 (Exception Handling)

```
int a, b, c;
try {
	// 실행되는 로직
    a = 10;
    b = 0;
    c = a / b; 
    // 10 나누기 0 → 산술오류 ArithmeticException
} catch (ArithmeticException e) {
	 // 예외 처리
    c = -1;  
}
```
<br>
<br>

#### finally
![](https://i.imgur.com/HuM57Wf.png)
<br>
<br>

#### throw (예외 발생시키기)
자바에서는 **throw 키워드**를 사용하여 강제로 예외를 발생시킬 수 있다.

사용자가 일부러 에러를 throw하여 에러를 catch 한다는 개념으로 보면 된다.

이때 new 생성자로 예외 클래스를 초기화하여 던져는데, 이 클래스 생성자에 입력값을 주게되면, catch문이 getMessage() 메서드에서 출력할 메세지를 지정하게 된다

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("음수를 제외한 숫자만 입력하세요 : ");
            int num = s.nextInt(); // 사용자로부터 정수를 입력 받음
            if (num < 0) {
                // 음수를 입력하면 에러를 발생 시킨다.
                // ArithmeticException 예외 클래스 객체를 생성해 catch문으로 넘겨버린다고 생각하며 된다
                
                throw new ArithmeticException("입력값이 옳지 않습니다."); 
            
            }
            System.out.println("num = " + num);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다");
        }
    }
}
```
<br>
<br>

#### throws (예외 떠넘기기)
예외가 발생할 수 있는 코드를 작성할 때 try - catch 블록으로 처리하는 것이 기본이지만, 경우에 따라서는 다른 곳에서 예외를 처리하도록 호출한 곳으로 예외를 떠넘길 수도 있다.

이때 사용하는 키워드가 `throws`이다. `throws` 는 **메소드 선언부 끝에 작성**되어 메소드에서 예외를 직접 처리(catch)하지 않은 예외를 호출한 곳으로 떠넘기는 역할을 한다.

```
public static boolean checkTenWithThrows(int ten) throws NotTenException{  
    if (ten != 10) {  
        throw new NotTenException();  
    }  
    return true;  
}

System.out.println("== checkTenWithThrows ==");  
try {  
    checkResult = checkTenWithThrows(5);  
} catch (NotTenException e) {  
    System.out.println("e = " + e);  
}  
System.out.println("checkResult = " + checkResult);
```