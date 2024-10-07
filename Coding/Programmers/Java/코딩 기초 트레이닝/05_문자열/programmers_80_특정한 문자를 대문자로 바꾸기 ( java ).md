# [ Programmers ] 특정한 문자를 대문자로 바꾸기 ( java ) 80 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181873

## 문제 설명

영소문자로 이루어진 문자열 `my_string`과 영소문자 1글자로 이루어진 문자열 `alp`가 매개변수로 주어질 때, `my_string`에서 `alp`에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.


### 제한사항

- 1 ≤ `my_string`의 길이 ≤ 1,000


### 입출력 예

|my_string|alp|result|
|---|---|---|
|"programmers"|"p"|"Programmers"|
|"lowercase"|"x"|"lowercase"|


### 입출력 예 설명

입출력 예 #1

- 예제 1번의 `my_string`은 "programmers"이고 `alp`가 "p"이므로 `my_string`에 모든 p를 대문자인 P로 바꾼 문자열 "Programmers"를 return 합니다.

입출력 예 #2

- 예제 2번의 `alp`는 "x"이고 `my_string`에 x는 없습니다. 따라서 "lowercase"를 return 합니다.


## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 주어진 문자열(my_string)에서 특정 문자(alp)를 대문자로 변환
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서 StringBuilder를 사용하여 결과 문자열을 생성하고 반환
- 코드의 주요 알고리즘:
    
    - toCharArray 메소드를 사용하여 문자열을 문자 배열로 변환
    - for-each loop를 사용하여 문자 배열을 순회하며 변환
    - 삼항 연산자를 사용하여 특정 문자인 경우 대문자로 변환, 그렇지 않은 경우 원래 문자를 그대로 사용
- 코드의 핵심:
    
    - 주어진 문자열에서 특정 문자를 대문자로 변환하는 것
    - StringBuilder, toCharArray 메소드 등을 효율적으로 사용

### 풀이
```
class Solution {

    // solution 메소드 정의, 문자열과 특정 문자를 매개변수로 받음
    public String solution(String my_string, String alp) {
        // 결과를 저장할 StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();

        // 입력 문자열을 소문자로 변환하고, 문자 배열로 변환하여 순회
        for (char c : my_string.toLowerCase().toCharArray()) {
            // 문자가 특정 문자인 경우 대문자로 변환하여 추가, 그렇지 않은 경우 원래 문자를 그대로 추가
            sb.append(c == alp.charAt(0) ? Character.toUpperCase(c) : c);
        }

        // 최종 결과 문자열을 반환
        return sb.toString();
    }
}
```

