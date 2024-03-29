# \[ Backjoon - 5622번 \] 다이얼 ( java )

https://www.acmicpc.net/problem/5622

## 문제
상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.

![](https://u.acmicpc.net/9c88dd24-3a4c-4a09-bc50-e6496958214d/Screen%20Shot%202021-06-16%20at%2012.48.39%20AM.png)

전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.

할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.

## 입력

첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.

## 출력

첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.

## 예제
### 예제 입력 1 

WA

### 예제 출력 1 

13

### 예제 입력 2 

UNUCIC

### 예제 출력 2 

36




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

