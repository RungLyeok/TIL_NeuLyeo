# \[ Backjoon - 1152번 \] 단어의 개수 ( java )

https://www.acmicpc.net/problem/1152

## 문제
영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

## 입력

첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.

## 출력

첫째 줄에 단어의 개수를 출력한다.

## 예제
### 예제 입력 1

The Curious Case of Benjamin Button

### 예제 출력 1

6

### 예제 입력 2

 The first character is a blank

### 예제 출력 2

6




## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 Java 코드의 주된 목적은 사용자로부터 문자열을 입력받아, 그 문자열에서 단어의 개수를 세고, 그 결과를 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 사용자로부터 문자열을 입력받는 부분과, 그 문자열에서 단어의 개수를 세는 부분으로 구성되어 있습니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java의 기본 입출력 클래스인 BufferedReader를 사용하여 사용자로부터 입력을 받습니다. 그 후, StringTokenizer 클래스를 사용하여 입력받은 문자열을 공백을 기준으로 토큰(단어)으로 분리하고, 그 토큰의 개수를 세어서 출력합니다.



### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _08_단어의개수 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 객체를 생성하여 사용자로부터 문자열을 입력받습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringTokenizer 객체를 생성하여 입력받은 문자열을 공백을 기준으로 토큰으로 분리합니다.
        StringTokenizer st = new StringTokenizer(br.readLine());

        // countTokens 메소드를 사용하여 토큰의 개수를 세고, 그 결과를 출력합니다.
        System.out.print(st.countTokens());
    }
}
```

