# \[ Backjoon - 1157번 \] 단어 공부 ( java )

https://www.acmicpc.net/problem/1157

## 문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

## 입력

첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

## 출력

첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
## 예제
### 예제 입력 1 

Mississipi

### 예제 출력 1 

?

### 예제 입력 2 

zZa

### 예제 출력 2 

Z


## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 단어에서 가장 많이 사용된 알파벳을 찾아 대문자로 출력하는 것입니다. 만약 가장 많이 사용된 알파벳이 여러 개라면 '?'를 출력합니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 한 개의 단어를 입력받습니다. 그 후, 입력받은 단어에서 각 알파벳이 몇 번 사용되었는지를 계산하고, 가장 많이 사용된 알파벳을 찾아 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java 8의 Stream API와 람다 표현식을 사용하여 입력받은 단어에서 각 알파벳이 몇 번 사용되었는지를 계산하고, 가장 많이 사용된 알파벳을 찾습니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 Stream API와 람다 표현식을 사용하여 간결하고 명확한 코드를 작성하는 것입니다.


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class _05_단어공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 각 알파벳이 몇 번 사용되었는지를 저장하는 배열을 선언합니다.
        int[] arr = new int[26];

        // 입력받은 단어에서 각 알파벳이 몇 번 사용되었는지를 계산합니다.
        br.readLine().toUpperCase()
                .chars().forEach(c -> arr[c - 'A']++);

        // 가장 많이 사용된 알파벳의 횟수를 찾습니다.
        int max = IntStream.of(arr).max().getAsInt();
        // 가장 많이 사용된 알파벳의 수를 계산합니다.
        long count = IntStream.of(arr).filter(i -> i == max).count();

        // 가장 많이 사용된 알파벳이 여러 개라면 '?'를 출력합니다.
        if (count > 1) {
            System.out.print('?');
        } else {
            // 가장 많이 사용된 알파벳을 대문자로 출력합니다.
            System.out.print(
                    (char) (IntStream.range(0, arr.length)
                            .filter(i -> arr[i] == max)
                            .findFirst().getAsInt() + 'A')
            );
        }
    }
}
```

