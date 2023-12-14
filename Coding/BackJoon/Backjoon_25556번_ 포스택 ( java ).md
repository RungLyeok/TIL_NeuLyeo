# \[ Backjoon - 25556번 \] 포스택 ( with java )

[https://www.acmicpc.net/problem/25556](https://www.acmicpc.net/problem/25556)


## 문제
![](https://i.imgur.com/mmAEiMF.png)

### 입력
>![](https://i.imgur.com/C5Oi1qb.png)
>
### 출력
>
>![](https://i.imgur.com/ejqMg99.png)
>

### 예제
![](https://i.imgur.com/Ui0Hv8s.png) ![](https://i.imgur.com/BEYlLUB.png)


## 문제 풀이
### 문제 접근 ( 알고리즘 )

- 입력
	-  첫째 줄 입력 :  순열의 길이 N (1 <= N <= 100 000)
	-  둘째 줄 입력 : 순열 A의 원소 ( 1 <= A  <= N / 중복X ), 공백으로 구분


**스택은 ( Last In First Out ) 후입선출의 특성을 가지고 있다.**  
  

따라서 스택에 data를 넣을 때 오름차순으로 넣어야지만 오름차순의 출력을 받을 수 있다.

  

|stack|[ 1 ]|[ 1, 2 ]|[ 1, 2, 3 ]|
|---|---|---|---|
|오름차순 [ 1, 2, 3 ]|push( 1 )|push( 2 )|push( 3 )|
|stack|[ 1, 2, 3 ]|[ 1, 2 ]|[ 1 ]|
|pop()|3|2|1|
|result|3|2 3|1 2 3|

  

result : 꺼낸 수들은 순서대로 오른쪽에서 왼쪽으로 나열
  
따라서 스택에 이미 들어간 data 보다 삽입하려는 num의 값이 작으면 안 된다.  

stack.peek() < num 일 때만 stack.push(num) 한다.

만약 위 규칙을 지키지 않는다면 어떻게 하더라도 출력한 값들을 오름차순으로 만들 수 없다. ( = 포닉스 청소 불가능 )

> 예제 1번  
>   
> 10  
> 4 3 6 7 8 9 10 2 1 5   
>   
> stack1 : 4 6 7 8 9 10  
> stack2 : 3 5  
> stack3 : 2   
> stack4 : 1

>   
> 예제 2번  
>   
> 5  
> 5 4 3 2 1   
>   
> // 1을 넣을 stack이 없다.  
> stack1 : 5   
> stack2 : 4  
> stack3 : 3  
> stack4 : 2

### 풀이

```
import java.util.ArrayList;  
import java.util.Scanner;  
import java.util.Stack;  
  
public class Main {  
    public static void main(String[] args) {  
        // 입력을 받는 부분  
        Scanner sc = new Scanner(System.in);  
          
        // 수열의 길이, N  
        int n = sc.nextInt();  

		// 수열을 담을 배열 선언
        ArrayList<Integer> list = new ArrayList<>();  
          
        // 수열 생성, N만큼 반복  
        for (int i = 0; i < n; i++) {  
            list.add(sc.nextInt());  
        }
          
        // 스택 4개를 담을 배열  
        ArrayList<Stack<Integer>> sList = new ArrayList<>();  
          
        // 스택 4개 생성  
        for (int i = 0; i < 4; i++) {  
            sList.add(new Stack<>());  
            sList.get(i).push(0);  
        }  
        
        // 청소할 수 있는지 확인  
        boolean flag = true;  
          
        // 수열 순회  
        for (int num : list) {  
        
            // num을 스택에 넣을 수 있는지 확인  
            boolean isNumber = false;  
              
            // 배열 안에 있는 스택 순회  
            for(Stack<Integer> a : sList){
              
                // 스택의 peek 값 보다 num이 큰 경우  
                if (num > a.peek()){
                  
                    // 스택에 num을 추가  
                    a.push(num);  
                    isNumber = true;  
                      
                    // num 추가 후 스택 순회 종료  
                    break;  
                }  
            }
              
            // isNumber이 false인 경우  
            // num 이 4개의 모든 스택의 peek값 보다 작은 경우  
            if (!isNumber) {  
                // 청소 할 수 없음  
                flag = false;  
                // 수열 순회 종료  
                break;  
            }  
        }
          
        if (flag) {  
            System.out.println("YES");  
        } else {  
            System.out.println("NO");  
        }  
    }  
}
```