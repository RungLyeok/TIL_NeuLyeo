# [ Programmers ] _ 나누어떨어지는숫자배열 ( java )
https://school.programmers.co.kr/learn/courses/30/lessons/12910
## 문제 
### 문제 설명
>![](https://i.imgur.com/5F9nmLK.png)
>


### 제한사항
> 
> ![](https://i.imgur.com/BmroCHp.png)
>



### 입출력 예
![](https://i.imgur.com/gDUQAlj.png)







## 문제 풀이
### 문제 접근 ( 알고리즘 )
- divisor로 나누어 떨어지는 arr의 요소를 ArrayList에 담는다.

- 나누어 떨어지는 요소가 없는 경우
	- ArrayList에 요소가 없는경우
	- [ -1 ] 을 리턴

- 그 외의 경우
	- ArrayList의 요소를 출력할 배열에 옮김

- 출력 배열을 정렬 후 리턴


### 풀이
#### ArrayList 사용
```
import java.util.ArrayList;  
import java.util.Arrays;  
  
public class solution {  
    public int[] solution(int[] arr, int divisor) {  
        // 반환 배열  
        int[] answer = {};  
        // ArrayList 선언  
        ArrayList<Integer> list = new ArrayList<>();  
  
        // 입력 배열 arr의 크기만큼 반복  
        for (int i = 0; i < arr.length; i++) {  
  
            // arr의 요소가 divisor로 나누어 떨어지는 경우  
            // ArrayList에 추가  
            if (arr[i] % divisor == 0) {  
                list.add(arr[i]);  
            }  
        }  
  
        // arr의 모든 요소가 나누어 떨이지지 않는 경우  
        // [ -1 ] 반환  
        if (list.size() == 0) {  
            answer = new int[] {-1};  
  
        } else {  
            // 출력 배열의 크기 지정  
            answer = new int[list.size()];  
  
            // ArrayList 크기 만큼 반복  
            for (int i = 0; i < list.size(); i++) {  
  
                // ArrayList의 요소를 출력 배열에 옮겨 담는다.  
                answer[i] = list.get(i);  
            }  
  
            // 출력 배열 정렬  
            Arrays.sort(answer);  
        }  
        return answer;  
    }  
}
```

![](https://i.imgur.com/oCdSEWl.png)

### Stream 사용
```
import java.util.Arrays;  
  
public class Solution {  
    public int[] solution(int[] arr, int divisor) {  
    
        // stream 생성  
        int[] answer = Arrays.stream(arr).  
                // stream 가공  
                filter(el -> el % divisor == 0)  
                // stream 정렬  
                .sorted()  
                // stream을 배열로 반환  
                .toArray();  
		
		// 나누어 떨어지는 요소가 없는 경우 [-1] 반환
        if (answer.length == 0) {  
            answer = new int[] {-1};  
        }  
  
        return answer;  
    }  
}
```

![](https://i.imgur.com/8M0BgCh.png)
