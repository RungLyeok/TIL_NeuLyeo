# \[ Backjoon - 10811번 \]  바구니 뒤집기 ( java )
https://www.acmicpc.net/problem/10811
## 문제

도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다. 

도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.

바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.

둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)

도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.

### 출력

모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.

### 예제
#### 예제 입력 1 

5 4
1 2
3 4
1 4
2 2

#### 예제 출력 1 

3 4 1 2 5

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 주어진 크기의 배열을 생성하고, 사용자로부터 특정 구간의 요소를 반전하는 연산을 수행한 후, 최종적으로 배열의 모든 요소를 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 배열의 크기와 연산의 횟수를 입력받습니다. 그 후, 사용자로부터 특정 구간의 요소를 반전하는 연산을 수행합니다. 마지막으로, 배열의 모든 요소를 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 반복문과 조건문을 사용하여 특정 구간의 요소를 반전하는 연산을 수행하는 것입니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 주어진 연산을 수행한 후, 최종적으로 배열의 모든 요소를 출력하는 것입니다.


### 풀이

```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class _09_바구니뒤집기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int[] arr = new int[size];
        for (int i = 0; i < size ; i++) {
            arr[i] = i + 1;
        }

        int n = Integer.parseInt(st.nextToken());
        // 사용자로부터 특정 구간의 요소를 반전하는 연산을 수행합니다.
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            reverseArr(arr, start, end);
        }

        // 배열의 모든 요소를 출력합니다.
        System.out.print(Arrays.stream(arr)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" ")));
    }
    
    private static void reverseArr (int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
```
