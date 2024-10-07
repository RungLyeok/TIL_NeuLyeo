# [ Programmers ] _ 같은 숫자는 싫어( java )
https://school.programmers.co.kr/learn/courses/30/lessons/12906
## 문제 
### 문제 설명
>![](https://i.imgur.com/EEAt3DH.png)
>

### 제한사항
>
>![](https://i.imgur.com/DrjilHN.png)
>


### 입출력 예
![](https://i.imgur.com/gQ6AL7X.png)





## 문제 풀이
다양한 방법으로 풀 수 있는 문제입니다. 리스트에 정답에 들어갈 값을 하나씩 넣어주면 됩니다.

for문을 이용해 이전 값을 기억하고, 이 값과 같은 값이면 정답이 담길 리스트에 값을 담지 않습니다. 이전 값과 비교하여 새로운 값이면 리스트에 값을 순서대로 담습니다.

첫번째 값은 무조건 들어가게 되므로, 첫번째 값은 정답 리스트에 넣고 시작하고, 두번째 값부터 위 로직을 적용하면 됩니다.
### 문제 접근 ( 알고리즘 )
- Integer Stack 생성
  
- 입력 배열 크기 만큼 반복, 
	- 우선 arr[ 0 ] 값 Stack에 추가
	  
- 다음 인덱스 부터 Stack `peek()` 값과 다른 경우만 추가
  
- 출력 배열 생성
	- 크기는 Stack의 크기 만큼
	  
- Stack 모든 값을 출력 배열에 넣는다.
	- Stakc은 입력의 연순순으로 출력하므로
	- 배열에 역순으로 담는다.
### 풀이
#### stack 사용

```
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       
        //integer를 담는 Stack 선언
        Stack<Integer> st = new Stack<Integer>();
        
        // 입력 배열의 크기만큼 반복
        for(int i = 0; i < arr.length; i++) {
        
        	// 배열의 첫 요소인 경우
            if(i == 0) {
                st.push(arr[i]);
            } 
            
           	// 다음 인덱스(1) 부터는, stack의 최상단의 값(peek)이 arr[i]의 값과 일치여부 확인 후
            // 일치하지 않을 경우에만 stack에 해당 값 push
            else if(st.peek() != arr[i]){
                st.push(arr[i]);
            }
        }
        
      	// 결과값 answer의 사이즈는 stack의 사이즈와 동일하게 생성
        int[] answer = new int[st.size()];
        
		// stack의 모든 data를 꺼낸다. pop()
        // stack에서 꺼내는 값은 실제 배열의 역순이므로
        // 역순으로 담는다 (i는 st.size()-1부터 시작, -1씩 줄여가며 i가 0보다 클때까지)
        for(int i = st.size() - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }
    
        return answer;
    }
}
```

![](https://i.imgur.com/a5lEOUh.png)  

![](https://i.imgur.com/MFNtlcB.png)

