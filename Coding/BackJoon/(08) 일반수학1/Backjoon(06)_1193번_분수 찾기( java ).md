





# [BOJ / java] 1193 : 분수 찾기

https://www.acmicpc.net/problem/2903

## 문제
무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

|   |   |   |   |   |   |
|---|---|---|---|---|---|
|1/1|1/2|1/3|1/4|1/5|…|
|2/1|2/2|2/3|2/4|…|…|
|3/1|3/2|3/3|…|…|…|
|4/1|4/2|…|…|…|…|
|5/1|…|…|…|…|…|
|…|…|…|…|…|…|

이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.

X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

## 입력

첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.

## 출력

첫째 줄에 분수를 출력한다.

## 예제 

1 -> 1/1
2 -> 1/2
3 -> 2/1
4 -> 3/1
5 -> 2/2
6 -> 1/3
7 -> 1/4
8 -> 2/3
9 -> 3/2
14 ->2/4

## 문제 풀이
### 코드설명
- 코드의 동작 방식:
    
    - `BufferedReader`를 이용하여 사용자로부터 입력(n)을 받습니다.
    - `line`은 현재 대각선의 라인(즉, 몇 번째 대각선인지)을 나타내고, `count`는 해당 라인까지의 분수의 총 개수입니다.
    - while문을 통해 `count`가 입력 값(n)보다 작거나 같을 때까지 `line`을 증가시키고, `count`를 업데이트합니다. 여기서 `count`의 계산은 등차수열의 합 공식을 이용합니다.
    - 계산된 `count`에서 입력 값(n)을 빼서 현재 라인에서 몇 번째 위치해야 하는지 찾습니다(`diff`).
    - `line`이 짝수일 때와 홀수일 때 분수의 순서가 반대이므로, 이를 구분하여 분수를 출력합니다.
- 코드의 핵심 부분:
    
    - 대각선 라인을 따라 분수가 나열되는 패턴을 이해하고, 해당 라인과 위치를 계산하는 로직이 핵심입니다.
    - 등차수열의 합 공식(`line * (line + 1) / 2`)을 이용하여 해당 라인까지의 분수의 총 개수를 계산합니다.
    - `line`의 홀짝에 따라 분수를 출력하는 방식이 다릅니다.
- 코드의 흐름:
    
    - 사용자 입력 → while문을 통한 라인 및 위치 계산 → 분수 출력

### 풀이

```
import java.io.*;

public class _06_분수찾기 {
    public static void main(String[] args) throws IOException {
        // 사용자로부터의 입력을 받기 위한 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사용자로부터 n번째 분수 입력 받기
        int n = Integer.parseInt(br.readLine());
        int line = 0; // 대각선의 라인 번호
        int count = 0; // 해당 라인까지의 분수의 총 개수

        // n번째 분수의 위치를 찾기 위한 반복문
        while (count < n) {
            line++;
            count = line * (line + 1) / 2; // 등차수열의 합 공식을 이용한 계산
        }

        // 현재 라인에서 n번째 분수까지의 차이
        int diff = count - n;

        // line이 짝수일 때와 홀수일 때 분수의 출력 방식이 다름
        if (line % 2 == 0) {
            System.out.println((line - diff) + "/" + (1 + diff)); // 짝수 라인의 분수 출력 방식
        } else {
            System.out.println((1 + diff) + "/" + (line - diff)); // 홀수 라인의 분수 출력 방식
        }
    }
}

```

