




# [ Programmers ] 카운트 업 ( java ) 33 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181920

## 문제 
### 문제 설명
정수 `start_num`와 `end_num`가 주어질 때, `start_num`부터 `end_num`까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

### 제한사항
- 0 ≤ `start_num` ≤ `end_num` ≤ 50

### 입출력 예
![](https://i.imgur.com/yz74Eqo.png)



## 문제 풀이
### 코드 설명
**코드의 목적:**

- 이 코드는 주어진 시작 숫자 `start_num`부터 끝 숫자 `end_num`까지의 정수들을 포함하는 배열을 생성하는 알고리즘을 구현합니다.

**코드의 주요 구조:**

1. Import: `IntStream` 클래스를 import합니다.
2. 클래스 정의: `Solution` 클래스를 정의합니다.
3. 메서드 정의: `solution` 메서드를 정의합니다.

**코드의 주요 알고리즘:**

1. 스트림 생성: `IntStream.rangeClosed(start_num, end_num)` 메서드를 사용하여 `start_num`부터 `end_num`까지의 정수들을 포함하는 스트림을 생성합니다.
2. 배열 생성: `toArray()` 메서드를 사용하여 스트림의 요소들을 `int` 배열로 변환하고 반환합니다.

**코드의 핵심:**

- `IntStream.rangeClosed(start_num, end_num)` 메서드를 사용하여 정수 범위를 나타내는 스트림을 간결하게 생성합니다.
- `toArray()` 메서드를 사용하여 스트림의 요소들을 배열로 변환합니다.

### 풀이
```
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start_num, int end_num) {
        // start_num부터 end_num까지의 정수 스트림 생성
        IntStream stream = IntStream.rangeClosed(start_num, end_num);

        // 스트림을 배열로 변환하여 반환
        return stream.toArray();
    }
}
```

