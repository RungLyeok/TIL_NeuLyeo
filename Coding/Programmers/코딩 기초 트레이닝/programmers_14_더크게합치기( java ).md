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
- 정수를 문자열로 바꾸는 `String.valueOf( )`
	- 입력 받은 정수를 문자열로 바꾼다.

- 문자열을 이어주는 `.concat( )`
	- 두 문자열을 순서를 바꿔 붙인다.

- 문자를 정수로 바꾸는 `Integer.parseInt( )`
	- 순서를 바꿔 붙인 문자열 2개를 다시 숫자로 바꿔 크기를 비교한다.

- 삼항연산자 이용
	- 크기가 큰 값으로 반환한다.

### 풀이
```
class Solution {
    public int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        int numA = Integer.parseInt(strA.concat(strB));
        int numB = Integer.parseInt(strB.concat(strA));


        int answer = (numA > numB) ? numA : numB;
        return answer;
    }
}
```

![](https://i.imgur.com/Tq4AO42.png)













