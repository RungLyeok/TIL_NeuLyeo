# [ Programmers ]  주사위 게임 2 ( java ) 23 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181930

## 문제 
### 문제 설명
1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 `a`, `b`, `c`라고 했을 때 얻는 점수는 다음과 같습니다.

- 세 숫자가 모두 다르다면 `a` + `b` + `c` 점을 얻습니다.
- 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (`a` + `b` + `c`) × (`a`2 + `b`2 + `c`2 )점을 얻습니다.
- 세 숫자가 모두 같다면 (`a` + `b` + `c`) × (`a`2 + `b`2 + `c`2 ) × (`a`3 + `b`3 + `c`3 )점을 얻습니다.

세 정수 `a`, `b`, `c`가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
### 제한사항
- `a`, `b`, `c`는 1이상 6이하의 정수입니다.

### 입출력 예
![](https://i.imgur.com/JNNdtUB.png)

## 문제 풀이
### 코드 설명
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public int solution(int a, int b, int c)`: 세 개의 정수 `a`, `b`, `c`를 인자로 받아 특정 조건에 따라 계산된 값을 반환하는 함수를 정의합니다.

**2. 조건에 따른 계산:**

- `int answer = (a == b && b == c) ? ... : ... ;`: 삼항 연산자를 사용하여 `a`, `b`, `c`의 값에 따라 다른 계산을 수행합니다.
    - `(a == b && b == c)`: 세 숫자가 모두 같은 경우입니다.
        - `(int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (a+b+c)`: 세 숫자의 세제곱, 제곱, 합을 곱한 값을 계산합니다.
    - `((a == b) || (a==c) || (b==c))`: 두 숫자가 같은 경우입니다.
        - `(int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (a+b+c)`: 세 숫자의 제곱과 합을 곱한 값을 계산합니다.
    - 그 외의 경우: 세 숫자의 합을 계산합니다.

**3. 결과 반환:**

- `return answer;`: 계산된 값 `answer`를 반환합니다.

### 풀이
```
class Solution {
    public int solution(int a, int b, int c) {
        
        int answer = (a == b && b == c) 
            ? (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) *
            (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (a+b+c)
            
            : ((a == b) || (a==c) || (b==c)) 
            ? (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (a+b+c)
                
            : a + b + c;
        
        return answer;
    }
}
```







