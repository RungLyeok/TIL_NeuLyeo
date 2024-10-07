# [ Programmers ] 문자열 바꿔서 찾기 ( java ) 89 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181864

## 문제 설명

문자 "A"와 "B"로 이루어진 문자열 `myString`과 `pat`가 주어집니다. `myString`의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 `pat`이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.


### 제한사항

- 1 ≤ `myString`의 길이 ≤ 100
- 1 ≤ `pat`의 길이 ≤ 10
    - `myString`과 `pat`는 문자 "A"와 "B"로만 이루어진 문자열입니다.


### 입출력 예

|myString|pat|result|
|---|---|---|
|"ABBAA"|"AABB"|1|
|"ABAB"|"ABAB"|0|


### 입출력 예 설명

입출력 예 #1

- "ABBAA"에서 "A"와 "B"를 서로 바꾸면 "BAABB"입니다. 여기에는 부분문자열 "AABB"가 있기 때문에 1을 return 합니다.

입출력 예 #2

- "ABAB"에서 "A"와 "B"를 서로 바꾸면 "BABA"입니다. 여기에는 부분문자열 "BABA"가 없기 때문에 0을 return 합니다.

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 주어진 문자열(myString)에서 패턴 문자열(pat)이 존재하는지 확인합니다. 단, 패턴 문자열에서 'A'는 'B'로, 'B'는 'A'로 변경하여 확인합니다.
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서 replace 메소드, contains 메소드를 사용하여 문자열 변경 및 패턴 존재 여부를 확인합니다.
- 코드의 주요 알고리즘:
    
    - replace 메소드를 사용하여 패턴 문자열에서 'A'를 'B'로, 'B'를 'A'로 변경합니다. 이때, 중간 단계로 'X'를 사용하여 'A'와 'B'의 변경이 서로 영향을 미치지 않게 합니다.
    - contains 메소드를 사용하여 변경된 패턴이 주어진 문자열에 존재하는지 확인합니다.
- 코드의 핵심:
    
    - 주어진 패턴 문자열에서 특정 문자를 다른 문자로 변경하고, 변경된 패턴이 주어진 문자열에 존재하는지 확인하는 것
    - 문자열 변경 시 중간 단계를 사용하여 원하는 결과를 얻는 것

### 풀이
```
class Solution {

    // solution 메소드 정의, 주어진 문자열과 패턴 문자열을 매개변수로 받음
    public int solution(String myString, String pat) {
        // 패턴 문자열에서 'A'를 'B'로, 'B'를 'A'로 변경. 중간 단계로 'X'를 사용
        pat = pat.replace("A", "X").replace("B", "A")
                .replace("X", "B");
        
        // 변경된 패턴이 주어진 문자열에 존재하는지 확인하고 존재하면 1, 아니면 0을 반환
        return myString.contains(pat) ? 1 : 0;
    }
}
```

