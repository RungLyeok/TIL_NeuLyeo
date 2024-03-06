





# [BOJ / java] 2563번 : 색종이

https://www.acmicpc.net/problem/2563

## 문제
가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다. 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.

![](https://u.acmicpc.net/6000c956-1b07-4913-83c3-72eda18fa1d1/Screen%20Shot%202021-06-23%20at%2012.27.04%20PM.png)

예를 들어 흰색 도화지 위에 세 장의 검은색 색종이를 그림과 같은 모양으로 붙였다면 검은색 영역의 넓이는 260이 된다.

## 입력

첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다. 색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, 두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다. 색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다

## 출력

첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.

## 예제
### 예제 입력 1

3
3 7
15 7
5 2

### 예제 출력 1

260

## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 코드는 Java로 작성된 코드로, 100x100 크기의 2차원 배열을 사용하여 색종이를 표현하는 것이 목적입니다.
    - 사용자로부터 색종이의 개수와 각 색종이의 시작 좌표를 입력 받아, 색종이가 덮이는 영역의 넓이를 계산하고 출력합니다.
- 코드의 주요 구조:
    
    - 이 코드는 BufferedReader와 StringTokenizer를 사용하여 사용자로부터 입력을 받습니다.
    - 2차원 배열을 사용하여 색종이를 표현하고, for loop를 사용하여 색종이가 덮이는 영역을 계산합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 두 개의 중첩된 for loop를 사용하여 색종이가 덮이는 영역을 계산합니다.
    - 각 색종이의 시작 좌표부터 10x10 크기의 영역을 덮는다고 가정하고, 해당 영역에 해당하는 배열의 원소 값을 1로 변경합니다.
    - 이미 덮인 영역은 다시 덮이지 않도록, 배열의 원소 값이 1인 경우에는 넘어가고, 그렇지 않은 경우에만 넓이를 증가시킵니다.
- 코드의 흐름:
    
    - 코드는 먼저 BufferedReader를 통해 사용자로부터 색종이의 개수를 입력 받습니다.
    - 그 후, 각 색종이의 시작 좌표를 입력 받아, 해당 좌표부터 10x10 크기의 영역을 덮는다고 가정하고, 해당 영역에 해당하는 배열의 원소 값을 1로 변경합니다.
    - 마지막으로, 색종이가 덮이는 영역의 넓이를 출력합니다.


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04_색종이 {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 통해 사용자로부터 입력 받기 위한 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 색종이의 개수를 입력 받음
        int n = Integer.parseInt(br.readLine());
        // 100x100 크기의 2차원 배열 생성
        int[][] arr = new int[100][100];
        // 색종이가 덮이는 영역의 넓이를 저장할 변수
        int answer = 0;

        // 색종이의 개수만큼 for loop 실행
        for (int i = 0; i < n; i++) {
            // StringTokenizer를 통해 색종이의 시작 좌표를 입력 받음
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 색종이가 덮는 영역을 계산하는 for loop
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    // 해당 영역이 덮이지 않았다면, 값을 1로 변경하고 넓이를 증가시킴
                    if(arr[j][k] != 1) {
                        arr[j][k] = 1;
                        answer++;
                    }
                }
            }
        }
        // 색종이가 덮이는 영역의 넓이 출력
        System.out.println(answer);
    }
}
```

