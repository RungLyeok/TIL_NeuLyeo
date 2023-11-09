
## 6. 다차원 배열

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
```

<br>
<br>
<br>
<br>

---
## 7. 클래스와 객체

자바 프로그래밍을 OOP(객체 지향 프로그래밍)이라고도 한다.

현실 세계에서도 특정 제품을 만들 때 여러 가지 부품들을 각각 만들어 하나로 조립해서 제품을 생산하듯이 프로그래밍적으로도 여러 가지 객체(Object)를 각각 만들어서 하나로 조립하는 프로그래밍 기법을 객체 지향 프로그래밍이라고 한다.

자바에서 객체는 클래스를 통해 생성하실 수 있다.
<br>
<br>
<br>

### 01. 클래스
<br>

#### 클래스 구조

| 클래스의 구성 맴버  | 설명                                                             |
| ------------------- | ---------------------------------------------------------------- |
| 필드(Field)         | 객체의 데이터가 저장되는 곳                                      |
| 생성자(Constructor) | new 연산자로 호출되는 메소드로 객체 생성 시 필드의 초기화를 담당 |
| 메소드(Method)      | 객체의 동작에 해당하며 클래스의 다양한 동작을 구성               |

클래스 내부에는 클래스의 속성을 나타내는 **필드**와 클래스의 동작을 나타내는 **메소드** 그리고 클래스를 생성할 때 호출할 수 있는 **생성자**가 있다.
생성자는 new 연산자를 통해 호출할 수 있는 메소드라고 생각하시면 되며 주로 필드의 변수들을 초기화하는 역할을 한다.
<br>
<br>

#### 클래스 선언

```
class Student{ 
	//필드(Field) 
	String name; 	    //이름 
	int age; 	        //나이 
	int korean_scroe; 	//국어성적 
	int math_score; 	//수학성적 
	int english_score; 	//영어성적 
	
	//생성자 (Constructor) 
	Student(String name, int age, int kor_score, int mat_score, int eng_score){
		 this.name = name; 
		 this.age = age; 
		 this.korean_scroe = kor_score; 
		 this.math_score = mat_score; 
		 this.english_score = eng_score; 
	} 
	
	//메소드(Method) 
	public void printScore() { 
		System.out.println("이름 : " + name); 
		System.out.println("나이 : " + age); 
		System.out.println("국어성적 : " + korean_scroe); 
		System.out.println("수학성적 : " + math_score); 
		System.out.println("영어성적 : " + english_score); 
	} 
}
```

클래스는 위와 같이 class 클래스명 { }  와 같은 형태로 만든다

내부에 **필드, 생성자, 메소드**를 정의해야 한다.

추가로 생성자와 메소드는 오버 로딩이 가능하다.

이렇게 생성된 클래스는 하나의 객체 설계도이다.

이렇게 정의된 클래스를 통해 동일한 객체를 무한정 찍어낼 수 있다.

이렇게 찍어낸 객체를 인스턴스라고 한다.
<br>
<br>

#### 생성자

생성자는 객체가 생설될 때 자동으로 호출된다.
클래스명과 이름이 같아야 한다.
리턴 타입은 없다.

##### this 
객체 자신을 의미한다.
##### this ()
생성자를 의미한다.
<br>
<br>
<br>

### 02. 인스턴스
<br>

#### 인스턴스 생성

클래스를 통해 객체를 생성하기 위해서는 new 연산자를 사용한다.

new 연산자 뒤에는 생성자가 오는데, 생성자는 클래스() 형태를 가지고 있으며 생성자의 여부에 따라 인자 값을 맞춰 넣는다.

이렇게 new 연산자로 생성된 객체는 힙 메모리 영역에 생성되며 이렇게 만들어진 객체를 해당 클래스의 인스턴스(instance)라고 한다.

```
public class Main {
	public static void main(String[] args) { 
		//생성자가 없는 경우 
		Student student1 = new Student(); 
		
		//생성자가 있는 경우 
		Student student2 = new Student("홍길동", 18, 100, 90, 80); 
	} 
}
```
<br>
<br>

#### 인스턴스 메소드 사용

```
public class Main { public static void main(String[] args) { 
	Student student = new Student("홍길동", 18, 100, 90, 80); 
	student.printScore(); //인스턴스 메소드 호출 
	} 
}
```
<br>
<br>
<br>

### 03. 오버로딩 (Overloading)

오버로딩의 정의는 

자바의 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가 있더라도 
매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있다.
<br>

#### 오버로딩의 조건

- 메소드의 이름이 같아야 한다.
- 매개변수의 개수나 타입이 달라야한다.
- 리턴값만 다른 것은 오버로딩이 아니다.
<br>
<br>

#### 예시

```
public void print() { 
	System.out.println("오버로딩1"); 
} 
String print(Integer a) { 
	System.out.println("오버로딩2"); 
	return a.toString(); 
} 
void print(String a) { 
	System.out.println("오버로딩3");
	System.out.println(a); 
} 
String print(Integer a, Integer b) { 
	System.out.println("오버로딩4"); 
	return a.toString() + b.toString(); 
}
```
<br>
<br>
<br>

### 04. 접근제어자

자바에서 접근제어자(access modifier)는  
**클래스와 클래스의 멤버 (필드, 메소드, 생성자)를 사용할 때, 접근할 수 있는  범위를 지정**해 주는 역할을 한다.

보통 접근제어자 또는 접근지정자라고 부르며 클래스나 클래스 멤버 앞에 붙어있는 public, private, protected 등의 키워드가 바로 접근제어자(접근지정자)이다.

공개범위는 **public  >  protected  >  default(생략)  >  private** 순으로 좁아 진다. 

![](https://i.imgur.com/QQsLqy9.png)


<br>
<br>

#### public
public 은 공개를 나타내며, 모든 클래스에서 접근이 가능합니다 (패키지와 상관없음)
<br>
<br>

#### private 
private은 비공개를 나타내며, 같은 클래스안에 있는 멤버들만 접근이 가능합니다.
<br>
<br>

#### protected
같은 패키지안의 모든 클래스와, 다른 패키지의 자식 클래스에서 접근이 가능합니다.
<br>
<br>

#### default(생략)
접근지정자가 없으면 default 멤버로, 같은 패키지안의 클래스에서만 접근이 가능합니다.
<br>
<br>
<br>

### 05. static (정적)

정적(static)은 고정된이란 의미를 가지고 있다.

Static이라는 키워드를 사용하여 Static변수와 Static메소드를 만들 수 있는데 다른말로 정적필드와 정적 메소드라고도 하며 이 둘을 합쳐 정적 멤버라고 한다. (또는 클래스 멤버)

정적 필드와 정적 메소드는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다.

그렇기에 클래스 로더가 클래스를 로딩해서 메소드 메모리 영역에 적재할때 클래스별로 관리한다.

따라서 클래스의 로딩이 끝나는 즉시 바로 사용할 수 있다.

![](https://i.imgur.com/AN3vtYL.png)

메모리에 한번만 할당된다. 즉, Static 변수나 메소드는 공유되는 특성을 가진다.

static 클래스 변수 : 해당 클래스의 각 객체들이 값을 공유
static 클래스 메소드 : 객체를 생성하지 않아도 호출 가능

<br>
<br>
<br>
<br>

---
## 8. 상속 (Inheritance)
<br>

### 01. 상속

**부모 클래스**(상위 클래스)와 **자식 클래스**(하위 클래스)가 있으며, 자식 클래스는 부모 클래스를 선택해서, **그 부모의 멤버를 상속받아 그대로 쓸 수 있게** 된다.

상속을 하는 이유는 이미 마련되어 있던 클래스를 재사용해서 만들 수 있기 때문에 효율적이고, 개발 시간을 줄여준다.

상속을 하더라도 자식 클래스가 부모의 모든 것들을 물려받는 것은 아니다.

- **부모 클래스의 private 접근 제한을 갖는 필드 및 메소드**는 **자식이 물려받을 수 없다**
- **부모와 자식 클래스가 서로 다른 패키지에 있다면**, 부모의 default 접근 제한을 갖는 필드 및 메소드도 자식이 물려받을 수 없다.
    (default 접근 제한은 ‘같은 패키지에 있는 클래스’만 접근이 가능하게끔 하는 접근 제한자이기 때문입니다.)
- 그 이외의 경우는 모두 상속의 대상이 된다.
<br>

#### 부모 클래스
상속 대상이 되는 기존 클래스 = 상위 클래스, 기초 클래스
<br>

#### 자식 클래스
기존 클래스를 상속하는 클래스 = 하위 클래스, 파생 클래스
<br>
<br>

#### 상속 형태


![](https://i.imgur.com/CRK7yOc.png)

다중 상속은 불가능 하다.

하나의 자식 클래스가 2개의 부모를 상속받는 것

상속받은 여러 개의 부모 클래스들에서 동일한 명칭의 필드나 메소드가 있으면?

- 어떤 부모 클래스의 필드와 메소드를 상속받아야 하는가?
- 어떤 부모 클래스에 어떻게 접근해야 하는가?

위와 같은 모호함이 발생한다.

![](https://i.imgur.com/pwLUcLM.png)
<br>
<br>

#### 상속 방법 (extends)

```
//부모 클래스 생성 
class 부모{ } 

//부모 클래스 상속 
class 자식 extends 부모{ }
```
<br>
<br>
<br>

### 02. super, super()

자바에서는 자식 객체를 생성하면, 부모 객체를 먼저 생성한 후, 자식 객체가 그 다음에 생성한다.

부모 클래스(ParentBook)는 명시적 생성자 선언이 없었고, 자식 클래스(ChildBook)는 명시적 생성자 선언이 존재합니다.

**그러면 이 때 부모 클래스의 생성자 선언**은, 자식 클래스의 생성자 선언 내부에 맨 첫줄에 **super();** 라고 생성됩니다.

부모의 기본 생성자 선언을 포함해서 명시적 생성자 선언이 없었으므로, 컴파일러가 super(); 를 알아서 생성합니다. 그리고 그 super(); 는 부모 클래스의 기본 생성자를 컴파일러가 호출하는 것입니다.

**앞으로 ‘super’ 키워드는 부모 클래스(객체)를 나타내는 것임을 기억하면 됩니다.**

<br>

#### super 

부모 클래스와 자식 클래스의 멤버 이름이 같을 때 구분하는 키워드

```
class People{
	//필드(Feild) 
	String name; //이름 
	int age; //나이
	//메소드(Method) 
	public void printMyself(){ 
		System.out.println("이름 : " + name); 
		System.out.println("나이 : " + age); 
	}
} 
class Student extends People{ 
	//필드(Field) 
	int korean_scroe; //국어성적 
	int math_score; //수학성적 
	int english_score; //영어성적 
	
	//생성자(Constrouct) 
	Student(String name, int age, int kor_score, int mat_score, int eng_score){
		 super.name = name; //부모 필드 
		 super.age = age; //부모 필드 
		 this.korean_scroe = kor_score; 
		 this.math_score = mat_score; 
		 this.english_score = eng_score; 
	}
```
<br>

#### super()

부모클래스의 생성자 호출

```
public class ParentBook{
  String name; //필드
  int price;

  public ParentBook (String name, int price){ // 부모의 생성자가 있는 경우
    this.name = name;
    this.price = price;
}
  public void Print(){ // 메소드
    System.out.println("책의 이름과 가격 : "+name+" "+price);
}

public class ChildBook extends ParentBook{
  ChildBook (){ // 자식 생성자
    super("나의 라임오렌지 나무", 10000); // 반드시 자식 생성자 첫줄에 선언
}

public static void main (String[] args){
  ChildBook Child = new ChildBook();
  System.out.print("[구현 결과 2] : ");
  Child.Print();
}
```
<br>
<br>
<br>

### 03. 오버라이딩 (Overriding)

**부모 클래스로부터 상속받은 메서드의 내용을 재정의(변경) 하는 것**을 오버라이딩이라고 한다. 

물론 상속받은 메서드를 그대로 사용해도 되지만 자식클래스에서 변경해야 하는 경우가 많다. 

이렇게 **변경이 이루어지는 경우에 부모메서드를 오버라이딩**한다.

> **1. 자식 클래스의 오버라이딩 하려는 메서드는 부모 클래스의 메서드와**  
>	**- 이름이 같아야 한다.**  
> 	**- 매개변수가 같아야 한다.**  
> 	**- 반환타입이 같아야 한다. ** 
  >
>  2. 접근 제어자는 조상클래스의 메서드보다 좁은 범위로 변경할 수 없다.  
> **- ex) 부모클래스 : public void xxx( ){ . . . }  , 자식클래스 : protectecd void xxx( ){ . . . } // 에러!!**  
> 	- 참고:  public -> protecd, -> (default), -> private 접근 범위가 좁아짐
>
>**3. 부모 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.  
>	- ex) 부모클래스 : void xxx ( ) throws IOException, SQLException { . . . }  
       자식클래스:  void xxx ( ) throws Exception { . . . }  
>	-**  단순 개수 문제가 아님. Exception 은 모든 예외의 최고 부모이다. 가장 많은 개수의 예외를 던질 수 있다.  
>  
>**4. 인스턴스 메서드를 static 메서드 또는 그 반대로 변경할 수 없다.**
<br>

#### 예시

```
class Car{
	void drive(){ 
	System.out.println("기름을 써서 출발"); 
	} 
}
class EvCar extends Car{ 
	@Override 
	void drive(){ 
		System.out.println("전기를 써서 출발"); 
	} 
} 
class overrridingEX { 
	public static void main(String[] args) { 
	Car car = new Car(); 
	car.drive(); 
	EvCar evCar = new EvCar(); 
	evCar.drive(); 
	} 	
}
```

<br>
<br>
<br>
<br>

---
## 9. 다형성 (Polymorphism)
<br>
### 01. 다형성

하나의 객체가 여러 가지 형태를 가질 수 있는 것을 의미한다.

자바에서 다형성은 한 타입의 참조 변수를 통해 여러 타입의 객체를 참조할 수 있도록 하는 것이다. 

즉, 상위 클래스 타입의 참조 변수를 통해서 하위 클래스의 객체를 참조할 수 있도록 허용하여 상위 클래스가 동일한 메시지로 하위 클래스들이 서로 다른 동작을 할 수 있도록 한다.

다형성을 활용하면, 부모 클래스가 자식 클래스의 동작 방식을 알 수 없어도 오버라이딩을 통해 자식 클래스에 접근할 수 있다.
<br>

#### **다형성의 장점**

1. 유지보수 : 여러 객체를 하나의 타입으로 관리할 수 있어 유지보수가 용이하다.
2. 재사용성 : 객체의 재사용이 쉬워 재사용성이 높아진다.
3. 느슨한 결합 : 클래스 간의 의존성을 줄여 확장성은 높아지고 결합도는 낮아진다.

<Br>

#### **다형성의 조건**

1. 상위 클래스와 하위 클래스는 상속 관계여야 한다.
2. 다형성이 보장되기 위해 오버라이딩(하위 클래스 메서드의 재정의)이 반드시 필요하다.
3. 자식 클래스의 객체가 부모 클래스의 타입으로 형변환(업캐스팅)해야 한다.

```
class Human { 
	public void info() { 
	System.out.println("나는 사람입니다."); 
	} 
} 
class Female extends Human { 
	public void info() { 
		System.out.println("나는 여자입니다."); 
	} 
} 
class Male extends Human { 
	public void info() { 
		System.out.println("나는 남자입니다."); 
	} 
} 
public class PolymorphismEx { 
	public static void main(String[] args) {
	 // 객체 타입과 참조변수 타입이 일치
	 Human human = new Human(); 
	 Female female = new Female(); 
	 
	 // 객체 타입과 참조변수 타입이 불일치(다형성)
	 Human female = new Female();
	 Human male = new Male(); 
	 
	 // 하위 클래스 타입으로 상위 클래스 참조 불가능 
	 // Female female2 = new Human();
	 human.info(); 
	 female.info(); 
	 male.info(); 
	}
```
<br>
<br>

#### **참조 변수의 형 변환**

자바에서는 기본 자료형의 형 변환도 가능하지만, 참조 변수도 형 변환이 가능하다.

참조 변수의 형 변환은 사용할 수 있는 멤버의 개수를 조절하는 것이다.

>**형 변환을 위한 조건**
> 1. 서로 상속관계에 있는 상위 클래스 : 하위 클래스 사이에만 형 변환이 가능하다.
> 2. **업 캐스팅**(하위 클래스 타입에서 상위 클래스 타입으로 형 변환)은 형 변환 연산자를 생략할 수 있다.
> 3. **다운 캐스팅**(상위 클래스에서 하위 클래스 타입으로 변환)은 형 변환 연산자를 반드시 작성해야 한다.

```
// 업 캐스팅 () 생략 가능 
Parents parents = (Parents) child1; 

// 다운 캐스팅 () 생략 불가능 
Child1 child11 = (Child1) parents; 

// Child1과 Child2는 상속 관계가 아니므로 형변환 불가능 
// Child2 child2 = (Child2) child1;
```
<br>
<br>
<br>

### 02. instanceof

instanceof 연산자는 참조 변수의 형 변환이 가능한 지의 여부를 boolean 타입으로 확인할 수 있는 자바의 문법 요소이다.

즉, 업 캐스팅 또는 다운 캐스팅이 가능한 지를 검사하는 것이다.

```
Animal animal = new Animal(); 
System.out.println(animal instanceof Object); // true 
System.out.println(animal instanceof Animal); // true 
System.out.println(animal instanceof Dog); // false 
System.out.println(animal instanceof Cat); // false 

Animal cat = new Cat(); 
System.out.println(cat instanceof Object); // true 
System.out.println(cat instanceof Animal); // true 
System.out.println(cat instanceof Dog); // false 
System.out.println(cat instanceof Cat); // true 

Animal dog = new Dog(); 
System.out.println(dog instanceof Object); // true 
System.out.println(dog instanceof Animal); // true
System.out.println(dog instanceof Dog); // ture 
System.out.println(dog instanceof Cat); // false
```

<br>
<br>
<br>
<br>

---
## 10. 추상 클래스
<Br>

### 01. 추상 클래스

추상 클래스(Abstract Class)는 추상 메서드를 선언해 놓고 상속을 통해 자식 클래스에서 메서드를 완성하도록 유도하는 클래스이다. 

이러한 특성 탓에 **미완성 설계도**라고 표현하기도 한다.

실체클래스의 공통적인 부분( 변수, 메서드 )를 추출해서 선언한 클래스이다.

추상클래스는 **객체를 생성할 수 없다**. 실체가 없고 구체적이지 않기 때문에

추상클래스와 실체클래스는 상속관계이다.

```
abstract class 클래스{ 
	...
	public abstract void 메서드(); 
}
```

추상 클래스는 추상 메서드를 가지지 않아도 괜찮다. 다만, 추상 메서드를 하나라도 가진다면 그 클래스는 추상 클래스가 된다.

추상 메서드를 선언했다면 자식 클래스는 해당 메서드를 반드시 구현하도록 강제된다.

또한 JAVA는 다중 상속을 지원하지 않기 때문에 여러 개의 추상 클래스를 상속할 수 없다.
<Br>

#### 추상클래스 사용 목적
1. 공통된 필드와 메서드를 통일할 목적
2. 실체클래스 구현시, 시간절약
3. 규격에 맞는 실체클래스 구현
<br>
<br>
<br>

### 02. 추상 메소드

추상클래스에 존재하는 메소드를 상속받은 자식클래스에서 반드시 오버라이딩 해야하는 메소드 이다.

추상메소드는 선언만하고 구현 내용이 없다.

```
abstract void print();
```

<br>
<br>
<br>
<br>

---
## 11. 인터페이스
<br>

### 01. 인터페이스

인터페이스도 추상 클래스와 비슷하게 다른 클래스를 작성하는데 도움을 주는 목적으로 작성한다.

다만 인터페이스는 추상 클래스보다 추상화 정도가 높아 추상 클래스와 다르게 구현부가 있는 일반 메서드, 일반 변수 멤버 등을 가질 수 없다. 

즉, 인터페이스는 구현된 게 아무것도 없는 **기본 설계도**라고 할 수 있다.

인터페이스 또한 인스턴스를 생성할 수 없다.

```
interface 인터페이스{
    public static final 상수 = 값;
    public abstract void 메서드();
}
```

**모든 멤버 변수는 public static final, 즉 상수이다.** 
public static final은 자동으로 컴파일 시 생성되므로 생략가능 하다.

**모든 메서드는 public abstract, 즉 추상 메서드이다.** 
마찬가지로 public abstract는 생략 가능하다.

다만, Java 8에서부터는 다음과 같이 디폴트 메서드와 정적 메서드를 사용할 수 있다.

디폴트 메서드 :

```
public interface Default{     
        // 디폴트 메소드 : 실행 내용까지 작성 가능
        public default void 메서드(){
   
            ... // 구현 내용
            
        }
}
```

정적 메서드 :

```
public interface Static{   
        // 정적 메소드
        public static void 메서드(){
            ... // Static.메서드() 와 같이 호출 가능
        }
 }
```
<br>
<br>
<br>

### 02. 추상클래스와 인터페이스의 차이

|             |                                         추상클래스                                          | 인터페이스                                             |
| ----------- |:-------------------------------------------------------------------------------------------:| ------------------------------------------------------ |
| 다중상속    |                                           불가능                                            | 가능                                                   |
| 추상 메서드 |                                          0개 이상                                           | 전부                                                   |
| 일반 메서드 |                                            가능                                             | 불가능. 다만 Java8부터는 디폴트, 정적 메서드 구현 가능 |
| 필드        |                                  일반 변수, 상수 모두 가능                                  | 상수(static final)만 가능                              |
| 상속 키워드 |                                           extends                                           | implements                                             |
| 접근 제어자 |                                          제한 없음                                          | public                                                 |
| 공통점      | 1. 인스턴스를 생성할 수 없다.  <br>2. 상속받은 클래스는 반드시 추상 메서드를 구현해야 한다. |                                                        |


![](https://i.imgur.com/MDrN5H3.png)
<br>
<br>

#### 추상클래스

- 사람 is kind of 포유류
- 포유류 is kind of 생물체
- 조류 is kind of 생물체

##### 명확한 계층 구조 추상화
추상 클래스는 이를 상속받을 각 객체들의 공통점을 찾아 추상화시켜 놓은 것으로, 상속 관계를 타고 올라갔을 때 같은 부모 클래스를 상속하며 부모 클래스가 가진 기능들을 구현해야 할 경우 사용한다.

##### 중복 멤버 통합
추상 클래스를 이용하면 중복 멤버 변수의 통합이 가능하다. 인터페이스는 일반 멤버 변수를 선언하지 못하고 상수만 선언할 수 있기 때문에 이러한 중복 멤버 변수의 통합이 불가능하다. static final 상수를 선언한다면 각 클래스에서 값의 변경이 불가능할 것이다.
<br>
<br>

#### 인터페이스

- 박쥐 is able to 날기
- 독수리 is able to 날기
- 사람 is able to 수영
- 펭귄 is able to 수영

##### 자유로운 관계 묶음
인터페이스는 상속 관계를 타고 올라갔을 때 다른 조상 클래스를 상속하더라도, 같은 기능이 필요할 경우 사용한다. 클래스와 별도로 구현 객체가 같은 동작을 한다는 것을 보장하기 위해 사용한다.
##### 다중 상속이 필요한 경우

<br>
<br>
<br>
<br>

---
## 12. 내부 클래스
<br>

### 01. 내부 클래스란

내부 클래스(inner class)란 하나의 **클래스 내부에 선언된 또 다른 클래스**를 의미한다.

**내부에 정의된다는 점을 제외하고는 일반적인 클래스와 다르지 않다.** 우리가 어느 클래스에 변수나 상수가 필요하다면 클래스 멤버로서 클래스 내에서 선언하여 사용해 왔듯이, 선언 주체를 변수에서 클래스로 바꾼다면 그것이 내부 클래스인 것이다.

이처럼 내부 클래스는 **보통 두 클래스가 서로 긴밀한 관계**가 있거나, **하나의 클래스 또는 메소드에서만 사용되는 클래스**일 때 이용되는 기법이다.
<br>
<br>

#### 내부클래스 장점
1. 클래스를 논리적으로 그룹화
2. 타이트한 캡슐화의 적용
3. 가독성, 유지 관리 향상
<br>
<br>

#### 내부클래스 특징
1. 내부 클래스에서 외부 클래스 멤버에 접근가능
2. 외부에서는 내부 클래스에 접근 불가
<br>
<br>
<br>

### 02. 내부 클래스 종류

| **내부 클래스**                  | **특징**                                                                                                                                                                                                                                                                                             |
| -------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 인스턴스 클래스 (instance class) | 외부 클래스의 멤버변수 선언 위치에 선언하며, 외부 클래스의 인스턴스 멤버처럼 다뤄진다.  <br>주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용될 목적으로 선언된다.                                                                                                                             |
| 스태틱 클래스 (static class)     | 외부 클래스의 멤버변수 선언 위치에 선언하며, 외부 클래스의 static 멤버처럼 다뤄진다.  <br>다만 주의할점은 static이라고 해서 new 생성자 초기화를 못하는 건 아니다.  <br>즉, 일반적인 static 필드 변수나 static 메서드와 달리, staic 내부 클래스는 같은 static이지만 메모리 구조나 기능이 전혀 다르다. |
| 지역 클래스 (local class)        | 외부 클래스의 메서드나 초기화블럭 안에 선언하며, 선언된 메서드 블록 영역 내부에서만 사용될 수 있다.                                                                                                                                                                                                  |
| 익명 클래스 (anonymous class)    | 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스이다.  <br>주로 클래스를 일회용으로 사용할때 자주 이용된다.                                                                                                                                                                                 |
<br>
<br>

#### 인스턴스 클래스
- 클래스의 멤버 변수 선언부에 위치하고 static 키워드가 없는 내부 클래스
- 외부 클래스의 멤버로 취급되기 때문에 외부 클래스의 객체 먼저 생성한 후 내부 클래스의 객체를 생성이 가능하다
- 인스턴스 클래스 내부에는 instance 멤버만 선언할 수 있다. (static 멤버는 선언 불가)
- 주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용될 목적으로 선언된다.
<br>
<br>

#### 스태틱 클래스
- static 키워드가 붙은 내부 클래스
- 단, 일반적인 static 필드 변수나 static 메서드와 똑같이 생각하면 안된다.
- static 클래스 내부에는 instance 멤버와 static 멤버 모두 선언 할 수 있다.
- 그러나 일반적인 static 메서드와 동일하게 외부 클래스의 인스턴스 멤버에는 접근이 불가하고, 정적(static) 멤버에만 접근할 수 있다.

static 클래스는 static 이라고 해서 메모리에 한번만 로드되는 객체 개념이 아니다.

즉, 내부 인스턴스 클래스 처럼 외부 인스턴스를 먼저 선언하고 초기화해야 하는 선수 작업 필요 없이, **내부 클래스의 인스턴스를 바로 생성**할 수 있다는 차이점만 존재한다.

내부 클래스를 이용하는데, 내부 클래스에서 바깥 외부의 인스턴스를 사용할 일이 없다면 **static 클래스로 선언**해주어야 한다. 
<br>
<br>

#### 지역 클래스
- 메소드 내부에 위치하는 클래스 (지역 변수와 같은 성질을 지님)
- **지역 변수처**럼 해당 메서드 내부에서만 한정적으로 사용된다. (해당 메소드 실행 외에는 클래스 접근 및 사용 불가)
- 접근제한자와 static을 붙일 수 없다.  
    메소드 내부에서만 사용되므로 접근을 제한할 필요가 없고, 원래 메소드 내에는 static 멤버를 선언할 수 없기 때문이다.
<br>
<br>

#### 익명 클래스
- 익명 클래스는 클래스 **이름이 존재하지 않는 이너 클래스다.** 
- 단 하나의 객체만을 생성하는 **일회용 클래스**
- 클래스의 **선언과 동시에 객체를 생성**
- 익명 클래스는 생성자가 존재하지 않는다.
- 익명 클래스는 기존에 존재하는 클래스를 메서드 내에서 일회용으로 클래스 내부 구성을 선언하여 필요한 메서드를 재정의 하여 사용하는 기법이다

```
public class Main {
    public static void main(String[] args) {
    	// Object 클래스를 일회성으로 익명 클래스로 선언하여 변수 o 에 저장
        Object o = new Object() {
            @Override
            public String toString() {
                return "내 마음대로 toString 바꿔보리기 ~";
            }
        };
		
        // 익명 클래스의 객체의 오버라이딩한 메서드를 사용
        String txt = o.toString();
        System.out.println(txt); // 내 마음대로 toString 바꿔보리기 ~
    }
}
```


<br>
<br>
<br>
<br>

---
## 13. 자바 입출력
<br>
<br>

### 01. 자바 입출력과 스트림
<br>

#### 스트림이란?
자바에서 모든 입출력은 스트림(Stream)을 통해 이루어진다. 

입출력 장치는 매우 다양하여 장치에 따라 입출력 부분을 일일이 다르게 구현하면 프로그램 호환성이 떨어질 수 밖에 없다.
이런 문제를 해결하기 위해 자바는 입출력 장치와 무관하고 일관성 있게 프로그램을 구현할 수 있도록 일종의 가상 통로인 스트림을 제공한다.

자료를 읽어 들이려는 소스(source)와 자료를 쓰려는 대상(target)에 따라 각각 다른 스트림 클래스를 제공한다.
<br>
<br>

#### 입, 출력 스트림
어떤 대상으로부터 자료를 읽어 들일 때 사용하는 스트림이 입력 스트림이다.  

편집 화면에 사용자가 쓴 글을 파일에 저장할 때는 출력 스트림을 사용한다.

스트림은 단방향으로 자료가 이동하기 때문에 입력과 출력을 동시에 할 수 없다. 

| **종류**        | **예시**                                                          |
| --------------- | ----------------------------------------------------------------- |
| **입력 스트림** | FileInputStream, FileReader, BufferInputStream, BufferReader 등   |
| **출력 스트림** | FileOutputStream, FileWriter, BufferOutputStream, BufferWriter 등 |

<br>
<br>

#### 바이트 스트림
원래 자바의 스트림은 바이트(Byte)단위로 자료의 입출력이 이루어진다. 그러므로 그림, 동영상, 음악 파일 등 대부분 파일은 바이트 단위로 읽거나 쓰면 된다. 

그런데 자바에서 하나의 문자를 나타내는 Char형은 2바이트이기 때문에 1바이트만 읽으면 한글과 같은 문자는 깨져버리고 만다.  

따라서 입출력 중 가장 많이 사용하는 자료인 문자를 위해 문자 스트림을 별도로 제공한다.  

즉 읽어 들이는 자료형에 따라 바이트용과 문자용 스트림이 있다.

| **종류**          | **예시**                                                                   |
| ----------------- | -------------------------------------------------------------------------- |
| **바이트 스트림** | FileInputStream, FileOutputStream, BufferInputStream, BufferOutputStream등 |
| **문자 스트림**   | FileReader, FileWriter, BufferReader, BufferWriter 등                      |

<br>
<br>

#### 기반, 보조 스트림
기반 스트림은 읽어 들일 곳(소스)나 써야할 곳(대상)에서 직접 읽고 쓸 수 있으며 입출력 대상에 직접 연결되어 생성되는 스트림이다.

보조 스트림은 직접 읽고 쓰는 기능은 없으며, 항상 다른 스트림을 포함하여 생성된다.

| **종류**        | **예시**                                                                            |
| --------------- | ----------------------------------------------------------------------------------- |
| **기반 스트림** | FileInputStream, FileOutputStream, FileReader, FileWriter등                         |
| **보조 스트림** | InputStreamReader, OutputStreamWriter, BufferedInputStream, BufferedOutputStream 등 |
<br>
<br>
<br>

### 02. 콘솔 입력
#### System.in
```
System.out.print("입력 : ");  
int a = System.in.read() - '0'; // 아스키코드 값만큼 빼서 숫자로 변환  
System.out.println("a = " + a);  
System.in.read(new byte[System.in.available()]);  
// System.in 은 엔터값 까지 받아오기 때문에 엔터값을 제거 해야 한다.
```
<br>
<br>

#### InputStreamReader
```
InputStreamReader reader = new InputStreamReader(System.in);  
// 배열의 크기 만큼만 문자열을 받는다.  
char[] c = new char[3];  
System.out.print("입력 : ");  
reader.read(c);  
System.out.println(c);
```
<br>
<br>

#### BufferedReader
``` 
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
System.out.print("입력 : ");  
String s1 = br.readLine();  
System.out.println("s1 = " + s1);
```
<br>
<br>

#### Scanner
```
		//1-2. Scanner  
        System.out.println("== Scanner ==");  
        Scanner sc = new Scanner(System.in);  
        System.out.print("입력1 : ");  
        System.out.println(sc.next());  
        sc.nextLine();  
  
        System.out.print("입력2 : ");  
        System.out.println(sc.nextInt());  
        sc.nextLine();  
  
        System.out.println("입력3 : ");  
        System.out.println(sc.nextLine());  
  
//      참고) 정수, 문자열 변환  
        int num = Integer.parseInt("12345");  
        String str = Integer.toString(12345);
```
<br>
<br>
<br>

### 03. 콘솔 출력

```
//      2. 출력  
        System.out.println("Hello");  
        System.out.println("World");  
  
        System.out.print("Hello");  
        System.out.print("World");  
        System.out.println();  
  
        System.out.printf("Hello");  
        System.out.printf("World");  
        System.out.println();  
  
        String s = "자바";  
        int number = 3;  
  
        System.out.println(s + "는 언어 선호도 " + number +"위 입니다.");  
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number);  
  
        System.out.printf("%d\n", 10); //정수  
        System.out.printf("%o\n", 10); //8진수  
        System.out.printf("%x\n", 10); //16진수  
        System.out.printf("%f\n", 5.2f); // float  
        System.out.printf("%c\n", 'a'); //char  
        System.out.printf("%s\n", "안녕하세요"); //String  
  
        // 줄 정렬  
        System.out.printf("%-5d\n", 123);  
        System.out.printf("%5d\n", 1234);  
        System.out.printf("%5d\n", 12345);  
  
        System.out.printf("%.2f\n", 1.123);  
        System.out.printf("%.2f\n", 1.126);
```
<br>
<br>
<br>

### 04. 파일 출력
<br>

#### 파일 쓰기
<br>

##### FileWriter

```
// 파일 경로 설정
FileWriter fw = new FileWriter("./memo.txt");  
String memo = "1줄 입니다."\n";  
fw.write(memo);  
  
memo = "2줄 작성 중 입니다.\n";  
fw.write(memo);  
  
// 파일 쓰기가 끝나면 항상 종료 해야한다.  
fw.close();

//파일 이어 쓰기
FileWriter fw2 = new FileWriter("./memo.txt", true);  
memo = "파일을 이어 쓰는 중 입니다.\n";  
fw2.write(memo);  
fw2.close();
```
<br>

##### PrintWriter
```
PrintWriter pw = new PrintWriter("memo.txt");  
memo = "1줄 작성 중입니다.";  
pw.println(memo);  
  
memo = "2번 작성 중입니다.";  
pw.println(memo);  
pw.close();

//파일 이어 쓰기
PrintWriter pw2 = new PrintWriter(new FileWriter("./memo.txt", true));  
memo = "3줄 이어 쓰기 입니다.\n";  
pw2.println(memo);  
pw2.close();
```
<br>
<br>

#### 파일 입력
```
BufferedReader br = new BufferedReader(new FileReader("./memo.txt"));  
  
while  (true) {  
    String line = br.readLine();  
    if (line == null) {  
        break;  
    }  
    System.out.println(line);  
}  
br.close();
```


<br>
<br>
<br>
<br>

---
## 14. 예외 처리
<br>

### 01. 오류 종류
<br>

#### 논리 에러 (Logic Error)
논리적 에러는 이른바 **'버그'** 라고 생각하면 된다.

프로그램이 실행하고 작동하는데는 아무런 문제가 없는 오류이지만, 결과가 예상과 달라 사용자가 의도한 작업을 수행하지 못하게 되어 서비스 이용에 지장이 생길 수 있다.

논리적 오류는 컴퓨터 입장에서는 프로그램이 멀쩡히 돌아가는 것이니 에러 메시지를 알려주지 않는다. 따라서 개발자는 프로그램의 전반적인 코드와 알고리즘을 체크 필요가 있다.
<br>
<br>

#### 컴파일 에러 (Complillation Error)
컴파일 에러는 컴파일 단계에서 오류 발견하면 컴파일러가 에러 메시지 출력해주는 것을 말한다.

컴파일 에러 발생의 대표적인 원인으로 **문법 구문 오류(syntax error)**를 들 수 있다.

컴파일 에러는 그렇게 심각하게 볼 오류 종류는 아니다.

왜냐하면 컴파일 에러가 있다는 것은, 곧 컴파일이 안된다는 의미이며, 이는 즉 프로그램이 만들어지지 않아 프로그램 실행 자체가 불가하기 때문이다.
<br>
<br>

#### 런타임 에러 (Runtime Error)
컴파일 에러를 꼼꼼하게 잡아 컴파일에는 문제가 없더라도, 프로그램 실행 중에 에러가 발생해서 잘못된 결과를 얻거나,  혹은 외부적인 요인으로 기계적 결함으로 프로그램이 비정상적으로 종료될 수 있다.

이것이 우리가 집중적으로 파헤쳐 봐야 할 **실행 오류(런타임 에러)** 이다.

대체로 개발 시 설계 미숙(논리적)으로 발생하는 에러가 대부분이며, 런타임 에러 발생 시 프로그래머가 역추적해서 원인 확인해야 한다.


자바 프로그래밍에서는 실행 시(runtime) 발생할 수 있는 오류를 '**에러(error)**'와 '**예외(exception)**' 두가지로 구분 하였다.

- 에러(error) : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
- 예외(exception) : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
<br>
<br>
<br>

### 02. 예외 (Exception)

대부분의 예외(Exception)는 개발자가 구현한 로직에서 발생한 실수나 사용자의 영향에 의해 발생한다. 

그래서 예외는 에러와 달리 문제가 발생하더라도 이에 대한 **대응 코드**를 미리 작성해 놓음으로써 어느정도 프로그램의 비정상적인 종료 혹은 동작을 막을 수 있다.

자바에서 다루는 모든 예외 오류는 **Exception 클래스**에서 처리한다.

![](https://i.imgur.com/PaPG1wW.png)

![](https://i.imgur.com/MM1AZFW.png)
<br>
<br>
<br>

### 02. 예외 처리 (Exception Handling)

```
int a, b, c;
try {
	// 실행되는 로직
    a = 10;
    b = 0;
    c = a / b; 
    // 10 나누기 0 → 산술오류 ArithmeticException
} catch (ArithmeticException e) {
	 // 예외 처리
    c = -1;  
}
```
<br>
<br>

#### finally
![](https://i.imgur.com/HuM57Wf.png)
<br>
<br>

#### throw (예외 발생시키기)
자바에서는 **throw 키워드**를 사용하여 강제로 예외를 발생시킬 수 있다.

사용자가 일부러 에러를 throw하여 에러를 catch 한다는 개념으로 보면 된다.

이때 new 생성자로 예외 클래스를 초기화하여 던져는데, 이 클래스 생성자에 입력값을 주게되면, catch문이 getMessage() 메서드에서 출력할 메세지를 지정하게 된다

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("음수를 제외한 숫자만 입력하세요 : ");
            int num = s.nextInt(); // 사용자로부터 정수를 입력 받음
            if (num < 0) {
                // 음수를 입력하면 에러를 발생 시킨다.
                // ArithmeticException 예외 클래스 객체를 생성해 catch문으로 넘겨버린다고 생각하며 된다
                
                throw new ArithmeticException("입력값이 옳지 않습니다."); 
            
            }
            System.out.println("num = " + num);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다");
        }
    }
}
```
<br>
<br>

#### throws (예외 떠넘기기)
예외가 발생할 수 있는 코드를 작성할 때 try - catch 블록으로 처리하는 것이 기본이지만, 경우에 따라서는 다른 곳에서 예외를 처리하도록 호출한 곳으로 예외를 떠넘길 수도 있다.

이때 사용하는 키워드가 `throws`이다. `throws` 는 **메소드 선언부 끝에 작성**되어 메소드에서 예외를 직접 처리(catch)하지 않은 예외를 호출한 곳으로 떠넘기는 역할을 한다.

```
public static boolean checkTenWithThrows(int ten) throws NotTenException{  
    if (ten != 10) {  
        throw new NotTenException();  
    }  
    return true;  
}

System.out.println("== checkTenWithThrows ==");  
try {  
    checkResult = checkTenWithThrows(5);  
} catch (NotTenException e) {  
    System.out.println("e = " + e);  
}  
System.out.println("checkResult = " + checkResult);
```