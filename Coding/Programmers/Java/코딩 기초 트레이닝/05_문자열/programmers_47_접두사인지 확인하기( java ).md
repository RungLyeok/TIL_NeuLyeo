# [ Programmers ] 접두사인지 확인하기 ( java ) 47 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181906

## 문제 
### 문제 설명
어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.  
문자열 `my_string`과 `is_prefix`가 주어질 때, `is_prefix`가 `my_string`의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- 1 ≤ `my_string`의 길이 ≤ 100
- 1 ≤ `is_prefix`의 길이 ≤ 100
- `my_string`과 `is_prefix`는 영소문자로만 이루어져 있습니다.

### 입출력 예
![](https://i.imgur.com/xfSWSbd.png)


## 문제 풀이
### 코드 설명
**코드의 목적:**

이 코드는 주어진 문자열(my_string)이 특정 문자열(is_prefix)로 시작하는지를 판별하고, 그 결과에 따라 1 또는 0을 반환하는 기능을 가진 알고리즘입니다.

**코드의 주요 구조:**

1. 클래스 정의: Solution이라는 이름의 클래스를 정의합니다.
2. 메서드 정의: solution이라는 이름의 메서드를 정의합니다. 이 메서드는 두 개의 문자열(my_string, is_prefix)을 인자로 받아 처리합니다.

**코드의 주요 알고리즘:**

1. startsWith 메서드 사용: String 클래스의 startsWith 메서드를 이용해 my_string이 is_prefix로 시작하는지 여부를 확인합니다.
2. 결과 반환: my_string이 is_prefix로 시작하면 1을 반환하고, 그렇지 않으면 0을 반환합니다.

**코드의 핵심:**

1. startsWith 메서드를 이용해 문자열이 특정 접두사로 시작하는지 효과적으로 판별합니다.
2. 삼항 연산자를 이용해 조건에 따른 반환값을 간결하게 처리합니다.

### 풀이
```
class Solution {
    public int solution(String my_string, String is_prefix) {
        // my_string이 is_prefix로 시작하는지 확인
        return my_string.startsWith(is_prefix) ? 1 : 0;  // 삼항 연산자를 사용하여 조건에 따라 반환값 결정
    }
}
```

