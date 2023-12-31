# [ Programmers ] 조건에 맞게 수열 변환하기 2 ( java ) 72 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181881

## 문제 설명

정수 배열 `arr`가 주어집니다. `arr`의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다.

이러한 작업을 `x`번 반복한 결과인 배열을 `arr(x)`라고 표현했을 때, `arr(x) = arr(x + 1)`인 `x`가 항상 존재합니다. 이러한 `x` 중 가장 작은 값을 return 하는 solution 함수를 완성해 주세요.

단, 두 배열에 대한 "="는 두 배열의 크기가 서로 같으며, 같은 인덱스의 원소가 각각 서로 같음을 의미합니다.


### 제한사항

- 1 ≤ `arr`의 길이 ≤ 1,000,000
    - 1 ≤ `arr`의 원소의 값 ≤ 100


### 입출력 예

|arr|result|
|---|---|
|[1, 2, 3, 100, 99, 98]|5|


### 입출력 예 설명

입출력 예 #1

- 위 작업을 반복하면 다음과 같이 `arr`가 변합니다.

|반복 횟수|arr|
|---|---|
|0|[1, 2, 3, 100, 99, 98]|
|1|[3, 2, 7, 50, 99, 49]|
|2|[7, 2, 15, 25, 99, 99]|
|3|[15, 2, 31, 51, 99, 99]|
|4|[31, 2, 63, 51, 99, 99]|
|5|[63, 2, 63, 51, 99, 99]|
|6|[63, 2, 63, 51, 99, 99]|

- 이후로 `arr`가 변하지 않으며, `arr(5) = arr(6)`이므로 5를 return 합니다.

## 문제 풀이
### 코드 설명

- 코드의 목적:
    
    - 이 코드는 주어진 배열에 대해 특정한 변환을 수행하고 있습니다.
    - 이 변환은 주어진 조건에 따라 배열의 각 요소에 대해 수행됩니다.
    - 변환은 더 이상 가능하지 않을 때까지 반복적으로 수행됩니다.
    - 이 변환 과정이 총 몇 번 반복되었는지를 측정하고, 그 횟수를 반환하는 것이 이 코드의 최종 목적입니다.
- 코드 주요 구조:
    
    - 이 코드는 주어진 배열을 복사하여 새로운 배열을 생성하는 부분으로 시작합니다.
    - 다음으로, 원래 배열의 각 요소에 대해 특정 조건에 따른 변환을 수행합니다.
    - 이 변환 후의 배열과 원본 배열을 비교하여, 두 배열이 동일한지 확인합니다.
    - 만약 두 배열이 동일하다면, 변환 과정을 중단합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java의 스트림 API를 활용하여 배열의 각 요소에 대한 변환을 수행합니다.
    - 배열의 각 요소가 50 이상이고 짝수인 경우, 해당 요소는 2로 나눠집니다.
    - 반대로, 요소가 50 미만이고 홀수인 경우, 해당 요소는 2를 곱하고 1을 더하는 연산을 수행합니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 변환 전후의 배열을 비교하는 부분입니다.
    - 이 비교를 통해 변환이 더 이상 일어나지 않는 경우를 감지하고, 그 시점에서 변환 과정을 중단합니다.
    - 이 변환 과정이 총 몇 번 반복되었는지를 계산하고 그 횟수를 반환하는 것이 이 코드의 핵심입니다.

### 풀이
```
import java.util.Arrays;

class Solution {
    // 정수 배열을 입력받아 변환 과정을 거친 후, 변환 횟수를 반환하는 메소드
    public int solution(int[] arr) {
        int answer = 0;

        // 변환 과정이 끝날 때까지 반복
        while (true) {
            // 원본 배열 복사
            int[] copy = Arrays.copyOf(arr, arr.length);

            // 배열의 각 요소를 조건에 따라 변환
            arr = Arrays.stream(arr)
                    .map(n -> (n >= 50 && n % 2 == 0) ? n / 2 :    // 50 이상 짝수는 2로 나눔
                            (n < 50 && n % 2 == 1) ? n * 2 + 1 : n) // 50 미만 홀수는 2배 후 1 더함
                    .toArray();

            // 변환 전후의 배열이 동일하다면 반복 종료
            if (Arrays.equals(arr, copy)) {
                break;
            }

            // 변환 횟수 증가
            answer++;
        }

        // 변환 횟수 반환
        return answer;
    }
}
```

