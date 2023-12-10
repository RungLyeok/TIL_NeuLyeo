# \[ Backjoon - 2753번 \] 윤년 ( with java )
https://www.acmicpc.net/problem/2753
## 문제
연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.


### 입력 
>
> 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
>
### 출력 
> 
> 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
> 

### 예제
![](https://i.imgur.com/OJ0SmRH.png)  ![](https://i.imgur.com/G12Sjo1.png)

### 💡주의할 점 
주어진 년도가 윤년이 되는 조건

- 4의 배수 => 윤년

4의 배수 이면서
	- 400의 배수 => 윤년
	- 100의 배수 => X

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
  
        if (a % 4 == 0 && a > 0) {  
            if (a % 400 == 0) {  
                System.out.print(1);  
            } else if (a % 100 == 0) {  
                System.out.print(0);  
            } else {  
                System.out.print(1);  
            }  
        } else {  
            System.out.print(0);  
        }  
    }  
}
```

![](https://i.imgur.com/4BmthFs.png)

### 삼항연산자
```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
  
        int a = Integer.parseInt(br.readLine());  
  
        System.out.print((a % 4 == 0) ? ((a % 400 == 0) ? "1" :(a % 100 == 0)? "0" : "1") : "0");
    }  
}
```

![](https://i.imgur.com/F5M4Ai7.png)
