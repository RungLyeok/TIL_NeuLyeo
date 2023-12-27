




# [ Programmers ] 수열과 구간 쿼리 4 ( java ) 31 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181922

## 문제 
### 문제 설명
정수 배열 `arr`와 2차원 정수 배열 `queries`이 주어집니다. `queries`의 원소는 각각 하나의 `query`를 나타내며, `[s, e, k]` 꼴입니다.

각 `query`마다 순서대로 `s` ≤ `i` ≤ `e`인 모든 `i`에 대해 `i`가 `k`의 배수이면 `arr[i]`에 1을 더합니다.

위 규칙에 따라 `queries`를 처리한 이후의 `arr`를 return 하는 solution 함수를 완성해 주세요.

### 제한사항
- 1 ≤ `arr`의 길이 ≤ 1,000
    - 0 ≤ `arr`의 원소 ≤ 1,000,000
- 1 ≤ `queries`의 길이 ≤ 1,000
    - 0 ≤ `s` ≤ `e` < `arr`의 길이
    - 0 ≤ `k` ≤ 5

### 입출력 예
![](https://i.imgur.com/KKXruIg.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

- 이 코드는 주어진 배열 `arr`에 대해 일련의 쿼리 `queries`를 처리하여 특정 조건에 맞는 인덱스의 값을 증가시키는 알고리즘을 구현합니다.

**코드의 주요 구조:**

1. 클래스 정의: `Solution` 클래스를 정의합니다.
2. 메서드 정의: `solution` 메서드를 정의합니다.

**코드의 주요 알고리즘:**

1. 쿼리 순회:
    - `queries` 배열의 각 쿼리를 순회하면서 다음을 수행합니다.
2. 범위 내 인덱스 순회:
    - 쿼리에서 지정된 범위의 인덱스(`queries[i][0]`부터 `queries[i][1]`까지)를 순회하면서 다음을 수행합니다.
3. 조건 확인 및 값 증가:
    - 현재 인덱스 `j`가 쿼리의 세 번째 요소(`queries[i][2]`)로 나누어 떨어지면 `arr[j]`를 1 증가시킵니다.
4. 결과 반환:
    - 쿼리들을 모두 처리한 후 수정된 배열 `arr`을 반환합니다.

**코드의 핵심:**

- 중첩된 `for`문을 사용하여 쿼리와 배열의 인덱스를 순회합니다.
- `%` 연산자를 사용하여 특정 조건(나누어 떨어지는 값)을 확인합니다.
- 배열의 인덱스를 통해 직접 값을 수정합니다.

### 풀이
```
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 쿼리 순회
        for (int i = 0; i < queries.length; i++) {
            // 범위 내 인덱스 순회
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                // 조건 확인 및 값 증가
                if (j % queries[i][2] == 0) {
                    arr[j]++;
                }
            }
        }

        // 수정된 배열 반환
        return arr;
    }
}
```