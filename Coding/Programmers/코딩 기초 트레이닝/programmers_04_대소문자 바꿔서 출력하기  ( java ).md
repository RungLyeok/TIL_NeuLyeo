# [ Programmers ]  대소문자 바꿔서 출력하기 ( java ) 4 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181949
## 문제 
### 문제 설명
영어 알파벳으로 이루어진 문자열 `str`이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
### 제한사항
- 1 ≤ `str`의 길이 ≤ 20
    - `str`은 알파벳으로 이루어진 문자열입니다.

### 입출력 예
![](https://i.imgur.com/igR5K0Y.png)







## 문제 풀이
### 코드 설명
**문자 변환:**

- `for (Character item : a.toCharArray())`: 문자열 `a`의 각 문자에 대해 반복문을 실행합니다.
    - `Character.isLowerCase(item) ? Character.toUpperCase(item) : Character.toLowerCase(item)`: 삼항 연산자를 사용하여 문자의 대소문자를 전환합니다.
        - `Character.isLowerCase(item)`: 문자가 소문자인지 확인합니다.
        - `Character.toUpperCase(item)`: 소문자일 경우 대문자로 변환합니다.
        - `Character.toLowerCase(item)`: 대문자일 경우 소문자로 변환합니다.
        - 결과적으로 소문자는 대문자로, 대문자는 소문자로 바뀝니다.
    - `System.out.println(...)`: 변환된 문자를 한 줄씩 출력합니다.
### 풀이
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
	    for (Character item : a.toCharArray()) {  
    System.out.println(Character.isLowerCase(item) ? Character.toUpperCase(item) : Character.toLowerCase(item));  
}
    }
}
```

