# [ Programmers ] _ 문자열 섞기 ( java )

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
`StringBuilder` 를 사용해서 문제 해결

`.split("")` 을 사용해서 문자로 나눈 str1arr를 생성한다.

반복문을 사용하여 StringBuilder에 넣어준다.

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












