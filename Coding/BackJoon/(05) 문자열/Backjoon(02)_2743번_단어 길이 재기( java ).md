# \[ Backjoon - 2743번 \] 단어 길이 재기 ( java )

https://www.acmicpc.net/problem/2743

## 문제
알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.

### 출력

첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.

### 예제
#### 예제 입력 1 

pulljima

#### 예제 출력 1 

8




## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 문자열을 입력받아, 그 문자열의 길이를 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 문자열을 입력받습니다. 그 후, 입력받은 문자열의 길이를 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java의 기본 입출력 클래스인 BufferedReader를 사용하여 사용자로부터 입력을 받고, 문자열의 length 메소드를 사용하여 문자열의 길이를 계산합니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 입력받은 문자열의 길이를 찾아 출력하는 것입니다.



### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_단어길이재기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사용자로부터 문자열을 입력받아, 그 문자열의 길이를 출력합니다.
        System.out.println(br.readLine().length());
    }
}
```

