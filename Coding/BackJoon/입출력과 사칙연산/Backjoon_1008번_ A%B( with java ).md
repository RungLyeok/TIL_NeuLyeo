# \[ Backjoon - 1008번 \] A/B ( with java )
https://www.acmicpc.net/problem/1008
## 문제
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

### 입력 
>
>첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)  
>
### 출력 
> 
> 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
> 
## 문제 주요 내용
https://leungnyeok.tistory.com/entry/Java-02-%EC%97%AC%EB%9F%AC%EA%B0%80%EC%A7%80-%EC%97%B0%EC%82%B0%EC%9E%90
## 문제 풀이
### BufferReader 사용

```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.StringTokenizer;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        double a = Double.parseDouble(st.nextToken());  
        double b = Double.parseDouble(st.nextToken());  
  
        if((a > 0 && a < 10) || (b > 0 && b < 10)){  
            System.out.print(a / b);  
        }  
    }  
}
```

![](https://i.imgur.com/NTQekDg.png)


### Scanner 사용

```
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
  
        double a, b = 0 ;  
  
        a = sc.nextDouble();  
        b = sc.nextDouble();  
  
        if((a > 0 && a < 10) || (b > 0 && b < 10)){  
            System.out.print(a / b);  
        }  
  
        sc.close();  
    }  
}
```

![](https://i.imgur.com/ivn47qB.png)

