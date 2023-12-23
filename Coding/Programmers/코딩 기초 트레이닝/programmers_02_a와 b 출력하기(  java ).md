# [ Programmers ] _ a와 b 출력하기 ( java )
https://school.programmers.co.kr/learn/courses/30/lessons/181951
## 문제 
### 문제 설명
정수 `a`와 `b`가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.

### 제한사항
- -100,000 ≤ `a`, `b` ≤ 100,000

### 입출력 예
![](https://i.imgur.com/CsE6MKA.png)





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

        System.out.printf("a = %d\n" , a);
        System.out.printf("b = %d" , b);
    }
}
```



