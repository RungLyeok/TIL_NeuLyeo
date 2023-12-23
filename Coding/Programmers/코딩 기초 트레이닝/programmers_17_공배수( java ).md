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
- `number % n == 0 && number % m == 0` 조건은 `number`가 `n`과 `m` 모두로 나누어떨어지는지를 확인

- 조건이 참이면 `1`을 반환하고, 거짓이면 `0`을 반환합니다.

### 풀이
```
class Solution {
    public int solution(int number, int n, int m) {
        int answer = (number % n == 0 && number % m == 0) ? 1 : 0 ;
        return answer;
    }
}
```














