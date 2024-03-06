





# [BOJ / java] 2745 : 진법변환

https://www.acmicpc.net/problem/2745

## 문제
B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.

10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

## 입력

첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)

B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.

## 출력

첫째 줄에 B진법 수 N을 10진법으로 출력한다.

## 예제
### 예제 입력 1

ZZZZZ 36

### 예제 출력 1

60466175

## 문제 풀이
### 코드설명
- 코드의 동작방식:
    
    1. 사용자로부터 입력받은 문자열과 진법을 기반으로 10진법으로 변환하는 작업을 수행합니다.
    2. 문자열은 숫자와 알파벳 대문자로 구성될 수 있으며, 알파벳 대문자는 10 이상의 숫자를 표현합니다.
- 코드의 구성:
    
    1. 'import'를 사용하여 필요한 라이브러리를 불러옵니다.
    2. 메인 함수에서 사용자로부터 문자열과 진법을 입력받습니다.
    3. for문을 사용하여 문자열의 각 문자를 확인하고, 이를 10진법으로 변환합니다.
    4. 결과를 출력합니다.
- 코드의 핵심 부분:
    
    1. 문자열의 각 문자를 확인하는 for문입니다. 이 부분에서 문자가 숫자인지 알파벳인지 확인하고, 이에 따라 10진법으로 변환하는 과정이 이루어집니다.
    2. 변환된 10진법을 누적하여 최종 결과를 구하는 부분입니다.
- 코드의 흐름: 사용자 입력 → 문자열과 진법 분리 → 문자열의 각 문자를 10진법으로 변환 → 결과 누적 → 최종 결과 출력


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _01_진법변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader를 사용하여 입력을 받습니다.
        StringTokenizer st = new StringTokenizer(br.readLine()); // 공백을 기준으로 문자열을 분리합니다.

        String s = st.nextToken(); // 첫 번째 토큰을 문자열로 저장합니다.
        int b = Integer.parseInt(st.nextToken()); // 두 번째 토큰을 진법으로 저장합니다.

        int idx = 0;
        int num = 0;
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) { // 문자열의 끝에서 시작하여 처음까지 확인합니다.
            char c = s.charAt(i); // 문자열의 각 문자를 확인합니다.
            if (c >= '0' && c <= '9') { // 문자가 숫자인 경우
                num = c - '0'; // 숫자로 변환합니다.
            } else { // 문자가 알파벳인 경우
                num = c - 55; // 알파벳을 숫자로 변환합니다.
            }
            result += num * Math.pow(b, idx++); // 진법에 따른 가중치를 곱하고 결과에 더합니다.
        }

        System.out.print(result); // 최종 결과를 출력합니다.
    }
}
```

