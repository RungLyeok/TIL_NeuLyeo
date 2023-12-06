# \[ Backjoon - 1000번 \] A+B ( with java )
https://www.acmicpc.net/problem/1000
## 문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

### 입력 
>
>첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)  
>
### 출력 
> 
> 첫째 줄에 A+B를 출력한다.
> 
## 문제 주요 내용
https://leungnyeok.tistory.com/entry/Java-02-%EC%97%AC%EB%9F%AC%EA%B0%80%EC%A7%80-%EC%97%B0%EC%82%B0%EC%9E%90
## 문제 풀이

```
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
  
        int a, b = 0 ;  
  
        a = sc.nextInt();  
        b = sc.nextInt();  
  
        if((a > 0 && a < 10) || (b > 0 && b < 10)){  
            System.out.print(a + b);  
        }  
  
        sc.close();  
    }  
}
```
