# \[ Backjoon - 10813번 \] 공 바꾸기 ( java )
https://www.acmicpc.net/problem/10813
## 문제

도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.

도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.

공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.

둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)

도현이는 입력으로 주어진 순서대로 공을 교환한다.

### 출력

1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.

### 예제 입력 1

5 4
1 2
3 4
1 4
2 2

### 예제 출력 1

3 1 4 2 5

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 주어진 크기의 배열을 생성하고, 사용자로부터 특정 인덱스에 위치한 두 개의 요소를 교환하는 연산을 수행한 후, 최종적으로 배열의 모든 요소를 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 배열의 크기와 연산의 횟수를 입력받습니다. 그 후, 사용자로부터 특정 인덱스에 위치한 두 개의 요소를 교환하는 연산을 수행합니다. 마지막으로, 배열의 모든 요소를 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 반복문과 조건문을 사용하여 특정 인덱스에 위치한 두 개의 요소를 교환하는 연산을 수행하는 것입니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 주어진 연산을 수행한 후, 최종적으로 배열의 모든 요소를 출력하는 것입니다.


### 풀이

```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class _06_공바꾸기 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }

        int numOperations = Integer.parseInt(st.nextToken());
        // 사용자로부터 특정 인덱스에 위치한 두 개의 요소를 교환하는 연산을 수행합니다.
        for (int i = 0; i < numOperations; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int tmp = 0;

            tmp = arr[b];
            arr[b] = arr[a];
            arr[a] = tmp;
        }

        // 배열의 모든 요소를 출력합니다.
        System.out.print(Arrays.stream(arr)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" ")));
    }
}
```
