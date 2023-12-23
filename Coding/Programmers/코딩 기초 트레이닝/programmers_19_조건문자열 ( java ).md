# [ Programmers ] _ 조건 문자열 ( java )
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
1. `solution(String ineq, String eq, int n, int m)` 메서드:

	- 4개의 인수(`ineq`, `eq`, `n`, `m`)를 입력받아 불리언 표현식의 결과를 0 또는 1로 반환하는 메서드입니다.

2. 삼항 연산자:

	- 중첩된 삼항 연산자를 사용하여 다양한 조건을 한 줄에 표현합니다.

3. 조건문:

	- `ineq.equals("<") && eq.equals("=")`: `ineq`이 `"<"`이고 `eq`가 `"="`이면 `n <= m` 조건을 비교합니다.
	- `ineq.equals("<")`: 그 외의 경우 `ineq`이 `"<"`이면 `n < m` 조건을 비교합니다.
	- `eq.equals("="):` 그 외의 경우 `eq`가 `"="`이면 `n >= m` 조건을 비교합니다.
	- 위의 모든 조건에 해당하지 않으면 `n > m` 조건을 비교합니다.

4. 결과 반환:

	- 비교 결과가 `true`이면 `1`을 반환하고, `false`이면 `0`을 반환합니다.

**코드 동작 예시:

- `ineq = "<", eq = "=", n = 10, m = 20`인 경우:
    - `n <= m` 조건이 `true`이므로 `1`을 반환합니다.
- `ineq = "<", eq = "", n = 15, m = 10`인 경우:
    - `n < m` 조건이 `false`이므로 `0`을 반환합니다.
- `ineq = ">", eq = "=", n = 30, m = 20`인 경우:
    - `n >= m` 조건이 `true`이므로 `1`을 반환합니다.
- `ineq = ">", eq = "", n = 10, m = 20`인 경우:
    - `n > m` 조건이 `false`이므로 `0`을 반환합니다.

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














