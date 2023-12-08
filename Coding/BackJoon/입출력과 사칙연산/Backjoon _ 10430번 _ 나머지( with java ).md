# \[ Backjoon - 10430번 \] 나머지 ( with java )
https://www.acmicpc.net/problem/10430
## 문제
(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

### 입력 
>
>첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
>
### 출력 
> 
> 불기 연도를 서기 연도로 변환한 결과를 출력한다.
> 


![](https://i.imgur.com/LVFgyVP.png)

## 문제 주요 내용
불멸기원(佛滅紀元)은 그 이름대로 석가모니가 열반해 해, 즉 불멸한 연도를 기점으로 헤어리는 기년법으로 줄여서 `불기(佛紀)` 라고 부른다.

불기 원년(1년)은 기원전 544년이므로 서기를 불기로 변환할 때는 543를 더하면 된다. 


예를 들면, 서기 2000년은 불기 2543년인 셈이다.

또한 

예제 입력과 출력을 확인하면 간단하게 확인 할 수 있다.

`2541 - 1998`의 차이는 543 인 것을 확인 할 수 있다.
## 문제 풀이

```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
  
        int year = Integer.parseInt(br.readLine());  
  
        if(year > 1000 && year <= 3000 ) {  
  
            System.out.print(year - 543);  
        }  
    }  
}
```
