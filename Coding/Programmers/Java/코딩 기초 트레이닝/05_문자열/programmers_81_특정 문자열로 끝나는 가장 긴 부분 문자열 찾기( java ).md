# [ Programmers ] 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기 ( java ) 81 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181872

## 문제 설명

문자열 `myString`과 `pat`가 주어집니다. `myString`의 부분 문자열중 `pat`로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.


### 제한사항

- 5 ≤ `myString` ≤ 20
- 1 ≤ `pat` ≤ 5
    - `pat`은 반드시 `myString`의 부분 문자열로 주어집니다.
- `myString`과 `pat`에 등장하는 알파벳은 대문자와 소문자를 구분합니다.


### 입출력 예

|myString|pat|result|
|---|---|---|
|"AbCdEFG"|"dE"|"AbCdE"|
|"AAAAaaaa"|"a"|"AAAAaaaa"|


### 입출력 예 설명

입출력 예 #1

- "AbCdEFG"에서 "dE"는 한 번 등장하며 처음부터 해당 위치까지 잘라내면 "AbCdE"가 됩니다. 따라서 이 문자열이 "dE"로 끝나는 가장 긴 문자열이며, "AbCdE"를 return 합니다.

입출력 예 #2

- "AAAAaaaa"에서 "a"는 총 네 번 등장하며 이 중 가장 마지막에 있는 위치까지 잘라내면 "AAAAaaaa"가 됩니다. 따라서 이 문자열이 "a"로 끝나는 가장 긴 문자열이며, "AAAAaaaa"를 return 합니다.


## 문제 풀이
### 코드 설명
-  코드의 목적:
    
    - 주어진 문자열(myString)에서 특정 문자열(pat)로 끝나는 가장 긴 부분 문자열을 찾아 반환
- 코드의 주요 구조:
    
    - programmers_81_특정문자열로끝나는가장긴부분문자열찾기 클래스와 solution 메소드로 구성
    - solution 메소드에서 substring과 lastIndexOf 메소드를 사용하여 결과 문자열을 생성하고 반환
- 코드의 주요 알고리즘:
    
    - lastIndexOf 메소드를 사용하여 특정 문자열이 마지막으로 나타나는 위치를 찾음
    - substring 메소드를 사용하여 해당 위치까지의 부분 문자열을 추출
- 코드의 핵심:
    
    - 주어진 문자열에서 특정 문자열로 끝나는 가장 긴 부분 문자열을 찾는 것
    - substring, lastIndexOf 메소드 등을 효율적으로 사용

### 풀이
```
class Solution {
    public String solution(String myString, String pat) {
        
         // 주어진 문자열에서 특정 문자열로 끝나는 가장 긴 부분 문자열을 찾아 반환
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}
```

