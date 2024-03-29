# \[ Backjoon - 5597번 \] 과제안내신분 ( java )
https://www.acmicpc.net/problem/5597
## 문제

X대학 M교수님은 프로그래밍 수업을 맡고 있다.

교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.

교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.

## 입력

입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.

## 출력

출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.

### 예제 입력 1 

3
1
4
5
7
9
6
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30

### 예제 출력 1
2
8

### 예제 입력 2 
9
30
6
12
10
20
21
11
7
5
28
4
18
29
17
19
27
13
16
26
14
23
22
15
3
1
24
25

### 예제 출력 2 
2
8

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 28개의 정수를 입력받아 1부터 30까지의 정수 중에서 입력받지 않은 정수를 찾아 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 28개의 정수를 입력받습니다. 그 후, 1부터 30까지의 정수 중에서 입력받지 않은 정수를 찾아 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 반복문과 조건문을 사용하여 1부터 30까지의 정수 중에서 입력받지 않은 정수를 찾는 것입니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 1부터 30까지의 정수 중에서 입력받지 않은 정수를 찾아 출력하는 것입니다.


### 풀이

```
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class _07_과제안내신분 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int[] arr = new int[31];
        
        // 28개의 정수를 입력받습니다.
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            arr[n] = 1;
        }

        // 1부터 30까지의 정수 중에서 입력받지 않은 정수를 찾아 출력합니다.
        for (int i = 1; i <= 30; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
```
