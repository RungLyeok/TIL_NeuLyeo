# [ Programmers ]  조건 문자열 ( java ) 19 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181934

## 문제 
### 문제 설명
문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.

- 두 수가 `n`과 `m`이라면
    - ">", "=" : `n` >= `m`
    - "<", "=" : `n` <= `m`
    - ">", "!" : `n` > `m`
    - "<", "!" : `n` < `m`

두 문자열 `ineq`와 `eq`가 주어집니다. `ineq`는 "<"와 ">"중 하나고, `eq`는 "="와 "!"중 하나입니다. 그리고 두 정수 `n`과 `m`이 주어질 때, `n`과 `m`이 `ineq`와 `eq`의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
### 제한사항
- 1 ≤ `n` ≤ 100

### 입출력 예
![](https://i.imgur.com/1YE386G.png)


## 문제 풀이
### 코드 설명
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public int solution(String ineq, String eq, int n, int m)`: 부등식 조건을 비교하는 함수를 정의합니다. 이 함수는 다음 네 개의 매개변수를 받습니다.
    - `ineq`: 부등호(`<`, `>`)를 나타내는 문자열입니다.
    - `eq`: 등호(`=`, `!=`)를 나타내는 문자열입니다.
    - `n`: 비교할 숫자입니다.
    - `m`: 비교할 숫자입니다.

**2. 부등식 비교:**

- `if (ineq.equals("<"))`: `ineq`가 `<`인지 확인합니다.
    - `if (eq.equals("="))`: `eq`가 `=`인지 확인합니다.
        - `answer = (n <= m) ? 1 : 0;`: `n`이 `m`보다 작거나 같은지 비교하여 결과를 `answer`에 저장합니다.
    - `else`: `eq`가 `=`가 아닌 경우입니다.
        - `answer = (n < m) ? 1 : 0;`: `n`이 `m`보다 작은지 비교하여 결과를 `answer`에 저장합니다.
- `else`: `ineq`가 `<`가 아닌 경우입니다.
    - `if (eq.equals("="))`: `eq`가 `=`인지 확인합니다.
        - `answer = (n >= m) ? 1 : 0;`: `n`이 `m`보다 크거나 같은지 비교하여 결과를 `answer`에 저장합니다.
    - `else`: `eq`가 `=`가 아닌 경우입니다.
        - `answer = (n > m) ? 1 : 0;`: `n`이 `m`보다 큰지 비교하여 결과를 `answer`에 저장합니다.

**3. 결과 반환:**

- `return answer;`: 비교 결과를 나타내는 `answer`를 반환합니다. `answer`는 1(참) 또는 0(거짓)의 값을 가집니다.

### 풀이
#### 조건문 사용
```
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                answer = (n <= m) ? 1 : 0;
            } else {
                answer = (n < m) ? 1 : 0;
            }
        } else {
            if (eq.equals("=")) {
                answer = (n >= m) ? 1 : 0;
            } else {
                answer = (n > m) ? 1 : 0;
            }
        }
        return answer;
    }
}
```

#### 삼항 연산자 사용
```
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        return (ineq.equals("<") && eq.equals("=") ? n <= m :
                ineq. equals("<") ? n < m :
                eq.equals("=") ? n >= m :
                n > m) ? 1 : 0;
    }
}
```














