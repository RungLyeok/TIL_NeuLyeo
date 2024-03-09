





# [BOJ / java] 2720 : 세탁소 사장 동혁

https://www.acmicpc.net/problem/2720

## 문제
미국으로 유학간 동혁이는 세탁소를 운영하고 있다. 동혁이는 최근에 아르바이트로 고등학생 리암을 채용했다.

동혁이는 리암에게 실망했다.

리암은 거스름돈을 주는 것을 자꾸 실수한다.

심지어 $0.5달러를 줘야하는 경우에 거스름돈으로 $5달러를 주는것이다!

어쩔수 없이 뛰어난 코딩 실력을 발휘해 리암을 도와주는 프로그램을 작성하려고 하지만, 디아블로를 하느라 코딩할 시간이 없어서 이 문제를 읽고 있는 여러분이 대신 해주어야 한다.

거스름돈의 액수가 주어지면 리암이 줘야할 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성하시오. 거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다. 예를 들어, $1.24를 거슬러 주어야 한다면, 손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.

## 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 거스름돈 C를 나타내는 정수 하나로 이루어져 있다. C의 단위는 센트이다. (1달러 = 100센트) (1<=C<=500)

## 출력

각 테스트케이스에 대해 필요한 쿼터의 개수, 다임의 개수, 니켈의 개수, 페니의 개수를 공백으로 구분하여 출력한다.

## 예제
### 예제 입력 1 
3
124
25
194
### 예제 출력 1

4 2 0 4
1 0 0 0
7 1 1 4

## 문제 풀이
### 코드설명
- 코드의 동작방식: 
	- 이 코드는 특정 금액을 25센트, 10센트, 5센트, 1센트의 동전으로 교환할 때 각 동전이 몇 개 필요한지를 계산하는 Java 프로그램입니다.
    
- 코드의 구성: 
	- 코드는 메인 클래스인 '_03_세탁소사장동혁'와 메인 메소드 'main'으로 구성되어 있습니다. BufferedReader를 통해 입력을 받고, 이를 통해 계산을 진행합니다.
    
- 코드의 핵심 부분: 
	- 코드의 핵심은 while문 내부에서 진행되는 계산입니다. 각 동전의 개수를 계산한 후에는, StringBuilder를 사용하여 결과를 문자열로 만들고 출력합니다.
    
- 코드의 흐름: 
	- 입력 받기 → 동전 개수 계산 → 결과 출력


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_세탁소사장동혁 {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 이용한 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스의 수를 입력 받음
        int t = Integer.parseInt(br.readLine());
        // 각 동전의 가치를 배열로 선언
        int[] cArr = {25, 10, 5, 1};

        // 각 테스트 케이스에 대해
        while (t-- > 0) {
            // 교환할 금액을 입력 받음
            int c = Integer.parseInt(br.readLine());
            // 결과를 담을 StringBuilder 선언
            StringBuilder sb = new StringBuilder();

            // 각 동전에 대해
            for (int n : cArr) {
                // 동전의 개수를 계산하고 결과에 추가
                sb.append(c / n).append(" ");
                // 남은 금액을 계산
                c %= n;
            }

            // 결과 출력
            System.out.println(sb.toString().trim());
        }
    }
}
```

