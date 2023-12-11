# [ Programmers ] _ 대소문자 바꿔서 출력하기 ( with java )
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
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
    
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                System.out.print(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}
```

![](https://i.imgur.com/MHK2PcM.png)
