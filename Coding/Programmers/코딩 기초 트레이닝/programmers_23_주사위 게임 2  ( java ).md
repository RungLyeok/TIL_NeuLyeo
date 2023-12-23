# [ Programmers ] _ 주사위 게임 2 ( java )
https://school.programmers.co.kr/learn/courses/30/lessons/181930

## 문제 
### 문제 설명
두 정수 `a`, `d`와 길이가 n인 boolean 배열 `included`가 주어집니다. 첫째항이 `a`, 공차가 `d`인 등차수열에서 `included[i]`가 i + 1항을 의미할 때, 이 등차수열의 1항부터 n항까지 `included`가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
### 제한사항
- 1 ≤ `a` ≤ 100
- 1 ≤ `d` ≤ 100
- 1 ≤ `included`의 길이 ≤ 100
- `included`에는 true가 적어도 하나 존재합니다.
### 입출력 예
![](https://i.imgur.com/mNfAYxy.png)

## 문제 풀이
### 코드 설명
1. 함수 정의:

- `public int solution(int a, int d, boolean[] included)`: 이 코드는 `solution`이라는 함수를 정의합니다.
    - `a`: 첫 번째 숫자를 의미합니다.
    - `d`: 공차(등차수열에서 연속된 두 수의 차이)를 의미합니다.
    - `included`: 각 숫자를 포함할지 여부를 나타내는 boolean 배열입니다.
    - 함수는 `int`형 값을 반환합니다.

2. 변수 선언:

- `int answer = 0`: 결과를 저장할 변수 `answer`를 0으로 초기화합니다.
- `int n = a`: 현재 숫자를 저장할 변수 `n`을 `a`로 초기화합니다.

3. 반복문:

- `for (boolean b : included)`: `included` 배열의 각 요소에 대해 반복합니다.
    - `if (b == true)`: 현재 요소가 `true`인 경우, 즉 현재 숫자를 포함해야 하는 경우 다음을 수행합니다.
        - `answer += n`: 현재 숫자 `n`을 `answer`에 더합니다.
    - `n += d`: 다음 숫자를 계산하기 위해 `n`에 `d`를 더합니다.

4. 결과 반환:

- `return answer`: 최종적으로 계산된 `answer` 값을 반환합니다.

코드의 역할:

이 코드는 `a`부터 시작해서 공차가 `d`인 등차수열에서 `included` 배열의 값이 `true`인 숫자들의 합을 계산합니다. 예를 들어, `a = 10`, `d = 5`, `included = {true, false, true}`인 경우, 결과는 10 + 20 = 30이 됩니다.

### 풀이
```
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = a;
        for (boolean b : included) {
            if (b == true) {
                answer += n;
            }
            n += d;
        }
    
        return answer;
    }
}
```







