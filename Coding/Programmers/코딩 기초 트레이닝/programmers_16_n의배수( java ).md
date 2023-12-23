# [ Programmers ] _ n의배수 ( java )

https://school.programmers.co.kr/learn/courses/30/lessons/181937
## 문제 
### 문제 설명
정수 `num`과 `n`이 매개 변수로 주어질 때, `num`이 `n`의 배수이면 1을 return `n`의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.

### 제한사항
- 2 ≤ `num` ≤ 100
- 2 ≤ `n` ≤ 9
### 입출력 예
  ![](https://i.imgur.com/RAwTgJT.png)

## 문제 풀이
### 문제 접근

1. `solution(int num, int n)` 메서드:

- 두 개의 정수 `num`과 `n`을 입력받아 `num`이 `n`으로 나누어떨어지는지(배수) 여부를 확인하는 메서드입니다.

2. 삼항 조건문:

- `num % n == 0` 조건으로 `num`이 `n`으로 나누어떨어지는지 판단합니다.
    - 나누어떨어지면 `1`을 반환합니다.
    - 나누어떨어지지 않으면 `0`을 반환합니다.

코드 동작 예시:

- `num = 12`, `n = 4`인 경우:
    - `12`는 `4`로 나누어떨어지므로 `1`을 반환합니다.
- `num = 15`, `n = 4`인 경우:
    - `15`는 `4`로 나누어떨어지지 않으므로 `0`을 반환합니다.
### 풀이
```
class Solution {
    public int solution(int num, int n) {
        int answer = (num % n == 0) ? 1 : 0;
        return answer;
    }
}
```














