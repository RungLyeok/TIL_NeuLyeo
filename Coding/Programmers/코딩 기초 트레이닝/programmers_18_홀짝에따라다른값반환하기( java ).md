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
- `number % n == 0 && number % m == 0` 조건은 `number`가 `n`과 `m` 모두로 나누어떨어지는지를 확인

- 조건이 참이면 `1`을 반환하고, 거짓이면 `0`을 반환합니다.

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














