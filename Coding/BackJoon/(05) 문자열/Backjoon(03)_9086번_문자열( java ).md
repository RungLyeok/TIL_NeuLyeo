# \[ Backjoon - 9086번 \] 문자열 ( java )

https://www.acmicpc.net/problem/9086

## 문제
문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.

## 입력

입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.

## 출력

각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.

### 예제
#### 예제 입력 1 

3
ACDKJFOWIEGHE
O
AB

#### 예제 출력 1 

AE
OO
AB




## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 n개의 문자열을 입력받아, 각 문자열의 첫 번째 문자와 마지막 문자를 출력하는 것입니다. 문자열의 길이가 1인 경우, 동일 문자를 두 번 출력합니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 n개의 문자열을 입력받습니다. 그 후, 각 문자열의 첫 번째 문자와 마지막 문자를 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java의 기본 입출력 클래스인 BufferedReader를 사용하여 사용자로부터 입력을 받고, 문자열의 charAt 메소드를 사용하여 특정 위치의 문자를 찾습니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 각 문자열의 첫 번째 문자와 마지막 문자를 찾아 출력하는 것입니다.



### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // n개의 문자열을 입력받아, 각 문자열의 첫 번째 문자와 마지막 문자를 출력합니다.
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int sl = s.length();

            if (sl > 1) {
                System.out.println(s.charAt(0) + "" + s.charAt(sl - 1));
            } else {
                System.out.println(s + s);
            }
        }
    }
}
```

