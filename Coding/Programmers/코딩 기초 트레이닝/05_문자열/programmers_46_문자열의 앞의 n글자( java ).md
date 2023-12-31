# [ Programmers ] 문자열의 앞의 n글자 ( java ) 46 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181907

## 문제 
### 문제 설명
문자열 `my_string`과 정수 `n`이 매개변수로 주어질 때, `my_string`의 앞의 `n`글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- `my_string`은 숫자와 알파벳으로 이루어져 있습니다.
- 1 ≤ `my_string`의 길이 ≤ 1,000
- 1 ≤ `n` ≤ `my_string`의 길이

### 입출력 예
![](https://i.imgur.com/tmjqvZv.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

이 코드는 주어진 문자열 **my_string**에서 시작부터 **n**번째 인덱스까지의 부분 문자열을 추출하는 알고리즘을 구현합니다.

**코드의 주요 구조:**

- 클래스 정의: **Solution** 클래스를 정의합니다.
- 메서드 정의: **solution** 메서드를 정의합니다. 이 메서드는 **String** 타입을 반환합니다.

**코드의 주요 알고리즘:**

- **substring** 메서드 사용: **my_string**의 시작부터 **n**번째 인덱스까지의 부분 문자열을 **substring** 메서드로 추출합니다.
- 결과 반환: 추출한 부분 문자열을 반환합니다.

**코드의 핵심:**

- **substring** 메서드를 사용하여 문자열의 특정 부분 문자열을 효율적으로 추출합니다.

### 풀이
```
class Solution {
    public String solution(String my_string, int n) {
        // my_string의 시작부터 n번째 인덱스까지의 부분 문자열을 추출하여 반환
        return my_string.substring(0, n);
    }
}
```

