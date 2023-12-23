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
### 문제 접근

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














