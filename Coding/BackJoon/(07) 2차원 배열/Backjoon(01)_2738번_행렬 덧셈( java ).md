





# \[ Backjoon - 2738번 \] 행렬 덧셈 ( java )

https://www.acmicpc.net/problem/2738

## 문제N

M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

## 입력

첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

## 출력

첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

## 예제
### 예제 입력 1

3 3
1 1 1
2 2 2
0 1 0
3 3 3
4 4 4
5 5 100

### 예제 출력 1

4 4 4
6 6 6
5 6 100

## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 코드는 두 개의 행렬을 입력받아 행렬의 덧셈을 수행하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 행렬의 크기를 입력받습니다. 그 후, 두 개의 행렬을 입력받아 행렬의 덧셈을 수행하고 결과를 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java 8의 Stream API와 람다 표현식을 사용하여 간결하고 명확한 코드를 작성하고 있습니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 행렬의 덧셈을 수행하는 것입니다.


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class _01_행렬덧셈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 행렬의 크기를 입력받습니다.
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int[][] arr1 = new int[nm[0]][nm[1]];
        int[][] arr2 = new int[nm[0]][nm[1]];
        
        // 두 개의 행렬을 입력받습니다.
        for (int i = 0; i < nm[0]; i++) {
            arr1[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 0; i < nm[0]; i++) {
            arr2[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        // 행렬의 덧셈을 수행하고 결과를 출력합니다.
        IntStream.range(0, nm[0]).forEach(i -> {
            IntStream.range(0, nm[1]).forEach(j -> System.out.print(arr1[i][j] + arr2[i][j] + " "));
            System.out.println();
        });
    }
}
```

