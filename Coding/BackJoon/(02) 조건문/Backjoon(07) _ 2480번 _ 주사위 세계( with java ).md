# \[ Backjoon - 2480번 \] 주사위 세계 ( with java )
https://www.acmicpc.net/problem/2480
## 문제

1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

### 입력
첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.

### 출력
첫째 줄에 게임의 상금을 출력 한다.

### 예제
#### 예제 입력 1
3 3 6

#### 예제 출력 1
1300

#### 예제 입력 2 
2 2 2

#### 예제 출력 2 
12000

#### 예제 입력 3 
6 2 5

#### 예제 출력 3 
600
## 문제풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 주사위 게임에서 승리 조건에 따른 점수를 계산하는 것입니다. 주사위 게임은 3개의 주사위를 동시에 굴리고, 주사위의 눈이 같은 경우와 다른 경우에 따라 점수를 다르게 부여합니다.
- 코드의 주요 구조:
    
    - 이 코드는 입력으로 3개의 주사위 눈의 수를 받습니다. 이후, 주사위 눈의 수를 오름차순으로 정렬하고, 주사위 눈의 수에 따라 점수를 계산하여 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 `Arrays.sort()` 메소드를 사용하여 주사위 눈의 수를 오름차순으로 정렬하고, 주사위 눈의 수에 따라 점수를 계산하는 것입니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 주사위 눈의 수를 분석하여 해당하는 점수를 계산하는 것입니다.

### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backjoon_07_2480_주사위세계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];

        // 주사위 눈의 수를 입력 받습니다.
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 주사위 눈의 수를 오름차순으로 정렬합니다.
        Arrays.sort(arr);

        // 주사위 눈의 수에 따라 점수를 계산합니다.
        if (arr[0] == arr[2]) {  // 모든 주사위 눈의 수가 같은 경우
            System.out.println(10000 + (arr[0] * 1000));
        } else if (arr[0] == arr[1] || arr[1] == arr [2]) {  // 두 개의 주사위 눈의 수가 같은 경우
            System.out.println(1000 + (arr[1] * 100));
        } else {  // 모든 주사위 눈의 수가 다른 경우
            System.out.println(arr[2] * 100);
        }
    }
}
```
