# \[ Backjoon - 27866번 \] 문자와 문자열 ( java )

https://www.acmicpc.net/problem/27866

## 문제
단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1000이다.

둘째 줄에 정수 i가 주어진다. 

### 출력

 S의 i번째 글자를 출력한다.
### 예제
#### 예제 입력 1 

Sprout
3

#### 예제 출력 1 

r

#### 예제 입력 2

shiftpsh
6

#### 예제 출력 2

p

#### 예제 입력 3

Baekjoon
4

#### 예제 출력 3 

k




## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 문자열과 숫자를 입력받아, 입력받은 숫자에 해당하는 인덱스 위치의 문자를 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 문자열과 숫자를 입력받습니다. 그 후, 입력받은 숫자에 해당하는 인덱스 위치의 문자를 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java의 기본 입출력 클래스인 BufferedReader를 사용하여 사용자로부터 입력을 받고, 문자열의 charAt 메소드를 사용하여 특정 위치의 문자를 찾습니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 입력받은 숫자에 해당하는 인덱스 위치의 문자를 찾아 출력하는 것입니다.
### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_문자와문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사용자로부터 문자열과 숫자를 입력받아, 입력받은 숫자에 해당하는 인덱스 위치의 문자를 출력합니다.
        System.out.println(br.readLine().charAt(Integer.parseInt(br.readLine()) - 1));
    }
}
```

