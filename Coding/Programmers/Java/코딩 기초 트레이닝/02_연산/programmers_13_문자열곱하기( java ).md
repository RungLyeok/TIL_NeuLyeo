# [ Programmers ]  문자열 곱하기 ( java ) 13 / 124

https://school.programmers.co.kr/learn/courses/30/lessons/181940
## 문제 
### 문제 설명
문자열 `my_string`과 정수 `k`가 주어질 때, `my_string`을 `k`번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- 1 ≤ `my_string`의 길이 ≤ 100
- `my_string`은 영소문자로만 이루어져 있습니다.
- 1 ≤ `k` ≤ 100

### 입출력 예
  ![](https://i.imgur.com/pkC9M5f.png)


## 문제 풀이
### 코드 설명
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public String solution(String my_string, int k)`: 문자열을 반복하는 함수를 정의합니다. 이 함수는 다음 두 개의 매개변수를 받습니다.
    - `my_string`: 반복할 문자열입니다.
    - `k`: 반복 횟수입니다.

**2. 문자열 반복:**

- `return my_string.repeat(k);`: 문자열을 `k`번 반복하여 새로운 문자열을 생성하고 반환합니다.
    - `my_string.repeat(k)`: 문자열 `my_string`을 `k`번 반복하는 메서드입니다.

**실행 예시:**

Java

```
String my_string = "hello";
int k = 3;

String result = new Solution().solution(my_string, k);
System.out.println(result);  // 출력: hellohellohello
```

### 풀이
```
class Solution {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
```













