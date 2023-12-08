# \[ Backjoon - 18108번 \] 1998년생인 내가 태국에서는 2541년생 ( with java )
https://www.acmicpc.net/problem/18108
## 문제
ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다. 공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.

불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다. 반면, 우리나라는 서기 연도를 사용하고 있다. 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.

### 입력 
>
>서기 연도를 알아보고 싶은 불기 연도 _y_가 주어진다. (1000 ≤ _y_ ≤ 3000)
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
