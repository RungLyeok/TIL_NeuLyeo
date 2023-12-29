# [ Programmers ] 배열 만들기 5 ( java ) 41 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181912

## 문제 
### 문제 설명
문자열 배열 `intStrs`와 정수 `k`, `s`, `l`가 주어집니다. `intStrs`의 원소는 숫자로 이루어져 있습니다.

배열 `intStrs`의 각 원소마다 `s`번 인덱스에서 시작하는 길이 `l`짜리 부분 문자열을 잘라내 정수로 변환합니다. 이때 변환한 정수값이 `k`보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.

### 제한사항
- 0 ≤ `s` < 100
- 1 ≤ `l` ≤ 8
- 10l - 1 ≤ `k` < 10l
- 1 ≤ `intStrs`의 길이 ≤ 10,000
    - `s` + `l` ≤ `intStrs`의 원소의 길이 ≤ 120

### 입출력 예
![](https://i.imgur.com/7FNqDFZ.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

- 이 코드는 주어진 문자열 `my_string`을 복사한 뒤, `queries`에 있는 쿼리들을 차례대로 적용하여 문자열을 변형하는 알고리즘을 구현합니다.

**코드의 주요 구조:**

1. 클래스 정의: `Solution` 클래스를 정의합니다.
2. 메서드 정의: `solution` 메서드를 정의합니다.

**코드의 주요 알고리즘:**

1. 문자열 복사: `my_string`을 복사하여 `StringBuilder` 객체 `answer`에 저장합니다.
2. 쿼리 순회: `queries`의 각 쿼리 `q`에 대해 다음을 수행합니다.
    - 쿼리의 시작 인덱스 `a`와 끝 인덱스 `b`를 추출합니다.
    - `answer`의 `a`부터 `b`까지의 부분 문자열을 뒤집어 `sb`에 저장합니다.
    - `answer`의 `a`부터 `b`까지의 부분 문자열을 `sb`의 문자열로 교체합니다.
3. 결과 반환: `answer`에 저장된 최종 문자열을 반환합니다.

**코드의 핵심:**

- `StringBuilder`를 사용하여 문자열을 효율적으로 조작합니다.
- `substring` 메서드를 사용하여 부분 문자열을 추출합니다.
- `reverse` 메서드를 사용하여 문자열을 뒤집습니다.
- `replace` 메서드를 사용하여 문자열의 일부를 교체합니다.

### 풀이
```
class Solution {
    public String solution(String my_string, int[][] queries) {
        // my_string 복사
        StringBuilder answer = new StringBuilder(my_string);

        // 쿼리 순회
        for (int[] q : queries) {
            int a = q[0];
            int b = q[1];

            // 부분 문자열 뒤집기
            StringBuilder sb = new StringBuilder(answer.substring(a, b + 1)).reverse();

            // 뒤집은 부분 문자열로 교체
            answer.replace(a, b + 1, sb.toString());
        }

        // 최종 문자열 반환
        return answer.toString();
    }
}
```

