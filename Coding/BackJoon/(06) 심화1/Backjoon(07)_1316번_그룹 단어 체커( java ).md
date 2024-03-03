# \[ Backjoon - 1316번 \] 그룹 단어 체커 ( java )

https://www.acmicpc.net/problem/1316

## 문제
예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

|크로아티아 알파벳|변경|
|---|---|
|č|c=|
|ć|c-|
|dž|dz=|
|đ|d-|
|lj|lj|
|nj|nj|
|š|s=|
|ž|z=|

예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

## 입력

첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.

단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

## 출력

입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
## 예제
### 예제 입력 1 

ljes=njak

### 예제 출력 1

6

### 예제 입력 2

ddz=z=

### 예제 출력 2

3

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

