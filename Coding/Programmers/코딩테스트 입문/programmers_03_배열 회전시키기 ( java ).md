# [ Programmers ] 배열 회전시키기 ( java )

https://school.programmers.co.kr/learn/courses/30/lessons/120844?language=java
## 문제 
### 문제 설명
정수가 담긴 배열 `numbers`와 문자열 `direction`가 매개변수로 주어집니다. 배열 `numbers`의 원소를 `direction`방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.

### 제한사항
- 3 ≤ `numbers`의 길이 ≤ 20
- `direction`은 "left" 와 "right" 둘 중 하나입니다.

### 입출력 예
![](https://i.imgur.com/QeNWmhP.png)

## 문제 풀이
### 코드 설명
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public int[] solution(int[] numbers, String direction)`: 정수 배열 `numbers`와 방향 문자열 `direction`을 입력받아 정수 배열을 반환하는 함수입니다.

**2. 변수 초기화:**

- `int length = numbers.length`: 배열의 길이를 저장합니다.
- `int[] answer = new int[length]`: 결과 배열을 생성합니다.

**3. 왼쪽으로 회전:**

- `if (direction.equals("left")) { ... }`: 방향이 "left"인 경우 다음을 수행합니다.
    - `for (int i = 0; i < length; i++) { ... }`: 배열의 각 원소를 반복하면서 다음을 수행합니다.
        - `answer[i] = numbers[(i + 1) % length]`: 현재 원소의 다음 원소를 결과 배열에 저장합니다. % 연산자를 사용하여 배열의 끝에서 처음으로 넘어가도록 합니다.

**4. 오른쪽으로 회전:**

- `if (direction.equals("right")) { ... }`: 방향이 "right"인 경우 다음을 수행합니다.
    - `for (int i = 0; i < length; i++) { ... }`: 배열의 각 원소를 반복하면서 다음을 수행합니다.
        - `answer[(i + 1) % length] = numbers[i]`: 현재 원소를 결과 배열의 다음 위치에 저장합니다. % 연산자를 사용하여 배열의 끝에서 처음으로 넘어가도록 합니다.

**5. 결과 반환:**

- `return answer`: 회전된 결과 배열을 반환합니다.

**코드의 역할:**

이 코드는 정수 배열을 입력받은 방향으로 한 칸씩 회전시키는 역할을 합니다. "left" 방향은 왼쪽으로, "right" 방향은 오른쪽으로 회전시킵니다.

### 풀이
#### 일반 풀이
```
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] answer = new int[length];
        
        if (direction.equals("left")) {
            for (int i = 0; i < length; i++) {
                answer[i] = numbers[(i + 1) % length];
            }
        }
        
        if (direction.equals("right")) {
            for (int i = 0; i < length; i++) {
                answer[(i + 1) % length] = numbers[i];
            }
        }
        
        return answer;
    }
}
```


#### 삼항 연산자 사용
```
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            int idx = (direction.equals("right")) ?
                (i + 1) % length :
                (i - 1 + length) % length;
            answer[idx] = numbers[i];
        }
        
        return answer;
    }
}
```

