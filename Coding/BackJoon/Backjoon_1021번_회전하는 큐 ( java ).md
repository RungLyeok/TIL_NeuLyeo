# \[ Backjoon - 1021번 \] 회전하는  큐 ( with java )

https://www.acmicpc.net/problem/1021

## 문제
지민이는 N개의 원소를 포함하고 있는 양방향 순환 큐를 가지고 있다. 지민이는 이 큐에서 몇 개의 원소를 뽑아내려고 한다.

지민이는 이 큐에서 다음과 같은 3가지 연산을 수행할 수 있다.

1. 첫 번째 원소를 뽑아낸다. 이 연산을 수행하면, 원래 큐의 원소가 a1, ..., ak이었던 것이 a2, ..., ak와 같이 된다.
2. 왼쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 a2, ..., ak, a1이 된다.
3. 오른쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 ak, a1, ..., ak-1이 된다.

큐에 처음에 포함되어 있던 수 N이 주어진다. 그리고 지민이가 뽑아내려고 하는 원소의 위치가 주어진다. (이 위치는 가장 처음 큐에서의 위치이다.) 이때, 그 원소를 주어진 순서대로 뽑아내는데 드는 2번, 3번 연산의 최솟값을 출력하는 프로그램을 작성하시오.

### 입력
>![](https://i.imgur.com/w7trnuG.png)
>

### 출력
>
>첫째 줄에 문제의 정답을 출력한다.
>

### 예제
![](https://i.imgur.com/bhkdNYq.png) ![](https://i.imgur.com/eAHj1sy.png) ![](https://i.imgur.com/DCTt5rR.png) ![](https://i.imgur.com/DF2Aen4.png)




## 문제 풀이
큐를 시뮬레이션하는 문제입니다. 큐의 동작을 시뮬레이션 하지만, front와 back 양쪽에서 자료를 접근해야 하므로 리스트를 이용해 구현하면 됩니다.

push는 자료를 리스트의 add 메소드를 사용하면 되고, pop은 remove(0)으로 0번 인덱스의 값을 제거하면 됩니다.

front 값에 접근하는 것은 리스트에서 get(0)로 접근하면 되고, back에 접근하는 것은 get(list.size()-1)로 접근하면 됩니다.

### 문제 접근
문제를 정확하게 이해하는 것이 중요하다.

-  입력  
	-  첫째 줄 입력
		- 큐의 크기 : N ( 0 < N < 50 )
		- 뽑으려는 수의 개수 M
		  
	-  둘째 줄 입력 : 뽑으려는 수
	  
-  출력
	- 2, 3번 연산 시  출력 값을 1씩 증가시킨다.
	  
-  연산
	- 1. 첫 번째 원소를 뽑아낸다. 이 연산을 수행하면, 원래 큐의 원소가 a1, ..., ak이었던 것이 a2, ..., ak와 같이 된다. 
	- 2. 왼쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 a2, ..., ak, a1이 된다.
	- 3. 오른쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 ak, a1, ..., ak-1이 된다.

**Queue**는 입력과 출력이 정해진 위치에서만 가능하다.

하지만 2, 3번의 연산을 하려면 양쪽 끝에서 입출력이 가능해야한다.

따라서 양쪽에서 입출력이 가능한 **Deque**를 사용하면 편한다.

>
>💡Deque 란
>
>Stack, Queue의 특성을 모두 가진 자료구조이다.
>즉, FIFO, LIFO의 특성을 모두 가지고 있다.
>
>아래의 메서드를 사용할 수 있다.
>
>addFirst() : 덱 맨 앞쪽에 값을 삽입하는 메서드
>addLast() : 덱 마지막 쪽에 값을 삽입하는 메서드
>pollFirst() : 덱 맨 앞쪽의 값을 빼오는 메서드
>pollLast() : 덱 마지막 쪽의 값을 빼오는 메서드
>




**2번 연산과 3번 연산이 최소가 되도록 해야 한다**

1. 뽑고자 하는 원소가 덱의 중앙에서 어느 방향에 가까운지 확인
2. 그 방향으로 2,3번 연산을 통해 첫 번째 위치까지 반복
3. 1번 연산을 통해 원소를 뽑음


> 예시 1
> 
> Queue = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
> 뽑을 숫자 : 1, 2, 3
> 
> 1번 연산만 3번 진행
> { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } => { 4, 5, 6, 7, 8, 9, 10 }
> 
> 출력 : 0

> 예시 2
> 
> Queue = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
> 뽑을 숫자 : 2, 9, 5
> 
> 2번 연산 후 1번 연산
> { 2, 3, 4, 5, 6, 7, 8, 9, 10, 1 } => { 3, 4, 5, 6, 7, 8, 9, 10, 1 }
> count = 1
> 
> 3번 연산 3번 후 1번 연산
> { 9, 10, 1, 3, 4, 5, 6, 7, 8 } => { 10, 1, 3, 4, 5, 6, 7, 8 }
> count = 4
> 
> 2번 연산 4번 후 1번 연산
> { 5, 6, 7, 8, 10, 1, 3, 4 } => { 6, 7, 8, 10, 1, 3, 4 } 
>count = 8
>
> 출력 : 8

### 문제 풀이

```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.LinkedList;  
  
import java.util.StringTokenizer;  
  
public class Backjoon_1021 {  
  
    public static void main(String[] args) throws IOException {  
  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        // 큐의 크기  
        int N = Integer.parseInt(st.nextToken());  
        // 뽑는 원소의 개수  
        int M = Integer.parseInt(st.nextToken());  
  
        // 뽑으려는 원소의 종류를 담은 배열  
        // 다음 줄 : 뽑으려는 원소의 종류  
        st = new StringTokenizer(br.readLine());  
        int[] elArr = new int[M];  
        for (int i = 0; i < M; i++) {  
            elArr[i] = Integer.parseInt(st.nextToken());  
        }  
  
        // 2,3번 연산 횟수를 담는 변수  
        int cnt = 0;  
  
        // 큐 생성  
        LinkedList<Integer> q = new LinkedList<Integer>();  
  
        // 큐에 1 ~ N 만큼 원소 넣기  
        for(int i = 1; i <= N; i++) {  
            q.add(i);  
        }  
        
        // 어떠한 연산을 써야하는지 파악하는 과정  
        for(int i = 0; i < M; i++) {  
  
            // 큐에서 뽑고자 하는 숫자의 index 확인  
            int target_idx = q.indexOf(elArr[i]);  
  
            // 큐의 중간 인덱스를 가르키는 변수  
            int half_idx;  
  
            // 큐의 크기가 짝수인 경우  
            if(q.size() % 2 == 0) {  
                // 중간 인덱스를 큐 크기 - 1 를 한다.  
                half_idx = q.size() / 2 - 1;  
            }  
            else {  
                // 큐의 크가 홀수인 경우  
                half_idx = q.size() / 2;  
            }  
  
            // 2번연산  
            // 뽑고자 하는 숫자가 중간 지점 보다 앞에 있는 경우  
            if(target_idx <= half_idx) {  
  
                // 모든 원소를 왼쪽으로 이동  
                for(int j = 0; j < target_idx; j++) {  
  
                    // 첫번째 원소를 빼서 맨뒤로 이동  
                    int temp = q.pollFirst();  
                    q.offerLast(temp);  
                    cnt++;  
                }  
            }  
            else {  
                // 3번연산  
                // 뽑고자 하는 숫자가 중간 지점 보다 뒤에 있는 경우  
                // 모든 원소를 오른쪽으로 이동  
                for(int j = 0; j < q.size() - target_idx; j++) {  
  
                    // 마지막 원소를 빼서 앞으로 이동  
                    int temp = q.pollLast();  
                    q.offerFirst(temp);  
                    cnt++;  
                }  
  
            }  
            // 1번 연산  
            q.pollFirst();  
        }  
  
        System.out.println(cnt);  
    }  
}
```