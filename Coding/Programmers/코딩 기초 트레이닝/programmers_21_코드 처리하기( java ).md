# [ Programmers ] _ flag에 따라 다른 값 반환하기 ( java )
https://school.programmers.co.kr/learn/courses/30/lessons/181932

## 문제 
### 문제 설명
문자열 `code`가 주어집니다.  
`code`를 앞에서부터 읽으면서 만약 문자가 "1"이면 `mode`를 바꿉니다. `mode`에 따라 `code`를 읽어가면서 문자열 `ret`을 만들어냅니다.

`mode`는 0과 1이 있으며, `idx`를 0 부터 `code의 길이 - 1` 까지 1씩 키워나가면서 `code[idx]`의 값에 따라 다음과 같이 행동합니다.

- `mode`가 0일 때
    - `code[idx]`가 "1"이 아니면 `idx`가 짝수일 때만 `ret`의 맨 뒤에 `code[idx]`를 추가합니다.
    - `code[idx]`가 "1"이면 `mode`를 0에서 1로 바꿉니다.
- `mode`가 1일 때
    - `code[idx]`가 "1"이 아니면 `idx`가 홀수일 때만 `ret`의 맨 뒤에 `code[idx]`를 추가합니다.
    - `code[idx]`가 "1"이면 `mode`를 1에서 0으로 바꿉니다.

문자열 `code`를 통해 만들어진 문자열 `ret`를 return 하는 solution 함수를 완성해 주세요.

단, 시작할 때 `mode`는 0이며, return 하려는 `ret`가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.
### 제한사항
- 1 ≤ `code`의 길이 ≤ 100,000
    - `code`는 알파벳 소문자 또는 "1"로 이루어진 문자열입니다.
### 입출력 예
![](https://i.imgur.com/w7z0dUW.png)

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














