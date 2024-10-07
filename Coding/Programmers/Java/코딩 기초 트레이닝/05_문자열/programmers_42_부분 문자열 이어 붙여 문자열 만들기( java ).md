# [ Programmers ] 부분 문자열 이어 붙여 문자열 만들기 ( java ) 42 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181911

## 문제 
### 문제 설명
길이가 같은 문자열 배열 `my_strings`와 이차원 정수 배열 `parts`가 매개변수로 주어집니다. 

`parts[i]`는 [s, e] 형태로, `my_string[i]`의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다. 

각 `my_strings`의 원소의 `parts`에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- 1 ≤ `my_strings`의 길이 = `parts`의 길이 ≤ 100
- 1 ≤ `my_strings`의 원소의 길이 ≤ 100
- `parts[i]`를 [s, e]라 할 때, 다음을 만족합니다.
    - 0 ≤ s ≤ e < `my_strings[i]`의 길이

### 입출력 예
![](https://i.imgur.com/QgCZbRp.png)


## 문제 풀이
### 코드 설명
**코드의 목적:**

- 이 코드는 주어진 문자열 배열 `my_strings`에서 각 문자열의 일부분을 추출하여 하나의 문자열로 합치는 알고리즘을 구현합니다.

**코드의 주요 구조:**

1. 클래스 정의: `Solution` 클래스를 정의합니다.
2. 메서드 정의: `solution` 메서드를 정의합니다.

**코드의 주요 알고리즘:**

1. StringBuilder 생성: 결과 문자열을 저장할 `StringBuilder` 객체 `sb`를 생성합니다.
2. 문자열 배열 순회: `my_strings`의 각 문자열 `my_strings[i]`에 대해 다음을 수행합니다.
    - `parts[i][0]`부터 `parts[i][1]`까지의 부분 문자열을 추출하여 `sb`에 추가합니다.
3. 결과 반환: `sb`에 저장된 최종 문자열을 반환합니다.

**코드의 핵심:**

- `StringBuilder`를 사용하여 문자열을 효율적으로 조작합니다.
- `append` 메서드의 세 번째 인자를 사용하여 문자열의 특정 부분을 추출합니다.
- 반복문을 사용하여 문자열 배열의 각 문자열에서 부분 문자열을 추출하고 합칩니다.

### 풀이
```
class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        // 결과 문자열 저장할 StringBuilder 생성
        StringBuilder sb = new StringBuilder();

        // 문자열 배열 순회
        for (int i = 0; i < my_strings.length; i++) {
            // 부분 문자열 추출하여 추가
            sb.append(my_strings[i], parts[i][0], parts[i][1] + 1);
        }

        // 최종 문자열 반환
        return sb.toString();
    }
}
```

