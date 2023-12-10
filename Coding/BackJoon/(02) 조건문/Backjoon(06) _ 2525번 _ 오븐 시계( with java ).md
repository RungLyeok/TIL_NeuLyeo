# \[ Backjoon - 2525번 \] 오븐 시계 ( with java )
https://www.acmicpc.net/problem/2525
## 문제
KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.

또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.

훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.


### 입력 
>![](https://i.imgur.com/ozrBYS2.png)
>

### 출력 
> ![](https://i.imgur.com/A6qb6dh.png)
> 

### 예제
![](https://i.imgur.com/OSY3a41.png) ![](https://i.imgur.com/gHcI4PC.png) ![](https://i.imgur.com/9GHKO3G.png)



## 문제 풀이
### 알고리즘 [ 문제 접근 ]
추가할 시간을 분 단위로 입력을 받기 때문에

현재 시간을 나타내는 입력을 분으로 바꿔서 추가할 시간을 더한다.

그 후 시간의 형태에 맞춰 출력 한다.

```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.StringTokenizer;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int a = Integer.parseInt(st.nextToken());  
        int b = Integer.parseInt(st.nextToken());  
        int c = Integer.parseInt(br.readLine());  
  
        int sum = a * 60 + b + c;  
  
        int h = (sum / 60) % 24;  
        int m = sum % 60;  
  
        System.out.print(h + " " + m);  
    }  
}
```
![](https://i.imgur.com/axYrs5Q.png)

### 출력 보완 : StringBuilder 사용
```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.StringTokenizer;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int a = Integer.parseInt(st.nextToken());  
        int b = Integer.parseInt(st.nextToken());  
        int c = Integer.parseInt(br.readLine());  
  
        StringBuilder sb = new StringBuilder();  
  
        int sum = a * 60 + b + c;  
  
        System.out.print(  
                sb.append((sum / 60) % 24).append(" ").append(sum % 60)  
        );  
    }  
}
```
![](https://i.imgur.com/Qlyb6LC.png)
