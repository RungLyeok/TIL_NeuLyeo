# [ Programmers ] _ 문자열 겹쳐쓰기 ( java )

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
String 메서드를 이용해서 푸는 문제이다

- substring( n, m ) : n인덱스 부터 m인덱스 까지 문자열 추출

- substring( n ) : n인덱스 부터 끝까지 문자열 추출
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

![](https://i.imgur.com/URUqD4v.png)






