# [ Programmers ] _ 문자열 곱하기 ( java )

https://school.programmers.co.kr/learn/courses/30/lessons/181940
## 문제 
### 문제 설명
문자열 `my_string`과 정수 `k`가 주어질 때, `my_string`을 `k`번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- 1 ≤ `my_string`의 길이 ≤ 100
- `my_string`은 영소문자로만 이루어져 있습니다.
- 1 ≤ `k` ≤ 100

### 입출력 예
  ![](https://i.imgur.com/pkC9M5f.png)


## 문제 풀이
### 문제 접근
`StringBuilder` 를 사용해서 문제 해결

`.append()`와 반복문을 사용하여 입력 정수인 k 만큼 StringBuilder에 넣어준다.

### 풀이
```
class Solution {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }
        
        return sb.toString();
    }
}
```

![](https://i.imgur.com/thl8EvG.png)












