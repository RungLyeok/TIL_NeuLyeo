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
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = (n % 2 == 0) ? n + " is even" : n + " is odd";
        System.out.print(str);
    }
}
```

![](https://i.imgur.com/GQfnhTT.png)





