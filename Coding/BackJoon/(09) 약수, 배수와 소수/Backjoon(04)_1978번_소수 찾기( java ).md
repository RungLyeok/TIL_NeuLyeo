





# [BOJ / java] 1978 : 소수 찾기 

https://www.acmicpc.net/problem/1978

## 문제

주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

## 입력

첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

## 출력

주어진 수들 중 소수의 개수를 출력한다.

## 예제
### 예제 입력 1 

4
1 3 5 7

### 예제 출력 1 

3

## 문제 풀이
### 코드설명
-  코드의 동작 방식:
	-  표준 입력으로부터 한 줄씩 입력을 받습니다.
	-  첫 번째 줄에는 숫자의 개수 `n`을 입력받습니다.
	-  두 번째 줄에는 공백으로 구분된 `n`개의 숫자를 입력받습니다.
	-  각 숫자가 소수인지 판별하여 소수의 개수를 셉니다.
	-  결과를 출력합니다.

-  코드의 핵심 부분:
	-  표준 입력을 받기 위해 `BufferedReader`를 사용.
	-  입력된 숫자들을 공백으로 구분하여 배열에 저장.
	-  `isPrime` 메소드를 통해 소수 판별.
	-  소수 개수를 세어 출력.

- 코드의 흐름:
	- 입력 → 숫자 개수 파악 → 숫자들 입력 → 소수 판별 → 소수 개수 출력

### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 표준 입력을 받습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄에서 숫자의 개수를 입력받아 정수로 변환합니다.
        int n = Integer.parseInt(br.readLine());
        // 소수의 개수를 세기 위한 변수를 초기화합니다.
        int count = 0;
        // 두 번째 줄에서 공백으로 구분된 숫자들을 입력받아 배열로 저장합니다.
        String[] numbers = br.readLine().split(" ");

        // 각 숫자에 대해 소수인지 판별합니다.
        for (String num : numbers) {
            // 문자열을 정수로 변환합니다.
            int a = Integer.parseInt(num);
            // 소수일 경우 count를 증가시킵니다.
            if (isPrime(a)) count++;
        }

        // 최종적으로 소수의 개수를 출력합니다.
        System.out.println(count);
    }

    // 주어진 숫자가 소수인지 판별하는 메소드입니다.
    public static boolean isPrime(int a) {
        // 2보다 작은 숫자는 소수가 아닙니다.
        if (a < 2) return false;

        // 2부터 해당 숫자의 제곱근까지 나누어 떨어지는지 확인합니다.
        for (int i = 2; i * i <= a; i++) {
            // 나누어 떨어질 경우 소수가 아닙니다.
            if (a % i == 0) return false;
        }

        // 위 조건을 모두 통과하면 소수입니다.
        return true;
    }
}
```

