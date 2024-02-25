# \[ Backjoon - 11720번 \] 숫자의 합 ( java )

https://www.acmicpc.net/problem/11720

## 문제
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

## 입력

첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

## 출력

각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

## 예제
### 예제 입력 1 

1
1

### 예제 출력 1

1

### 예제 입력 2

5
54321

### 예제 출력 2

15




## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 문자열로 구성된 숫자를 입력받아, 그 숫자의 각 자리수의 합을 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 문자열로 구성된 숫자를 입력받습니다. 그 후, 그 숫자의 각 자리수의 합을 계산하고 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java의 기본 입출력 클래스인 BufferedReader를 사용하여 사용자로부터 입력을 받고, 문자열의 split 메소드를 사용하여 각 자리수를 분리하고, Integer.parseInt 메소드를 사용하여 각 자리수를 정수로 변환합니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 입력받은 숫자의 각 자리수의 합을 계산하고 출력하는 것입니다.



### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05_숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int sum = 0;

        // 문자열로 구성된 숫자를 입력받아, 그 숫자의 각 자리수의 합을 계산하고 출력합니다.
        for(String s : br.readLine().split("")) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
    }
}
```

