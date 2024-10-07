# [ Programmers ]  홀짝에 따라 다른 값 반환하기 ( java ) 18 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181935

## 문제 
### 문제 설명
양의 정수 `n`이 매개변수로 주어질 때, `n`이 홀수라면 `n` 이하의 홀수인 모든 양의 정수의 합을 return 하고 `n`이 짝수라면 `n` 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- 1 ≤ `n` ≤ 100

### 입출력 예
![](https://i.imgur.com/tjb11rO.png)


## 문제 풀이
### 코드 설명
**1. import:**

- `import java.util.stream.IntStream;`: 스트림을 사용하기 위해 `IntStream` 클래스를 불러옵니다.

**2. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public int solution(int n)`: 정수 `n`을 인자로 받아 특정 조건에 맞는 숫자들의 합을 계산하는 함수를 정의합니다.

**3. 짝수/홀수에 따른 합 계산:**

- `int answer = (n % 2 == 0) ? ... : ...;`: 삼항 연산자를 사용하여 `n`이 짝수인지 홀수인지에 따라 다른 계산을 수행합니다.
    - `n % 2 == 0`: `n`이 짝수인지 확인합니다.
        - `IntStream.rangeClosed(2, n).filter(i -> i % 2 == 0).map(i -> i * i).sum()`: 2부터 `n`까지의 짝수들을 제곱하여 합친 결과를 계산합니다.
    - `n % 2 == 1`: `n`이 홀수인지 확인합니다.
        - `IntStream.rangeClosed(1, n).filter(i -> i % 2 == 1).sum()`: 1부터 `n`까지의 홀수들을 합친 결과를 계산합니다.

**4. 결과 반환:**

- `return answer;`: 계산된 합을 `answer`로 반환합니다.

**실행 예시:**

```
int n = 10;
int result = new Solution().solution(n);
System.out.println(result);  // 출력: 110 (2^2 + 4^2 + 6^2 + 8^2 + 10^2)

int n = 9;
int result = new Solution().solution(n);
System.out.println(result);  // 출력: 25 (1 + 3 + 5 + 7 + 9)
```

### 풀이
```
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = (n % 2 == 0)
                ? IntStream.rangeClosed(2, n).filter(i -> i % 2 == 0).map(i -> i * i).sum()
                : IntStream.rangeClosed(1, n).filter(i -> i % 2 == 1).sum();
        return answer;
    }
}
```














