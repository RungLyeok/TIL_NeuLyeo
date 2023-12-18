# \[ Backjoon - 2830번 \] 행성 X 3 # ( java )

https://www.acmicpc.net/problem/2830


## 문제
![](https://i.imgur.com/aR1XBWM.png)



### 입력
![](https://i.imgur.com/W4g57Iu.png)



### 출력
첫째 줄에 행성 X3의 가치를 출력한다.


### 예제
![](https://i.imgur.com/CNya1aV.png) ![](https://i.imgur.com/PSrFeTN.png) ![](https://i.imgur.com/ZJLBpdF.png)


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

## reference
https://velog.io/@studyhard/ps-boj-2830