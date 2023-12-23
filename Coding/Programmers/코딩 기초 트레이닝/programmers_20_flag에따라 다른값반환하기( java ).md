# [ Programmers ] _ flag에 따라 다른 값 반환하기 ( java )
https://school.programmers.co.kr/learn/courses/30/lessons/181933

## 문제 
### 문제 설명
두 정수 `a`, `b`와 boolean 변수 `flag`가 매개변수로 주어질 때, `flag`가 true면 `a` + `b`를 false면 `a` - `b`를 return 하는 solution 함수를 작성해 주세요.
### 제한사항
- -1,000 ≤ `a`, `b` ≤ 1,000
### 입출력 예
![](https://i.imgur.com/zes9srK.png)

## 문제 풀이
### 문제 접근

1. `solution(int a, int b, boolean flag)` 메서드:

	- 세 개의 인수 `a`, `b`, `flag`를 입력받아 `flag` 값에 따라 `a`와 `b`의 합 또는 차를 계산하는 메서드입니다.

2. 삼항 연산자:

- `flag ? a + b : a - b`는 삼항 연산자로, 조건에 따라 두 값 중 하나를 선택하는 연산자입니다.
    - `flag`가 `true`이면 `a + b`를 반환합니다. (합을 계산)
    - `flag`가 `false`이면 `a - b`를 반환합니다. (차를 계산)

3. 결과 반환:

- 삼항 연산자를 통해 계산된 값을 `answer` 변수에 저장하고 반환합니다.

코드 동작 예시:

- `a = 10, b = 5, flag = true`인 경우: - `flag`가 `true`이므로 `a + b`인 15를 반환합니다.
- `a = 20, b = 10, flag = false`인 경우: - `flag`가 `false`이므로 `a - b`인 10을 반환합니다.
### 풀이
#### 삼항 연산자 사용
```
class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = flag ? a + b : a - b;
        return answer;
    }
}
```














