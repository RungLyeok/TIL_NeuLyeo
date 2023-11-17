# \[Java\] 06. 클래스 ( class )와 객체

---

자바 프로그래밍을 **OOP(객체 지향 프로그래밍**)이라고도 한다.

현실에서도 특정 제품을 만들 때 여러 가지 부품들을 각각 만들어 하나로 조립해서 제품을 생산하듯

프로그래밍적으로도 여러 가지 객체(Object)를 각각 만들어서 하나로 조립하는 프로그래밍 기법을

**객체 지향 프로그래밍**이라고 한다.

자바에서 객체는 클래스를 통해 생성하실 수 있다.  
  
  
  
  

## 01\. 클래스

### 클래스

| 클래스의 구성 맴버 | 설명 |
| --- | --- |
| 필드(Field) | 객체의 데이터가 저장되는 곳 |
| 생성자(Constructor) | new 연산자로 호출되는 메소드로 객체 생성 시 필드의 초기화를 담당 |
| 메소드(Method) | 객체의 동작에 해당하며 클래스의 다양한 동작을 구성 |

클래스 내부에는

클래스의 속성을 나타내는 **필드**

클래스의 동작을 나타내는 **메서드**

클래스를 생성할 때 호출할 수 있는 **생성자**가 있다.

  
생성자는 new 연산자를 통해 호출할 수 있는 메서드라고 생각하시면 되며 주로 필드의 변수들을 초기화하는 역할을 한다.  
  
  
  

### 클래스 선언

```
class Student{ 
    //필드(Field) 
    String name;         //이름 
    int age;             //나이 
    int korean_scroe;     //국어성적 
    int math_score;     //수학성적 
    int english_score;     //영어성적 

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

클래스는 위와 같이 class 클래스명 { } 와 같은 형태로 만든다.

내부에 **필드, 생성자, 메서드를** 정의해야 한다.

추가로 생성자와 메서드는 오버 로딩이 가능하다.

이렇게 생성된 클래스는 하나의 객체 설계도이다.

이렇게 정의된 클래스를 통해 동일한 객체를 무한정 찍어낼 수 있다.

이렇게 찍어낸 객체를 인스턴스라고 한다.  
  
  
  

### 생성자

생성자는 객체가 생성될 때 자동으로 호출된다.

  
클래스명과 이름이 같아야 한다.

  
리턴 타입은 없다.

#### this

객체 자신을 의미한다.

#### this ()

생성자를 의미한다.  
  
  
  
  

## 02\. 인스턴스

클래스를 사용하기 위해서는 해당 클래스의 객체(object)를 선언해야 한다.

**클래스로부터 객체를 선언하는 과정을 인스턴스화**라고 한다.

즉, 인스턴스란 메모리에 할당된 해당 클래스타입의 객체를 의미한다.

하나의 클래스로부터 여러 개의 인스턴스를 생성할 수 있다.

생성된 인스턴스는 독립된 메모리 공간에 저장된 자신만의 필드를 가진다.

해당 클래스의 모든 메서드(method)는 같은 클래스타입의 모든 인스턴스가 공유한다.  
  

### 인스턴스 생성

클래스를 통해 객체를 생성하기 위해서는 new 연산자를 사용한다.

new 연산자 뒤에는 생성자가 오는데, 생성자는 클래스() 형태를 가지고 있으며

생성자의 여부에 따라 인자 값을 맞춰 넣는다.

이렇게 new 연산자로 생성된 객체는 힙 메모리 영역에 생성되며

이렇게 만들어진 객체를 해당 클래스의 인스턴스(instance)라고 한다.

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

  
  

### 인스턴스 메소드 사용

```
public class Main { public static void main(String[] args) { 
    Student student = new Student("홍길동", 18, 100, 90, 80); 
    student.printScore(); //인스턴스 메소드 호출 
    } 
}
```

  
  
  

## 03\. 오버로딩 (Overloading)

오버로딩의 정의는

자바의 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있더라도

  
**매개변수의 개수 또는 타입**이 다르면, 같은 이름을 사용해서 메서드를 정의할 수 있다.  
  

### 오버로딩의 조건

-   메서드의 이름이 같아야 한다.
-   매개변수의 개수나 타입이 달라야 한다.
-   리턴값만 다른 것은 오버로딩이 아니다.

예시

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

  
  
  

## 04\. 접근제어자

자바에서 접근제어자(access modifier)는

  
**클래스와 클래스의 멤버 (필드, 메서드, 생성자)를 사용할 때, 접근할 수 있는 범위를 지정**해 주는 역할을 한다.

보통 접근제어자 또는 접근지정자라고 부르며 클래스나 클래스 멤버 앞에 붙어있는 public, private, protected 등의 키워드가 바로 접근제어자(접근지정자)이다.

공개범위는 **public > protected > default(생략) > private** 순으로 좁아진다.

![](https://i.imgur.com/QQsLqy9.png)

  
  

### public

public 은 공개를 나타내며, 모든 클래스에서 접근이 가능합니다 (패키지와 상관없음)  
  
  

### private

private은 비공개를 나타내며, 같은 클래스 안에 있는 멤버들만 접근이 가능합니다.  
  
  

### protected

같은 패키지안의 모든 클래스와, 다른 패키지의 자식 클래스에서 접근이 가능합니다.  
  
  

### default(생략)

접근지정자가 없으면 default 멤버로, 같은 패키지안의 클래스에서만 접근이 가능합니다.  
  
  
  
  
  

## 05\. static (정적)

정적(static)은 고정됨이란 의미를 가지고 있다.

Static이라는 키워드를 사용하여 Static변수와 Static메서드를 만들 수 있는데

다른 말로 정적필드와 정적 메서드라고도 하며 이 둘을 합쳐 정적 멤버라고 한다. (또는 클래스 멤버)

정적 필드와 정적 메서드는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다

.

그렇기에 클래스 로더가 클래스를 로딩해서 메소드 메모리 영역에 적재할 때 클래스별로 관리한다.

따라서 클래스의 로딩이 끝나는 즉시 바로 사용할 수 있다.

![](https://i.imgur.com/AN3vtYL.png)

메모리에 한 번만 할당된다. 즉, Static 변수나 메서드는 공유되는 특성을 가진다.

static 클래스 변수 : 해당 클래스의 각 객체들이 값을 공유

  
static 클래스 메소드 : 객체를 생성하지 않아도 호출 가능