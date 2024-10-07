# [ Programmers ]  등차수열의 특정한 항만 더하기 ( java ) 22 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181931

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
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public int solution(int a, int d, boolean[] included)`: 세 개의 인자를 받아서 특정 조건에 맞는 숫자들의 합을 계산하는 함수를 정의합니다.
    - `a`: 시작 숫자입니다.
    - `d`: 등차의 값입니다.
    - `included`: 각 숫자를 포함할지 여부를 나타내는 boolean 배열입니다.

**2. 변수 초기화:**

- `int answer = 0;`: 결과 값을 저장할 변수를 0으로 초기화합니다.
- `int n = a;`: 현재 숫자를 저장할 변수 `n`을 시작 숫자 `a`로 초기화합니다.

**3. 숫자 순회 및 합산:**

- `for (boolean b : included) { ... }`: `included` 배열의 각 요소를 순회합니다.
    - `if (b == true) { answer += n; }`: 현재 요소가 `true`인 경우, 즉 해당 숫자를 포함해야 하는 경우 현재 숫자 `n`을 `answer`에 더합니다.
    - `n += d;`: 다음 숫자를 위해 `n`에 등차 `d`를 더합니다.

**4. 결과 반환:**

- `return answer;`: 조건에 맞게 더해진 숫자들의 합인 `answer`를 반환합니다.

**코드의 역할:**

이 코드는 등차수열에서 특정 숫자들을 선택하여 합산하는 역할을 합니다. 시작 숫자 `a`, 등차 `d`, 그리고 각 숫자의 포함 여부를 나타내는 `included` 배열을 입력받아 포함된 숫자들의 합을 계산합니다.

**예시:**

```
int a = 1;
int d = 3;
boolean[] included = {true, false, true};

int result = new Solution().solution(a, d, included);
System.out.println(result);  // 출력: 8 (1 + 4 = 8)
```

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







