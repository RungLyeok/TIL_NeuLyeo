# [ Programmers ] 간단한 식 계산하기 ( java ) 88 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181865

## 문제 설명

문자열 `binomial`이 매개변수로 주어집니다. `binomial`은 "`a` `op` `b`" 형태의 이항식이고 `a`와 `b`는 음이 아닌 정수, `op`는 '+', '-', '*' 중 하나입니다. 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.


### 제한사항

- 0 ≤ `a`, `b` ≤ 40,000
- 0을 제외하고 `a`, `b`는 0으로 시작하지 않습니다.


### 입출력 예

|binomial|result|
|---|---|
|"43 + 12"|55|
|"0 - 7777"|-7777|
|"40000 * 40000"|1600000000|


### 입출력 예 설명

입출력 예 #1

- 예제 1번의 `binomial`은 "43 + 12"로 이 식을 계산한 결과인 43 + 12 = 55를 return 합니다.

입출력 예 #2

- 예제 2번의 `binomial`은 "0 - 7777"로 이 식을 계산한 결과인 0 - 7777 = -7777을 return 합니다.

입출력 예 #3

- 예제 3번의 `binomial`은 "40000 * 40000"으로 이 식을 계산한 결과인 40000 × 40000 = 1600000000을 return 합니다.

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 주어진 이항 연산자 문자열(binomial)에서 연산자(+, -, *)와 피연산자를 분리하고 해당 연산을 수행하여 결과를 반환합니다.
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서 split 메소드, switch-case 문, parseInt 메소드를 사용하여 문자열을 분리하고 연산을 수행합니다.
- 코드의 주요 알고리즘:
    
    - split 메소드를 사용하여 이항 연산자 문자열을 공백을 기준으로 분리합니다.
    - switch-case 문을 사용하여 연산자를 판단하고 해당 연산을 수행합니다.
    - parseInt 메소드를 사용하여 문자열을 숫자로 변환합니다.
- 코드의 핵심:
    
    - 주어진 이항 연산자 문자열에서 연산자와 피연산자를 분리하고 연산을 수행하는 것
    - switch-case 문을 효율적으로 사용하여 다양한 연산을 처리하는 것

### 풀이
```
class Solution {

    // solution 메소드 정의, 이항 연산자 문자열을 매개변수로 받음
    public int solution(String binomial) {
        // 이항 연산자 문자열을 공백을 기준으로 분리
        String[] str = binomial.split(" ");
        // 연산 결과를 저장할 변수 초기화
        int answer = 0;

        // 문자열 배열을 순회하며 연산 수행
        for (int i = 0; i < str.length; i++) {
            switch (str[i]) {
                case "+":
                    // 연산자가 '+'인 경우, 앞뒤 피연산자를 더함
                    answer = Integer.parseInt(str[i - 1]) + Integer.parseInt(str[i + 1]);
                    break;
                case "-":
                    // 연산자가 '-'인 경우, 앞 피연산자에서 뒤 피연산자를 뺌
                    answer = Integer.parseInt(str[i - 1]) - Integer.parseInt(str[i + 1]);
                    break;
                case "*":
                    // 연산자가 '*'인 경우, 앞뒤 피연산자를 곱함
                    answer = Integer.parseInt(str[i - 1]) * Integer.parseInt(str[i + 1]);
                    break;
            }
        }

        // 연산 결과 반환
        return answer;
    }
}
```

