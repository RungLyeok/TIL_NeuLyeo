# \[ Backjoon - 1546번 \]  평균 ( java )
https://www.acmicpc.net/problem/1546
## 문제

세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

### 출력

첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.

### 예제
#### 예제 입력 1

3
40 80 60

#### 예제 출력 1

75.0

#### 예제 입력 2

3
10 20 30

#### 예제 출력 2

66.666667

10-2 이하의 오차를 허용한다는 말은 정확히 소수 2번째 자리까지 출력하라는 뜻이 아니다.

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 n개의 점수를 입력받아 가장 높은 점수를 기준으로 다른 점수들을 변환하고, 변환된 점수들의 평균을 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 n개의 점수를 입력받습니다. 그 후, 가장 높은 점수를 기준으로 다른 점수들을 변환하고, 변환된 점수들의 평균을 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java 8의 Stream API와 람다 표현식을 사용하여 간결하고 명확한 코드를 작성하고 있습니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 가장 높은 점수를 기준으로 다른 점수들을 변환하고, 변환된 점수들의 평균을 출력하는 것입니다.


### 풀이

```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10_평균 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // n개의 점수를 입력받습니다.
        double[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToDouble(Integer::parseInt).toArray();

        // 가장 높은 점수를 찾습니다.
        double max = Arrays.stream(arr).max().orElse(0);

        // 가장 높은 점수를 기준으로 다른 점수들을 변환하고, 변환된 점수들의 합을 구합니다.
        double sum = Arrays.stream(arr).map(x -> x / max * 100).sum();

        // 변환된 점수들의 평균을 출력합니다.
        System.out.println(sum / n);
    }
}
```
