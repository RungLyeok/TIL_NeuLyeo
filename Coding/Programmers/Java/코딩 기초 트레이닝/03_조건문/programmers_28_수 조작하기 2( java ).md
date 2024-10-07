# [ Programmers ] 수 조작하기 2 ( java ) 28 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181925

## 문제 
### 문제 설명
정수 배열 `numLog`가 주어집니다. 처음에 `numLog[0]`에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 입력으로 받아 순서대로 다음과 같은 조작을 했다고 합시다.

- "w" : 수에 1을 더한다.
- "s" : 수에 1을 뺀다.
- "d" : 수에 10을 더한다.
- "a" : 수에 10을 뺀다.

그리고 매번 조작을 할 때마다 결괏값을 기록한 정수 배열이 `numLog`입니다. 즉, `numLog[i]`는 `numLog[0]`로부터 총 `i`번의 조작을 가한 결과가 저장되어 있습니다.

주어진 정수 배열 `numLog`에 대해 조작을 위해 입력받은 문자열을 return 하는 solution 함수를 완성해 주세요.

### 제한사항
- 2 ≤ `numLog`의 길이 ≤ 100,000
    - -100,000 ≤ `numLog[0]` ≤ 100,000
    - 1 ≤ `i` ≤ `numLog`의 길이인 모든 `i`에 대해 `|numLog[i] - numLog[i - 1]|`의 값은 1 또는 10입니다.

### 입출력 예
![](https://i.imgur.com/c8hdTJ9.png)


## 문제 풀이
### 코드 설명
**코드의 목적:**

- 주어진 정수 배열 `numLog`에서 숫자 간의 차이를 분석하여 제어 문자열을 생성하는 코드입니다.

**코드의 주요 구조:**

1. 초기화
2. 배열 순회
3. 차이 계산 및 제어 문자 추가
4. 결과 반환

**코드의 주요 알고리즘:**

1. `StringBuilder` 객체를 생성하여 제어 문자열을 저장할 준비를 합니다.
2. 배열의 각 요소를 순회하며 다음을 수행합니다.
    - 현재 요소와 다음 요소의 차이를 계산합니다.
    - 차이에 따라 다음과 같이 제어 문자를 `StringBuilder`에 추가합니다.
        - 1: 'w'
        - -1: 's'
        - 10: 'd'
        - -10: 'a'
3. `StringBuilder`에 저장된 제어 문자열을 문자열로 반환합니다.

### 풀이
```
class Solution {
    public String solution(int[] numLog) {
        // 제어 문자열을 저장할 StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();

        // 배열의 마지막 요소는 제외하고 순회
        for (int i = 0; i < numLog.length - 1; i++) {
            // 현재 요소와 다음 요소의 차이 계산
            int n = numLog[i + 1] - numLog[i];

            // 차이에 따른 제어 문자 추가
            switch (n) {
                case 1:  // 다음 요소가 1 증가한 경우
                    sb.append("w");
                    break;
                case -1:  // 다음 요소가 1 감소한 경우
                    sb.append("s");
                    break;
                case 10:  // 다음 요소가 10 증가한 경우
                    sb.append("d");
                    break;
                case -10:  // 다음 요소가 10 감소한 경우
                    sb.append("a");
                    break;
            }
        }

        // 생성된 제어 문자열 반환
        String answer = sb.toString();
        return answer;
    }
}

```