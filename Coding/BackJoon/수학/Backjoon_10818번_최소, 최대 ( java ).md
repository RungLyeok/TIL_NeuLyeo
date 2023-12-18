# \[ Backjoon - 10818번 \] 최소, 최대 ( java )
https://www.acmicpc.net/problem/10818
## 문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

### 입력
>ㅇ
>![](https://i.imgur.com/SRpkt6i.png)
>

### 출력
>ㅇ
>![](https://i.imgur.com/nuhgP5j.png)
>

### 예제
![](https://i.imgur.com/7Gmm3ac.png)

## 문제 풀이
값을 하나씩 읽어들일 때 마다 최솟값과 최댓값을 업데이트 하는 형식으로 구현하면 됩니다.

최솟값을 저장하기 위한 변수, 최댓값을 저장하기 위한 변수를 하나씩 만들어 위와 같이 값이 들어올 때 마다 비교하여 업데이트하면 됩니다.

### 문제 접근 ( 알고리즘 )

- 입력
	- 첫째 줄 : 정수의 개수 N ( 1 ≤ N ≤ 1,000,000 )
	- 둘째 줄 : N개의 정수, 공백으로 구분 ( -1,000,000 ≤ num ≤ 1,000,000 )
	  
- 출력
	- 주어진 정수의 최솟값과 최댓값을 공백으로 구분해 출력


기본적인 배열 문제이다. 

**Arrays.sort() 메소드** 를 이용하여 문제를 해결하였다.

sort( ) : 배열에 저장된 원소 값을 **오름차순으로 정렬**해주는 메소드

오름차순으로 정렬하면

최솟값은 배열의 첫번째 원소 ( arr[ 0 ] )

최댓값은 배열의 마지막 원소 ( arr.length - 1 )

로 찾을 수 있다.
### 풀이

```
import java.util.Arrays;  
import java.util.Scanner;

public class Backjoon_10818 {  
    public static void main(String[] args) {  
  
        Scanner in = new Scanner(System.in);  
          
        // 정수의 개수를 입력 받는다.  
        int n = in.nextInt();  
          
        // 정수의 개수 크기의 배열 생성  
        int[] arr = new int[n];  
          
        // 정수의 개수 만큼 반복  
        for (int i = 0; i < n; i++) {  
            // 배열에 정수 입력  
            arr[i] = in.nextInt();  
        }  
  
        in.close();  
          
        // 배열 정렬, 오름차순  
        Arrays.sort(arr);  
          
        // 최소, 최대 값 출력  
        System.out.print(arr[0] + " " + arr[n - 1]);  
    }  
}
```
