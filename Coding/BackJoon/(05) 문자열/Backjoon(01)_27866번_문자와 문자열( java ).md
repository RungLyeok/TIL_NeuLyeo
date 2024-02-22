# \[ Backjoon - 27866번 \] 문자와 문자열 ( java )

https://www.acmicpc.net/problem/27866

## 문제
총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오



### 입력
첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.



### 출력
첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.


### 예제
![](https://i.imgur.com/GtkzOUF.png)  ![](https://i.imgur.com/c4UNkMC.png)




## 문제 풀이
### 문제 접근 ( 알고리즘 )
### 풀이

```
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.ArrayList;  
import java.util.StringTokenizer;  
  
  
public class Backjoon_10807 {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
          
        // 몇 개의 정수가 주어지는지 입력 받는다.  
        int n = Integer.parseInt(br.readLine());  
  
        // 공백으로 구분되어져 있는 정수를 배열에 담는다.  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        ArrayList<Integer> list = new ArrayList();  
        for (int i = 0; i < n; i++) {  
            list.add(Integer.parseInt(st.nextToken()));  
        }  
  
        // 찾으려고 하는 정수를 입력 받는다.  
        int v = Integer.parseInt(br.readLine());  
          
        // 배열에 v가 몇개가 있는지 세는 변수  
        int cnt = 0;  
  
        // 리스트를 돌며 v와 같으면 cmt를 1증가 시킨다.  
        for (int item : list) {  
            if (item == v) {  
                cnt++;  
            }  
        }  
        System.out.print(cnt);  
    }  
}
```

![](https://i.imgur.com/nf7PG5I.png)

