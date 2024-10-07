# [ Programmers ] 문자열의 뒤의 n글자 ( java ) 43 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181910

## 문제 
### 문제 설명
문자열 `my_string`과 정수 `n`이 매개변수로 주어질 때, `my_string`의 뒤의 `n`글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- `my_string`은 숫자와 알파벳으로 이루어져 있습니다.
- 1 ≤ `my_string`의 길이 ≤ 1,000
- 1 ≤ `n` ≤ `my_string`의 길이

### 입출력 예
![](https://i.imgur.com/sHtGAV1.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

- 이 코드는 주어진 문자열 `my_string`에서 끝에서부터 `n`개의 문자를 추출하여 새로운 문자열로 만드는 알고리즘을 구현합니다.

**코드의 주요 구조:**

1. 클래스 정의: `Solution` 클래스를 정의합니다.
2. 메서드 정의: `solution` 메서드를 정의합니다.

**코드의 주요 알고리즘:**

1. 시작 인덱스 계산: 추출할 부분 문자열의 시작 인덱스 `sn`을 계산합니다.
2. 끝 인덱스 계산: 추출할 부분 문자열의 끝 인덱스 `en`을 계산합니다.
3. 부분 문자열 추출: `my_string`의 `sn`부터 `en - 1`까지의 부분 문자열을 `substring` 메서드로 추출하여 반환합니다.

**코드의 핵심:**

- `substring` 메서드를 사용하여 문자열에서 특정 부분 문자열을 추출합니다.
- 문자열의 길이에서 `n`을 빼서 끝에서부터 `n`개의 문자를 추출할 수 있도록 시작 인덱스를 계산합니다.

### 풀이
```
class Solution {
    public String solution(String my_string, int n) {
        // 추출할 부분 문자열의 시작 인덱스
        int sn = my_string.length() - n;
        // 추출할 부분 문자열의 끝 인덱스
        int en = sn + n;

        // 부분 문자열 추출
        return my_string.substring(sn, en);  // my_string의 sn부터 en - 1까지의 부분 문자열 추출
    }
}
```

