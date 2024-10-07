# [ Programmers ] _ 짝수는 싫어요 ( java )

https://school.programmers.co.kr/learn/courses/30/lessons/120813?language=java
## 문제 
### 문제 설명
정수 `n`이 매개변수로 주어질 때, `n` 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

### 제한사항
- 1 ≤ `n` ≤ 100

### 입출력 예
  ![](https://i.imgur.com/vDRKbTD.png)





## 문제 풀이
### 문제 접근
Stream을 사용하여 문제 해결

- IntStream.range(a, b)
	- a ~ b - 1 까지의 정수를 생성한다.
- IntStream.rangeClosed(a, b)
	- a ~ b 까지의 정수를 생성한다.
	  
- .filter
	-  특정 조건을 만족하는 스트림 요소만 반한다.
	  
- .toArray()
	- 스트림을 배열로 반환한다.

### 풀이
```
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        int[] answer = IntStream.rangeClosed(1, n)
                        .filter(x -> x % 2 != 0)
                        .toArray();
        return answer;
    }
}
```

![](https://i.imgur.com/hWb6jMS.png)















