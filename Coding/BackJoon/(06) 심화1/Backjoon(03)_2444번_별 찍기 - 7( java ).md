# \[ Backjoon - 2444번 \] 별 찍기 - 7 ( java )

https://www.acmicpc.net/problem/2444

## 문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

## 입력

첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

## 출력

첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

## 예제
### 예제 입력 1 

5

### 예제 출력 1 
```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```



## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 수에 따른 특정 패턴의 별 찍기를 출력하는 것입니다. 별 찍기 패턴은 양쪽으로 대칭인 마름모 형태입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 한 개의 정수를 입력받습니다. 그리고 해당 정수 n에 따라, 먼저 상단 부분의 별을 찍고, 그 다음 하단 부분의 별을 찍습니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 먼저 상단 부분의 별을 찍기 위해 1부터 n까지 반복하며, 각 줄에서 n - i 만큼의 공백을 출력하고, 그 다음 (2 * i) - 1만큼의 별을 출력합니다. 이후, 하단 부분의 별을 찍기 위해 n - 1부터 1까지 반복하며, 같은 방식으로 공백과 별을 출력합니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 입력받은 정수에 따른 별 찍기 패턴을 출력하는 것입니다.



### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_별찍기7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) ;

        // 상단 부분의 별을 찍습니다.
        for (int i = 1; i <= n; i++) {
            // 각 줄에서 n - i 만큼의 공백을 출력합니다.
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // 그 다음 (2 * i) - 1만큼의 별을 출력합니다.
            for (int k = 0; k < (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 하단 부분의 별을 찍습니다.
        for (int i = n - 1; i >= 1; i--) {
            // 각 줄에서 n - i 만큼의 공백을 출력합니다.
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // 그 다음 (2 * i) - 1만큼의 별을 출력합니다.
            for (int k = 0; k < (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

