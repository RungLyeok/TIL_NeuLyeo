# \[ Backjoon - 2908번 \] 상수 ( java )

https://www.acmicpc.net/problem/2908

## 문제
상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.

상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

## 입력

첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.

## 출력

첫째 줄에 상수의 대답을 출력한다.

## 예제
### 예제 입력 1

734 893

### 예제 출력 1

437

### 예제 입력 2

221 231

### 예제 출력 2

132




## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 코드의 목적은 사용자로부터 두 개의 숫자를 입력받아, 각 숫자를 반전시킨 후, 그 중에서 더 큰 숫자를 찾아 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 사용자로부터 두 개의 숫자를 입력받는 부분과, 각 숫자를 반전시키는 부분, 그리고 반전시킨 숫자 중에서 더 큰 숫자를 찾아 출력하는 부분으로 구성되어 있습니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java의 기본 입출력 클래스인 BufferedReader를 사용하여 사용자로부터 입력을 받고, StringTokenizer를 사용하여 입력받은 문자열을 토큰으로 분리합니다. 그 후, StringBuilder의 reverse 메소드를 사용하여 각 숫자를 반전시키고, Math.max 메소드를 사용하여 두 숫자 중에서 더 큰 숫자를 찾아 출력합니다.



### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _09_상수 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 객체를 생성하여 사용자로부터 두 개의 숫자를 입력받습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // StringBuilder의 reverse 메소드를 사용하여 각 숫자를 반전시킵니다.
        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        // Math.max 메소드를 사용하여 두 숫자 중에서 더 큰 숫자를 찾아 출력합니다.
        System.out.println(Math.max(a, b));
    }
}
```

