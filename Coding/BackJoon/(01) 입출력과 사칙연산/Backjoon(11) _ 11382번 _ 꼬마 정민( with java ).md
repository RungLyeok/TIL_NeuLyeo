# \[ Backjoon - 11382번 \] 꼬마 정민 ( with java )
https://www.acmicpc.net/problem/11382
## 문제
꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

### 입력 
>
>![](https://i.imgur.com/TTNb515.png)
>
### 출력 
> 
> A+B+C의 값을 출력한다.
> 

![](https://i.imgur.com/bGOsYU9.png)


## 문제 주요 내용
변수의 타입을 `int`로 진행하면 `[런타임 에러 (NumberFormat)]` 가 발생하게 된다.

int 보다 큰 수가 들어가기 때문이다.

따라서 int 가 아닌 `long` 으로 코딩한다.


## 문제 풀이

```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.StringTokenizer;  
  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        long a = Long.parseLong(st.nextToken());  
        long b = Long.parseLong(st.nextToken());  
        long c = Long.parseLong(st.nextToken());  
  
        System.out.print(a + b + c);  
    }  
}
```
