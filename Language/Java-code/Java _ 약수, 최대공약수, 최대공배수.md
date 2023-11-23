# [ Java _ code ] 약수, 최대공약수, 최대공배수 구하기
## 약수
약수 (Divisor) 란?
- 어떤 수를 나누어 떨어지게 하는 수를 그 수의 약수라고 한다.
- 예를 들어 10의 약수는 1, 2, 5, 10 이다.

### 반복문을 이용하여 구하기
모든 수를 돌아야 하기 때문에 수가 커질 수록 비효율 적이다.

```
public ArrayList getDivisor(int num) { 

	// 약수를 담을 배열 생성
    ArrayList result = new ArrayList();  

    // 1부터 파라미터로 전달받은 숫자(num)까지 반복
    for (int i = 1; i <= num; i++){  
    
		// 나누어 떨어지는 경우 배열에 추가
        if (num % i ==0){  
            result.add(i);  
        }  
    }  
    result.add(num);  
  
    return result;  
}
```

### 제곱근을 이용하여 약수 찾기
제곱근 (Square root) 이란 
- 제곱의 반대 개념이다.
- 실수 a에 대하여 x2 = a를 만족시키는 x가 존재할 때, 이 x를 a의 제곱근이라고 합니다.
- 4의 2승은 16이다. / 16의 제곱근은 4이다.

![](https://i.imgur.com/9G1j7JP.png)

num의 약수가 1일 때 다른 약수는 num/1 이 되므로 다른 하나의 약수는 num이 된다.

즉, num 의 약수 중 하나가 i 일 때, 다른 약수 중 하나는 num / i 가 된다.

```
public ArrayList getDivisorSR(int num) {  
  
    // 약수를 담을 배열 생성  
    ArrayList result = new ArrayList();  
  
    // 1부터 파라미터로 전달받은 숫자(num)까지 반복  
    for (int i = 1; i <= (int)Math.sqrt(num); i++) {  
  
        // 나누어 떨어지는 경우 배열에 추가  
        if (num % i == 0) {  
            result.add(i);  
            if (i != num / i) {  
                result.add(num / i);  
            }  
  
        }  
    }
    
    // 배열 오름차순 정렬  
    result.sort(Comparator.naturalOrder());  
    return result;  
} 
```




## 최대공약수, 최대공배수 구하기
위의 약수 구하기 함수를 이용하여 최대 공약수, 최대 공배수를 구한다.

### 최대 공약수 ( GCD : the Greatest Common Denominator )
서로 다른 두 자연수의 공통된 약수를 공약수라 한다.
12의 약수 = 1, 2, 3, 4, 6, 12
18의 약수 = 1, 2, 3, 6, 9, 18
공약수 = 1, 2, 3, 6

공약수 중에서 가장 큰 수를 최대 공약수라 한다.
최대 공약수 = 6

```
public int getGCD(int numA, int numB) {  
    int gcd = -1;  
  
    ArrayList divisorA = this.getDivisor(numA);  
    ArrayList divisorB = this.getDivisor(numB);  

	// numA의 약수 배열을 순환
    for (int itemA : (ArrayList<Integer>) divisorA) {
	
	    // numB의 약수 배열을 순환
        for (int itemB : (ArrayList<Integer>) divisorB) {  
        
		    // A의 약수와 B의 약수가 같은경우
            if (itemA == itemB) { 
            
	            // 같은 경우에서 가장 큰수를 저장한다.
                if (itemA > gcd) {  
                    gcd = itemA;  
                }  
            }  
        }  
    }  
    return gcd;  
}
```

### 최대 공배수 ( LCM : the Lowest Common Multiple )

2와 3의 배수를 구하면 공통된 배수를 확인할 수 있다. 이것을 공배수라 한다.
2의 배수 = 2, 4, 6, 8, 10, 12 .....
3의 배수 = 3, 6, 9, 12, 15, ......
공배수 = 6. 12. 18. 24. 30

공배수 중에서 가장 작은 수를 최소 공배수라 한다.

```
public int getLCM(int numA, int numB) {  
    int lcm = -1;  

	// 최대 공약수를 구한다.
    int gcd = getGCD(numA, numB);  

	// 최대 공약수가 -1이 아닌 경우
    if (gcd != -1) {  

		// 최대 공배수는 A * B / 최대 공약수 이다.
        lcm = numA * numB / gcd;  
    }  
  
    return lcm;  
}
```

## code test
```
int number1 = 1984;  
int number2 = 3524;  
  
Main test = new Main();  
ArrayList l1 = test.getDivisor(number1);  
ArrayList l2 = test.getDivisorSR(number2);

System.out.println("number1의 약수 : " + l1);  
// number1의 약수 : [1, 2, 4, 8, 16, 31, 32, 62, 64, 124, 248, 496, 992, 1984]

System.out.println("number2의 약수 : " + l2);  
// number2의 약수 : [1, 2, 4, 881, 1762, 3524] 
  
System.out.println("최대 공약수 : " + p.getGCD(number1, number2));  
// 최대 공약수 : 4

System.out.println("최대 공배수 : " + p.getLCM(number1, number2));
// 최대 공배수 : 1747904
```