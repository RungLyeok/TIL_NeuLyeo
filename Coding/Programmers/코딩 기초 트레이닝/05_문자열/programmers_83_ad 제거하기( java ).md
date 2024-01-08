# [ Programmers ] ad 제거하기 ( java ) 83 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181870

## 문제 설명

문자열 배열 `strArr`가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.

### 제한사항

- 1 ≤ `strArr`의 길이 ≤ 1,000
    - 1 ≤ `strArr`의 원소의 길이 ≤ 20
    - `strArr`의 원소는 알파벳 소문자로 이루어진 문자열입니다.


### 입출력 예

|strArr|result|
|---|---|
|["and","notad","abcd"]|["and","abcd"]|
|["there","are","no","a","ds"]|["there","are","no","a","ds"]|


### 입출력 예 설명

입출력 예 #1

- 1번 인덱스의 문자열인 "notad"는 부분 문자열로 "ad"를 가집니다. 따라서 해당 문자열을 제거하고 나머지는 순서를 유지하여 ["and","abcd"]를 return 합니다.

입출력 예 #2

- "ad"가 부분 문자열로 들어간 문자열이 존재하지 않습니다. 따라서 원래 배열을 그대로 return 합니다.


## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 주어진 문자열 배열(strArr)에서 "ad"를 포함하지 않는 문자열들만을 찾아 새로운 배열로 반환
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서 Java Stream API를 사용하여 조건에 맞는 문자열을 필터링하고 새로운 배열로 반환
- 코드의 주요 알고리즘:
    
    - Java Stream API의 stream 메소드를 사용하여 배열을 Stream으로 변환
    - filter 메소드를 사용하여 "ad"를 포함하지 않는 문자열만을 선택
    - toArray 메소드를 사용하여 Stream을 배열로 변환
- 코드의 핵심:
    
    - 주어진 문자열 배열에서 특정 문자열을 포함하지 않는 문자열만을 선택하는 것
    - Java Stream API를 효율적으로 사용

### 풀이
```
import java.util.Arrays;

class Solution {

    // solution 메소드 정의, 문자열 배열을 매개변수로 받음
    public String[] solution(String[] strArr) {

        // 주어진 문자열 배열에서 "ad"를 포함하지 않는 문자열들만을 찾아 새로운 배열로 반환
        return Arrays.stream(strArr)
                .filter(x -> !x.contains("ad"))
                .toArray(String[]::new);
    }
}
```

