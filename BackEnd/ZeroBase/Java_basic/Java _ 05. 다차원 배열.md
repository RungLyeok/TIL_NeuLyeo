# \[Java\] 05. 다차원 배열

---

## 배열

[2023.11.08 - \[Language/Java\] - \[Java\] 01. 변수와 자료형](https://leungnyeok.tistory.com/entry/Java-01-%EB%B3%80%EC%88%98%EC%99%80-%EC%9E%90%EB%A3%8C%ED%98%95)

  
  
  
  

## 01\. 다차원 배열

다차원 배열이란 2차원 이상의 배열을 의미하며, 배열 요소 안에 또 다른 배열을 가지는 것을 의미한다.

2차원 배열 : 배열의 요소로 1차원 배열을 가지는 배열

3차원 배열 : 배열의 요소로 2차원 배열을 가지는 배열

  
  
  
  

## 02\. 2차원 배열의 선언 및 생성방법

자바에서는 2차원 배열을 나타내는 타입을 따로 제공하지 않는다.

대신에 1차원 배열의 요소로 또 다른 1차원 배열을 사용할 수 있다.

```
// 문법

타입[ ][ ] 배열이름;

타입 배열이름 [ ][ ];

타입[ ] 배열이름 [ ];


// (방법1) 배열의 선언과 생성을 나누어 사용

  int[ ][ ] num;         // 2차원 배열에 대한 레퍼런스 변수 선언

  num = new int[2][3];   // 2차원 배열생성 (2차원 배열의 저장공간 할당)


// (방법2) 배열의 선언과 생성을 한줄로 합쳐서 사용

  int[ ][ ] num = new int[2][3];
```

  
  
  
  

## 03\. 이차원 배열의 초기화 및 사용

```
int[][] num = { { 10, 11, 12 }, { 20, 21, 22 } };
int total = 0;

System.out.println("num 배열 길이: " + num.length); 
System.out.println("num[0] 배열 길이: " + num[0].length); 
System.out.println("num[1] 배열 길이: " + num[1].length);

for (int i = 0; i < num.length; i++) { 
    for (int j = 0; j < num[i].length; j++) { 
        total = total + num[i][j]; 
        System.out.println("num[" + i + "][" + j + "] : " + num[i][j]); 
    } 
} 

System.out.println("num 배열의 총합: " + total);
```