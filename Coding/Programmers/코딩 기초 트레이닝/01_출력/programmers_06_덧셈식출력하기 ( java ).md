# [ Programmers ]  덧셈식 출력하기 ( java ) 6 / 124

https://school.programmers.co.kr/learn/courses/30/lessons/181947
## 문제 
### 문제 설명
![](https://i.imgur.com/FFRLPYQ.png)

### 제한사항
![](https://i.imgur.com/v539C2M.png)


### 입출력 예
![](https://i.imgur.com/WLoQuVY.png)


## 문제 풀이
### 코드 설명
### 풀이
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d", a, b, a+b);
    }
}
```



