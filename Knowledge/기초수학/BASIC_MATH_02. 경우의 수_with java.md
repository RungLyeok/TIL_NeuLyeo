# [ BASIC MATH ] 02. 경우의 수 _ with java
## 합의 법칙
### 배열을 이용하여 구현
```
import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.HashSet;  
  
public class NumberOfCases {  
    public static void main(String[] args){  
        // 1. 합의 법칙  
        // 두 개의 주사위를 던졌을 때 합이 3 또는 4의 배수일 경우의 수  
        System.out.println("== 합의 법칙 ==");  
          
        int[] dice1 = {1, 2, 3, 4, 5, 6};  
        int[] dice2 = {1, 2, 3, 4, 5, 6};  
  
        int nA = 0;  
        int nB = 0;  
        int nAandB = 0;  
		          
        for (int item1 : dice1) {  
            for (int item2 : dice2) {  
	            // 주사위 1,2 의 합이 3의 배수인 경우
                if((item1 + item2) % 3 ==0){  
                    nA += 1;  
                }  
                // 주사위 1,2 의 합이 4의 배수인 경우
                if((item1 + item2) % 4 ==0){  
                    nB += 1;  
                }  
                // 3의 배수, 4의 배수 모두 해당하는 경우
                if((item1 + item2) % 12 ==0){  
                    nAandB += 1;  
                }  
            }  
        }
        // A의 경우 + B의 경우 - A,B 중복 = 12 + 9 - 1 = 20   
        System.out.println("결과 : " + (nA + nB - nAandB));  
```
### HashSet을 이용하여 구현
HashSet은 중복을 자동으로 제거하기 때문에 중복을 뺄 필요 없다.

```  
        
        HashSet<ArrayList> allCase = new HashSet<>();  
        
        for (int item1: dice1) {  
            for (int item2: dice2) {  
	            // 두 주사위의 합이 3의 배수 또는 4의 배수인 경우
                if((item1 + item2) % 3 == 0 || (item1 + item2) % 4 == 0){
                    ArrayList list = new ArrayList(Arrays.asList(item1, item2));  
                    allCase.add(list);  
                }  
            }  
        }  
        System.out.println("결과 : " + allCase.size());  

```

## 곱의 법칙
```
        // 2. 곱의 법칙  
        // 두 개의 주사위를 a, b를 던졌을 때 a는 3의 배수, b는 4의 배수인 경우으 수  
        System.out.println("== 곱의 법칙 ==");  
    
        nA = 0;  
        nB = 0;  
  
        for (int item1: dice1) {
	        // 주사위 a 가 3의 배수인 경우  
            if(item1 % 3 == 0) {  
                nA++;  
            }  
        }  
        for (int item1: dice2) {  
			// 주사위 b 가 4의 배수인 경우
            if (item1 % 4 == 0) {  
                nB++;  
            }  
        }  
        System.out.print("결과 : "+ (nA * nB));  // 2 X 1 = 2
    }  
}
```
