# [ Programmers ] 배열 만들기 3 ( java ) 58 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181895

## 문제 
### 문제 설명
정수 배열 `arr`와 2개의 구간이 담긴 배열 `intervals`가 주어집니다.

`intervals`는 항상 `[[a1, b1], [a2, b2]]`의 꼴로 주어지며 각 구간은 닫힌 구간입니다. 닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미합니다.

이때 배열 `arr`의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을 앞뒤로 붙여 새로운 배열을 만들어 return 하는 solution 함수를 완성해 주세요.
### 제한사항
- 1 ≤ `arr`의 길이 ≤ 100,000
    - 1 ≤ `arr`의 원소 < 100
- 1 ≤ `a1` ≤ `b1` < `arr`의 길이
- 1 ≤ `a2` ≤ `b2` < `arr`의 길이

### 입출력 예
![](https://i.imgur.com/RH3lsnQ.png)

## 문제 풀이
### 코드 설명

**코드의 목적:**

이 코드는 주어진 배열에서 주어진 구간의 원소들을 추출하여 새로운 배열로 반환하는 기능을 가진 알고리즘입니다.

**코드의 주요 구조:**

1. 클래스 정의: Solution이라는 이름의 클래스를 정의합니다.
2. 메서드 정의: solution이라는 이름의 메서드를 정의합니다. 이 메서드는 정수 배열(arr)과 2차원 정수 배열(intervals)을 인자로 받아 처리합니다.

**코드의 주요 알고리즘:**

1. intervals 배열을 스트림으로 변환합니다.
2. 각 구간에 대해 해당 구간의 원소들을 arr에서 추출하여 스트림에 추가합니다.
3. 최종적으로 스트림의 원소들을 배열로 변환하여 반환합니다.

**코드의 핵심:**

1. Arrays.stream과 flatMapToInt를 이용하여 2차원 배열을 1차원 스트림으로 변환합니다.
2. IntStream.rangeClosed와 map을 이용하여 각 구간의 원소들을 추출합니다.

### 풀이
```
import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        // intervals 배열을 스트림으로 변환
        return Arrays.stream(intervals)
            // 각 구간에 대해 해당 구간의 원소들을 arr에서 추출하여 스트림에 추가
            .flatMapToInt(d -> IntStream.rangeClosed(d[0], d[1])
                         .map(i -> arr[i]))
            // 최종적으로 스트림의 원소들을 배열로 변환하여 반환
            .toArray();
    }
}
```

