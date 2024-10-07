




# [ Programmers ] 수열과 구간 쿼리 3 ( java ) 29 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181924

## 문제 
### 문제 설명
정수 배열 `arr`와 2차원 정수 배열 `queries`이 주어집니다. `queries`의 원소는 각각 하나의 `query`를 나타내며, `[i, j]` 꼴입니다.

각 `query`마다 순서대로 `arr[i]`의 값과 `arr[j]`의 값을 서로 바꿉니다.

위 규칙에 따라 `queries`를 처리한 이후의 `arr`를 return 하는 solution 함수를 완성해 주세요.

### 제한사항
- 1 ≤ `arr`의 길이 ≤ 1,000
    - 0 ≤ `arr`의 원소 ≤ 1,000,000
- 1 ≤ `queries`의 길이 ≤ 1,000
    - 0 ≤ `i` < `j` < `arr`의 길이

### 입출력 예
![](https://i.imgur.com/cHbWgs3.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

- 주어진 정수 배열 `arr`에서 여러 개의 위치 교환 쿼리를 수행하는 코드입니다.

**코드의 주요 구조:**

1. 쿼리 순회
2. 위치 교환
3. 결과 반환

**코드의 주요 알고리즘:**

1. `queries` 배열에 포함된 각 쿼리를 순회합니다.
2. 각 쿼리에서 다음을 수행합니다.
    - 쿼리에서 지정한 두 위치의 값을 서로 교환합니다.
3. 모든 쿼리를 수행한 후 배열 `arr`을 반환합니다.

### 풀이
```
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 각 쿼리를 순회하며 위치 교환 수행
        for (int[] query : queries) {
            int i = query[0];  // 교환할 첫 번째 위치
            int j = query[1];  // 교환할 두 번째 위치

            // 임시 변수를 사용하여 두 위치의 값 교환
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        // 변경된 배열 반환
        return arr;
    }
}
```