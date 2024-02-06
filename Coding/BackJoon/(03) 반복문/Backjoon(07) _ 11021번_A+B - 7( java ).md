# \[ Backjoon - 11021번 \] A+B - 7 ( java )
https://www.acmicpc.net/problem/11021
## 문제

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

### 출력
각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.

### 예제 입력 1 
5
1 1
2 3
3 4
9 8
5 2

### 예제 출력 1 
Case #1: 2
Case #2: 5
Case #3: 7
Case #4: 17
Case #5: 7

## 문제풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 테스트 케이스의 수만큼 두 개의 정수를 입력받아 각각의 정수 쌍에 대한 합을 계산하고, 각 테스트 케이스에 대한 결과를 "Case #테스트케이스번호: 합"의 형식으로 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 테스트 케이스의 수를 입력받습니다. 그 후, 테스트 케이스의 수만큼 두 개의 정수를 입력받아 각각의 정수 쌍에 대한 합을 계산합니다. 계산된 결과는 각 테스트 케이스에 대한 번호와 함께 StringBuilder에 저장되며, 모든 테스트 케이스에 대한 계산이 끝나면 한 번에 출력됩니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java 8의 Stream API와 람다 표현식을 사용하여 간결하고 명확한 코드를 작성하고 있습니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 각 테스트 케이스에 대한 결과를 "Case #테스트케이스번호: 합"의 형식으로 출력하는 것입니다.

### 풀이

```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.Arrays;  
import java.util.stream.IntStream;  
  
public class _07_A플러스B_7 {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        StringBuilder sb = new StringBuilder();  
  
        // 테스트 케이스의 수를 입력받습니다.  
        IntStream.rangeClosed(1, Integer.parseInt(br.readLine())).forEach(i -> {  
            try {  
                // 두 개의 정수를 입력받아 합을 계산하고, 계산된 결과를 각 테스트 케이스에 대한 번호와 함께 StringBuilder에 저장합니다.  
                sb.append("Case #").append(i).append(": ")  
                        .append(Arrays.stream(br.readLine().split(" "))  
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
