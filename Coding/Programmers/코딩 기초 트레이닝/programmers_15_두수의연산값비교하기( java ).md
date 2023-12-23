# [ Programmers ]  두 수의 연산값 비교하기 ( java ) 15 / 124

https://school.programmers.co.kr/learn/courses/30/lessons/181938
## 문제 
### 문제 설명
연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

- 12 ⊕ 3 = 123
- 3 ⊕ 12 = 312

양의 정수 `a`와 `b`가 주어졌을 때, `a` ⊕ `b`와 `2 * a * b` 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.

단, `a` ⊕ `b`와 `2 * a * b`가 같으면 `a` ⊕ `b`를 return 합니다.

### 제한사항
- 1 ≤ `a`, `b` < 10,000

### 입출력 예
  ![](https://i.imgur.com/nekQES8.png)




## 문제 풀이
### 문제 접근
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public int solution(int a, int b)`: 두 개의 정수 `a`와 `b`를 인자로 받아 더 큰 값을 선택하여 반환하는 함수를 정의합니다.

**2. 숫자 비교:**

- `int nAb = Integer.parseInt("" + a + b);`: 두 정수 `a`와 `b`를 문자열로 연결한 후 정수로 변환하여 `nAb`에 저장합니다. 즉, `a`와 `b`를 붙여 만든 숫자를 저장합니다.
- `int nBa = 2 * a * b;`: `a`와 `b`의 곱에 2를 곱한 값을 `nBa`에 저장합니다.
- `int answer = (nAb >= nBa) ? nAb : nBa;`: 삼항 연산자를 사용하여 `nAb`와 `nBa` 중 더 큰 값을 `answer`에 저장합니다.

**3. 결과 반환:**

- `return answer;`: 더 큰 값을 나타내는 `answer`를 반환합니다.

**실행 예시:**

```
int a = 12;
int b = 34;

int result = new Solution().solution(a, b);
System.out.println(result);  // 출력: 1234 (1234가 12 * 2 * 34보다 크기 때문에)
```

### 풀이
```
class Solution {
    public int solution(int a, int b) {
        int nAb = Integer.parseInt("" + a + b);
        int nBa = 2 * a * b;
        int answer = (nAb >= nBa) ? nAb : nBa;
        return answer;
    }
}
```
















