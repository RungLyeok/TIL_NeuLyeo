# [ Programmers ] 마지막 두 원소 ( java ) 26 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181927

## 문제 
### 문제 설명
정수 리스트 `num_list`가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
### 제한사항
- 2 ≤ `num_list`의 길이 ≤ 10
- 1 ≤ `num_list`의 원소 ≤ 9

### 입출력 예
![](https://i.imgur.com/Jmn9cUP.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

- 주어진 정수 배열에서 규칙에 따라 마지막 요소를 추가한 새로운 배열을 생성하는 코드입니다.

**코드의 주요 구조:**

1. 새 배열 생성
2. 기존 배열 요소 복사
3. 마지막 요소 계산 및 추가
4. 새 배열 반환

**코드의 주요 알고리즘:**

1. 기존 배열보다 크기가 1 큰 새 배열을 생성합니다.
2. 기존 배열의 요소를 새 배열에 복사합니다.
3. 마지막 요소는 다음 규칙에 따라 계산합니다.
    - 마지막 요소가 바로 이전 요소보다 크면: 마지막 요소 - 이전 요소
    - 마지막 요소가 바로 이전 요소보다 작거나 같으면: 마지막 요소 * 2
4. 계산된 마지막 요소를 새 배열에 추가합니다.
5. 새 배열을 반환합니다.

### 풀이
```
class Solution {

    // 정수 배열 num_list를 입력받아 규칙에 따라 마지막 요소를 추가한 새 배열을 반환하는 메서드
    public int[] solution(int[] num_list) {
        // 기존 배열보다 크기가 1 큰 새 배열 생성
        int[] answer = new int[num_list.length + 1];

        // 기존 배열의 요소를 새 배열에 복사
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];

            // 마지막 요소인 경우 규칙에 따라 계산
            if (i == num_list.length - 1) {
                answer[i + 1] = (num_list[i] > num_list[i - 1]) ? num_list[i] - num_list[i - 1] : num_list[i] * 2;
            }
        }

        // 새 배열 반환
        return answer;
    }
}
```

#### stream API
```
import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length - 1;
        
        int[] answer = IntStream.concat(Arrays.stream(num_list),
                                       IntStream.of((num_list[n] > num_list[n - 1]) 
                                       ? num_list[n] - num_list[n - 1]
                                       : num_list[n] * 2)).toArray();
        return answer;
    }
}
```
