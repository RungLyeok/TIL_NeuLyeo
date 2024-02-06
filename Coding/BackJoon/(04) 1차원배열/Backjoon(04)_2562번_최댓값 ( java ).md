# \[ Backjoon - 2562번 \] 최댓값 ( java )
https://www.acmicpc.net/problem/2562
## 문제
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

예를 들어, 서로 다른 9개의 자연수

3, 29, 38, 12, 57, 74, 40, 85, 61

이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

### 입력
첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

### 출력
첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

### 예제 입력 
3
29
38
12
57
74
40
85
61

### 예제 출력 
85
8

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 9개의 정수 중에서 가장 큰 수와 그 수가 몇 번째 입력된 것인지를 찾아 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 9개의 정수를 입력받습니다. 그 후, 입력받은 정수 중에서 가장 큰 수와 그 수가 몇 번째 입력된 것인지를 찾아 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 반복문과 조건문을 사용하여 가장 큰 수와 그 수가 몇 번째 입력된 것인지를 찾는 것입니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 입력받은 9개의 정수 중에서 가장 큰 수와 그 수가 몇 번째 입력된 것인지를 찾아 출력하는 것입니다.


### 풀이

```
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = 0, index = 0, i = 0;
        String line;
        
        // 9개의 정수를 입력받아 가장 큰 수와 그 수가 몇 번째 입력된 것인지를 찾습니다.
        while ((line = br.readLine()) != null && ++i > 0)
            
            if (Integer.parseInt(line) > max) { 
                max = Integer.parseInt(line); 
                index = i; 
            }
        
        // 가장 큰 수와 그 수가 몇 번째 입력된 것인지를 출력합니다.
        System.out.println(max + "\n" + index);
    }
}
```
