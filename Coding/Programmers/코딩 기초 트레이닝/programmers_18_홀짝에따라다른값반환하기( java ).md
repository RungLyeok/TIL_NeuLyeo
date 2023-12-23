# [ Programmers ] _ 홀짝에 따라 다른 값 반환하기 ( java )
https://school.programmers.co.kr/learn/courses/30/lessons/181935

## 문제 
### 문제 설명
양의 정수 `n`이 매개변수로 주어질 때, `n`이 홀수라면 `n` 이하의 홀수인 모든 양의 정수의 합을 return 하고 `n`이 짝수라면 `n` 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- 1 ≤ `n` ≤ 100
### 입출력 예
![](https://i.imgur.com/tjb11rO.png)


## 문제 풀이
### 문제 접근
1.  `solution(int n)` 메서드:

- 정수 `n`을 입력받아 `1부터 n까지의 홀수의 합` 또는 `2부터 n까지의 짝수의 제곱의 합`을 계산하는 메서드입니다.

2. 삼항 조건문:

- `n % 2 == 0` 조건으로 `n`이 짝수인지 홀수인지를 판단합니다.
    - `n`이 짝수인 경우:
        - `IntStream.rangeClosed(2, n).filter(i -> i % 2 == 0).map(i -> i * i).sum()`을 실행합니다.
    - `n`이 홀수인 경우:
        - `IntStream.rangeClosed(1, n).filter(i -> i % 2 == 1).sum()`을 실행합니다.

3.. 짝수 부분 코드:

- `IntStream.rangeClosed(2, n)`: 2부터 n까지의 정수 스트림을 생성합니다.
- `.filter(i -> i % 2 == 0)`: 짝수만 걸러냅니다.
- `.map(i -> i * i)`: 각 짝수의 제곱을 계산합니다.
- `.sum()`: 제곱의 합을 구합니다.

4. 홀수 부분 코드:

- `IntStream.rangeClosed(1, n)`: 1부터 n까지의 정수 스트림을 생성합니다.
- `.filter(i -> i % 2 == 1)`: 홀수만 걸러냅니다.
- `.sum()`: 홀수의 합을 구합니다.

예시:

- `n = 10`인 경우:
    - 짝수 부분 코드가 실행되어 `4 + 16 + 36 + 64 = 120`을 반환합니다.
- `n = 9`인 경우:
    - 홀수 부분 코드가 실행되어 `1 + 3 + 5 + 7 + 9 = 25`을 반환합니다.
### 풀이
```
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = (n % 2 == 0)
                ? IntStream.rangeClosed(2, n).filter(i -> i % 2 == 0).map(i -> i * i).sum()
                : IntStream.rangeClosed(1, n).filter(i -> i % 2 == 1).sum();
        return answer;
    }
}
```














