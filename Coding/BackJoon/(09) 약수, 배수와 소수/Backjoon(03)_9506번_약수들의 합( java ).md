





# [BOJ / java] 9506 : 약수들의 합 

https://www.acmicpc.net/problem/9506

## 문제
어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.

예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.

n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.

## 입력

입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100,000)

입력의 마지막엔 -1이 주어진다.

## 출력

테스트케이스 마다 한줄에 하나씩 출력해야 한다.

n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).

이때, 약수들은 오름차순으로 나열해야 한다.

n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.

## 예제
### 예제 입력 1

6
12
28
-1

### 예제 출력 1

6 = 1 + 2 + 3
12 is NOT perfect.
28 = 1 + 2 + 4 + 7 + 14

## 문제 풀이
### 코드설명
- 코드의 동작 방식:
    
    - `BufferedReader`를 사용하여 사용자로부터 정수 n을 반복적으로 입력받습니다.
    - 입력받은 n이 -1이면 프로그램을 종료합니다.
    - 변수 sum을 선언하고 0으로 초기화합니다. 이 변수는 n의 약수들의 합을 계산하는 데 사용됩니다.
    - `StringBuilder` 객체 sb를 사용하여 더해진 약수들을 문자열 형태로 저장합니다.
    - 1부터 n-1까지의 모든 정수에 대해 반복문을 실행하며, n을 현재 정수로 나누었을 때 나머지가 0이 되는 경우(즉, 현재 정수가 n의 약수인 경우) sum에 더하고 sb에 추가합니다.
    - 반복문이 종료된 후, sum이 n과 같으면 n은 완전수라고 판단하고, 약수들의 합을 출력합니다. 그렇지 않으면 n이 완전수가 아니라고 출력합니다.
- 코드의 핵심 부분:
    
    - n의 약수를 찾아 sum에 더하는 과정.
    - `StringBuilder`를 사용하여 약수들을 문자열 형태로 저장하고 출력하는 과정.
    - 완전수 여부에 따라 다른 메시지를 출력하는 조건문.
- 코드의 흐름:
    
    - 사용자 입력 → 입력값 검증 및 처리 → 약수 탐색 및 합 계산 → 완전수 판별 및 결과 출력

### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_약수들의합 {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            // 사용자로부터 정수 n 입력 받기
            int n = Integer.parseInt(br.readLine());

            // 입력받은 n이 -1이면 반복문 종료(프로그램 종료)
            if (n == -1) break;

            // 약수들의 합을 저장할 변수 sum 초기화
            int sum = 0;
            // 약수들을 문자열 형태로 저장할 StringBuilder 객체 생성
            StringBuilder sb = new StringBuilder();

            // 1부터 n-1까지의 모든 정수에 대해 반복
            for (int i = 1; i < n; i++) {
                // 현재 정수가 n의 약수인 경우
                if (n % i == 0) {
                    // sum에 약수 더하기
                    sum += i;
                    // sb에 약수 추가 및 " + "로 연결
                    sb.append(i).append(" + ");
                }
            }

            // 반복문 종료 후 sum이 n과 같다면 완전수
            if (sum == n) {
                // 완전수일 경우 약수들의 합을 출 n, sb.toString().substring(0, sb.length() - 3));
            } else {력
                System.out.printf("%d = %s\n",
                // 완전수가 아닐 경우 메시지 출력
                System.out.printf("%d is NOT perfect.\n", n);
            }
        }
    }
}
```

