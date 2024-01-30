# \[ Backjoon - 1270번 \] 전쟁 땅따먹기 ( java )

https://www.acmicpc.net/problem/1270


## 문제

드디어 전쟁은 전면전이 시작되었고, 서로 땅을 따먹기 시작했다.

현재 여러 지역은 한창 전쟁이 벌어지고 있는 상황인데, 어느 지역은 거의 전쟁이 마무리 단계로 가고 있다.

하지만 당신은 군대를 보낼 때 적군을 혼란시키기 위해서 우리 나라의 군대라는걸 표시하지 않고, 군대의 번호로 표시했다.

어느 땅에서 한 번호의 군대의 병사가 절반을 초과한다면 그 땅은 그 번호의 군대의 지배하에 놓이게 된다.

이때, 각 땅들을 지배한 군대의 번호를 출력하여라. 만약, 아직 전쟁이 한창중인 땅이라면 “SYJKGW”을 쌍 따옴표 없이 출력한다.

### 입력
첫째 줄에는 땅의 개수 n(n<=200)이 주어진다. 

그리고 두 번째 줄에서 n+1번째 줄에는 제일 처음에 숫자 Ti(i번째 땅의 병사수, Ti<=100,000)와, 
Ti개의 숫자 (각각 병사의 군대 번호)가 주어진다. 

i번째 땅의 j번째 병사 번호 Nij가 주어진다. ( | Nij | <= 2^31 )

### 출력
첫째 줄에는 각각의 땅의 상태를 순서대로 출력한다. 

만약 땅이 지배가 되어있다면 그 지배한 병사의 번호를 출력하고, 
아니라면 “SYJKGW”을 쌍 따옴표 없이 출력한다.

### 예제 입력, 출력
![](https://i.imgur.com/Yga1AiC.png)



## 문제 풀이
### 코드 설명

- 코드의 목적:
    - 이 코드는 주어진 땅에 대해 가장 많은 병사를 보유한 번호를 출력하는 것입니다.
    - 만약 가장 많은 병사의 개수가 땅의 절반 이상이라면 그 병사의 번호를 출력하고, 그렇지 않다면 "SYJKGW"를 출력합니다.

- 코드의 주요 구조:
    - 이 코드는 입력으로 땅의 개수와 각 땅의 병사 수, 그리고 각 병사들의 번호를 받습니다. 
    - 이후, 병사들의 번호를 key로, 그 번호의 병사 수를 value로 하는 HashMap을 생성합니다.

- 코드의 주요 알고리즘:
    - HashMap을 통해 각 번호의 병사 수를 저장하며, 이후에는 HashMap을 순회하면서 가장 많은 병사를 보유한 번호를 찾습니다. 
    - 이때, 가장 많은 병사의 수가 땅의 절반 이상이라면 그 번호를 출력하고, 그렇지 않다면 "SYJKGW"를 출력합니다.

- 코드의 핵심:
    - 이 코드의 핵심은 HashMap 데이터 구조를 사용하여 병사들의 번호와 그 번호의 병사 수를 저장하고, 이를 바탕으로 가장 많은 병사를 보유한 번호를 찾는 것입니다.
### 풀이

```
import java.util.HashMap;  
import java.util.Map;  
import java.util.Scanner;  

public class Main {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt(); // 땅의 개수를 입력받습니다.
  
        for (int i = 0; i < n; i++) {  
            int nI = sc.nextInt(); // i번째 땅의 병사 수를 입력받습니다.
            Map<Long, Integer> map = new HashMap<>();  // 병사 번호와 그 번호의 병사 수를 저장할 HashMap을 생성합니다.
  
            for (int j = 0; j < nI; j++) {  
                long l = sc.nextLong(); // 병사 번호를 입력받습니다.
                map.put(l, map.getOrDefault(l, 0) + 1); // 병사 번호와 그 번호의 병사 수를 HashMap에 저장합니다.
            }  
  
            int maxCnt = 0; // 가장 큰 개수를 저장할 변수를 선언합니다.
            long maxL = -1; // 가장 많은 병사 번호를 저장할 변수를 선언합니다.
  
            // HashMap을 순회하면서 가장 많은 병사를 갖는 번호를 찾습니다.
            for (Map.Entry<Long, Integer> entry : map.entrySet()) {  
                if (entry.getValue() > maxCnt) {  
                    maxCnt = entry.getValue();  
                    maxL = entry.getKey();  
                }  
            }  
  
            // 가장 많은 병사의 수가 땅의 절반 이상이라면 그 번호를 출력하고, 그렇지 않다면 "SYJKGW"를 출력합니다.
            if (maxCnt > nI / 2) {  
                System.out.print(maxL + " ");  
            } else {  
                System.out.print("SYJKGW ");  
            }  
        }  
  
        sc.close();  // Scanner를 닫습니다.
    }  
}

```



