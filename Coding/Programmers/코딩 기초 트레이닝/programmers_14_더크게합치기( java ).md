# [ Programmers ] _ 더크게합치기 ( java )

https://school.programmers.co.kr/learn/courses/30/lessons/181939
## 문제 
### 문제 설명
연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

- 12 ⊕ 3 = 123
- 3 ⊕ 12 = 312

양의 정수 `a`와 `b`가 주어졌을 때, `a` ⊕ `b`와 `b` ⊕ `a` 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.

단, `a` ⊕ `b`와 `b` ⊕ `a`가 같다면 `a` ⊕ `b`를 return 합니다.

### 제한사항
- 1 ≤ `a`, `b` < 10,000
### 입출력 예
  ![](https://i.imgur.com/NcuOecK.png)



## 문제 풀이
### 문제 접근
- `Integer.parseInt()` 메서드를 사용하여 `""` 와 `a`와 `b`를 더하여 문자열로 변환합니다.

### 풀이
```
class Solution {
    public int solution(int a, int b) {
        int nAb = Integer.parseInt("" + a + b);
        int nBa = Integer.parseInt("" + b + a);
        
        int answer = (nAb > nBa) ? nAb : nBa;
        return answer;
    }
}
```

![](https://i.imgur.com/Tq4AO42.png)













