# \[ BASIC MATH \] 04. 조합 ( Combination ) _ with java
## 조합 구현

![](https://i.imgur.com/ubaNzp9.png)

```
public class Main {  
    static int getNumOfCombination(int n, int r) {  
        int pResult = 1;  
        for (int i = n; i >= n - r + 1; i--) {  
            pResult *= i;  
        }  
  
        int fResult = 1;  
        for (int i = 1; i <= r; i++) {  
            fResult *= i;  
        }  
  
        return pResult / fResult;  
    }  
  
    public static void main(String[] args) {  
//      1. 조합 nCr  nPr/r!        
		System.out.println("== 조합 ==");  
  
        int n = 4;  
        int r = 2;  
  
        // nPr  
        int pResult = 1;  
        for (int i = n; i >= n - r + 1; i--) {  
            pResult *= i;  
        }  
  
        // r!  
        int fResult = 1;  
        for (int i = 1; i <= r; i++) {  
            fResult *= i;  
        }  
  
        System.out.println("결과 : " + pResult / fResult);
        // 결과 : 6
  
  
//      2. 중복 조합 nHr = n+r-1Cr        
		System.out.println("== 중복 조합 ==");  
        n = 2;  
        r = 3;  
  
        System.out.println("결과 : " + getNumOfCombination(n + r - 1, r));  
		// 결과 : 4
	}  
}
```