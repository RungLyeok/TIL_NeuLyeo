# [ Programmers ]  공배수 ( java ) 17 / 124

https://school.programmers.co.kr/learn/courses/30/lessons/181936
## 문제 
### 문제 설명
정수 `number`와 `n`, `m`이 주어집니다. `number`가 `n`의 배수이면서 `m`의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

### 제한사항
- 10 ≤ `number` ≤ 100
- 2 ≤ `n`, `m` < 10

### 입출력 예
  ![](https://i.imgur.com/8bu2XOK.png)

## 문제 풀이
### 문제 접근
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public int solution(int number, int n, int m)`: 세 개의 정수 `number`, `n`, `m`을 인자로 받아 `number`가 `n`과 `m` 모두로 나누어 떨어지는지 확인하는 함수를 정의합니다.

**2. 나머지 연산 및 결과 저장:**

- `int answer = (number % n == 0 && number % m == 0) ? 1 : 0;`: 삼항 연산자를 사용하여 `number`가 `n`과 `m` 모두로 나누어 떨어지는지 확인하고 결과를 `answer`에 저장합니다.
    - `number % n == 0 && number % m == 0`: `number`를 `n`으로 나눈 나머지와 `m`으로 나눈 나머지가 모두 0인지 확인합니다. 즉, 두 숫자 모두로 나누어 떨어지는지 확인합니다.
    - `1`: 두 숫자 모두로 나누어 떨어지면 1을 저장합니다.
    - `0`: 그렇지 않으면 0을 저장합니다.

**3. 결과 반환:**

- `return answer;`: `answer`를 반환합니다. 즉, `number`가 `n`과 `m` 모두로 나누어 떨어지면 1을 반환하고, 그렇지 않으면 0을 반환합니다.

**실행 예시:**

```
int number = 12;
int n = 3;
int m = 4;

int result = new Solution().solution(number, n, m);
System.out.println(result);  // 출력: 1 (12는 3과 4로 나누어 떨어지기 때문에)
```


```
int number = 15;
int n = 2;
int m = 5;

int result = new Solution().solution(number, n, m);
System.out.println(result);  // 출력: 0 (15는 2 또는 5로 나누어 떨어지지 않기 때문에)
```

### 풀이
```
class Solution {
    public int solution(int number, int n, int m) {
        int answer = (number % n == 0 && number % m == 0) ? 1 : 0 ;
        return answer;
    }
}
```














