# \[ BASIC MATH \] 06. 지수(Exponents)와 로그 (logarithms) with java
## Math를 이용하여 구현

```
public class Main {    
    public static void main(String[] args) {  
  
		// 제곱, 제곱근, 지수  
        // Math.pow(밑, 지수)  
        System.out.println(Math.pow(2, 3)); // 8.0  
        System.out.println(Math.pow(2, -3)); // 0.125  
        System.out.println(Math.pow(-2, -3)); // -0.125  
        System.out.println(Math.pow(2, 30)); // 1.073741824E9  
        System.out.printf("%.0f\n", Math.pow(2, 30)); // 1073741824  
  
        // 제곱근 = root
        // Math.sqrt()  
        System.out.println(Math.sqrt(16)); // 4  
        System.out.println(Math.pow(16, 1.0/2)); // 4  
        System.out.println(Math.pow(16, 1.0/4)); // 2  
  
		// 절대 값  
		// Math.abs()  
        System.out.println(Math.abs(5)); // 5  
        System.out.println(Math.abs(-5)); // 5  
  
  
		// 로그  
        System.out.println(Math.E); // 자연 산수          System.out.println(Math.log(2.7182818284590452353602874713527)); // 1  
        System.out.println(Math.log10(1000)); // 3  
        System.out.println(Math.log(4) / Math.log(2)); // 2  
  
    }  
}
```

## Math 없이 제곱, 제곱근 구현

```
public class Main {  

    // 제곱  
    // a = 밑 / b = 지수
    static double pow(int a, double b) {   
    
        double result = 1;
        
        // 음수 확인 변수  
        boolean isMinus = false;  

		// 지수가 0인 경우
        if (b == 0) {  
            return 1;  
            
        } else if (b < 0) { 
	        // 지수가 음수인 경우
            b *= -1;  
            isMinus = true;  
        }  
        
		// 지수만큼 반복
        for (int i = 0; i < b; i++) {  
        
		    // 제곱
            result *= a;  
        }  
  
        return isMinus ? 1 / result : result;  
    }  
  
    // 제곱근  
    static double sqrt(int a) {  
    
	    // 반환을 위한 변수  
        double result = 1; 
        
        for (int i = 0; i < 10; i++) {
	        // 바빌로니아 방법   
            result = (result + (a / result)) / 2;  
        }  
  
        return result;  
    }  
  
    public static void main(String[] args) {           
                        
        System.out.println("== Math pow ==");  
        System.out.println(Math.pow(2, 3));  
        System.out.println(Math.pow(2, -3));  
        System.out.println(Math.pow(-2, -3));  
  
        System.out.println("== My pow ==");  
        System.out.println(pow(2, 3));  
        System.out.println(pow(2, -3));  
        System.out.println(pow(-2, -3));  
  
        System.out.println("== Math sqrt ==");  
        System.out.println(Math.sqrt(16)); // 4  
        System.out.println(Math.sqrt(8)); // 2.8284271247461903  
  
        System.out.println("== My sqrt ==");  
        System.out.println(sqrt(16)); //  
        System.out.println(sqrt(8)); // 2.82842712474619 근사치  

    }  
}
```