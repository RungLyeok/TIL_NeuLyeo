# \[ Backjoon - 11718번 \] 그대로 출력하기 ( java )

https://www.acmicpc.net/problem/11718

## 문제
입력 받은 대로 출력하는 프로그램을 작성하시오.

## 입력

입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.

## 출력

입력받은 그대로 출력한다.

## 예제
### 예제 입력 1 

Hello
Baekjoon
Online Judge

### 예제 출력 1 

Hello
Baekjoon
Online Judge




## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 Java 코드는 사용자로부터 문자열을 입력받고, 각 문자에 해당하는 전화 다이얼 시간을 계산하여 그 총합을 출력하는 것입니다. 여기서 전화 다이얼 시간은 각 문자가 위치한 문자열 배열의 인덱스에 3을 더한 값으로 계산됩니다.
- 코드의 주요 구조:
    
    - 이 코드는 사용자로부터 문자열을 입력받는 부분, 각 문자에 해당하는 전화 다이얼 시간을 계산하는 부분, 그리고 그 총합을 출력하는 부분으로 구성되어 있습니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java의 기본 입출력 클래스인 BufferedReader를 사용하여 사용자로부터 문자열을 입력받습니다. 그 후, 입력받은 문자열의 각 문자에 대해 해당하는 전화 다이얼 시간을 계산합니다. 이 시간은 각 문자가 위치한 문자열 배열의 인덱스에 3을 더한 값으로 계산됩니다. 이렇게 계산된 시간들의 총합을 구하고, 이를 출력합니다.



### 풀이

```
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10_다이얼 {
    public static void main(String[] args) throws Exception {
        // 각 문자에 대응하는 전화 다이얼을 배열로 표현합니다.
        String[] str = new String[]{"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

        // BufferedReader 객체를 생성하여 사용자로부터 문자열을 입력받습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum = 0;

        // 입력받은 문자열의 각 문자에 대해 전화 다이얼 시간을 계산합니다.
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            for (int j = 0; j < str.length; j++) {
                // 문자가 위치한 문자열 배열의 인덱스에 3을 더한 값으로 전화 다이얼 시간을 계산합니다.
                if (str[j].indexOf(c) >= 0) {
                    sum += j + 3;
                    break;
                }
            }
        }

        // 총합 시간을 출력합니다.
        System.out.println(sum);
    }
}
```

