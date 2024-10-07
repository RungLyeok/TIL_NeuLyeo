# [ Programmers ]  flag에 따라 다른 값 반환하기 ( java ) 20 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181933

## 문제 
### 문제 설명
두 정수 `a`, `b`와 boolean 변수 `flag`가 매개변수로 주어질 때, `flag`가 true면 `a` + `b`를 false면 `a` - `b`를 return 하는 solution 함수를 작성해 주세요.
### 제한사항
- -1,000 ≤ `a`, `b` ≤ 1,000

### 입출력 예
![](https://i.imgur.com/zes9srK.png)

## 문제 풀이
### 코드 설명
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public int solution(int a, int b, boolean flag)`: 두 개의 정수 `a`, `b`와 boolean 값 `flag`를 인자로 받아 덧셈 또는 뺄셈을 수행하는 함수를 정의합니다.

**2. 덧셈 또는 뺄셈:**

- `int answer = flag ? a + b : a - b;`: 삼항 연산자를 사용하여 `flag`의 값에 따라 덧셈 또는 뺄셈을 수행하고 결과를 `answer`에 저장합니다.
    - `flag ? a + b`: `flag`가 참이면 `a + b`를 계산합니다. 즉, 덧셈을 수행합니다.
    - `a - b`: `flag`가 거짓이면 `a - b`를 계산합니다. 즉, 뺄셈을 수행합니다.

**3. 결과 반환:**

- `return answer;`: 계산된 결과인 `answer`를 반환합니다.

**실행 예시:**


```
int a = 10;
int b = 5;
boolean flag = true;

int result = new Solution().solution(a, b, flag);
System.out.println(result);  // 출력: 15 (flag가 참이므로 덧셈 수행)

flag = false;
result = new Solution().solution(a, b, flag);
System.out.println(result);  // 출력: 5 (flag가 거짓이므로 뺄셈 수행)
```

### 풀이
#### 삼항 연산자 사용
```
class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = flag ? a + b : a - b;
        return answer;
    }
}
```














