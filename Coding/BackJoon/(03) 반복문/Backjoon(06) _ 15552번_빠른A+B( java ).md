# \[ Backjoon - 15552번 \] 빠른A+B ( java )
https://www.acmicpc.net/problem/15552
## 문제

본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.

C++을 사용하고 있고 `cin`/`cout`을 사용하고자 한다면, `cin.tie(NULL)`과 `sync_with_stdio(false)`를 둘 다 적용해 주고, `endl` 대신 개행문자(`\n`)를 쓰자. 단, 이렇게 하면 더 이상 `scanf`/`printf`/`puts`/`getchar`/`putchar` 등 C의 입출력 방식을 사용하면 안 된다.

Java를 사용하고 있다면, `Scanner`와 `System.out.println` 대신 `BufferedReader`와 `BufferedWriter`를 사용할 수 있다. `BufferedWriter.flush`는 맨 마지막에 한 번만 하면 된다.

Python을 사용하고 있다면, `input` 대신 `sys.stdin.readline`을 사용할 수 있다. 단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 `.rstrip()`을 추가로 해 주는 것이 좋다.

또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.

자세한 설명 및 다른 언어의 경우는 [이 글](http://www.acmicpc.net/board/view/22716)에 설명되어 있다.

[이 블로그 글](http://www.acmicpc.net/blog/view/55)에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.

### 입력

첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

### 출력

각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

### 예제 입력 1 복사

5
1 1
12 34
5 500
40 60
1000 1000

### 예제 출력 1 복사

2
46
505
100
2000

## 문제풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 테스트 케이스의 수만큼 두 개의 정수를 입력받아 각각의 정수 쌍에 대한 합을 계산하고, 모든 결과를 한 번에 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 테스트 케이스의 수를 입력받습니다. 그 후, 테스트 케이스의 수만큼 두 개의 정수를 입력받아 각각의 정수 쌍에 대한 합을 계산합니다. 계산된 모든 결과는 StringBuilder에 저장되며, 모든 테스트 케이스에 대한 계산이 끝나면 한 번에 출력됩니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java 8의 Stream API와 람다 표현식을 사용하여 간결하고 명확한 코드를 작성하고 있습니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 StringBuilder를 사용하여 모든 결과를 한 번에 출력하는 것입니다.

### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.Arrays;

public class _06_빠른A플러스B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 테스트 케이스의 수를 입력받습니다.
        IntStream.range(0, Integer.parseInt(br.readLine())).forEach(i -> {
            try {
                // 두 개의 정수를 입력받아 합을 계산하고, 계산된 결과를 StringBuilder에 저장합니다.
                sb.append(Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt).sum()).append('\n');
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        
        // 모든 결과를 한 번에 출력합니다.
        System.out.println(sb);
    }
}
```
