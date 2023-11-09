# \[Java\] 08.다형성 (Polymorphism)

---
<br>
## 01. 다형성

하나의 객체가 여러 가지 형태를 가질 수 있는 것을 의미한다.

자바에서 다형성은 한 타입의 참조 변수를 통해 여러 타입의 객체를 참조할 수 있도록 하는 것이다. 

즉, 상위 클래스 타입의 참조 변수를 통해서 하위 클래스의 객체를 참조할 수 있도록 허용하여 상위 클래스가 동일한 메시지로 하위 클래스들이 서로 다른 동작을 할 수 있도록 한다.

다형성을 활용하면, 부모 클래스가 자식 클래스의 동작 방식을 알 수 없어도 오버라이딩을 통해 자식 클래스에 접근할 수 있다.
<br>

### **다형성의 장점**

1. 유지보수 : 여러 객체를 하나의 타입으로 관리할 수 있어 유지보수가 용이하다.
2. 재사용성 : 객체의 재사용이 쉬워 재사용성이 높아진다.
3. 느슨한 결합 : 클래스 간의 의존성을 줄여 확장성은 높아지고 결합도는 낮아진다.

<Br>

### **다형성의 조건**

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

### **참조 변수의 형 변환**

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

## 02. instanceof

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

