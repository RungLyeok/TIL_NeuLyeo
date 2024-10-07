# [ Programmers ] 수 조작하기1 ( java ) 27 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181926

## 문제 
### 문제 설명
정수 `n`과 문자열 `control`이 주어집니다. `control`은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, `control`의 앞에서부터 순서대로 문자에 따라 `n`의 값을 바꿉니다.

- "w" : `n`이 1 커집니다.
- "s" : `n`이 1 작아집니다.
- "d" : `n`이 10 커집니다.
- "a" : `n`이 10 작아집니다.

위 규칙에 따라 `n`을 바꿨을 때 가장 마지막에 나오는 `n`의 값을 return 하는 solution 함수를 완성해 주세요.

### 제한사항
- -100,000 ≤ `n` ≤ 100,000
- 1 ≤ `control`의 길이 ≤ 100,000
    - `control`은 알파벳 소문자 "w", "a", "s", "d"로 이루어진 문자열입니다.

### 입출력 예
![](https://i.imgur.com/S9qltuX.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

- 주어진 숫자 `n`과 제어 문자열 `control`에 따라 숫자를 조작한 결과를 반환하는 코드입니다.

**코드의 주요 구조:**

1. 초기화
2. 제어 문자열 순회
3. 제어 문자에 따른 조작
4. 결과 반환

**코드의 주요 알고리즘:**

1. `answer` 변수에 초기 숫자 `n`을 저장합니다.
2. 제어 문자열 `control`의 각 문자를 순회합니다.
3. 각 문자에 따라 다음과 같이 `answer` 값을 조작합니다.
    - 'w': 1 증가
    - 's': 1 감소
    - 'd': 10 증가
    - 'a': 10 감소
4. 조작된 `answer` 값을 반환합니다.

### 풀이
```
class Solution {
    public int solution(int n, String control) {
        // 결과를 저장할 변수
        int answer = n;

        // 제어 문자열의 각 문자를 순회
        for (char c : control.toCharArray()) {
            // 제어 문자에 따른 조작
            switch (c) {
                case 'w':  // 1 증가
                    answer += 1;
                    break;
                case 's':  // 1 감소
                    answer -= 1;
                    break;
                case 'd':  // 10 증가
                    answer += 10;
                    break;
                case 'a':  // 10 감소
                    answer -= 10;
                    break;
            }
        }

        // 조작된 숫자 반환
        return answer;
    }
}
```