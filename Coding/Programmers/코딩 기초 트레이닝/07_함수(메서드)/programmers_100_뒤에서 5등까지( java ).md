# [ Programmers ] 뒤에서 5등까지 ( java ) 100 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181853

## 문제 설명

정수로 이루어진 리스트 `num_list`가 주어집니다. `num_list`에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.


### 제한사항

- 6 ≤ `num_list`의 길이 ≤ 30
- 1 ≤ `num_list`의 원소 ≤ 100


### 입출력 예

|num_list|result|
|---|---|
|[12, 4, 15, 46, 38, 1, 14]|[1, 4, 12, 14, 15]|


### 입출력 예 설명

입출력 예 #1

- [12, 4, 15, 46, 38, 1, 14]를 정렬하면 [1, 4, 12, 14, 15, 38, 46]이 되고, 앞에서 부터 5개를 고르면 [1, 4, 12, 14, 15]가 됩니다.

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 주어진 정수 배열을 오름차순으로 정렬한 후, 정렬된 배열에서 가장 작은 5개의 요소를 추출하여 반환하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 입력으로 정수 배열을 받습니다. 이후, 배열을 오름차순으로 정렬하고, 정렬된 배열에서 처음 5개의 요소를 추출하여 반환합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 `Arrays.sort()` 메소드를 사용하여 배열을 오름차순으로 정렬하고, `Arrays.copyOfRange()` 메소드를 사용하여 정렬된 배열에서 처음 5개의 요소를 추출하는 것입니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 정렬과 배열 복사 기능을 사용하여 주어진 문제를 해결하는 것입니다.

### 풀이
```
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);  // 배열을 오름차순으로 정렬합니다.
        
        // 정렬된 배열에서 처음 5개의 요소를 추출하여 반환합니다.
        // 만약 배열의 길이가 5보다 작다면, 배열의 모든 요소를 반환합니다.
        return Arrays.copyOfRange(num_list, 0, Math.min(num_list.length, 5));
    }
}
```

