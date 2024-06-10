





# [BOJ / java] 2581 : 소수 

https://www.acmicpc.net/problem/2581

## 문제
자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

## 입력
입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.

M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.

## 출력
M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 

단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.

## 예제
### 예제 입력 1
60
100

### 예제 출력 1
620
61

### 예제 입력 2
64
65

### 예제 출력 2
-1

## 문제 풀이
### 코드설명
#### 코드의 동작 방식:

1. 표준 입력으로 두 개의 정수 `a`와 `b`를 입력받습니다.
2. `a`와 `b` 사이의 모든 정수에 대해 소수인지 판별합니다.
3. 소수라면, 합계(`sum`)에 더하고, 최소 소수(`min`)를 갱신합니다.
4. 소수가 하나도 없을 경우 `-1`을 출력합니다.
5. 소수가 존재하면, 소수의 합과 최소 소수를 출력합니다.

#### 코드의 핵심 부분:

1. 두 정수 `a`와 `b`를 입력받아 범위를 설정.
2. `isPrime` 메소드를 통해 소수 판별.
3. 소수의 합과 최소 소수를 구함.
4. 결과 출력: 소수가 없을 때와 있을 때의 처리가 다름.

#### 코드의 흐름:

입력 → 범위 설정 → 소수 판별 및 합과 최소값 계산 → 결과 출력

### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 표준 입력을 받습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 정수 a를 입력받아 정수로 변환합니다.
        int a = Integer.parseInt(br.readLine());
        // 두 번째 정수 b를 입력받아 정수로 변환합니다.
        int b = Integer.parseInt(br.readLine());
        // 소수의 합을 저장할 변수를 초기화합니다.
        int sum = 0;
        // 최소 소수를 저장할 변수를 초기화합니다.
        int min = Integer.MAX_VALUE;

        // a부터 b까지의 모든 정수에 대해 소수인지 확인합니다.
        for (int i = a; i <= b; i++) {
            // 소수라면 합에 더하고 최소 소수를 갱신합니다.
            if (isPrime(i)) {
                sum += i;
                if (min > i) min = i;
            }
        }

        // 소수가 하나도 없을 경우 -1을 출력합니다.
        if (sum == 0) {
            System.out.println(-1);
        } else {
            // 소수의 합과 최소 소수를 출력합니다.
            System.out.println(sum);
            System.out.println(min);
        }
    }

    // 주어진 숫자가 소수인지 판별하는 메소드입니다.
    public static boolean isPrime(int n) {
        // 2보다 작은 숫자는 소수가 아닙니다.
        if (n < 2) return false;

        // 2부터 해당 숫자의 제곱근까지 나누어 떨어지는지 확인합니다.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // 나누어 떨어질 경우 소수가 아닙니다.
            if (n % i == 0) return false;
        }

        // 위 조건을 모두 통과하면 소수입니다.
        return true;
    }
}
```

