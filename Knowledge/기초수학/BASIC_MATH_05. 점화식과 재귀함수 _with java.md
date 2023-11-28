# \[ BASIC MATH \] 05. 점화식과 재귀함수 with java
## 피보나치 수열

```
public class Main {

	// 재귀함수
	static int recursion(int n) {  
        if (n < 3) {  
            return 1;  
        }  
        return recursion(n - 2) + recursion(n -1);  
    } 
    
    public static void main(String[] args) {
    
	// 반복문
	if (n <= 2) {
		result = 1;
		
	} else {
		for (int i = 2; i < n; i++) {
			result = a1 + a2;
			a1 = a2;
			a2 = result;
		}
	}
	
	System.out.println(result);  // 8
    System.out.println(recursion(n)); // 8
    }
}
```

## 팩토리얼

```
public class Main {

	// 재귀함수
	static int factorial(int n) {
        if (n == 1) {  
            return 1;  
        }  
        return n * factorial(n - 1);  
    }  
  
    public static void main(String[] args) {  
        System.out.println(factorial(1));  // 1
        System.out.println(factorial(2));  // 2
        System.out.println(factorial(3));  // 6
        System.out.println(factorial(4));  // 24
        System.out.println(factorial(5));  // 120
    }  
```