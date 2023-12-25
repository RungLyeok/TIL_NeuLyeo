# [ Programmers ] 원소들의 곱과 합 ( java ) 24 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181929

## 문제 
### 문제 설명
정수가 담긴 리스트 `num_list`가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
### 제한사항
- 2 ≤ `num_list`의 길이 ≤ 10
- 1 ≤ `num_list`의 원소 ≤ 9

### 입출력 예
![](https://i.imgur.com/ceHEDZC.png)


## 문제 풀이
### 코드 설명
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public int solution(int[] num_list)`: 정수 배열 `num_list`를 입력받아 0 또는 1을 반환하는 함수입니다.

**2. 변수 초기화:**

- `int sumA = 1`: 모든 원소의 곱을 저장할 변수를 1로 초기화합니다.
- `int sumB = 0`: 모든 원소의 합을 저장할 변수를 0으로 초기화합니다.

**3. 원소의 곱과 합 계산:**

- `for (int item : num_list) { ... }`: 배열의 각 원소를 반복하면서 다음을 수행합니다.
    - `sumA *= item`: `sumA`에 현재 원소를 곱하여 모든 원소의 곱을 계산합니다.
    - `sumB += item`: `sumB`에 현재 원소를 더하여 모든 원소의 합을 계산합니다.

**4. 조건 비교 및 결과 반환:**

- `int answer = (sumA < Math.pow(sumB, 2)) ? 1 : 0`:
    - `sumA < Math.pow(sumB, 2)`: 모든 원소의 곱이 모든 원소의 합의 제곱보다 작으면 참입니다.
    - `? 1 : 0`: 조건이 참이면 1을, 거짓이면 0을 `answer`에 저장합니다.
- `return answer`: 계산된 `answer`를 반환합니다.

**코드의 역할:**

이 코드는 정수 배열의 모든 원소의 곱과 합을 비교하여 다음과 같은 결과를 반환합니다.

- 모든 원소의 곱이 모든 원소의 합의 제곱보다 작으면 1을 반환합니다.
- 그렇지 않으면 0을 반환합니다.

### 풀이
#### 반복문 사용
```
class Solution {
    public int solution(int[] num_list) {
        int sumA = 1;
        int sumB = 0;
        for (int item : num_list) {
            sumA *= item;
            sumB += item;
        }
        
        int answer = (sumA < Math.pow(sumB, 2)) ? 1 : 0;
        return answer;
    }
}
```

#### stream 사용
```
import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int A = Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        int B = Arrays.stream(num_list).reduce(0, (a, b) -> a + b);
        
        int answer = (A < Math.pow(B, 2)) ? 1 : 0;
        return answer;
    }
}
```







