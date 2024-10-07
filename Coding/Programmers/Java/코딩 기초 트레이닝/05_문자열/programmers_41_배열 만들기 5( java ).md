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

- 이 코드는 주어진 문자열 배열 `intStrs`에서 특정 조건을 만족하는 숫자들을 추출하여 정수 배열로 반환하는 알고리즘을 구현합니다.

**코드의 주요 구조:**

1. Import: `ArrayList` 클래스를 import 합니다.
2. 클래스 정의: `Solution` 클래스를 정의합니다.
3. 메서드 정의: `solution` 메서드를 정의합니다.

**코드의 주요 알고리즘:**

1. 리스트 생성: 조건을 만족하는 숫자를 저장할 `ArrayList` 객체 `list`를 생성합니다.
2. 문자열 배열 순회: `intStrs`의 각 문자열 `item`에 대해 다음을 수행합니다.
    - 문자열의 `s`번째 인덱스부터 `s + l - 1`번째 인덱스까지의 부분 문자열을 숫자로 변환하여 `n`에 저장합니다.
    - `n`이 `k`보다 크면 `list`에 추가합니다.
3. 결과 반환: `list`의 요소들을 IntStream으로 변환하고 `toArray()` 메서드를 사용하여 정수 배열로 반환합니다.

**코드의 핵심:**

- `substring` 메서드를 사용하여 문자열에서 부분 문자열을 추출합니다.
- `Integer.parseInt` 메서드를 사용하여 문자열을 숫자로 변환합니다.
- 조건문을 사용하여 조건을 만족하는 숫자를 필터링합니다.
- `stream`과 `mapToInt`를 사용하여 ArrayList를 정수 배열로 변환합니다.

### 풀이
```
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        // 조건을 만족하는 숫자를 저장할 ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // 문자열 배열 순회
        for (String item : intStrs) {
            // 문자열에서 특정 부분 문자열 추출하여 숫자로 변환
            int n = Integer.parseInt(item.substring(s, s + l));

            // 조건 만족 여부 확인
            if (k < n) {
                list.add(n);
            }
        }

        // ArrayList를 정수 배열로 변환하여 반환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
```

