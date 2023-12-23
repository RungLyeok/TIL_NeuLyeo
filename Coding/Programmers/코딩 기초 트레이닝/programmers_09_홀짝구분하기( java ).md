# [ Programmers ] _ 홀짝 구분하기 ( java )

https://school.programmers.co.kr/learn/courses/30/lessons/181944
## 문제 
### 문제 설명
![](https://i.imgur.com/de9QtKM.png)


### 제한사항
![](https://i.imgur.com/Slupy72.png)


### 입출력 예
![](https://i.imgur.com/xhM2jfs.png)  ![](https://i.imgur.com/8Ng2F68.png)


## 문제 풀이
### 코드 설명
### 풀이
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n % 2 == 0 ? n + " is even" : n + " is odd");
    }
}
```






