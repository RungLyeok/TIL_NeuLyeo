# [ Programmers ] 순서 바꾸기 ( java ) 62 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181891

## 문제 설명

정수 리스트 `num_list`와 정수 `n`이 주어질 때, `num_list`를 `n` 번째 원소 이후의 원소들과 `n` 번째까지의 원소들로 나눠 `n` 번째 원소 이후의 원소들을 `n` 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.

---

### 제한사항

- 2 ≤ `num_list`의 길이 ≤ 30
- 1 ≤ `num_list`의 원소 ≤ 9
- 1 ≤ `n` ≤ `num_list`의 길이

---

### 입출력 예

|num_list|n|result|
|---|---|---|
|[2, 1, 6]|1|[1, 6, 2]|
|[5, 2, 1, 7, 5]|3|[7, 5, 5, 2, 1]|

---

### 입출력 예 설명

입출력 예 #1

- [2, 1, 6]에서 첫 번째 이후의 원소는 [1, 6]이고 첫 번째까지의 원소는 [2]입니다. 두 리스트를 이어 붙이면 [1, 6, 2]가 됩니다.

입출력 예 #2

- [5, 2, 1, 7, 5]에서 세 번째 이후의 원소는 [7, 5]이고 세 번째까지의 원소는 [5, 2, 1]입니다. 두 리스트를 이어 붙이면 [7, 5, 5, 2, 1]가 됩니다.

## 문제 풀이
### 코드 설명

**코드의 목적:**

이 코드는 주어진 배열의 원소를 n번 회전시키는 기능을 가진 알고리즘입니다.

**코드의 주요 구조:**

1. 클래스 정의: Solution이라는 이름의 클래스를 정의합니다.
2. 메서드 정의: solution이라는 이름의 메서드를 정의합니다. 이 메서드는 정수 배열(num_list)와 정수(n)를 인자로 받아 처리합니다.

**코드의 주요 알고리즘:**

1. 배열의 원소를 큐에 추가합니다.
2. 큐의 원소를 n번 회전시킵니다. 이때, 큐의 첫 번째 원소를 꺼내서 큐의 마지막에 추가합니다.
3. 회전시킨 큐의 원소를 배열로 변환하여 반환합니다.

**코드의 핵심:**

1. Arrays.stream과 forEach를 이용하여 배열의 원소를 큐에 추가합니다.
2. 큐의 add와 remove 메서드를 이용하여 원소를 회전시킵니다.
3. 큐의 stream과 mapToInt를 이용하여 큐의 원소를 배열로 변환합니다.

### 풀이
```
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        // 배열의 원소를 큐에 추가
        Queue<Integer> q = new LinkedList();
        Arrays.stream(num_list).forEach(q::add);
        
        // 큐의 원소를 n번 회전시킴
        for (int i = 0; i < n; i++) {
            q.add(q.remove());
        }
        
        // 회전시킨 큐의 원소를 배열로 변환하여 반환
        return q.stream().mapToInt(Integer::intValue).toArray();
    }
}
```

