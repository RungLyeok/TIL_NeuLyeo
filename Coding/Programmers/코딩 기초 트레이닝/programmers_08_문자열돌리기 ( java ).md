# [ Programmers ] _ 문자열 돌리기 ( java )

https://school.programmers.co.kr/learn/courses/30/lessons/181945
## 문제 
### 문제 설명
![](https://i.imgur.com/k97KRya.png)

### 제한사항
![](https://i.imgur.com/wfi8XMa.png)

### 입출력 예
![](https://i.imgur.com/dESJV9Y.png)
## 문제 풀이
### 코드 설명
### 풀이
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next().chars().forEach(c -> System.out.println(Character.toString(c)));
    }
}
```





