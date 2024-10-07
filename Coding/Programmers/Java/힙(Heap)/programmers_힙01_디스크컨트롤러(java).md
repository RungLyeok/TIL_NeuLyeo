# [ Programmers ] _ 디스크 컨트롤 ( java )
https://school.programmers.co.kr/learn/courses/30/lessons/42627
## 문제 
### 문제 설명
![](https://i.imgur.com/YJTDXpp.png)
![](https://i.imgur.com/vCjPHd4.png)
![](https://i.imgur.com/RtOQ8QP.png)

### 제한사항
![](https://i.imgur.com/dYZKk0T.png)

### 입출력 예
![](https://i.imgur.com/qFrIq1n.png)





## 문제 풀이
![](https://i.imgur.com/gWATZCc.png)

### 문제 접근 ( 알고리즘 )
- 입력 : 2차원 배열
	- 1행 : 작업이 요청되는 시점
	- 2행 : 작업 소요 시간
- 출력 
	- 모든 작업을 종료하는 평균 시간 반환
	- 평균 시간이 가장 작은 방법을 사용
		- 1번째 작업이 끝나는 시점에서 들어온 작업 중
		- 작업 소요시간이 제일 작은 작업 부터 시작
	

#### 예시

### 풀이
#### Array 정렬, PriorityQueu사용

```
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;

        // 작업이 요청되는 시점 기준으로 오름차순 정렬
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        // 작업의 소요시간 기준으로 오름차순 정렬
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        int jobs_index = 0; // 작업 배열 인덱스
        int finish_job = 0; // 처리 완료된 작업 개수
        int end_time = 0; // 작업 처리 완료 시간

        while(true) {
            if(finish_job == jobs.length) {
	            break; // 모든 작업을 처리했다면 종료
            }

            // 이전 작업 처리 중 요청된 작업 add
            while(jobs_index < jobs.length && jobs[jobs_index][0] <= end_time) {
                pq.add(jobs[jobs_index++]);
            }

            if(!pq.isEmpty()) { // 이전 작업 처리 중 요청된 작업이 있는 경우
                int[] job = pq.poll();
                answer += end_time - job[0] + job[1]; // 작업 요청부터 종료까지 걸린 시간 추가
                end_time += job[1]; // 작업 처리 완료 시간 갱신
                finish_job++; // 처리 완료된 작업 개수 1 증가
            } else { // 이전 작업 처리 중 요청된 작업이 없는 경우
                end_time = jobs[jobs_index][0]; // 다음 작업 요청 시점으로 갱신
            }
        }

        return answer / jobs.length;
    }
}
```





