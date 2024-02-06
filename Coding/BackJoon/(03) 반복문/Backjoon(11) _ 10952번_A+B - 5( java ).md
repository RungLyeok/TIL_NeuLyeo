# \[ Backjoon - 10952번 \] A+B - 5 ( java )
https://www.acmicpc.net/problem/10952
## 문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

### 입력

입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

입력의 마지막에는 0 두 개가 들어온다.

### 출력

각 테스트 케이스마다 A+B를 출력한다.

### 예제 입력 1 

1 1
2 3
3 4
9 8
5 2
0 0
### 예제 출력 1
2
5
7
17
7

## 문제풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 두 개의 정수를 입력받아 합을 계산하는 것입니다. 입력받은 두 정수의 합이 0이면 프로그램을 종료합니다.
- 코드의 주요 구조:
    
    - 이 코드는 무한 루프를 사용하여 계속해서 사용자로부터 두 개의 정수를 입력받습니다. 입력받은 두 정수의 합이 0이면 프로그램을 종료합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java 8의 Stream API를 사용하여 간결하고 명확한 코드를 작성하고 있습니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 입력받은 두 정수의 합이 0이면 프로그램을 종료하는 것입니다.

### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _11_A플러스B_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (;;) {
            // 두 개의 정수를 입력받아 합을 계산합니다.
            int sum = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).sum();

            // 입력받은 두 정수의 합이 0이면 프로그램을 종료합니다.
            if (sum == 0) break;
            
	        System.out.println(sum);
        }
    }
}
```
