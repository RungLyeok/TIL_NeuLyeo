




# [ Programmers ] 수열과 구간 쿼리 2 ( java ) 30 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181923

## 문제 
### 문제 설명
정수 배열 `arr`와 2차원 정수 배열 `queries`이 주어집니다. `queries`의 원소는 각각 하나의 `query`를 나타내며, `[s, e, k]` 꼴입니다.

각 `query`마다 순서대로 `s` ≤ `i` ≤ `e`인 모든 `i`에 대해 `k`보다 크면서 가장 작은 `arr[i]`를 찾습니다.

각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.  
단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.

### 제한사항
- 1 ≤ `arr`의 길이 ≤ 1,000
    - 0 ≤ `arr`의 원소 ≤ 1,000,000
- 1 ≤ `queries`의 길이 ≤ 1,000
    - 0 ≤ `s` ≤ `e` < `arr`의 길이
    - 0 ≤ `k` ≤ 1,000,000

### 입출력 예
![](https://i.imgur.com/C3IFq0C.png)


## 문제 풀이
### 코드 설명
**코드의 목적:**

- 주어진 정수 배열 `arr`에서 여러 개의 쿼리에 대한 결과를 찾는 코드입니다. 각 쿼리는 배열의 특정 범위에서 특정 값보다 크면서 가장 작은 값을 찾도록 요구합니다.

**코드의 주요 구조:**

1. 결과 배열 생성
2. 쿼리 순회
3. 각 쿼리 처리
4. 결과 배열 반환

**코드의 주요 알고리즘:**

1. 쿼리의 수만큼 결과를 저장할 `answer` 배열을 생성합니다.
2. 각 쿼리를 순회하며 다음을 수행합니다.
    - 쿼리에서 지정한 범위 `s`부터 `e`까지 배열을 순회합니다.
    - 각 요소가 쿼리의 값 `k`보다 크고 현재까지 찾은 가장 작은 값 `tmp`보다 작으면 `tmp`를 갱신합니다.
    - 쿼리에 해당하는 값이 없는 경우 `answer` 배열에 -1을 저장합니다.
3. 모든 쿼리에 대한 결과가 저장된 `answer` 배열을 반환합니다.

### 풀이
```
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 쿼리 결과를 저장할 배열
        int[] answer = new int[queries.length];

        // 각 쿼리를 순회하며 처리
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];  // 쿼리 범위 시작
            int e = queries[i][1];  // 쿼리 범위 끝
            int k = queries[i][2];  // 기준 값
            int tmp = Integer.MAX_VALUE;  // 현재까지 찾은 가장 작은 값

            // 쿼리 범위 내에서 기준 값보다 크면서 가장 작은 값 찾기
            for (int j = s; j <= e; j++) {
                if (k < arr[j] && arr[j] < tmp) {
                    tmp = arr[j];
                }
            }

            // 결과 저장
            answer[i] = (tmp == Integer.MAX_VALUE) ? -1 : tmp;
        }

        // 결과 배열 반환
        return answer;
    }
}

```