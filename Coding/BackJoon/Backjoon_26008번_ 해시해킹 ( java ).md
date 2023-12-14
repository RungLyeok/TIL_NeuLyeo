# \[ Backjoon - 26008번 \] 해시 해킹 ( java )

https://www.acmicpc.net/problem/26008


## 문제
![](https://i.imgur.com/speKnmD.png)


### 입력
![](https://i.imgur.com/MTRIqZu.png)


### 출력
![](https://i.imgur.com/Yes34K5.png)


### 예제
![](https://i.imgur.com/1qK9f8B.png) ![](https://i.imgur.com/mJzgynq.png)
![](https://i.imgur.com/qs8eWX3.png)





## 문제 풀이
### 문제 접근 ( 알고리즘 )

### 풀이

```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.StringTokenizer;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int n = Integer.parseInt(st.nextToken());  
        int m = Integer.parseInt(st.nextToken());  
        int a = Integer.parseInt(st.nextToken());  
        int h = Integer.parseInt(br.readLine());  
  
        long answer = 1L;  
  
        for (int i = 0; i < n - 1; i++) {  
            answer = (answer * m) % 1000000007;  
        }  
        System.out.print(answer);  
    }  
}
```