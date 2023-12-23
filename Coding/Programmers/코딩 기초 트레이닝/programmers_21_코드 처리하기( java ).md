# [ Programmers ] _ 코드 처리하기 ( java )
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
1. 변수 선언:

- `answer`: 결과 문자열을 저장하기 위한 변수입니다.
- `mode`: 현재 모드를 저장하기 위한 변수입니다. 0 또는 1의 값을 가질 수 있습니다.

2. 반복문:

- `for` 문을 사용하여 `code`의 길이만큼 반복합니다.

3. 모드 전환:

- `code.charAt(i) == '1'`이면 현재 문자가 '1'이므로 `mode`를 1 - mode로 바꿉니다. 즉, 0에서 1로 또는 1에서 0으로 전환합니다.

4. 문자 추가:

- `mode`가 0이고 `i`가 짝수이면 현재 문자를 `answer`에 추가합니다.
- `mode`가 1이고 `i`가 홀수이면 현재 문자를 `answer`에 추가합니다.

5. 결과 반환:

- `answer`가 비어있으면 "EMPTY"를 반환하고, 그렇지 않으면 `answer`를 반환합니다.
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







