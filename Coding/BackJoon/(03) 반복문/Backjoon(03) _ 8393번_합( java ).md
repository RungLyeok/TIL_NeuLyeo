# \[ Backjoon - 8393번 \] 합 ( java )
https://www.acmicpc.net/problem/8393
## 문제

n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

### 입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

### 출력
1부터 n까지 합을 출력한다.

### 예제 입력 1 
3

### 예제 출력 1 
6

## 문제풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 정수 n까지의 모든 자연수의 합을 계산하여 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 한 개의 정수를 입력받습니다. 그 후, 1부터 입력받은 정수까지의 모든 자연수의 합을 계산하고 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java 8의 Stream API를 사용하여 1부터 입력받은 정수까지의 모든 자연수를 생성하고, 이들의 합을 계산합니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 Stream API와 람다 표현식을 사용하여 간결하고 명확한 코드를 작성하는 것입니다.

### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class _03_8393_합 {
    public static void main(String[] args) throws IOException {
        // 사용자로부터 한 개의 정수를 입력받습니다.
        int n = Integer.parseInt(
                new BufferedReader(
                        new InputStreamReader(System.in)
                ).readLine()
        );

        // 1부터 입력받은 정수까지의 모든 자연수의 합을 계산하고 출력합니다.
        System.out.println(IntStream.rangeClosed(1, n).sum());
    }
}

```
