# \[ Backjoon - 24174번 \] 힙 정렬 2 ( java )

https://www.acmicpc.net/problem/24174

## 문제
![](https://i.imgur.com/GJvWwIf.png)



### 입력
![](https://i.imgur.com/w69KWIB.png)



### 출력
![](https://i.imgur.com/W4ax924.png)



### 예제
 ![](https://i.imgur.com/hncGWjF.png)

![](https://i.imgur.com/Ph2NzKI.png)






## 문제 풀이

힙 정렬을 구현한 뒤, 중간 결과를 출력하는 문제입니다.

문제에 제시된 의사코드를 그대로 프로그래밍 언어로 구현해 주시면 됩니다.

그 후, swap이 호출될 때 마다 count 값을 증가시켜주고, 원하는 횟수에 도달하면 즉시 배열 상태를 출력하고 모든 동작을 종료해 주면 됩니다.

swap시 증가시켜줄 count 변수와 완료 여부를 알려주는 isDone 변수를 만들어 쓰시면 됩니다.
### 문제 접근 ( 알고리즘 )

### 풀이

```
  
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.util.StringTokenizer;  
  
public class Backjoon_24174 {  
    public static int cnt = 0, target = 0;  
    public static int[] output;  
    public static boolean isOut = false;  
  
    public static void main(String[] args) throws IOException {  
  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int num = Integer.parseInt(st.nextToken());  
        target = Integer.parseInt(st.nextToken());  
        int[] arr = new int[num + 1];  
        arr[0] = 0;  
        st = new StringTokenizer(br.readLine());  
        for (int i = 1; i < arr.length; i++) arr[i] = Integer.parseInt(st.nextToken());  
        heapSort(arr);  
        if (!isOut) {  
            System.out.print(-1);  
        }  
    }  
  
    public static void swap (int[] arr, int a, int b){  
        cnt++;  
        int tmp = arr[a];  
        arr[a] = arr[b];  
        arr[b] = tmp;  
        if(cnt == target){  
            StringBuilder sb = new StringBuilder();  
            for (int i = 1; i < arr.length; i++) {  
                sb.append(arr[i]);  
                sb.append(" ");  
            }  
            System.out.print(sb.toString());  
            isOut = true;  
        }  
    }  
  
    public static void heapSort(int[] arr) {  
        buildMinHeap(arr, arr.length - 1);  
        for (int i = arr.length - 1; i > 1 ; i--) {  
            swap(arr, 1 , i);  
            heapify(arr, 1, i - 1);  
        }  
    }  
  
    public static void buildMinHeap(int[] arr, int num) {  
        for (int i = num / 2; i >= 1 && !isOut; i--) {  
            heapify(arr, i, num);  
        }  
    }  
  
    public static void heapify(int[] arr, int k, int num) {  
        int left = 2 * k;  
        int right = 2 * k + 1;  
        int smaller = -1;  
  
        if (right <= num) {  
            smaller = arr[left] < arr[right] ? left : right;  
        } else if (left <= num) {  
            smaller = left;  
        } else {  
            return;  
        }  
  
        if (arr[smaller] < arr[k]) {  
            swap(arr,k,smaller);  
            heapify(arr, smaller, num);  
        }  
    }  
}
```

## reference
https://velog.io/@bzhs1992/%EB%B0%B1%EC%A4%80-24174-%ED%92%80%EC%9D%B4