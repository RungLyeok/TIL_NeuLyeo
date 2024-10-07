# [ Programmers ] 이어 붙인 수 ( java ) 25 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181928

## 문제 
### 문제 설명
정수가 담긴 리스트 `num_list`가 주어집니다. `num_list`의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
### 제한사항
- 2 ≤ `num_list`의 길이 ≤ 10
- 1 ≤ `num_list`의 원소 ≤ 9
- `num_list`에는 적어도 한 개씩의 짝수와 홀수가 있습니다.

### 입출력 예
![](https://i.imgur.com/jMErh6F.png)



## 문제 풀이
### 코드 설명
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public int solution(int[] num_list)`: 정수 배열 `num_list`를 입력받아 숫자를 반환하는 함수입니다.

**2. 변수 초기화:**

- `int sumE = 0`: 짝수의 자릿수를 저장할 변수입니다.
- `int sumO = 0`: 홀수의 자릿수를 저장할 변수입니다.

**3. 짝수와 홀수의 자릿수 계산:**

- `for (int a : num_list) { ... }`: 배열의 각 원소를 반복하면서 다음을 수행합니다.
    - `if(a % 2 == 0)`: 현재 원소가 짝수인 경우
        - `sumE = sumE * 10 + a`: `sumE`를 10배 하여 자리수를 올리고, 현재 원소를 더합니다.
    - `else`: 현재 원소가 홀수인 경우
        - `sumO = sumO * 10 + a`: `sumO`를 10배 하여 자리수를 올리고, 현재 원소를 더합니다.

**4. 결과 반환:**

- `return sumE + sumO`: 짝수와 홀수의 자릿수를 더한 값을 반환합니다.

**코드의 역할:**

이 코드는 정수 배열에서 짝수와 홀수를 구분하여 각각의 자릿수를 만들어 더한 값을 반환하는 역할을 합니다.

**예시:**

- `num_list = [3, 4, 5, 2, 1]`인 경우, `sumE = 42`(4와 2의 자릿수), `sumO = 351`(3, 5, 1의 자릿수)가 되어 `return sumE + sumO`는 `42 + 351 = 393`을 반환합니다.

### 풀이
```
class Solution {
    public int solution(int[] num_list) {
        int sumE = 0, sumO = 0;
        
        for (int a : num_list) {
            if(a % 2 == 0) {
                sumE = sumE * 10 + a;
            } else {
                sumO = sumO * 10 + a;
            }
        }
        
        return sumE + sumO;
    }
}
```
