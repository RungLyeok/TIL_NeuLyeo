# [ Programmers ] 리스트 자르기( ( java ) 56 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181897

## 문제 
### 문제 설명
정수 `n`과 정수 3개가 담긴 리스트 `slicer` 그리고 정수 여러 개가 담긴 리스트 `num_list`가 주어집니다. `slicer`에 담긴 정수를 차례대로 a, b, c라고 할 때, `n`에 따라 다음과 같이 `num_list`를 슬라이싱 하려고 합니다.

- `n = 1` : `num_list`의 0번 인덱스부터 `b`번 인덱스까지
- `n = 2` : `num_list`의 `a`번 인덱스부터 마지막 인덱스까지
- `n = 3` : `num_list`의 `a`번 인덱스부터 `b`번 인덱스까지
- `n = 4` : `num_list`의 `a`번 인덱스부터 `b`번 인덱스까지 `c` 간격으로

올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
### 제한사항
- `n` 은 1, 2, 3, 4 중 하나입니다.
- `slicer`의 길이 = 3
- `slicer`에 담긴 정수를 차례대로 a, b, c라고 할 때
    
    - 0 ≤ a ≤ b ≤ `num_list`의 길이 - 1
    - 1 ≤ c ≤ 3
- 5 ≤ `num_list`의 길이 ≤ 30
    
- 0 ≤ `num_list`의 원소 ≤ 100

### 입출력 예
![](https://i.imgur.com/Y0AzXCW.png)


## 문제 풀이
### 코드 설명

**코드의 목적:**

이 코드는 주어진 범위와 간격에 따라 배열에서 원소를 선택하고 이를 반환하는 기능을 가진 알고리즘입니다.

**코드의 주요 구조:**

1. 클래스 정의: Solution이라는 이름의 클래스를 정의합니다.
2. 메서드 정의: solution이라는 이름의 메서드를 정의합니다. 이 메서드는 정수(n), 정수 배열(slicer), 정수 배열(num_list)를 인자로 받아 처리합니다.

**코드의 주요 알고리즘:**

1. 'n'의 값에 따라 4가지 경우로 분기합니다.
2. 각 경우에 대해 주어진 범위와 간격에 따라 배열에서 원소를 선택하고 이를 리스트에 추가합니다.
3. 리스트를 배열로 변환하여 반환합니다.

**코드의 핵심:**

1. switch 문을 이용하여 'n'의 값에 따라 분기합니다.
2. for 문을 이용하여 주어진 범위와 간격에 따라 배열에서 원소를 선택합니다.
3. ArrayList와 Stream API를 이용하여 리스트를 배열로 변환합니다.

### 풀이
```
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> l = new ArrayList<>();

        int sIdx = slicer[0];
        int eIdx = slicer[1];
        int step = (n == 4) ? slicer[2] : 1;

        // 'n'의 값에 따라 분기
        switch (n) {
            case 1:
                // 처음부터 'eIdx'까지 'step' 간격으로 원소 선택
                for (int i = 0; i <= eIdx; i += step) {
                        l.add(num_list[i]);
                }
                break;

            case 2:
                // 'sIdx'부터 끝까지 'step' 간격으로 원소 선택
                for (int i = sIdx; i < num_list.length; i += step) {
                        l.add(num_list[i]);
                }
                break;

            case 3:
                // 'sIdx'부터 'eIdx'까지 'step' 간격으로 원소 선택
                for (int i = sIdx; i <= eIdx; i += step) {
                        l.add(num_list[i]);
                }
                break;
            case 4:
                // 'sIdx'부터 'eIdx'까지 'step' 간격으로 원소 선택
                for (int i = sIdx; i <= eIdx ; i += step) {
                        l.add(num_list[i]);
                }
                break;
        }

        // 리스트를 배열로 변환하여 반환
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}
```

