# \[ Backjoon - 2884번 \] 알람 시계 ( with java )
https://www.acmicpc.net/problem/2884
## 문제
상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.

상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.

이런 상근이를 불쌍하게 보던 창영이는 자신이 사용하는 방법을 추천해 주었다.

바로 "45분 일찍 알람 설정하기"이다.

이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.

현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.

### 입력 
>
> 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이
> 가 설정한 알람 시간 H시 M분을 의미한다.
> 
> 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 
> 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
>
### 출력 
> 
> 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력
> 과 같은 형태로 출력하면 된다.)
> 

### 예제
![](https://i.imgur.com/eC0QYkN.png)



### 💡주의할 점 
- 24시간 표현을 사용한다.
  
- 입력은 공백 한 칸을 기준으로 구분되어 입력된다. 출력 또한 같은 형식으로 출력
  
- 출력 시 불필요한 0은 사용하지 않는다.


## 문제 풀이
### 알고리즘 [ 문제 접근 ]
- M 이 45분보다 작은 경우 ( if ( M < 45 ) )
	-  H 가 0인 경우 ( if ( H == 0 ) )
		-  H = 23
		  
	- 그 외의 경우
		- H = -1
		  
	- M = 60 - (45 - M)
	  
- 그 외의 경우
	- M = M - 45

### if문 사용
```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.StringTokenizer;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int h = Integer.parseInt(st.nextToken());  
        int m = Integer.parseInt(st.nextToken());  
  
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {  
            if (m < 45) {  
                if (h == 0) {  
                    h = 23;  
                } else {  
                    h -= 1;  
                }  
                m = 60 - (45 - m);  
            } else {  
                m -= 45;  
            }  
            System.out.print(h + " "+ m);  
        }  
    }  
}
```

![](https://i.imgur.com/yumhJ2N.png)

### 출력 보완 : StringBuilder 사용
성능 향상을 위해 StringBuilder를 출력에 사용하였다.

```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.StringTokenizer;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int h = Integer.parseInt(st.nextToken());  
        int m = Integer.parseInt(st.nextToken());  
  
        StringBuilder sb = new StringBuilder();  
  
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {  
            if (m < 45) {  
                if (h == 0) {  
                    h = 23;  
                } else {  
                    h -= 1;  
                }  
                sb.append(h).append(' ').append(60 - (45 - m));  
            } else {  
                sb.append(h).append(' ').append(m - 45);  
            }  
            System.out.print(sb);  
        }  
    }  
}
```

![](https://i.imgur.com/65skGnw.png)

두 코드 결과에서 시간을 확인하면 StringBuilder를 사용하는 것이 더 빠른 것이 확인 가능하다.