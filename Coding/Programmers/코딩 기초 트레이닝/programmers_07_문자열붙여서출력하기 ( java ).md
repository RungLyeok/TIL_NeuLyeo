# [ Programmers ] _ 문자열 붙여서 출력하기 ( java )

https://school.programmers.co.kr/learn/courses/30/lessons/181946
## 문제 
### 문제 설명
![](https://i.imgur.com/O8crlao.png)


### 제한사항
![](https://i.imgur.com/sxavrpb.png)



### 입출력 예
![](https://i.imgur.com/4pm8Kpf.png)  ![](https://i.imgur.com/lhIsnLK.png)



## 문제 풀이
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] arr = s.split(" ");

        for (String a : arr ) {
            System.out.print(a);
        }
    }
}
```

![](https://i.imgur.com/JtgV35Y.png)



