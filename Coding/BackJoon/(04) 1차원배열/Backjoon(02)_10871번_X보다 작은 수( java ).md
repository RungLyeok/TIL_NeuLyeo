# \[ Backjoon - 10871번 \] X보다 작은 수 ( java )

https://www.acmicpc.net/problem/10871


## 문제
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

### 출력

X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

### 예제 입력 1

10 5
1 10 4 9 2 3 8 5 7 6

### 예제 출력 1

1 4 2 3




## 문제풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 정수 n과 x에 대해, n개의 정수를 입력받아 그 중에서 x보다 작은 정수만을 공백으로 구분하여 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 두 개의 정수 n과 x를 입력받습니다. 그 후, n개의 정수를 입력받아 그 중에서 x보다 작은 정수만을 공백으로 구분하여 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java 8의 Stream API와 람다 표현식을 사용하여 간결하고 명확한 코드를 작성하고 있습니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 입력받은 n개의 정수 중에서 x보다 작은 정수만을 공백으로 구분하여 출력하는 것입니다.


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;


public class _02_X보다작은수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        // n개의 정수를 입력받아 그 중에서 x보다 작은 정수만을 공백으로 구분하여 출력합니다.
        String result = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .filter(i -> i < x)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
```

