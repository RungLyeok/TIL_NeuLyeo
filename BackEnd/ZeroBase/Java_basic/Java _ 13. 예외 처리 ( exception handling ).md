# \[Java\] 13. 예외 처리 ( exception handling )

---

**목차**

<script type="text/javascript">$(function(){ $("#toc").toc({content: ".tt_article_useless_p_margin", headings: "h2,h3,h4"}); });</script>

## 01\. 오류 종류

### 논리 에러 (Logic Error)

논리적 에러는 이른바 **'버그'라고** 생각하면 된다.

프로그램이 실행하고 작동하는 데는 아무런 문제가 없는 오류이지만, 결과가 예상과 달라 사용자가 의도한 작업을 수행하지 못하게 되어 서비스 이용에 지장이 생길 수 있다.

논리적 오류는 컴퓨터 입장에서는 프로그램이 멀쩡히 돌아가는 것이니 에러 메시지를 알려주지 않는다. 따라서 개발자는 프로그램의 전반적인 코드와 알고리즘을 체크 필요가 있다.  
  
  
  

### 컴파일 에러 (Complillation Error)

컴파일 에러는 컴파일 단계에서 오류 발견하면 컴파일러가 에러 메시지 출력해 주는 것을 말한다.

컴파일 에러 발생의 대표적인 원인으로 **문법 구문 오류(syntax error)**를 들 수 있다.

컴파일 에러는 그렇게 심각하게 볼 오류 종류는 아니다.

왜냐하면 컴파일 에러가 있다는 것은, 곧 컴파일이 안된다는 의미이며, 이는 즉 프로그램이 만들어지지 않아 프로그램 실행 자체가 불가하기 때문이다.  
  
  
  

### 런타임 에러 (Runtime Error)

컴파일 에러를 꼼꼼하게 잡아 컴파일에는 문제가 없더라도, 프로그램 실행 중에 에러가 발생해서 잘못된 결과를 얻거나, 혹은 외부적인 요인으로 기계적 결함으로 프로그램이 비정상적으로 종료될 수 있다.

이것이 우리가 집중적으로 파헤쳐 봐야 할 **실행 오류(런타임 에러)** 이다.

대체로 개발 시 설계 미숙(논리적)으로 발생하는 에러가 대부분이며, 런타임 에러 발생 시 프로그래머가 역추적해서 원인 확인해야 한다.

자바 프로그래밍에서는 실행 시(runtime) 발생할 수 있는 오류를 '**에러(error)**'와 '**예외(exception)**' 두 가지로 구분하였다.

-   에러(error) : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
-   예외(exception) : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류

## 02\. 예외 (Exception)

대부분의 예외(Exception)는 개발자가 구현한 로직에서 발생한 실수나 사용자의 영향에 의해 발생한다.

그래서 예외는 에러와 달리 문제가 발생하더라도 이에 대한 **대응 코드**를 미리 작성해 놓음으로써 어느 정도 프로그램의 비정상적인 종료 혹은 동작을 막을 수 있다.

자바에서 다루는 모든 예외 오류는 **Exception 클래스**에서 처리한다.

![](https://i.imgur.com/PaPG1wW.png)

![](https://i.imgur.com/MM1AZFW.png)

  
  
  
  

## 03\. 예외 처리 (Exception Handling)

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

  
  

### finally

![](https://i.imgur.com/HuM57Wf.png)

  
  
  

### throw (예외 발생시키기)

자바에서는 **throw 키워드**를 사용하여 강제로 예외를 발생시킬 수 있다.

사용자가 일부러 에러를 throw 하여 에러를 catch 한다는 개념으로 보면 된다.

이때 new 생성자로 예외 클래스를 초기화하여 던졌는데, 이 클래스 생성자에 입력값을 주게 되면, catch문이 getMessage() 메서드에서 출력할 메시지를 지정하게 된다

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

  
  

### throws (예외 떠넘기기)

예외가 발생할 수 있는 코드를 작성할 때 try - catch 블록으로 처리하는 것이 기본이지만, 경우에 따라서는 다른 곳에서 예외를 처리하도록 호출한 곳으로 예외를 떠넘길 수도 있다.

이때 사용하는 키워드가 `throws`이다. `throws는` **메서드 선언부 끝에 작성**되어 메서드에서 예외를 직접 처리(catch) 하지 않은 예외를 호출한 곳으로 떠넘기는 역할을 한다.

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