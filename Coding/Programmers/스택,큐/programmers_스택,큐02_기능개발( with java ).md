# [ Programmers ] _ 기능개발 ( java )
https://school.programmers.co.kr/learn/courses/30/lessons/42586
## 문제 
### 문제 설명
>![](https://i.imgur.com/Ch7SHsc.png)
>

### 제한사항
>![](https://i.imgur.com/RUJOEEW.png)
>


### 입출력 예
![](https://i.imgur.com/HsdSr4Z.png)






## 문제 풀이
큐를 이용하는 대표적인 문제입니다. 우선 각 기능 개발에 며칠이 걸리는지 계산해야 합니다. 그 후, 큐에 순서대로 기능 개발을 넣습니다.

이 때, 현재 배포해야 하는 기능보다 빨리 완성되는 기능은 모두 함께 큐에 넣습니다. 그러다가 현재 배포해야 하는 기능보다 더 늦게 완성되는 기능에 도달하면, 지금까지 큐에 넣은 모든 기능을 배포합니다.

위와 같이 반복하면서 더이상 배포할 기능이 없을 때 까지 반복해 주면 됩니다.
### 문제 접근 ( 알고리즘 )
- 각 기능의 작업 일을 계산 한다.
	- 남은 진도(100 - 현재 진도) % 작업 속도 == 0 인 경우
		- 큐에 ( 작업일 ) 추가
		  
	- 남은 진도(100 - 현재 진도) % 작업 속도 == 0이 아닌 경우
		- 큐에  ( 작업일 + 1 ) 추가 
		  
-  1번 째 기능의 작업 일을 확인한다. `q.pool( )`
  
- 큐가 빌 때까지 반복, n 번 째 기능의 작업 일을 확인한다. `q.peek( )`
	- 1번째 기능의 작업일 보다 작거나 같은 경우
		- 1번째 기능의 작업 일과 같이 완료된다. => 같은 날 작업이 완료된다.
		- cnt 증가 `cnt++`
		- 다음 기능 확인 `q.pool( )`
		  
	- 1번째 기능의 작업일 보다 큰 경우
		- 결과 배열에 cnt 추가 후 다음 기능의 작업일 확인


#### 예시
>progresses = 93 , 30, 55
>speeds = 1, 30, 5
>
>(100 - 93 ) / 1 = 7 
>(100 - 30 ) / 30 +1  = 3
>(100 - 55 ) / 5   = 45 / 5 = 9
>
>1번째 기능 7일에 완료
>2번째 기능은 먼저 완료가 되어도 1번째 기능이 완료되야 완료 => 7일에 완료
>3번째 기능 9일에 완료
>
>7일에 2개 완료 9일에 1개 완료 => [2, 1]


### 풀이
#### Queue 사용

```
import java.util.*;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {  
  
	    // 결과를 담을 배열 선언  
	    ArrayList<Integer> list = new ArrayList<>();  
	    // 작업일를 담을 큐 선언  
	    Queue<Integer> q = new LinkedList<>();  
	  
	    // 각 progresses의 최소일수 계산  
	    // progresses 크기 만큼 반복  
	    for (int i = 0; i < progresses.length; i++) {  
	    
	        // 남은 진도 % 작업 속도가 0으로 떨어지는 경우  
	        if (((100 - progresses[i]) % speeds[i] == 0)) {  
	            q.add((100 - progresses[i]) / speeds[i]);  
	            
	        } else {  
	            // 남은 진도 % 작업 속도가 0으로 떨어진지 않으면 1일 추가  
	            q.add((100 - progresses[i]) / speeds[i] + 1);  
	        }  
	    }  
	  
	    // 1번째 기능 완료일을 담은 변수 (= 가장 긴 완료일)  
	    int x = q.poll();  
	    // 같은 완료일을 가진 기능의 개수 체크하는 변수
	    int cnt = 1;  
	  
	    // 큐가 빌 때까지 반복  
	    while (!q.isEmpty()) {  
	  
	        // n번째 기능 완료일이 1번째 기능 완료일 보다 작거나 같은 경우  
	        if (x >= q.peek()) {  
	  
	            // 같은 일에 cnt개의 기능이 배포가 가능하다.  
	            cnt++;  
	            q.poll();  
	  
	        } else {  
	            // n번째 기능 완료일이 1번째 기능 완료일 보다 큰 경우  
	  
	            // 출력 배열에 cnt 추가  
	            list.add(cnt);  
	  
	            // cnt를 다시 1로 초기화  
	            cnt = 1;  
	  
	            // 가장 긴 완료일 변경  
	            x = q.poll();  
	        }  
	    }  
  
	    // 마지막 cnt도 추가  
	    list.add(cnt);  
  
	    // 결과 배열로 출력  
	    return list.stream().mapToInt(i->i).toArray();  
	}
}
```

![](https://i.imgur.com/pyTVump.png)


