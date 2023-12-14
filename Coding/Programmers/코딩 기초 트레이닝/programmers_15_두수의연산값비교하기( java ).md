# [ Programmers ] _ 두 수의 연산값 비교하기 ( java )

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
- 정수를 문자열로 바꾸는 `String.valueOf( )`
	- 입력 받은 정수를 문자열로 바꾼다.

- 문자열을 이어주는 `.concat( )`
	- 두 문자열을 순서를 바꿔 붙인다.

- 문자를 정수로 바꾸는 `Integer.parseInt( )`
	- 이은 문자열을 정수로 바꾼다.

numA = 문자열로 이은 정수 / numB = 2 * A * B

- 삼항연산자 이용
	- 크기가 큰 값으로 반환한다.
	- 크기가 같으면 numA 반

### 풀이
```
class Solution {
    public int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        int numA = Integer.parseInt(strA.concat(strB));
        int numB = a * b * 2;
        
        int answer = (numA > numB) ? numA : numB;
        
        if (numB == numA) {
            answer = numA;
        }
        
        return answer;
    }
}
```

![](https://i.imgur.com/IqV3gEK.png)














