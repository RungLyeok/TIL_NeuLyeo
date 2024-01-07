# [ Programmers ] 소문자로 바꾸기 ( java ) 77 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181876

## 문제 설명

알파벳으로 이루어진 문자열 `myString`이 주어집니다. 모든 알파벳을 소문자로 변환하여 return 하는 solution 함수를 완성해 주세요.


### 제한사항

- 1 ≤ `myString`의 길이 ≤ 100,000
    - `myString`은 알파벳으로 이루어진 문자열입니다.


### 입출력 예

|myString|result|
|---|---|
|"aBcDeFg"|"abcdefg"|
|"aaa"|"aaa"|

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 주어진 문자열(myString)을 모두 소문자로 변환
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서 문자열을 소문자로 변환하고 결과를 반환
- 코드의 주요 알고리즘:
    
    - toLowerCase 메소드를 사용하여 문자열을 소문자로 변환
- 코드의 핵심:
    
    - 주어진 문자열을 모두 소문자로 변환하는 것
    - toLowerCase 메소드를 효율적으로 사용

### 풀이
```
class Solution {

    // solution 메소드 정의, 문자열을 매개변수로 받음
    public String solution(String myString) {
        
        // myString을 모두 대문자로 변환하여 반환
        return myString.toUpperCase();
    }
}
```

