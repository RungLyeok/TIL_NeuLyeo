# \[ Backjoon - 10950번 \] A+B-3 ( java )
https://www.acmicpc.net/problem/10950
## 문제

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

### 입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

### 출력
각 테스트 케이스마다 A+B를 출력한다.

### 예제 입력 1 
5
1 1
2 3
3 4
9 8
5 2

### 예제 출력 1
2
5
7
17
7

## 문제풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 테스트 케이스의 수만큼 두 개의 정수를 입력받아, 각각의 정수 쌍에 대해 합을 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 테스트 케이스의 수를 입력받습니다. 그 후, 테스트 케이스의 수만큼 두 개의 정수를 입력받아, 각각의 정수 쌍에 대해 합을 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java 8의 Stream API를 사용하여 테스트 케이스의 수만큼 반복을 수행하고, 각 반복에서 두 개의 정수를 입력받아 합을 출력합니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 Stream API와 람다 표현식을 사용하여 간결하고 명확한 코드를 작성하는 것입니다.

### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class _02_10950_A더하기B_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스의 수를 입력받습니다.
        IntStream.range(0, Integer.parseInt(br.readLine()))
                .forEach(i -> {
                    try {
                        // 두 개의 정수를 입력받아 합을 출력합니다.
                        String[] arr = br.readLine().split(" ");
                        System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }
}
```
