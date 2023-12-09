# \[ Backjoon - 10172번 \] 개 ( with java )
https://www.acmicpc.net/problem/10172
## 문제
아래 예제와 같이 개를 출력하시오.

### 입력 
>
>
>
### 출력 
> 
개를 출력한다.
> 

![](https://i.imgur.com/GOvR0Nr.png)

## 문제 주요 내용
`\`, `"`, `'`  를 출력하려면 

기호들 앞에 `\` 를 추가해주면 된다.

또한 줄바꿈은 `\n` 를 입력해준다.

줄바꿈과 `+` 를 이용하면 여러줄을 한번에 출력할 수 있다.
## 문제 풀이

```
public class Backjoon_10172 {  
    public static void main(String[] args)  {  
  
        System.out.println(  
                "|\\_/|\n" +  
                "|q p|   /}\n" +  
                "( 0 )\"\"\"\\\n" +  
                "|\"^\"`    |\n" +  
                "||_/=\\\\__|");  
    }  
}
```
