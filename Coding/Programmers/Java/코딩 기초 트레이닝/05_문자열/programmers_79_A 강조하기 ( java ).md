# [ Programmers ] A 강조하기 ( java ) 79 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181874

## 문제 설명

문자열 `myString`이 주어집니다. `myString`에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.


### 제한사항

- 1 ≤ `myString`의 길이 ≤ 20
    - `myString`은 알파벳으로 이루어진 문자열입니다.


### 입출력 예

|myString|result|
|---|---|
|"abstract algebra"|"AbstrAct AlgebrA"|
|"PrOgRaMmErS"|"progrAmmers"|

### 입출력 예 설명

입출력 예 #1

- 0번, 5번, 9번, 15번 인덱스의 "a"는 소문자이므로 전부 대문자로 고쳐줍니다.
- 다른 문자들은 전부 "a"가 아닌 소문자이므로 바꾸지 않습니다.
- 따라서 "AbstrAct AlgebrA"를 return 합니다.

입출력 예 #2

- 0번, 2번, 4번, 6번, 8번, 10번 인덱스의 문자들은 "A"가 아닌 대문자이므로 전부 소문자로 고쳐줍니다.
- 5번 인덱스의 "a"는 소문자이므로 대문자로 고쳐줍니다.
- 다른 문자들은 전부 "a"가 아닌 소문자이므로 바꾸지 않습니다.
- 따라서 "progrAmmers"를 return 합니다.


## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 주어진 문자열(myString)에서 'a' 문자를 대문자로 변환
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서 StringBuilder를 사용하여 결과 문자열을 생성하고 반환
- 코드의 주요 알고리즘:
    
    - toCharArray 메소드를 사용하여 문자열을 문자 배열로 변환
    - for-each loop를 사용하여 문자 배열을 순회하며 변환
    - 삼항 연산자를 사용하여 'a' 문자인 경우 대문자로 변환, 그렇지 않은 경우 원래 문자를 그대로 사용
- 코드의 핵심:
    
    - 주어진 문자열에서 'a' 문자를 대문자로 변환하는 것
    - StringBuilder, toCharArray 메소드 등을 효율적으로 사용

### 풀이
```
class Solution {

    // solution 메소드 정의, 문자열을 매개변수로 받음
    public String solution(String myString) {
        // 결과를 저장할 StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();

        // 입력 문자열을 소문자로 변환하고, 문자 배열로 변환하여 순회
        for (char c : myString.toLowerCase().toCharArray()) {
            // 문자가 'a'인 경우 대문자로 변환하여 추가, 그렇지 않은 경우 원래 문자를 그대로 추가
            sb.append(c == 'a' ? Character.toUpperCase(c) : c);
        }

        // 최종 결과 문자열을 반환
        return sb.toString();
    }
}
```

