# \[ Backjoon - 9012번 \] 괄호 ( java )

https://www.acmicpc.net/problem/9012


## 문제
![](https://i.imgur.com/UiL1uUS.png)


### 입력
입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다.

### 출력
출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다.

### 예제
![](https://i.imgur.com/dGs8DGc.png) ![](https://i.imgur.com/RKvBu8N.png)




## 문제 풀이
### 문제 접근 ( 알고리즘 )
- 입력 데이터 수 T를 입력 받는다.

- T 만큼 반복하는 반복문을 만든다. 
	- 괄호 문자열이 옳바른지 판단하는 메서드를 실행하여 반환값을 StringBuilder에 넣는다.

- 괄호 문자열 판단하는 메서드
	- 문자열을 입력 받는다.
	- 문자열의 길이만큼 반복하는 반목문 생성
		- 문자열을 한개씩 판단한다.
			- 여는 괄호인 경우 스택에 집어 넣는다.
			- 그 외의 경우(닫는 괄호) 스택에서 뺀다.
				- 만약 스택이 비어 있으면 `NO` 반환
				  
	- 문자열 반복문이 끝난 후 스택이 비어있으면
		- `YES` 반환
	- 스택이 남이였는 경우
		- `NO` 반환


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
    public static String solve(String s) {
        
        // 여는 괄호는 담는 스택 선언
        Stack<Character> stack = new Stack();

        // 문자열의 길이만큼 반복
        for (int i = 0; i < s.length(); i++) {
            
            // 문자열을 한개씩 문자로 바꾼다.
            char c = s.charAt(i);
            
            // 그 문자가 여는 괄호인 경우
            if (c == '(') {
                
                // 스택에 넣는다.
                stack.push(c);
                
                // 괄호의 짝이 안맞는 경우
            } else if (stack.isEmpty()) {
                return "NO";
                
                // 닫는 괄호인 경우 스택에서 뺸다.
            } else {
                stack.pop();
            }
        }
        
        // 모든 문자열을 돈 후 스택이 비어있으면 YES
        if (stack.isEmpty()) {
            return "YES";
            
            // 스택에 괄호가 남아있는 경우 NO
        } else {
            return "NO";
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 입력 데이터 수 T 를 받는다.
        int T = Integer.parseInt(br.readLine());

        // T 만큼 해결 메서드를 반복한다.
        for (int i = 0; i < T; i++) {
            sb.append(solve(br.readLine())).append("\n");
        }
        
        System.out.println(sb);
        
    }
}
```