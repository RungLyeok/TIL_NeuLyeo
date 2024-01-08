# [ Programmers ] 문자열이 몇 번 등장하는지 세기 ( java ) 82 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181871

## 문제 설명

문자열 `myString`과 `pat`이 주어집니다. `myString`에서 `pat`이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.


### 제한사항

- 1 ≤ `myString` ≤ 1000
- 1 ≤ `pat` ≤ 10


### 입출력 예

|myString|pat|result|
|---|---|---|
|"banana"|"ana"|2|
|"aaaa"|"aa"|3|


##### 입출력 예 설명

입출력 예 #1

- "banana"에서 1 ~ 3번 인덱스에서 한 번, 3 ~ 5번 인덱스에서 또 한 번 "ana"가 등장해서 총 두 번 등장합니다. 따라서 2를 return 합니다.

입출력 예 #2

- "aaaa"에서 0 ~ 2번 인덱스에서 한 번, 1 ~ 3번 인덱스에서 한 번, 2 ~ 4번 인덱스에서 한 번 "aa"가 등장해서 총 세 번 등장합니다. 따라서 3을 return 합니다.


## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 주어진 문자열(myString)에서 특정 문자열(pat)이 등장하는 횟수를 찾아 반환
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서 for loop와 startsWith 메소드를 사용하여 특정 문자열이 등장하는 횟수를 계산
- 코드의 주요 알고리즘:
    
    - for loop를 사용하여 문자열을 순회하며 특정 위치에서 시작하는 부분 문자열이 특정 문자열과 일치하는지 확인
    - startsWith 메소드를 사용하여 특정 위치에서 시작하는 부분 문자열이 특정 문자열과 일치하는지 확인
- 코드의 핵심:
    
    - 주어진 문자열에서 특정 문자열이 등장하는 횟수를 찾는 것
    - startsWith 메소드 등을 효율적으로 사용

### 풀이
```
class Solution {

    // solution 메소드 정의, 문자열과 특정 문자열을 매개변수로 받음
    public int solution(String myString, String pat) {
        // 특정 문자열이 등장하는 횟수를 저장할 변수 선언
        int answer = 0;

        // 문자열을 순회하며 특정 위치에서 시작하는 부분 문자열이 특정 문자열과 일치하는지 확인
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            // 특정 위치에서 시작하는 부분 문자열이 특정 문자열과 일치하면 횟수를 증가
            if (myString.startsWith(pat, i)) {
                answer++;
            }
        }

        // 특정 문자열이 등장하는 횟수를 반환
        return answer;
    }
}
```

