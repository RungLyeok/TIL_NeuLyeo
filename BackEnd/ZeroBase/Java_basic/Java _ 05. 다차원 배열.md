# [Java] 05. 다차원 배열
---

<br>
<br>
## 배열

<br>



배열의 논리적 메모리 구조가 2차원 이상의 형태를 보이는 배열을 다차원 배열이라고 한다.

일반적으로 2차원을 초과하는 구조의 배열을 잘 이용하지 않는다.

따라서 2차원 배열에 대해서만 공부한다.

<br>
<br>
<br>

### 01. 이차원 배열의 선언 및 생성방법

```
// (방법1) 배열의 선언과 생성을 나누어 사용

  int[ ][ ] num;         // 2차원 배열에 대한 레퍼런스 변수 선언

  num = new int[2][3];   // 2차원 배열생성 (2차원 배열의 저장공간 할당)


// (방법2) 배열의 선언과 생성을 한줄로 합쳐서 사용

  int[ ][ ] num = new int[2][3];
```
<br>
<br>
<br>

### 02. 이차원 배열의 초기화 및 사용

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
<br>
<br>
<br>
<br>
