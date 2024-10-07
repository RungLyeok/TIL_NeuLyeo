# [ Programmers ] 문자열안에 문자 ( java )

https://school.programmers.co.kr/learn/courses/30/lessons/120908
## 문제 
### 문제 설명
문자열 `str1`, `str2`가 매개변수로 주어집니다. `str1` 안에 `str2`가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

### 제한사항
- 1 ≤ `str1`의 길이 ≤ 100
- 1 ≤ `str2`의 길이 ≤ 100
- 문자열은 알파벳 대문자, 소문자, 숫자로 구성되어 있습니다.

### 입출력 예
![](https://i.imgur.com/PJqDZHM.png)


## 문제 풀이
### 코드 설명
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public int solution(String str1, String str2)`: 두 개의 문자열 `str1`과 `str2`를 입력받아 정수 값을 반환하는 함수입니다.

**2. 변수 초기화:**

- `int answer = 2`: 결과 값을 저장할 변수를 2로 초기화합니다.

**3. 문자열 비교:**

- `for(int i = 0; i <= str1.length() - str2.length(); i++) { ... }`: `str1`의 각 인덱스부터 `str2`의 길이만큼 부분 문자열을 비교하기 위한 반복문을 시작합니다.
    - `if (str1.startsWith(str2, i)) { ... }`: `str1`이 인덱스 `i`에서 시작하여 `str2`와 일치하는 경우 다음을 수행합니다.
        - `answer = 1`: 결과 값을 1로 변경합니다.
        - `break`: 반복문을 종료합니다.

**4. 결과 반환:**

- `return answer`: 비교 결과에 따른 값(1 또는 2)을 반환합니다.

**코드의 역할:**

이 코드는 두 개의 문자열 `str1`과 `str2`를 비교하여 다음과 같은 결과를 반환합니다.

- `str1`이 `str2`를 부분 문자열로 포함하는 경우: 1을 반환합니다.
- `str1`이 `str2`를 부분 문자열로 포함하지 않는 경우: 2를 반환합니다.

### 풀이

```
class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        
        for(int i = 0; i <= str1.length() - str2.length(); i++) {
            if (str1.startsWith(str2, i)) {
                answer = 1;
                break;
            }
        }
        
        return answer;

    }
}
```
