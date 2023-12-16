# [ Programmers ] _ 프로세스 ( java )
https://school.programmers.co.kr/learn/courses/30/lessons/42587
## 문제 
### 문제 설명
![](https://i.imgur.com/THsLqyE.png)


### 제한사항
![](https://i.imgur.com/LuH5RBM.png)



### 입출력 예
![](https://i.imgur.com/Pw2VHMk.png)






## 문제 풀이

### 문제 접근 ( 알고리즘 )
**Queue** 를 활용하여 문제 풀이  
  
**location = 확인 하는 요소의 인덱스  **  

**max = 중요도가 가장 높은 수  **

- 중요도가 가장 큰 수(max) 를 확인한다.
    - **중요도**가 가장 높은 수(max) 를 맨 앞으로 이동시킨다.
        - max가 아닌 요소들은 뒤로 이동
        - max 앞으로 오면 출력시킨다. **출력 시키면 return += 1  **

- location의 수치가 바뀌는 경우
    - max가 아니여서 맨뒤로 이동하는 경우 => 큐 크기 -1
    - max 요소가 출력 되는 경우 => -1
    - 일반 요소가 뒤로 이동하는 경우 => -1  
          
- **location = max 인 경우 과정 종료**

	
#### 예시

> 예제 2번  
>  
>priorities : [1, 1, 9, 1, 1, 1]  
>location : 0  
>return : 5  
>
>max = 9  
location = 0  
[1, 1, 9, 1, 1, 1]  
location이 0인 경우 뒤로 이동 후 큐의 크기 - 1 로 변경  
>  
>max = 9  
>location = 5  
>[1, 9, 1, 1, 1, 1]  
>맨 앞 요소를 뒤로 이동 시키면서 location -1  
  >
>max = 9   
>location = 4  
>[9, 1, 1, 1, 1, 1]  
>max 출력 후 retrun +1, location -1  
>  
>max = 1  
>location = 3  
>return = 1  
>[1, 1, 1, 1, 1]  
>max 출력 후 retrun 값 +1, location -1  
  >
>max = 1  
>location = 2  
>return = 2  
>[1, 1, 1, 1]  
>max 출력 후 retrun 값 +1, location -1  
>  
>max = 1  
>location = 1  
>return = 3  
>[1, 1, 1]  
>max 출력 후 retrun 값 +1, location -1  
>  
>max = 1  
>location 0  
>return = 4  
>[1, 1]  
  >
>location = max 이므로, return + 1, 과정 종료  
  >
>return = 5




### 풀이
#### Queue 사용

```
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        // 큐 선언
        Queue<Integer> q = new LinkedList<>();

        // 중요도를 큐에 넣는다.
        for (int n: priorities) {
            q.add(n);
        }

        // 큐가 빌 때까지 반복
        while (!q.isEmpty()) {
        
			// 중요도가 가장 높은 수
            int max = 0;

            // 큐를 순회하면서 중요도가 가장 높은 수를 구한다.
            for (int n: q) {
                if (n > max) {
                    max = n;
                }
            }

            // 맨 앞 요소가 max 인 경우
            if (q.peek() == max) {

                // 출력값을 1증가 한다.
                answer++;

                // 확인 요소가 맨 앞인 경우
                // 반복문을 끝낸다.
                if (location == 0) {
                    break;

                } else {
                    // 확인 요소가 맨 앞이 아닌 경우

                    // 중요도가 가장 높은 프로세스 제거
                    q.poll();

                    // 요소를 하나 제거 했으므로
                    // 확인 요소의 인덱스 -1 
                    location--;
                }

            } else {
                // 맨 앞 요소가 max가 아닌 경우

                // 맨 앞 요소를 맨뒤로 이동 시킨다.
                q.add(q.poll());
                
                // 확인 요소가 맨 앞으로 온 경우 
                if (location == 0) {
                    
                    // 맨 뒤로 이동하므로 location 값 변경
                    location = q.size()-1;
                    
                } else {
                    // 확인 요소가 맨 앞이 아닌 경우
                    
                    // 맨 앞 요소를 맨 뒤로 보내고 있으니
                    // 확인 요소의 idx를 -1 줄인다.
                    location--;
                }
            }
        }

        return answer;
    }
}
```

![](https://i.imgur.com/EiINQEz.png)



