# [ Programmers ]  홀짝 구분하기 ( java ) 9 / 124

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
- `System.out.print(n % 2 == 0 ? n + " is even" : n + " is odd");`: 삼항 연산자를 사용하여 홀짝을 판별하고 결과를 출력합니다.
    - `n % 2 == 0`: `n`을 2로 나눈 나머지가 0인지 확인합니다. 즉, 짝수인지 확인합니다.
    - `n + " is even"`: 짝수일 경우 "n is even"을 출력합니다.
    - `n + " is odd"`: 홀수일 경우 "n is odd"를 출력합니다.
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






