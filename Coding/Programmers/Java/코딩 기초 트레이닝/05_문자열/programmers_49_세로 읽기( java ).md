# [ Programmers ] 세로 읽기 ( java ) 49 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181904

## 문제 
### 문제 설명
문자열 `my_string`과 정수 `s`, `e`가 매개변수로 주어질 때, `my_string`에서 인덱스 `s`부터 인덱스 `e`까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- `my_string`은 영소문자로 이루어져 있습니다.
- 1 ≤ `m` ≤ `my_string`의 길이 ≤ 1,000
- `m`은 `my_string` 길이의 약수로만 주어집니다.
- 1 ≤ `c` ≤ `m`

### 입출력 예
![](https://i.imgur.com/IfMwSK5.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

이 코드는 주어진 문자열(my_string)에서 특정 횟수(m)마다 특정 위치(c)에 있는 문자를 추출하여 새로운 문자열을 생성하는 기능을 가진 알고리즘입니다.

**코드의 주요 구조:**

1. 클래스 정의: Solution이라는 이름의 클래스를 정의합니다.
2. 메서드 정의: solution이라는 이름의 메서드를 정의합니다. 이 메서드는 문자열(my_string)과 두 개의 정수(m, c)를 인자로 받아 처리합니다.

**코드의 주요 알고리즘:**

1. 반복문과 charAt 메서드 사용: c부터 시작하여 m씩 증가하는 위치에 있는 문자를 추출합니다.
2. 결과 반환: 추출한 문자들을 연결하여 새로운 문자열을 생성하고, 이를 반환합니다.

**코드의 핵심:**

1. 반복문을 이용해 문자열의 특정 위치에 있는 문자를 정확하게 추출합니다.
2. charAt 메서드를 이용해 문자열의 특정 위치에 있는 문자를 가져옵니다.
3. += 연산자를 이용해 추출한 문자들을 연결하여 새로운 문자열을 생성합니다.

### 풀이
```
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        // c부터 시작하여 m씩 증가하는 위치에 있는 문자를 추출
        for (int i = c; i < my_string.length() + c; i += m) {
            answer += my_string.charAt(i - 1);
        }

        // 추출한 문자들을 연결하여 새로운 문자열을 생성하고 반환
        return answer;
    }
}
```

