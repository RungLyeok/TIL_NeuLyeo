# \[ Backjoon - 1330번 \] 두 수 비교하기 ( with java )
https://www.acmicpc.net/problem/1330
## 문제

두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
### 입력
> 
> 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
> 
### 출력
>
> 첫째 줄에 다음 세 가지 중 하나를 출력한다.
>    - A가 B보다 큰 경우에는 '`>`'를 출력한다.
>    - A가 B보다 작은 경우에는 '`<`'를 출력한다.
>    - A와 B가 같은 경우에는 '`==`'를 출력한다.
>
### 제한
![](https://i.imgur.com/gQUn14K.png)

### 예제
![](https://i.imgur.com/q5YchLQ.png) ![](https://i.imgur.com/EMjvfmt.png) ![](https://i.imgur.com/vR0G7y4.png)






## 문제 주요 내용

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
  
        int a = Integer.parseInt(st.nextToken());  
        int b = Integer.parseInt(st.nextToken());  
          
        if(a >= -10000 && a <= 10000 && b >= -10000 && b <= 10000){  
            if (a > b) {  
                System.out.print(">");  
            } else if (a < b) {  
                System.out.print("<");  
            } else {  
                System.out.print("==");  
            }  
        }  
    }  
}
```
