# [ Programmers ]  문자열 돌리기 ( java ) 8 / 124

https://school.programmers.co.kr/learn/courses/30/lessons/181945
## 문제 
### 문제 설명
![](https://i.imgur.com/k97KRya.png)

### 제한사항
![](https://i.imgur.com/wfi8XMa.png)

### 입출력 예
![](https://i.imgur.com/dESJV9Y.png)
## 문제 풀이
### 코드 설명
- `forEach(c -> System.out.println(Character.toString(c)))`: 문자 스트림의 각 문자에 대해 다음을 수행합니다.
    - `c`: 현재 문자를 나타냅니다.
    - `Character.toString(c)`: 문자를 문자열로 변환합니다.
    - `System.out.println(...)`: 문자열을 한 줄씩 출력합니다.

**실행 예시:**

```
입력: hello
출력: 
h
e
l
l
o
```
### 풀이
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next().chars().forEach(c -> System.out.println(Character.toString(c)));
    }
}
```

