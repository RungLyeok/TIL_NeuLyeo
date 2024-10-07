# [ Programmers ] 카운트 다운 ( java ) 54 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181899

## 문제 
### 문제 설명
정수 `start_num`와 `end_num`가 주어질 때, `start_num`에서 `end_num`까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
### 제한사항
- 0 ≤ `end_num` ≤ `start_num` ≤ 50

### 입출력 예
![](https://i.imgur.com/nVd7pqE.png)


## 문제 풀이
### 코드 설명

**코드의 목적:**

이 코드는 주어진 시작 숫자(start)와 끝 숫자(end_num) 사이의 모든 정수를 내림차순으로 배열에 저장하는 기능을 가진 알고리즘입니다.

**코드의 주요 구조:**

1. 클래스 정의: Solution이라는 이름의 클래스를 정의합니다.
2. 메서드 정의: solution이라는 이름의 메서드를 정의합니다. 이 메서드는 두 개의 정수(start, end_num)를 인자로 받아 처리합니다.

**코드의 주요 알고리즘:**

1. IntStream의 rangeClosed 메서드를 이용하여 start와 end_num 사이의 모든 정수를 스트림으로 생성합니다.
2. 생성된 스트림을 내림차순으로 정렬합니다.
3. 정렬된 스트림을 배열로 변환하여 반환합니다.

**코드의 핵심:**

1. 자바 8의 스트림 API를 이용하여 배열을 처리합니다.
2. IntStream의 rangeClosed 메서드를 이용하여 특정 범위의 정수를 생성합니다.
3. sorted 메서드를 이용하여 정수를 내림차순으로 정렬합니다.

### 풀이
```
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end_num) {
        
        // start와 end_num 사이의 모든 정수를 내림차순으로 배열에 저장
        return IntStream.rangeClosed(end_num, start).boxed()
            .sorted((a, b) -> b - a).mapToInt(Integer::intValue).toArray();
    }
}
```

