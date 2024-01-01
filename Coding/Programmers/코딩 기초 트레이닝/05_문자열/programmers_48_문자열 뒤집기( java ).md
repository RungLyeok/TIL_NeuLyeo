# [ Programmers ] 문자열 뒤집기 ( java ) 48 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181905

## 문제 
### 문제 설명
문자열 `my_string`과 정수 `s`, `e`가 매개변수로 주어질 때, `my_string`에서 인덱스 `s`부터 인덱스 `e`까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- `my_string`은 숫자와 알파벳으로만 이루어져 있습니다.
- 1 ≤ `my_string`의 길이 ≤ 1,000
- 0 ≤ `s` ≤ `e` < `my_string`의 길이

### 입출력 예
![](https://i.imgur.com/tAV9z7P.png)



## 문제 풀이
### 코드 설명
**코드의 목적:**

이 코드는 주어진 문자열(my_string)에서 시작 인덱스(s)부터 종료 인덱스(e)까지의 부분 문자열을 뒤집는 기능을 가진 알고리즘입니다.

**코드의 주 구조:**

1. 클래스 정의: Solution이라는 이름의 클래스를 정의합니다.
2. 메서드 정의: solution이라는 이름의 메서드를 정의합니다. 이 메서드는 문자열(my_string)과 두 개의 정수(s, e)를 인자로 받아 처리합니다.

**코드의 주요 알고리즘:**

1. 부분 문자열 추출 및 뒤집기: 시작 인덱스(s)부터 종료 인덱스(e)까지의 부분 문자열을 추출하고, StringBuilder를 이용해 이를 뒤집습니다.
2. 결과 반환: 뒤집은 부분 문자열을 원래 문자열에 다시 삽입하고, 이를 반환합니다.

**코드의 핵심:**

1. substring 메서드를 이용해 문자열의 부분 문자열을 추출합니다.
2. StringBuilder의 reverse 메서드를 이용해 문자열을 뒤집습니다.
3. 뒤집은 부분 문자열을 원래 위치에 다시 삽입합니다.

### 풀이
```
class Solution {
    public String solution(String my_string, int s, int e) {
        // s부터 e까지의 부분 문자열을 추출하고 뒤집음
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1)).reverse();

        // 뒤집은 부분 문자열을 원래 문자열에 다시 삽입하고 반환
        return my_string.substring(0, s) + sb + my_string.substring(e + 1);
    }
}
```

