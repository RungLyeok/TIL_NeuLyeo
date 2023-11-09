
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