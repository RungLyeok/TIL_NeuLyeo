# \[ Backjoon - 25304번 \] 영수증 ( java )
https://www.acmicpc.net/problem/25304
## 문제

준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.

영수증에 적힌,

- 구매한 각 물건의 가격과 개수
- 구매한 물건들의 총 금액

을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

### 입력

첫째 줄에는 영수증에 적힌 총 금액 $X$가 주어진다.

둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 $N$이 주어진다.

이후 $N$개의 줄에는 각 물건의 가격 $a$와 개수 $b$가 공백을 사이에 두고 주어진다.

### 출력

구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 `Yes`를 출력한다. 일치하지 않는다면 `No`를 출력한다.

### 제한

-  1≤ X ≤ 1\,000\,000\,000$ 
-  1≤ N ≤ 100$ 
-  1≤ a ≤ 1\,000\,000$ 
-  1≤ b ≤ 10$ 

### 예제 입력 1 

260000
4
20000 5
30000 2
10000 6
5000 8

### 예제 출력 1 

Yes

영수증에 적힌 구매할 물건들의 목록으로 계산한 총 금액은 20000 × 5 + 30000 × 2 + 10000 × 6 + 5000 × 8 = 260000원이다. 이는 영수증에 적힌 총 금액인 260000원과 일치한다. 

### 예제 입력 2 

250000
4
20000 5
30000 2
10000 6
5000 8

### 예제 출력 2
No

## 문제풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 전체 금액과 상품 개수, 그리고 각 상품의 가격과 수량을 바탕으로, 상품들의 총 가격이 전체 금액과 일치하는지 확인하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 사용자로부터 전체 금액과 상품 개수를 입력받습니다. 그 후, 상품 개수만큼 각 상품의 가격과 수량을 입력받아, 상품들의 총 가격을 계산하고, 그것이 전체 금액과 일치하는지 확인합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 반복문을 사용하여 상품 개수만큼 각 상품의 가격과 수량을 입력받아, 상품들의 총 가격을 계산하는 것입니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 입력받은 상품들의 총 가격이 전체 금액과 일치하는지 확인하는 것입니다.

### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04_255304_영수증 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 전체 금액과 상품 개수를 입력받습니다.
        int total = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            // 각 상품의 가격과 수량을 입력받아, 상품들의 총 가격을 계산합니다.
            StringTokenizer st = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        // 상품들의 총 가격이 전체 금액과 일치하는지 확인하고 결과를 출력합니다.
        System.out.println(total == sum ? "Yes" : "No");
    }
}
```
