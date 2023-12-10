# \[ Backjoon - 14681번 \] 사분면 고르기 ( with java )
https://www.acmicpc.net/problem/14681
## 문제

흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.

![](https://i.imgur.com/wAdGcbM.png)


예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.

점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
### 입력 
> ![](https://i.imgur.com/bVe66l6.png)
>
### 출력 
> 
> ![](https://i.imgur.com/zGcPbzW.png)
> 

### 예제
![](https://i.imgur.com/TMbCVSS.png)  ![](https://i.imgur.com/ctvyZaN.png)



## 문제 주요 내용

## 문제 풀이
### if 문
```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
  
        int a = Integer.parseInt(br.readLine());  
        int b = Integer.parseInt(br.readLine());  
  
        if (a >= -1000 && a <= 1000 && b >= -1000 && b <= 1000) {  
            if (a < 0) {  
                if (b < 0) {  
                    System.out.print(3);  
                } else {  
                    System.out.print(2);  
                }  
            } else {  
                if (b < 0) {  
                    System.out.print(4);  
                } else {  
                    System.out.print(1);  
                }  
            }  
        }  
    }  
}
```

![](https://i.imgur.com/SxbI1d8.png)

### 삼항연산자
```
if (a >= -1000 && a <= 1000 && b >= -1000 && b <= 1000) {  
	System.out.print(  
	        (a < 0) ? ((b < 0) ? 3 : 2) : ((b < 0) ? 4 : 1)  
	);
}
```

![](https://i.imgur.com/hc4nsNi.png)
