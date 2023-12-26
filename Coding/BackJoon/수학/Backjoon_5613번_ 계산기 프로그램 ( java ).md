# \[ Backjoon - 5613번 \] 계산기 프로그램 ( java )

https://www.acmicpc.net/problem/5613


## 문제
덧셈, 뺄셈, 곱셈, 나눗셈을 할 수 있는 계산기 프로그램을 만드시오.


### 입력
입력의 각 줄에는 숫자와 +, -, *, /, =중 하나가 교대로 주어진다. 첫 번째 줄은 수이다. 연산자의 우선 순위는 생각하지 않으며, 입력 순서대로 계산을 하고, =가 주어지면, 그때까지의 결과를 출력한다. 주어지는 수는 108 이하의 양의 정수이다. 계산 중 결과는 0 또는 음수가 될 수 있지만, -108 ~ 108 범위를 넘지는 않는다. 또, 나눗셈에서 소수점은 버린다. 따라서, 100/3*3 = 99이다.

피제수가 음수일 때 나눗셈을 하는 경우는 입력으로 주어지지 않는다.

### 출력
첫째 줄에 계산 결과를 출력한다.

### 예제
![](https://i.imgur.com/3vzBWjw.png) ![](https://i.imgur.com/NCbqSak.png) ![](https://i.imgur.com/5kbw1sf.png)

 








## 문제 풀이
### 코드 설명
**1. 클래스 및 메인 함수 정의:**

- `public class Backjoon_5613`: 클래스를 정의합니다.
- `public static void main(String[] args) throws IOException`: 메인 함수를 정의합니다.

**2. 입출력 스트림 생성:**

- `BufferedReader br = new BufferedReader(new InputStreamReader(System.in));`: 표준 입력 스트림을 생성합니다.

**3. 초기 결과값 입력:**

- `int result = Integer.parseInt(br.readLine());`: 첫 번째 줄의 정수값을 읽어 `result` 변수에 저장합니다.

**4. 연산 반복:**

- `while (true) { ... }`: 무한 반복문을 시작합니다.
    - `String op = br.readLine();`: 연산자를 입력받습니다.
    - `if (op.equals("=")) { ... }`: 연산자가 "="이면 반복문을 종료합니다.
        - `System.out.println(result);`: 결과값을 출력합니다.
        - `break;`: 반복문을 종료합니다.
    - `int n = Integer.parseInt(br.readLine());`: 피연산자를 입력받습니다.
    - `switch (op) { ... }`: 연산자에 따라 분기합니다.
        - `case "+":`: 덧셈 연산을 수행합니다.
        - `case "-":`: 뺄셈 연산을 수행합니다.
        - `case "*":`: 곱셈 연산을 수행합니다.
        - `case "/":`: 나눗셈 연산을 수행합니다.

**5. 스트림 닫기:**

- `br.close();`: 입력 스트림을 닫습니다.

**코드의 역할:**

이 코드는 간단한 계산기를 구현합니다. 표준 입력에서 연산자와 피연산자를 반복적으로 입력받아 계산하고, "=" 연산자가 입력되면 최종 결과값을 출력합니다.

### 풀이

```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
  
public class Backjoon_5613 {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
  
        int result = Integer.parseInt(br.readLine());  
  
        while (true) {  
            String op = br.readLine();  
  
            if (op.equals("=")) {  
                System.out.println(result);  
                break;  
            }  
  
            int n = Integer.parseInt(br.readLine());  
  
            switch (op) {  
                case "+":  
                    result += n;  
                    break;  
                case "-":  
                    result -= n;  
                    break;  
                case "*":  
                    result *= n;  
                    break;  
                case "/":  
                    result /= n;  
                    break;  
            }  
        }  
        br.close();  
    }  
}
```
