





# \[ Backjoon - 2738번 \] 행렬 덧셈 ( java )

https://www.acmicpc.net/problem/2738

## 문제N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

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
    
    - 이 코드는 사용자로부터 입력받은 학생들의 과목별 학점과 학점에 따른 평점을 바탕으로, 전체 평균 평점을 계산해 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 과목별 학점에 따른 평점을 HashMap에 저장합니다. 그 후, 사용자로부터 학생들의 과목별 학점을 입력받아 전체 평균 평점을 계산하고 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java 8의 Stream API를 사용하여 간결하고 명확한 코드를 작성하고 있습니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 입력받은 과목별 학점에 따른 평점을 바탕으로 전체 평균 평점을 계산하여 출력하는 것입니다.


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.stream.IntStream;

public class _08_너의평점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arrS = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        Double[] arrD = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        // 과목별 학점에 따른 평점을 HashMap에 저장합니다.
        HashMap<String, Double> grade = new HashMap<>();
        IntStream.range(0, arrS.length).forEach(i -> grade.put(arrS[i], arrD[i]));

        // 전체 학점과 평점의 합을 저장할 배열을 선언합니다.
        double[] sum = {0.0, 0.0};

        // 사용자로부터 학생들의 과목별 학점을 입력받아 전체 평균 평점을 계산합니다.
        for (int i = 0; i < 20; i++) {
            String[] arr = br.readLine().split(" ");
            if (!arr[2].equals("P")) {
                double d = Double.parseDouble(arr[1]);
                sum[0] += d;
                sum[1] += d * grade.get(arr[2]);
            }
        }

        // 전체 평균 평점을 출력합니다.
        System.out.printf("%.6f", sum[1] / sum[0]);
    }
}
```

