# [ Programmers ] _ a와 b 출력하기 ( with java )
https://school.programmers.co.kr/learn/courses/30/lessons/181951
## 문제 
### 문제 설명
정수 `a`와 `b`가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.

### 제한사항
- -100,000 ≤ `a`, `b` ≤ 100,000

### 입출력 예
![](https://i.imgur.com/CsE6MKA.png)





## 문제 풀이
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.printf("a = %d\n",a);
        System.out.printf("b = %d",b);    
    }
}
```

![](https://i.imgur.com/EYQihDK.png)

