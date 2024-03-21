





# [BOJ / java] 2501 : 약수 구하기 

https://www.acmicpc.net/problem/2501

## 문제
어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다. 

6을 예로 들면

- 6 ÷ 1 = 6 … 0
- 6 ÷ 2 = 3 … 0
- 6 ÷ 3 = 2 … 0
- 6 ÷ 4 = 1 … 2
- 6 ÷ 5 = 1 … 1
- 6 ÷ 6 = 1 … 0

그래서 6의 약수는 1, 2, 3, 6, 총 네 개이다.

두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.

## 입력

첫째 줄에 N과 K가 빈칸을 사이에 두고 주어진다. N은 1 이상 10,000 이하이다. K는 1 이상 N 이하이다.

## 출력

첫째 줄에 N의 약수들 중 K번째로 작은 수를 출력한다. 만일 N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우에는 0을 출력하시오.

## 예제
### 예제 입력 1 

6 3

### 예제 출력 1 

3

### 예제 입력 2 

25 4

### 예제 출력 2 

0

### 예제 입력 3

2735 1

### 예제 출력 3

1


## 문제 풀이
### 코드설명
- 코드의 동작 방식:
    
    - `BufferedReader`를 사용하여 사용자로부터 한 줄의 입력을 받습니다. 이 입력은 공백으로 구분된 두 정수 a와 b를 포함합니다.
    - 입력받은 두 정수 a와 b를 각각 파싱하여 정수로 변환합니다.
    - 변수 `idx`를 선언하고 0으로 초기화합니다. 이 변수는 a의 약수를 찾을 때마다 1씩 증가하여, b번째 약수를 찾는데 사용됩니다.
    - 1부터 a까지의 모든 정수에 대해 반복문을 실행하며, a를 현재 정수로 나누었을 때 나머지가 0이 되는 경우(즉, 현재 정수가 a의 약수인 경우) `idx`를 1 증가시킵니다.
    - 만약 `idx`가 b와 같아진다면, 현재의 정수(즉, b번째 약수)를 출력하고 프로그램을 종료합니다.
    - 반복문이 종료된 후에도 b번째 약수를 찾지 못한 경우(즉, a의 약수의 개수가 b보다 작은 경우) 0을 출력합니다.
- 코드의 핵심 부분:
    
    - a의 모든 약수를 찾기 위한 반복문 실행.
    - 찾은 약수의 순서(`idx`)가 사용자가 원하는 순서(b)와 일치할 때 해당 약수를 출력.
    - a의 약수 중 b번째 약수가 없는 경우 0을 출력.
- 코드의 흐름:
    
    - 사용자 입력 → 입력 파싱 → 조건에 따른 약수 탐색 및 출력 → b번째 약수가 없을 경우 0 출력


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _02_약수구하기 {
    public static void main(String[] args) throws IOException {
        // 사용자로부터 입력을 받기 위한 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받은 라인을 공백으로 구분하여 배열에 저장
        String[] ab = br.readLine().split(" ");

        // 첫 번째 입력값(a)을 정수로 변환
        int a = Integer.parseInt(ab[0]);
        // 두 번째 입력값(b)을 정수로 변환
        int b = Integer.parseInt(ab[1]);
        // 약수를 찾기 위한 인덱스 초기화
        int idx = 0;

        // 1부터 a까지 반복하여 a의 약수를 찾음
        for (int i = 1; i <= a; i++) {
            // 현재 숫자가 a의 약수인지 확인
            if (a % i == 0){
                // 약수를 찾을 때마다 idx 증가
                idx++;
                // idx가 사용자가 원하는 b와 같다면 해당 약수 출력 후 프로그램 종료
                if (idx == b) {
                    System.out.println(i);
                    return;
                }
            }
        }

        // 모든 약수를 검사한 후 b번째 약수를 찾지 못한 경우 0 출력
        System.out.print(0);
    }
}
```

