# \[ Backjoon - 25314번 \] 코딩은 체육과목 입니다. ( java )
https://www.acmicpc.net/problem/25314
## 문제

![](https://u.acmicpc.net/ccbbee06-7e6f-4e56-bb9f-9a1abd795508/long-long-long-img1.png)

오늘은 혜아의 면접 날이다. 면접 준비를 열심히 해서 앞선 질문들을 잘 대답한 혜아는 이제 마지막으로 칠판에 직접 코딩하는 문제를 받았다. 혜아가 받은 문제는 두 수를 더하는 문제였다. C++ 책을 열심히 읽었던 혜아는 간단히 두 수를 더하는 코드를 칠판에 적었다. 코드를 본 면접관은 다음 질문을 했다. “만약, 입출력이 N바이트 크기의 정수라면 프로그램을 어떻게 구현해야 할까요?”

혜아는 책에 있는 정수 자료형과 관련된 내용을 기억해 냈다. 책에는 `long int`는 4$4$바이트 정수까지 저장할 수 있는 정수 자료형이고 `long long int`는 8$8$바이트 정수까지 저장할 수 있는 정수 자료형이라고 적혀 있었다. 혜아는 이런 생각이 들었다. “`int` 앞에 `long`을 하나씩 더 붙일 때마다 4$4$바이트씩 저장할 수 있는 공간이 늘어나는 걸까? 분명 `long long long int`는 12바이트, `long long long long int`는 16바이트까지 저장할 수 있는 정수 자료형일 거야!” 그렇게 혜아는 당황하는 면접관의 얼굴을 뒤로한 채 칠판에 정수 자료형을 써 내려가기 시작했다.

혜아가 N바이트 정수까지 저장할 수 있다고 생각해서 칠판에 쓴 정수 자료형의 이름은 무엇일까?

### 입력
첫 번째 줄에는 문제의 정수 N이 주어진다. (4≤N≤1000; N은 4의 배수)

### 출력
혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.

### 예제 입력 1 복사
4

### 예제 출력 1 복사
long int

### 예제 입력 2 
20

### 예제 출력 2 
long long long long long int

## 문제풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 숫자 n을 4로 나눈 몫만큼 'long'을 출력하고, 마지막에 'int'를 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 사용자로부터 한 개의 정수를 입력받습니다. 그 후, 입력받은 정수를 4로 나눈 몫만큼 'long'을 출력하고, 마지막에 'int'를 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 반복문을 사용하여 입력받은 숫자를 4로 나눈 몫만큼 'long'을 출력하는 것입니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 입력받은 숫자를 4로 나눈 몫만큼 'long'을 출력하고, 마지막에 'int'를 출력하는 것입니다.

### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _05_코딩은체육과목입니다 {
    public static void main(String[] args) throws IOException {
        // 사용자로부터 한 개의 정수를 입력받습니다.
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        // 입력받은 정수를 4로 나눈 몫만큼 'long'을 출력합니다.
        for (int i = 0; i < n / 4; i++) {
            System.out.print("long" + " ");
        }

        // 마지막에 'int'를 출력합니다.
        System.out.print("int");
    }
}
```
