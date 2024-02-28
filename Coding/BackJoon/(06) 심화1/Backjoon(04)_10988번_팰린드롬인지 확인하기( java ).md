# \[ Backjoon - 10988번 \] 팰린드롬인지 확인하기 ( java )

https://www.acmicpc.net/problem/10988

## 문제
알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.

팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 

level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

## 입력

첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.

## 출력

첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.

## 예제
### 예제 입력 1 

level

### 예제 출력 1 

1

### 예제 입력 2 

baekjoon

### 예제 출력 2 

0


## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 문자열을 입력받아, 해당 문자열이 팰린드롬(앞으로 읽으나 뒤로 읽으나 동일한 문자열)인지를 확인하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 문자열을 입력받습니다. 그 후, 문자열의 앞, 뒤에서부터 동일한 위치의 문자를 비교하여 문자열이 팰린드롬인지를 확인합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 문자열의 길이의 절반만큼 반복을 수행하며, 각 반복에서 문자열의 앞, 뒤에서 동일한 위치의 문자를 비교합니다. 만약 동일하지 않은 문자가 발견되면 즉시 반복을 중단하고 팰린드롬이 아니라는 결과를 출력합니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 문자열이 팰린드롬인지를 효율적으로 확인하는 것입니다.


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04_팰린드롬인지확인하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열을 입력받습니다.
        String s = br. readLine();
        int n = s.length();

        // 팰린드롬 여부를 저장하는 변수를 선언합니다.
        boolean isPalindrome = true;

        // 문자열의 길이의 절반만큼 반복을 수행합니다.
        for (int i = 0; i < n / 2; i++) {
            // 문자열의 앞, 뒤에서 동일한 위치의 문자를 비교합니다.
            if (s.charAt(i) != s.charAt(n - i - 1) ) {
                // 동일하지 않은 문자가 발견되면 즉시 반복을 중단하고 팰린드롬이 아니라는 결과를 출력합니다.
                isPalindrome = false;
                break;
            }
        }

        // 팰린드롬 여부를 출력합니다.
        System.out.print(isPalindrome ? 1 : 0);
    }
}
```

