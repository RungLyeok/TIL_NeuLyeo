# \[ Backjoon - 2438번 \] # 별 찍기 - 1 ( java )
https://www.acmicpc.net/problem/2438
## 문제

첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

### 입력

첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

### 출력

첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

### 예제 입력 1 

5

### 예제 출력 1 

*
**


## 문제풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 정수 n까지 1부터 n까지 각 숫자만큼 ' * '을 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 한 개의 정수를 입력받습니다. 그 후, 1부터 입력받은 정수까지의 각 숫자만큼 ' * '을 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java 8의 Stream API와 람다 표현식을 사용하여 간결하고 명확한 코드를 작성하고 있습니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 Java 11의 "repeat" 메소드를 사용하여 각 숫자만큼 ' * '을 반복 출력하는 것입니다.

### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;


public class _09_별찍기_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1부터 입력받은 정수까지의 각 숫자만큼 '*'을 출력합니다.
        IntStream.rangeClosed(1, Integer.parseInt(br.readLine()))
                .forEach(i -> System.out.println("*".repeat(i)));
    }
}

```
