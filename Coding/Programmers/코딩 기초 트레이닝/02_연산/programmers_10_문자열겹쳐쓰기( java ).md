# [ Programmers ]  문자열 겹쳐쓰기 ( java ) 10 / 124

https://school.programmers.co.kr/learn/courses/30/lessons/181943
## 문제 
### 문제 설명
![](https://i.imgur.com/ikWLkxl.png)

### 제한사항
![](https://i.imgur.com/2IwDHxS.png)

### 입출력 예
  ![](https://i.imgur.com/O6qPFjU.png)

## 문제 풀이
### 문제 접근
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public String solution(String my_string, String overwrite_string, int s)`: 문자열을 수정하는 함수를 정의합니다. 이 함수는 다음 세 개의 매개변수를 받습니다.
    - `my_string`: 수정할 문자열입니다.
    - `overwrite_string`: 덮어쓸 문자열입니다.
    - `s`: 덮어쓸 시작 위치입니다.

**2. 문자열 수정:**

- `String answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());`: 문자열을 수정하는 부분입니다.
    - `my_string.substring(0, s)`: 원본 문자열에서 0부터 `s`까지의 부분 문자열을 추출합니다.
    - `overwrite_string`: 덮어쓸 문자열입니다.
    - `my_string.substring(s + overwrite_string.length())`: 원본 문자열에서 `s` + `overwrite_string`의 길이 이후의 부분 문자열을 추출합니다.
    - 이 세 부분을 더하여 새로운 문자열 `answer`를 만듭니다.

**3. 결과 반환:**

- `return answer;`: 수정된 문자열 `answer`를 반환합니다.


### 풀이
```
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s) + overwrite_string 
            + my_string.substring(s + overwrite_string.length());
        return answer;
    }
}
```








