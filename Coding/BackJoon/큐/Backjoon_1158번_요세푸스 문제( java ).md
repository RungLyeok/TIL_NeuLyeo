# \[ Backjoon - 1158번 \] 요스푸스 문제 ( java )

https://www.acmicpc.net/problem/1158


## 문제
![](https://i.imgur.com/d9zdoHZ.png)



### 입력
![](https://i.imgur.com/BpOyb6U.png)

### 출력
![](https://i.imgur.com/I586MCJ.png)

### 예제
![](https://i.imgur.com/hXeRnG4.png)






## 문제 풀이
### 문제 접근 ( 알고리즘 )
- 입력 : 
	- N : N명의 사람의 수
	- K : K번째 사람을 뽑아 요세푸스 순열을 만든다. 
		- N명이 사람이 다 뽑힐 때 까지 반복

>
>예제 1번
>입력 : 7 3
>
>1 2 3 4 5 6 7 의 사람이 있다.
>3번째 사람을 뽑아 출력 시킨다.
>
>1 2 4 5 6 7
><3>
>
>1 2 4 5 7
><3 6>
>
>1 4 5 7
><3 6 2>
>
>1 4 5
><3 6 2 7>
>
>1 4
><3 6 2 7 5>
>
>4
><3 6 2 7 5 1>
>
><3 6 2 7 5 1 4>
>



### 풀이
#### ArrayList 사용
```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.ArrayList;  
import java.util.StringTokenizer;  
  
public class Backjoon_1158 {  
    public static void main(String[] args) throws IOException {  
        // 입력을 받기 위해 사용  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        //입력 변수 선언  
        int N, K;  
        N = Integer.parseInt(st.nextToken());  
        K = Integer.parseInt(st.nextToken());  
  
        // 출력을 위해 사용  
        StringBuilder sb = new StringBuilder();  
        sb.append("<");  
  
        // 문제 풀이  
        // N명의 사람을 넣을 배열 선언  
        ArrayList<Integer> list = new ArrayList<>();  
  
        // N만큼 반복, 배열에 넣는다.  
        for (int i = 1; i <= N; i++) {  
            list.add(i);  
        }  
  
        // K번째 사람을 찾기위한 변수  
        // -1인 이유, K번째 사람의 인덱스가 K-1 이기 때문이다.  
        int idx = -1;  
  
        // 배열이 빌 때까지 반복  
        while (!list.isEmpty()) {  
  
            // K만큼 반복  
            for (int i = 0; i < K; i++) {  
                // idx 증가 K 만큼  
                idx ++;  
                // System.out.println("idx = " + idx);  
  
                // idx가 배열의 크기보다 크거나 같은 경우  
                if (idx >= list.toArray().length) {  
                    // 다시 0으로  
                    idx = 0;  
                    // System.out.println("idx 0으로");  
                }  
            }  
            // System.out.println(list);  
            // k번째 사람을 출력 시킨다.  
            sb.append(list.get(idx)).append(", ");  
            // System.out.println("출력 idx = " + idx);            // 후 배열에서 제거  
            // --를 하는 이유, 배열을 제거하면 현재 idx가 다음 요소를 가르키기 때문이다.  
            list.remove(idx--);  
            // System.out.println("idx = " + idx);  
        }  
  
        sb.append(">");  
        System.out.print(sb.toString());  
    }  
}
```


![](https://i.imgur.com/xWuesE1.png)

#### Queue 사용
큐를 사용하여 문제를 해결 했다.

>
>예제 1번
>입력 : 7 3
>
>1 2 3 4 5 6 7 의 사람이 있다.
>3번째 사람을 뽑아 출력 시킨다.
>
>K - 1 만큼 q.poll( ), q.offer( ) 하여 
>3번째 사람이 맨 앞으로 오도록 만든다.
>
>1 2 3 4 5 6 7 / q.poll( ) => 1 / q.offer( 1 )
>2 3 4 5 6 7 1 / q.poll( ) => 2 / q.offer( 2 )
>3 4 5 6 7 1 2 / q.poll( ) => 3 출력
><3>
>
>4 5 6 7 1 2  / q.poll( ) => 4 / q.offer( 4 )
>5 6 7 1 2 4  / q.poll( ) => 5 / q.offer( 5 )
>6 7 1 2 4 5  / q.poll( ) => 6 출력 
><3 6>
>
>7 1 2 4 5  / q.poll( ) => 7 / q.offer( 7 )
>1 2 4 5 7  / q.poll( ) => 1 / q.offer( 1 )
>2 4 5 7 1 / q.poll( ) => 2 출력
><3 6 2>
>
>4 5 7 1 / q.poll( ) => 4 / q.offer( 4 )
>5 7 1 4 / q.poll( ) => 5 / q.offer( 5 )
>7 1 4 5 / q.poll( ) => 7 출력
><3 6 2 7>
>
>1 4 5 / q.poll( ) => 1 / q.offer( 1 )
>4 5 1 / q.poll( ) => 4 / q.offer( 4 )
>5 1 4 / q.poll( ) => 5 출력
><3 6 2 7 5>
>
>1 4 / q.poll(  ) => 1 / q.offer(  1 )
>4 1 / q.poll( ) => 4  / q.offer( 4 )
>1 4 / q.poll( ) => 1 출력
><3 6 2 7 5 1>
>
>4 / q.poll( ) => 4 출력
><3 6 2 7 5 1 4>
>

```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.LinkedList;  
import java.util.Queue;  
import java.util.StringTokenizer;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        // 입력을 받기 위해 사용  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        //입력 변수 선언  
        int N, K;  
        N = Integer.parseInt(st.nextToken());  
        K = Integer.parseInt(st.nextToken());  
  
        // 출력을 위해 사용  
        StringBuilder sb = new StringBuilder();  
        sb.append("<");  
  
        // 문제 풀이  
        // N명의 사람을 넣을 큐 선언  
        Queue<Integer> q = new LinkedList<>();  
  
        // N만큼 반복, 큐에 넣는다.  
        for (int i = 1; i <= N; i++) {  
            q.add(i);  
        }  
  
        // 큐가 빌 때까지 반복  
        while (!q.isEmpty()) {  
  
            // K - 1만큼 반복  
            for (int i = 0; i < K - 1; i++) {  
  
                // K 번째 요소가 앞에 오도록  
                // 맨 앞 요소들을 맨 뒤로 옮긴다.  
                q.offer(q.poll());
            }  
  
            // K 번째 요소 출력에 추가  
            sb.append(q.poll()).append(", ");  
        }  
        // 마지막 요소에도 공백이랑 괄호가 들어가기 때문에 제거  
        sb.delete(sb.length()-2, sb.length());  
        // 괄호 추가  
        sb.append(">");  
        // 출력  
        System.out.print(sb);  
    }  
}
```

![](https://i.imgur.com/hTGtzMN.png)

