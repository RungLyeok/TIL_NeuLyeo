# [ Programmers ]  문자 리스트 문자열 변환하기 ( java ) 12 / 124

https://school.programmers.co.kr/learn/courses/30/lessons/181941
## 문제 
### 문제 설명
![](https://i.imgur.com/cMl6DnF.png)


### 제한사항
![](https://i.imgur.com/IGbqUrG.png)



### 입출력 예
  ![](https://i.imgur.com/aFpO1ZU.png)



## 문제 풀이
### 코드 설명
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public String solution(String[] arr)`: 문자열 배열을 인자로 받아 하나의 문자열로 합치는 함수를 정의합니다.

**2. 문자열 배열 병합:**

- `return String.join("", arr);`: `String.join` 메서드를 사용하여 문자열 배열을 하나의 문자열로 병합합니다.
    - `String.join(delimiter, elements)`: 지정한 구분자(`delimiter`)로 문자열 배열의 요소(`elements`)를 연결하는 메서드입니다.
    - 이 경우 구분자를 빈 문자열("")로 지정하여 문자열을 직접 이어 붙입니다.

**실행 예시:**

Java

```
String[] arr = {"hello", " ", "world"};

String result = new Solution().solution(arr);
System.out.println(result);  // 출력: hello world
```

### 풀이
```
class Solution {
    public String solution(String[] arr) {
        return String.join("", arr);
    }
}
```












