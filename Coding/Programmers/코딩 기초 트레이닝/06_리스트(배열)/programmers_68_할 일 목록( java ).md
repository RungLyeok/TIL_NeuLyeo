# [ Programmers ] 할 일 목록 ( java ) 68 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181885

## 문제 설명

오늘 해야 할 일이 담긴 문자열 배열 `todo_list`와 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 `finished`가 매개변수로 주어질 때, `todo_list`에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.


### 제한사항

- 1 ≤ `todo_list`의 길이 1 ≤ 100
- 2 ≤ `todo_list`의 원소의 길이 ≤ 20
    - `todo_list`의 원소는 영소문자로만 이루어져 있습니다.
    - `todo_list`의 원소는 모두 서로 다릅니다.
- `finished[i]`는 true 또는 false이고 true는 `todo_list[i]`를 마쳤음을, false는 아직 마치지 못했음을 나타냅니다.
- 아직 마치지 못한 일이 적어도 하나 있습니다.


### 입출력 예

|todo_list|finished|result|
|---|---|---|
|["problemsolving", "practiceguitar", "swim", "studygraph"]|[true, false, true, false]|["practiceguitar", "studygraph"]|


### 입출력 예 설명

입출력 예 #1

- 예제 1번의 `todo_list` 중에서 "problemsolving"과 "swim"은 마쳤고, "practiceguitar"와 "studygraph"는 아직 마치지 못했으므로 `todo_list`에서 나온 순서대로 담은 문자열 배열 ["practiceguitar", "studygraph"]를 return 합니다.


## 문제 풀이
### 코드 설명

**코드의 목적:**

이 코드는 할 일 목록(todo_list)과 그에 대응하는 완료 여부 배열(finished)을 인자로 받아, 아직 완료되지 않은 할 일들만을 추려 새로운 배열로 반환하는 기능을 가진 알고리즘입니다.

**코드의 주요 구조:**

1. ArrayList 정의: String 형태의 ArrayList를 정의합니다.
2. for문: 주어진 할 일 목록 배열의 각 원소에 대해 반복문을 실행합니다.
3. 조건문: 할 일이 아직 완료되지 않은 경우(즉, finished[i]가 false인 경우), 해당 할 일을 ArrayList에 추가합니다.
4. 반환: ArrayList의 원소들을 배열로 변환하여 반환합니다.

**코드의 주요 알고리즘:**

1. 할 일 목록 배열의 각 원소에 대해 반복문을 실행합니다.
2. 할 일이 아직 완료되지 않은 경우, 해당 할 일을 ArrayList에 추가합니다.
3. ArrayList의 원소들을 배열로 변환하여 반환합니다.

**코드의 핵심:**

1. for문과 if문을 이용하여 완료되지 않은 할 일을 찾아냅니다.
2. ArrayList의 add 메서드를 이용하여 할 일을 추가합니다.
3. ArrayList의 toArray 메서드를 이용하여 ArrayList의 원소들을 배열로 변환합니다.

### 풀이
```
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        // String 형태의 ArrayList를 정의
        ArrayList<String> l = new ArrayList<>();

        // 할 일 목록 배열의 각 원소에 대해 반복문을 실행
        for (int i = 0; i < todo_list.length; i++) {
            
            // 할 일이 아직 완료되지 않은 경우, 해당 할 일을 ArrayList에 추가
            if (!finished[i]) {
                l.add(todo_list[i]);
            }
        }

        // ArrayList의 원소들을 배열로 변환하여 반환
        return l.toArray(new String[0]);
    }
}
```

