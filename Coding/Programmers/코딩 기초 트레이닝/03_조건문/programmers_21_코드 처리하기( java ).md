# [ Programmers ]  코드 처리하기 ( java ) 21 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181932

## 문제 
### 문제 설명
문자열 `code`가 주어집니다.  
`code`를 앞에서부터 읽으면서 만약 문자가 "1"이면 `mode`를 바꿉니다. `mode`에 따라 `code`를 읽어가면서 문자열 `ret`을 만들어냅니다.

`mode`는 0과 1이 있으며, `idx`를 0 부터 `code의 길이 - 1` 까지 1씩 키워나가면서 `code[idx]`의 값에 따라 다음과 같이 행동합니다.

- `mode`가 0일 때
    - `code[idx]`가 "1"이 아니면 `idx`가 짝수일 때만 `ret`의 맨 뒤에 `code[idx]`를 추가합니다.
    - `code[idx]`가 "1"이면 `mode`를 0에서 1로 바꿉니다.
- `mode`가 1일 때
    - `code[idx]`가 "1"이 아니면 `idx`가 홀수일 때만 `ret`의 맨 뒤에 `code[idx]`를 추가합니다.
    - `code[idx]`가 "1"이면 `mode`를 1에서 0으로 바꿉니다.

문자열 `code`를 통해 만들어진 문자열 `ret`를 return 하는 solution 함수를 완성해 주세요.

단, 시작할 때 `mode`는 0이며, return 하려는 `ret`가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.
### 제한사항
- 1 ≤ `code`의 길이 ≤ 100,000
    - `code`는 알파벳 소문자 또는 "1"로 이루어진 문자열입니다.

### 입출력 예
![](https://i.imgur.com/w7z0dUW.png)

## 문제 풀이
### 코드 설명
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public String solution(String code)`: 문자열 `code`를 인자로 받아 특정 규칙에 따라 문자를 선택하여 반환하는 함수를 정의합니다.

**2. 변수 초기화:**

- `String answer = "";`: 결과 문자열을 저장할 빈 문자열을 생성합니다.
- `int mode = 0;`: 모드를 저장할 변수를 0으로 초기화합니다. 이 모드는 문자 선택 방식을 결정하는 데 사용됩니다.

**3. 문자열 순회 및 문자 선택:**

- `for (int i = 0; i < code.length(); i++) { ... }`: 문자열 `code`를 처음부터 끝까지 순회합니다.
- `if(code.charAt(i) == '1') { mode = 1 - mode; }`: 현재 문자가 '1'이라면 모드를 반전합니다. 즉, 0이라면 1로, 1이라면 0으로 바꿉니다.
- `else { ... }`: 현재 문자가 '1'이 아닌 경우입니다.
    - `if (mode == 0 && i % 2 == 0){ answer += code.charAt(i); }`: 모드가 0이고 인덱스가 짝수라면 현재 문자를 `answer`에 추가합니다.
    - `else if (mode == 1 && i % 2 == 1) { answer += code.charAt(i); }`: 모드가 1이고 인덱스가 홀수라면 현재 문자를 `answer`에 추가합니다.

**4. 결과 반환:**

- `return answer.isEmpty() ? "EMPTY" : answer;`: `answer`가 비어있다면 "EMPTY"를 반환하고, 그렇지 않다면 `answer`를 반환합니다.

### 풀이
```
class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            if(code.charAt(i) == '1') {
                mode = 1 - mode;
            } else {
                if (mode == 0 && i % 2 == 0){
                    answer += code.charAt(i);
                } else if (mode == 1 && i % 2 == 1) {
                    answer += code.charAt(i);
                }
            }
        }
        
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}
```







