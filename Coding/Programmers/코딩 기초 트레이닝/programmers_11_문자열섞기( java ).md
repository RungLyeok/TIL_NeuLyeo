# [ Programmers ]  문자열 섞기 ( java ) 11 / 124

https://school.programmers.co.kr/learn/courses/30/lessons/181942
## 문제 
### 문제 설명
![](https://i.imgur.com/CufclaR.png)

### 제한사항
![](https://i.imgur.com/uwZa0BM.png)


### 입출력 예
  ![](https://i.imgur.com/XPs5vwX.png)


## 문제 풀이
### 문제 접근
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public String solution(String str1, String str2)`: 두 개의 문자열을 인자로 받아 새로운 문자열을 생성하는 함수를 정의합니다.

**2. StringBuilder 생성:**

- `StringBuilder sb = new StringBuilder();`: 문자열을 효율적으로 조작하기 위해 `StringBuilder` 객체를 생성합니다.

**3. 문자열 병합:**

- `for (int i = 0; i < str1.length(); i++)`: `str1`의 길이만큼 반복문을 실행합니다.
    - `sb.append(str1.charAt(i));`: `str1`의 i번째 문자를 `StringBuilder`에 추가합니다.
    - `sb.append(str2.charAt(i));`: `str2`의 i번째 문자를 `StringBuilder`에 추가합니다.

**4. 결과 반환:**

- `return sb.toString();`: `StringBuilder`에 저장된 문자열을 `String`으로 변환하여 반환합니다.

**실행 예시:**

```
String str1 = "hello";
String str2 = "world";

String result = new Solution().solution(str1, str2);
System.out.println(result);  // 출력: hweolrllod
```

### 풀이
```
class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        return sb.toString();
    }
}
```












