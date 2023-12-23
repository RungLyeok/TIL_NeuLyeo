# [ Programmers ] _ 공배수 ( java )

https://school.programmers.co.kr/learn/courses/30/lessons/181936
## 문제 
### 문제 설명
정수 `number`와 `n`, `m`이 주어집니다. `number`가 `n`의 배수이면서 `m`의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

### 제한사항
- 10 ≤ `number` ≤ 100
- 2 ≤ `n`, `m` < 10
### 입출력 예
  ![](https://i.imgur.com/8bu2XOK.png)

## 문제 풀이
### 문제 접근
1. `solution(int number, int n, int m)` 메서드:

- 세 개의 정수 `number`, `n`, `m`을 입력받아 `number`가 `n`과 `m`으로 모두 나누어떨어지는지(공배수) 여부를 확인하는 메서드입니다.

2. 삼항 조건문:. 
- `number % n == 0 && number % m == 0` 조건으로 `number`가 `n`과 `m`으로 모두 나누어떨어지는지 판단합니다.
    - 나누어떨어지면 `1`을 반환합니다.
    - 나누어떨어지지 않으면 `0`을 반환합니다.

코드 동작 예시:

- `number = 12`, `n = 3`, `m = 4`인 경우:
    - `12`는 `3`과 `4`로 모두 나누어떨어지므로 `1`을 반환합니다.
- `number = 15`, `n = 3`, `m = 4`인 경우:
    - `15`는 `4`로 나누어떨어지지 않으므로 `0`을 반환합니다.

### 풀이
```
class Solution {
    public int solution(int number, int n, int m) {
        int answer = (number % n == 0 && number % m == 0) ? 1 : 0 ;
        return answer;
    }
}
```














