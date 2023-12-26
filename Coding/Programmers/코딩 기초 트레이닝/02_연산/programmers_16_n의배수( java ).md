# [ Programmers ]  n의배수 ( java ) 16 / 124

https://school.programmers.co.kr/learn/courses/30/lessons/181937
## 문제 
### 문제 설명
정수 `num`과 `n`이 매개 변수로 주어질 때, `num`이 `n`의 배수이면 1을 return `n`의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.

### 제한사항
- 2 ≤ `num` ≤ 100
- 2 ≤ `n` ≤ 9

### 입출력 예
  ![](https://i.imgur.com/RAwTgJT.png)

## 문제 풀이
### 문제 접근
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public int solution(int num, int n)`: 두 개의 정수 `num`과 `n`을 인자로 받아 숫자 `num`이 `n`으로 나누어 떨어지는지 확인하는 함수를 정의합니다.

**2. 나머지 연산 및 결과 저장:**

- `int answer = (num % n == 0) ? 1 : 0;`: 삼항 연산자를 사용하여 `num`이 `n`으로 나누어 떨어지는지 확인하고 결과를 `answer`에 저장합니다.
    - `num % n == 0`: `num`을 `n`으로 나눈 나머지가 0인지 확인합니다. 즉, 나누어 떨어지는지 확인합니다.
    - `1`: 나누어 떨어지면 1을 저장합니다.
    - `0`: 나누어 떨어지지 않으면 0을 저장합니다.

**3. 결과 반환:**

- `return answer;`: `answer`를 반환합니다. 즉, `num`이 `n`으로 나누어 떨어지면 1을 반환하고, 그렇지 않으면 0을 반환합니다.

**실행 예시:**

```
int num = 10;
int n = 2;

int result = new Solution().solution(num, n);
System.out.println(result);  // 출력: 0 (10은 2로 나누어 떨어지지 않기 때문에)
```

```
int num = 12;
int n = 3;

int result = new Solution().solution(num, n);
System.out.println(result);  // 출력: 1 (12는 3으로 나누어 떨어지기 때문에)
```

### 풀이
```
class Solution {
    public int solution(int num, int n) {
        int answer = (num % n == 0) ? 1 : 0;
        return answer;
    }
}
```














