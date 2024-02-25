# \[ Backjoon - 2675번 \] 문자열 반복 ( java )

https://www.acmicpc.net/problem/2675

## 문제
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

QR Code "alphanumeric" 문자는 `0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./:` 이다.

## 입력

첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 

## 출력

각 테스트 케이스에 대해 P를 출력한다.

## 예제
### 예제 입력 1 복사

2
3 ABC
5 /HTP

### 예제 출력 1 복사

AAABBBCCC
/////HHHHHTTTTTPPPPP




## 문제 풀이
### 코드설명
- 코드의 목적에 대한 상세한 설명:
    
    - 이 코드의 주된 목적은 사용자로부터 특정 횟수와 문자열을 입력받는 것입니다. 그 후에는, 입력받은 문자열의 각 문자를 해당 횟수만큼 반복하여 출력하는 것입니다. 이는 문자열 내의 각 문자를 사용자가 지정한 횟수만큼 반복하여 새로운 문자열을 생성하고, 그 결과를 출력하는 것을 통해 이루어집니다.
- 코드의 주요 구조에 대한 상세한 설명:
    
    - 이 코드는 사용자의 입력을 기반으로 작동하는 구조를 가지고 있습니다. 먼저, 사용자로부터 특정 횟수와 문자열을 입력받습니다. 이 입력값들은 다음 단계에서 사용됩니다. 그 다음 단계는, 입력받은 문자열의 각 문자를 해당 횟수만큼 반복하여 출력하는 것입니다. 이를 통해, 원하는 문자열 패턴을 생성하고 출력하는 작업을 수행합니다.
- 코드의 주요 알고리즘에 대한 상세한 설명:
    
    - 이 코드의 알고리즘은 Java의 기본 입출력 클래스인 BufferedReader를 사용하여 사용자로부터 입력을 받는 것으로 시작합니다. 그 다음, StringTokenizer를 사용하여 입력받은 문자열을 토큰으로 분리합니다. 이렇게 분리된 문자열의 각 문자는 그 후 Java 8의 Stream API를 사용하여 각 문자를 반복하여 출력하는 데 사용됩니다. 이 과정에서 문자열의 chars 메소드를 사용하여 문자열을 문자 단위로 분리하고, 이를 반복하여 출력합니다.
- 코드의 핵심에 대한 상세한 설명:
    
    - 이 코드의 핵심은 사용자로부터 입력받은 문자열의 각 문자를 특정 횟수만큼 반복하여 출력하는 것입니다. 이는 문자열의 각 문자를 사용자가 지정한 횟수만큼 반복하여 새로운 문자열을 생성하고, 그 결과를 출력하는 작업을 수행함으로써 이루어집니다.



### 풀이

```
import java.io.*;
import java.util.*;

public class _07_문자열반복 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // n번 반복하여 문자열을 입력받고, 각 문자를 특정 횟수만큼 반복하여 출력합니다.
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String b = st.nextToken();

            // 문자열의 각 문자를 특정 횟수만큼 반복하여 출력합니다.
            b.chars().mapToObj(c -> String.valueOf((char)c).repeat(a))
                    .forEach(System.out::print);

            System.out.println();
        }
    }
}
```

