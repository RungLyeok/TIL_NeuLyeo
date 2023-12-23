# \[ Backjoon - 26008번 \] 해시 해킹 ( java )

https://www.acmicpc.net/problem/26008


## 문제
![](https://i.imgur.com/speKnmD.png)


### 입력
![](https://i.imgur.com/MTRIqZu.png)


### 출력
![](https://i.imgur.com/Yes34K5.png)


### 예제
![](https://i.imgur.com/1qK9f8B.png) ![](https://i.imgur.com/mJzgynq.png)
![](https://i.imgur.com/qs8eWX3.png)





## 문제 풀이

우선, 해싱은 최대한 모든 해시값이 일정한 비율로 나오는 것을 목표로 한다는 점을 잘 알아야 합니다. 같은 해시값이 나오는 경우를 '해시 충돌'이라고 부르며, 해시 충돌이 많이 발생할 수록 성능이 떨어지기 때문입니다.

이 문제의 해시 함수를 보면, A^0이 나오는 것을 볼 수 있습니다. A^0 = 1이기 때문에, 해시 함수는h(P) = (P0 + P1A^1 + P2A^2 + ... + P(N-1)A^(N-1)) % M이 됩니다.

여기서 잘 보면, 동일한 P1~P(N-1)에 대해서는 P0에 따라 0~(M-1) 값이 나오는 것을 볼 수 있습니다. 왜냐하면 M으로 나눈 나머지이기 때문입니다.

이렇게 총 P1~P(N-1)이 달라질 수 있는 경우의 수는 M^(N-1)개가 됩니다.

따라서 동일한 해시값을 가지는 값들은 총 M^(N-1)개가 됩니다. 이것은 처음에 논의한 것 처럼 일정한 비율로 나누어지는 해시 함수입니다.

총 M^N개의 비밀번호가 M개의 해시값에 골고루 분배되어서 M^(N-1)개씩 발생하는 것입니다.
### 문제 접근 ( 알고리즘 )
- 1번째열 입력 : 
	- N : 비밀번호의 길이
	- M : 문자 종류의 개수
	- A : 정수

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
https://gukin.tistory.com/21
https://nukoori.tistory.com/40