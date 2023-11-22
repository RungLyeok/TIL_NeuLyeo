# \[ BASIC MATH \] 03. 순열 ( permutation ) _ with java

## 팩토리얼 ( Factorial ) 구현
```
import java.util.stream.IntStream;  
  
public class c_permutation {  
    public static void main (String[] args) {  
        //1. 팩토리얼  
        //5!  
        
        int n = 5;  
        int result = 1;  

		// 반복문을 이용하여 팩토리얼 구하기
		// result = 1 * 2 * 3 * 4 * 5
        for (int i = 1; i <= n; i++) {  
            result *= i;   
        }  
        System.out.println("result = " + result);  

		// IntStream을 이용하여 팩토리얼 구하기
        System.out.println(IntStream.range(2, 6).reduce(1, (x, y) -> (x * y)));  
        }
  }
  ```

## 순열 구현

```
public class c_permutation {  
    public static void main (String[] args) { 
        // 2. 순열  
        // 5명을 3줄로 세우는 경우의 수  
        // 5P3 = 5 * 4 * 3
        
        n = 5;  
        int r = 3;  
        result = 1;  
        
		// 5 부터 n-r+1 까지 반복
        for (int i = n; i >= n - r + 1; i--) {  
            result *= i;  
        }  
        
        System.out.println("result = " + result);  
	}
}
```
## 중복 순열 구현

```
public class c_permutation {  
    public static void main (String[] args) { 
		// 3. 중복 순열  
        // 서로 다른 4개의 수 중 2개를 뽑는 경우의 수 (중복 허용)  
        // 4의 2승
        n = 4;  
        r = 2;  
        result = 1;  

		// r만큼 반복
        for (int i = 0; i < r; i++) {  
            result *= n;  
        }  
        
        System.out.println("result = " + result);  

		// Math의  pow를 이용하여 구현
        System.out.println(Math.pow(n, r));  
```

## 원 순열 구현
```
public class c_permutation {  
    public static void main (String[] args) { 
		//4. 원 순열  
        //원 모양의 테이블에 3명을 앉히는 경우의 수  
        // ( 3 - 1 )! = 2
        
        n = 3;  
        result = 1;  
        
        for (int i = 1; i < n; i++) {  
            result *= i;  
        }  
        
        System.out.println("result = " + result);  
    }  
}
```

