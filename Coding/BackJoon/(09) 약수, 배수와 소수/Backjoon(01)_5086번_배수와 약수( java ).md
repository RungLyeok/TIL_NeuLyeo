





# [BOJ / java] 5086 : 배수와 약수 

https://www.acmicpc.net/problem/5086

## 문제
4 × 3 = 12이다.

이 식을 통해 다음과 같은 사실을 알 수 있다.

3은 12의 약수이고, 12는 3의 배수이다.

4도 12의 약수이고, 12는 4의 배수이다.

두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.

1. 첫 번째 숫자가 두 번째 숫자의 약수이다.
2. 첫 번째 숫자가 두 번째 숫자의 배수이다.
3. 첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.

## 입력

입력은 여러 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다. 마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.

## 출력

각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.

## 예제
### 예제 입력 1

8 16
32 4
17 5
0 0

### 예제 출력 1

factor
multiple
neither


## 문제 풀이
### 코드설명
- 코드의 동작 방식:
    
    - 사용자로부터 입력을 받기 위해 `BufferedReader`와 `StringTokenizer`를 사용합니다.
    - 무한 반복문(`while(true)`) 안에서, 입력받은 두 수(a, b)에 대해 조건을 검사합니다.
    - 만약 a와 b 모두 0이면 반복문을 종료합니다(`break;`).
    - a가 b의 약수인 경우("factor"), b가 a의 배수인 경우("multiple"), 둘 다 아닐 경우("neither")를 판별하여 출력합니다.
- 코드의 핵심 부분:
    
    - `b % a == 0`는 a가 b의 약수임을 나타냅니다.
    - `a % b == 0`는 a가 b의 배수임을 나타냅니다.
    - 위 두 조건에 모두 해당하지 않으면 "neither"를 출력합니다.
- 코드의 흐름:
    
    - 사용자 입력 → 조건 검사 및 결과 출력 → 입력이 0 0이면 종료


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _01_배수와약수 {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 무한 반복문으로 입력 받기
        while (true) {
            // 입력받은 값을 공백으로 구분하여 토큰화
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 첫 번째 숫자
            int a = Integer.parseInt(st.nextToken());
            // 두 번째 숫자
            int b = Integer.parseInt(st.nextToken());

            // 입력이 0 0이면 반복문 종료
            if (a == 0 && b == 0) break;

            // a가 b의 약수인 경우
            if (b % a == 0) System.out.println("factor");
            // b가 a의 배수인 경우
            else if (a % b == 0) System.out.println("multiple");
            // 둘 다 아닌 경우
            else System.out.println("neither");
        }
    }
}
```

