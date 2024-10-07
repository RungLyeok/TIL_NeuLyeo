# [ Programmers ] 글자 지우기 ( java ) 53 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181900

## 문제 
### 문제 설명
문자열 `my_string`과 정수 배열 `indices`가 주어질 때, `my_string`에서 `indices`의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
### 제한사항
- 1 ≤ `indices`의 길이 < `my_string`의 길이 ≤ 100
- `my_string`은 영소문자로만 이루어져 있습니다
- 0 ≤ `indices`의 원소 < `my_string`의 길이
- `indices`의 원소는 모두 서로 다릅니다.

### 입출력 예
![](https://i.imgur.com/QLEobVh.png)

## 문제 풀이
### 코드 설명

**코드의 목적:**

이 코드는 주어진 문자열(my_string)에서 특정 위치(indices 배열에 저장된 인덱스)의 문자를 제거하는 기능을 가진 알고리즘입니다.

**코드의 주요 구조:**

1. 클래스 정의: Solution이라는 이름의 클래스를 정의합니다.
2. 메서드 정의: solution이라는 이름의 메서드를 정의합니다. 이 메서드는 문자열(my_string)과 정수 배열(indices)을 인자로 받아 처리합니다.

**코드의 주요 알고리즘:**

1. 문자열을 StringBuilder로 변환합니다.
2. 제거할 문자의 위치를 저장한 배열(indices)을 오름차순으로 정렬합니다.
3. 배열을 역순으로 순회하면서 해당 위치의 문자를 삭제합니다.

**코드의 핵심:**

1. StringBuilder의 deleteCharAt 메서드를 이용하여 문자열의 특정 위치에 있는 문자를 제거합니다.
2. 배열을 역순으로 순회하여 문자를 제거하므로 원래의 문자열의 구조가 유지됩니다.

### 풀이
```
import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        
        // 제거할 문자의 위치를 저장한 배열을 오름차순으로 정렬
        Arrays.sort(indices);
        
        // 배열을 역순으로 순회하면서 해당 위치의 문자를 삭제
        for (int i = indices.length - 1; i >= 0; i--) {
            sb.deleteCharAt(indices[i]);
        }
        
        // 최종 결과 문자열을 반환
        return sb.toString();
    }
}
```

