# [ Programmers ] _ 문자 리스트 문자열 변환하기 ( java )

https://school.programmers.co.kr/learn/courses/30/lessons/181941
## 문제 
### 문제 설명
![](https://i.imgur.com/cMl6DnF.png)


### 제한사항
![](https://i.imgur.com/IGbqUrG.png)



### 입출력 예
  ![](https://i.imgur.com/aFpO1ZU.png)



## 문제 풀이
### 문제 접근
`StringBuilder` 를 사용해서 문제 해결

`.append()`와 반복문을 사용하여 StringBuilder에 넣어준다.

### 풀이
```
class Solution {
    public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}
```

![](https://i.imgur.com/fpJRLne.png)











