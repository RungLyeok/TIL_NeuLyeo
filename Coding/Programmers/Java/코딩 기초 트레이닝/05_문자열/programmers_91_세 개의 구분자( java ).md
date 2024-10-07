# [ Programmers ] 세 개의 구분자 ( java ) 91 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181862

## 문제 설명

임의의 문자열이 주어졌을 때 문자 "a", "b", "c"를 구분자로 사용해 문자열을 나누고자 합니다.

예를 들어 주어진 문자열이 "baconlettucetomato"라면 나눠진 문자열 목록은 ["onlettu", "etom", "to"] 가 됩니다.

문자열 `myStr`이 주어졌을 때 위 예시와 같이 "a", "b", "c"를 사용해 나눠진 문자열을 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며, return할 배열이 빈 배열이라면 ["EMPTY"]를 return 합니다.


### 제한사항

- 1 ≤ `myStr`의 길이 ≤ 1,000,000
    - `myStr`은 알파벳 소문자로 이루어진 문자열 입니다.

### 입출력 예

|myStr|result|
|---|---|
|"baconlettucetomato"|["onlettu", "etom", "to"]|
|"abcd"|["d"]|
|"cabab"|["EMPTY"]|


### 입출력 예 설명

입출력 예 #1

- 문제 설명의 예시와 같습니다.

입출력 예 #2

- "c" 이전에는 "a", "b", "c" 이외의 문자가 없습니다.
- "c" 이후에 문자열 "d"가 있으므로 "d"를 저장합니다.
- 따라서 ["d"]를 return 합니다.

입출력 예 #3

- "a", "b", "c" 이외의 문자가 존재하지 않습니다. 따라서 저장할 문자열이 없습니다.
- 따라서 ["EMPTY"]를 return 합니다.

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 주어진 문자열(myStr)에서 'a', 'b', 'c'를 기준으로 분리하고, 비어 있지 않은 문자열만을 배열로 반환합니다. 만약 분리된 문자열이 없다면 'EMPTY'를 담은 배열을 반환합니다.
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서는 자바의 stream API를 사용하여 문자열을 분리하고 필터링합니다.
- 코드의 주요 알고리즘:
    
    - split 메소드를 사용하여 'a', 'b', 'c'를 기준으로 문자열을 분리합니다.
    - filter 메소드를 사용하여 비어 있지 않은 문자열만 선택합니다.
    - toArray 메소드를 사용하여 문자열 스트림을 배열로 변환합니다.
- 코드의 핵심:
    
    - 주어진 문자열에서 특정 문자를 기준으로 분리하고, 비어 있지 않은 문자열만 선택하는 것
    - 스트림 API를 효율적으로 사용하여 문자열 처리를 수행하는 것

### 풀이
```
import java.util.Arrays;

class Solution {

    // solution 메소드 정의, 주어진 문자열을 매개변수로 받음
    public String[] solution(String myStr) {
        
        // 문자열에서 'a', 'b', 'c'를 기준으로 분리하고 비어 있지 않은 문자열만 선택하여 배열로 변환
        String[] result = Arrays.stream(myStr.split("[abc]"))
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new); 

        // 분리된 문자열이 없다면 'EMPTY'를 담은 배열을 반환, 아니면 분리된 문자열 배열을 반환
        return result.length == 0 ? new String[]{"EMPTY"} : result;
    }
}
```

