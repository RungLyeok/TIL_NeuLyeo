# [ Programmers ] 접미사인지 확인하기 ( java ) 45 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181908

## 문제 
### 문제 설명
어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.  

문자열 `my_string`과 `is_suffix`가 주어질 때, `is_suffix`가 `my_string`의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- 1 ≤ `my_string`의 길이 ≤ 100
- 1 ≤ `is_suffix`의 길이 ≤ 100
- `my_string`과 `is_suffix`는 영소문자로만 이루어져 있습니다.

### 입출력 예
![](https://i.imgur.com/FNsHryZ.png)


## 문제 풀이
### 코드 설명
**코드의 목적:**

- 이 코드는 주어진 문자열 `my_string`이 `is_suffix`로 끝나는지 여부를 확인하여 1 또는 0을 반환하는 알고리즘을 구현합니다.

**코드의 주요 구조:**

1. 클래스 정의: `Solution` 클래스를 정의합니다.
2. 메서드 정의: `solution` 메서드를 정의합니다.

**코드의 주요 알고리즘:**

1. `endsWith` 메서드 사용: `my_string`이 `is_suffix`로 끝나는지 여부를 `endsWith` 메서드로 확인합니다.
2. 결과 반환:
    - `my_string`이 `is_suffix`로 끝나면 1을 반환합니다.
    - 그렇지 않으면 0을 반환합니다.

**코드의 핵심:**

- `endsWith` 메서드를 사용하여 문자열이 특정 접미사로 끝나는지 여부를 효율적으로 확인합니다.
- 삼항 연산자를 사용하여 조건에 따라 1 또는 0을 반환합니다.

### 풀이
```
class Solution {
    public int solution(String my_string, String is_suffix) {
        // my_string이 is_suffix로 끝나는지 확인
        return my_string.endsWith(is_suffix) ? 1 : 0;  // 삼항 연산자를 사용한 조건부 반환
    }
}
```

