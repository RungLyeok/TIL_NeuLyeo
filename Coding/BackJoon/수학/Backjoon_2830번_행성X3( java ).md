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
  
public class Backjoon_2830 {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
  
        int n = Integer.parseInt(br.readLine());  
  
        int[] pp = new int[20];  
  
        for (int i = 0; i < n; i++) {  
            int name = Integer.parseInt(br.readLine());  
            for(int j = 0; j < 20; j++) {  
                if((name & (1 << j)) > 0) {  
                    pp[j]++;  
                }  
            }  
        }  
        long sum = 0L;  
        for (int i = 0; i < 20; i++) {  
            sum += (1L << i) * pp[i] * (n - pp[i]);  
        }  
        System.out.println(sum);  
    }  
}
```

## reference
https://velog.io/@studyhard/ps-boj-2830