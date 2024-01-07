# [ Programmers ] 원하는 문자열 찾기 ( java ) 75 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181878

## 문제 설명

알파벳으로 이루어진 문자열 `myString`과 `pat`이 주어집니다. `myString`의 연속된 부분 문자열 중 `pat`이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.

단, 알파벳 대문자와 소문자는 구분하지 않습니다.


### 제한사항

- 1 ≤ `myString`의 길이 ≤ 100,000
- 1 ≤ `pat`의 길이 ≤ 300
- `myString`과 `pat`은 모두 알파벳으로 이루어진 문자열입니다.


### 입출력 예

|myString|pat|return|
|---|---|---|
|"AbCdEfG"|"aBc"|1|
|"aaAA"|"aaaaa"|0|

### 입출력 예 설명

입출력 예 #1

- "AbCdEfG"의 0~2번 인덱스의 문자열은 "AbC"이며, 이는 `pat`인 "aBc"와 같습니다. 따라서 1을 return 합니다.

입출력 예 #2

- `myString`의 길이가 `pat`보다 더 짧기 때문에 `myString`의 부분 문자열 중 `pat`와 같은 문자열이 있을 수 없습니다. 따라서 0을 return 합니다.

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 주어진 문자열(myString)에서 특정 패턴(pat)이 포함되어 있는지 확인
    - 대소문자를 구분하지 않음
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서 문자열의 포함 여부를 확인하고 결과를 반환
- 코드의 주요 알고리즘:
    
    - toLowerCase 메소드를 사용하여 대소문자를 구분하지 않고 문자열의 포함 여부를 확인
    - 삼항 연산자를 사용하여 포함 여부에 따라 다른 결과를 반환
- 코드의 핵심:
    
    - 주어진 문자열에서 특정 패턴이 포함되어 있는지 대소문자를 구분하지 않고 확인하는 것
    - toLowerCase 메소드와 삼항 연산자 등을 효율적으로 사용

### 풀이
```
class Solution {

    // solution 메소드 정의, 두 개의 문자열을 매개변수로 받음
    public int solution(String myString, String pat) {
        
        // myString에서 pat가 포함되어 있으면 1을 반환, 그렇지 않으면 0을 반환
        // 대소문자를 구분하지 않기 위해 두 문자열을 모두 소문자로 변환하여 비교
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
```

