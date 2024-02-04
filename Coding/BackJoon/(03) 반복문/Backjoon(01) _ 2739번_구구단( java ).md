# \[ Backjoon - 2739번 \] 구구단 ( java )
https://www.acmicpc.net/problem/2739
## 문제

N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

### 입력

첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

### 출력

출력형식과 같게 N*1부터 N*9까지 출력한다.

### 예제 입력 1 
2

### 예제 출력 1 
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18

## 문제풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 수의 구구단을 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 사용자로부터 한 개의 정수를 입력받습니다. 이후, 해당 정수에 대한 구구단을 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java 8의 Stream API를 사용하여 1부터 9까지의 숫자에 대해 입력받은 정수와의 곱셈 결과를 출력합니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 Stream API와 람다 표현식을 사용하여 간결하고 명확한 코드를 작성하는 것입니다.

### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class _01_2739_구구단 {
    public static void main(String[] args) throws IOException {
        // 사용자로부터 한 개의 정수를 입력받습니다.
        int n = Integer.parseInt(
                new BufferedReader(
                        new InputStreamReader(
                                System.in))
                        .readLine());
        
        // 1부터 9까지의 숫자에 대해 입력받은 정수와의 곱셈 결과를 출력합니다.
        IntStream.rangeClosed(1, 9)
                .forEach(i -> System.out.printf("%d * %d = %d\n", n, i, n * i));
    }
}
```
