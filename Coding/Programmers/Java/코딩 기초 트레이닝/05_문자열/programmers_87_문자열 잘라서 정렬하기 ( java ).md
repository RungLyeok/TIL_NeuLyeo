# [ Programmers ] 문자열 잘라서 정렬하기 ( java ) 87 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181866

## 문제 설명

문자열 `myString`이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.

단, 빈 문자열은 반환할 배열에 넣지 않습니다.


### 제한사항

- 1 ≤ `myString` ≤ 100,000
    - `myString`은 알파벳 소문자로 이루어진 문자열입니다.


### 입출력 예

|myString|result|
|---|---|
|"axbxcxdx"|["a","b","c","d"]|
|"dxccxbbbxaaaa"|["aaaa","bbb","cc","d"]|


### 입출력 예 설명

입출력 예 #1

- `myString`을 "x"를 기준으로 자른 배열은 ["a","b","c","d"]이며, 이 배열은 이미 사전순으로 정렬된 상태입니다. 따라서 해당 배열을 return 합니다.

입출력 예 #2

- `myString`을 "x"를 기준으로 자른 배열은 ["d","cc","bbb","aaaa"]이며, 이 배열을 사전순으로 정렬하면 ["aaaa","bbb","cc","d"]입니다. 따라서 해당 배열을 return 합니다.

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 주어진 문자열(myString)에서 'x' 문자를 기준으로 문자열을 분리하고, 비어있지 않은 문자열을 추출하여 정렬한 후 문자열 배열로 반환합니다.
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서 Stream API, split 메소드, filter 메소드, sorted 메소드를 사용하여 문자열을 분리, 필터링, 정렬하고 배열로 변환합니다.
- 코드의 주요 알고리즘:
    
    - split 메소드를 사용하여 문자열을 'x' 문자를 기준으로 분리합니다.
    - Stream API의 filter 메소드를 사용하여 비어있지 않은 문자열을 추출합니다.
    - sorted 메소드를 사용하여 문자열을 정렬합니다.
    - toArray 메소드를 사용하여 Stream을 문자열 배열로 변환합니다.
- 코드의 핵심:
    
    - 주어진 문자열에서 특정 문자를 기준으로 문자열을 분리하고 필터링, 정렬하는 것
    - Stream API를 효율적으로 사용하여 결과를 배열로 변환하는 것

### 풀이
```
import java.util.Arrays;

class Solution {

    // solution 메소드 정의, 문자열을 매개변수로 받음
    public String[] solution(String myString) {
        // 문자열을 'x' 문자를 기준으로 분리하고, 비어있지 않은 문자열을 추출하여 정렬한 후 문자열 배열로 변환
        return Arrays.stream(myString.split("x"))
                .filter(x -> !x.isEmpty())
                .sorted()
                .toArray(String[]::new);
    }
}
```

