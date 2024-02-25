# \[ Backjoon - 11654번 \] 아스키 코드 ( java )

https://www.acmicpc.net/problem/11654

## 문제
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

## 입력

알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

## 출력

입력으로 주어진 글자의 아스키 코드 값을 출력한다.

## 예제
### 예제 입력 1

A

### 예제 출력 1

65

### 예제 입력 2

C

### 예제 출력 2

67




## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 문자를 입력받아, 그 문자의 아스키 코드 값을 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 문자를 입력받습니다. 그 후, 입력받은 문자의 아스키 코드 값을 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java의 기본 입출력 클래스인 BufferedReader를 사용하여 사용자로부터 입력을 받고, 문자의 아스키 코드 값을 계산하기 위해 int 형으로 형 변환을 수행합니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 입력받은 문자의 아스키 코드 값을 찾아 출력하는 것입니다.



### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04_아스키코드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사용자로부터 문자를 입력받아, 그 문자의 아스키 코드 값을 출력합니다.
        System.out.println((int) br.readLine().charAt(0));
    }
}
```

