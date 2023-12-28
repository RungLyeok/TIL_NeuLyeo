# [ Programmers ] 간단한 논리 연산 ( java ) 36 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181917

## 문제 
### 문제 설명
boolean 변수 `x1`, `x2`, `x3`, `x4`가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.

- (`x1` ∨ `x2`) ∧ (`x3` ∨ `x4`)

### 제한사항

### 입출력 예
![](https://i.imgur.com/09RcBpB.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

- 이 코드는 네 개의 불리언 값 `x1`, `x2`, `x3`, `x4`를 받아 특정 조건을 만족하는지 여부를 확인하는 알고리즘을 구현합니다.

**코드의 주요 구조:**

1. 클래스 정의: `Solution` 클래스를 정의합니다.
2. 메서드 정의: `solution` 메서드를 정의합니다.

**코드의 주요 알고리즘:**

1. 조건 확인:
    - `(x1 || x2) && (x3 || x4)`라는 조건을 통해 다음을 확인합니다.
        - `x1` 또는 `x2` 중 적어도 하나가 참이어야 하고,
        - `x3` 또는 `x4` 중 적어도 하나가 참이어야 합니다.
2. 결과 반환:
    - 조건이 참이면 `true`, 그렇지 않으면 `false`를 반환합니다.

**코드의 핵심:**

- 논리 연산자 `||`(OR)와 `&&`(AND)를 사용하여 조건을 구성합니다.
- 삼항 연산자 (`? :`)를 사용하여 조건의 결과에 따라 `true` 또는 `false`를 반환합니다.

### 풀이
```
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        // 조건 확인: (x1 또는 x2) && (x3 또는 x4)
        boolean answer = (x1 || x2) && (x3 || x4) ? true : false;

        // 결과 반환
        return answer;
    }
}

```