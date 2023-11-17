# \[ Backjoon - 1021번 \] 회전하는  큐 ( with java )

https://www.acmicpc.net/problem/1021

## 문제

![](https://i.imgur.com/QKL7rPQ.png)

![](https://i.imgur.com/iyFptWT.png)

## 문제 주요 내용
-
-  입력  
	-  첫째 줄 입력 : 큐의 크기 : N ( 0 < N < 50 )
	-  둘째 줄 입력 : 뽑아내려고 하는 수의 개수 : M ( 0 < M <= N )
	  
-  출력
	- 2, 3번 연산 시  1 ++
	  
-  연산
	- 1. 첫 번째 원소를 뽑아낸다. 이 연산을 수행하면, 원래 큐의 원소가 a1, ..., ak이었던 것이 a2, ..., ak와 같이 된다.
	- 2. 왼쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 a2, ..., ak, a1이 된다.
	- 3. 오른쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 ak, a1, ..., ak-1이 된다.
	

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


## 문제 풀이

```
import java.util.Scanner;  
import java.util.LinkedList;  
  
public class Backjoon_1021 {  
  
    public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);  
        LinkedList<Integer> q = new LinkedList<Integer>();  
  
        // 2, 3번 연산 횟수  
        int cnt = 0;  
  
        // 큐의 크기(1 ~ N)  
        int n = in.nextInt();  
  
        // 큐의 크기 만큼 반복  
        for(int i = 1; i <= n; i++) {  
            // 1 ~ n 까지 큐에 넣는다.  
            q.offer(i);  
        }  
        // 뽑으려는 숫자의 개수  
        int m = in.nextInt();  
  
        // 뽑고자 하는 수를 담은 배열  
        int[] arr = new int[m];  
          
        // 뽑으려는 숫자의 개수 만큼 반복  
        for(int i = 0; i < m; i++) {  
            // arr에 담는다.  
            arr[i] = in.nextInt();  
        }  
        for(int i = 0; i < m; i++) {  
  
            // 큐에서 뽑고자 하는 숫자의 index 확인  
            int target_idx = q.indexOf(arr[i]);  
              
            // 큐의 중간 인덱스를 가르키는 변수  
            int half_idx;  
              
            // 큐의 크기가 짝수인 경우  
            if(q.size() % 2 == 0) {  
                // 중간 인덱스를 큐 크기 - 1 를 한다.      
half_idx = q.size() / 2 - 1;  
            }  
            else {  
                half_idx = q.size() / 2;  
            }  
  
  
            // 뽑고자 하는 숫자가 중간 지점 보다 앞에 있는 경우  
            if(target_idx <= half_idx) {  
                // 2번연산, 모든 원소를 왼쪽으로 이동  
                for(int j = 0; j < target_idx; j++) {  
                    // 첫번째 원소를 빼서 맨뒤로 이동  
                    int temp = q.pollFirst();  
                    q.offerLast(temp);  
                    cnt++;  
                }  
            }  
            else {    
// 뽑고자 하는 숫자가 중간 지점 보다 뒤에 있는 경우   
// 3번연산 모든 원소를 오른쪽으로 이동  
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