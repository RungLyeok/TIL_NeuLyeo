# [ Programmers ] _ 주사위 게임 2 ( java )
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
1. 클래스 및 함수 정의:

- `import java.util.*;`: `Math` 클래스를 사용하기 위해 `java.util` 패키지를 불러옵니다.
- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public int solution(int a, int b, int c)`: 문제의 솔루션을 제공하는 함수를 정의합니다. 이 함수는 세 개의 정수 `a`, `b`, `c`를 입력받아 점수 값을 계산하여 반환합니다.

2. 점수 계산:

- `int answer` 변수: 계산된 점수를 저장할 변수입니다.
- 3항 연산자를 사용하여 세 가지 조건에 따라 점수를 계산합니다.

조건 1:

- `(a == b && b == c)`: 세 숫자가 모두 같다면
- 계산: `(int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (a+b+c)`
- 세 숫자의 세제곱의 합, 세 숫자의 제곱의 합, 세 숫자의 합을 모두 곱합니다.

조건 2:

- `((a == b) || (a==c) || (b==c))`: 세 숫자 중 두 숫자가 같다면
- 계산: `(int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (a+b+c)`
- 세 숫자의 제곱의 합과 세 숫자의 합을 곱합니다.

조건 3:

- 위의 두 조건에 해당하지 않는 경우(세 숫자가 모두 다르다면)
- 계산: `a + b + c`
- 세 숫자의 합만 반환합니다.

3. 결과 반환:

- `return answer`: 계산된 점수 `answer`를 반환합니다.

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







