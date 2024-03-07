





# [BOJ / java] 11005 : 진법변환2

https://www.acmicpc.net/problem/11005

## 문제
10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.

10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

## 입력

첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

## 출력

첫째 줄에 10진법 수 N을 B진법으로 출력한다.

## 예제
### 예제 입력 1

60466175 36

### 예제 출력 1

ZZZZZ

## 문제 풀이
### 코드설명
- 코드의 동작방식:
    
    1. 사용자로부터 입력받은 10진법의 수를 다른 진법의 수로 변환하는 작업을 수행합니다.
    2. 변환된 수는 숫자와 알파벳 대문자로 표현될 수 있으며, 알파벳 대문자는 10 이상의 숫자를 표현합니다.
- 코드의 구성:
    
    1. 'import'를 사용하여 필요한 라이브러리를 불러옵니다.
    2. 메인 함수에서 사용자로부터 10진법의 수와 변환할 진법을 입력받습니다.
    3. while문을 사용하여 입력받은 10진법의 수를 다른 진법의 수로 변환합니다.
    4. 변환된 수를 문자열로 만들어 출력합니다.
- 코드의 핵심 부분:
    
    1. 10진법의 수를 다른 진법의 수로 변환하는 while문입니다. 이 부분에서 10진법의 수를 다른 진법의 수로 변환하고, 그 과정에서 나머지를 이용하여 변환된 수를 문자로 만드는 작업이 이루어집니다.
    2. StringBuilder를 이용하여 변환된 수의 문자열을 만들고, 이를 역순으로 출력하는 부분입니다.
- 코드의 흐름: 사용자 입력 → 10진법의 수와 변환할 진법 분리 → 10진법의 수를 다른 진법의 수로 변환 → 변환된 수를 문자열로 만듦 → 문자열 역순으로 출력


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_진법변환2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader를 사용하여 입력을 받습니다.

        String[] inputs = br.readLine().split(" "); // 공백을 기준으로 문자열을 분리합니다.
        StringBuilder sb = new StringBuilder(); // 변환된 수를 저장할 StringBuilder를 생성합니다.

        int n = Integer.parseInt(inputs[0]); // 첫 번째 입력을 10진법의 수로 저장합니다.
        int b = Integer.parseInt(inputs[1]); // 두 번째 입력값을 변환할 진법으로 저장합니다.

        while (n != 0) { // 10진법의 수를 다른 진법의 수로 변환합니다.
            int num = n % b; // 현재 수를 변환할 진법으로 나눈 나머지를 구합니다.

            if (num >= 10) { // 나머지가 10 이상인 경우
                sb.append((char) (num + 55)); // 나머지를 알파벳 대문자로 변환하여 추가합니다.
            } else { // 나머지가 10 미만인 경우
                sb.append(num); // 나머지를 그대로 추가합니다.
            }

            n /= b; // 현재 수를 변환할 진법으로 나눕니다.
        }

        System.out.println(sb.reverse().toString()); // 변환된 수를 역순으로 출력합니다.
    }
}
```

