# \[Java\] 07. 상속 ( Inheritance )

---


## 01\. 상속 ( Inheritance )

**부모 클래스**(상위 클래스)와 **자식 클래스**(하위 클래스)가 있으며,

자식 클래스는 부모 클래스를 선택해서, **그 부모의 멤버를 상속받아 그대로 쓸 수 있게** 된다.

상속은 기존의 클래스에 기능을 추가하거나 재정의하여 효율적이고 개발 시간을 줄여준다.

이러한 상속은 캡슐화, 추상화와 더불어 객체 지향 프로그래밍을 구성하는 중요한 특징이다.

상속을 하더라도 자식 클래스가 부모의 모든 것들을 물려받는 것은 아니다.

-   **부모 클래스의 private 접근 제한을 갖는 필드 및 메서드는** **자식이 물려받을 수 없다**
-   **부모와 자식 클래스가 서로 다른 패키지에 있다면**, 부모의 default 접근 제한을 갖는 필드 및 메서드도 자식이 물려받을 수 없다.  
    (default 접근 제한은 ‘같은 패키지에 있는 클래스’만 접근이 가능하게끔 하는 접근 제 한 자 이 기 때문입니다.)
-   그 이외의 경우는 모두 상속의 대상이 된다.

### 부모 클래스

기존에 정의되어 있던 클래스를

부모 클래스(parent class) 또는 상위 클래스(super class), 기초 클래스(base class)라고 한다.  
  

### 자식 클래스

상속을 통해 새롭게 작성되는 클래스를

클래스(child class) 또는 하위 클래스(sub class), 파생 클래스(derived class)라고 한다.  
  
  
  

### 상속 형태

![](https://i.imgur.com/CRK7yOc.png)

다중 상속은 불가능 하다.

하나의 자식 클래스가 2개의 부모를 상속받는 것

상속받은 여러 개의 부모 클래스들에서 동일한 명칭의 필드나 메서드가 있으면?

-   어떤 부모 클래스의 필드와 메서드를 상속받아야 하는가?
-   어떤 부모 클래스에 어떻게 접근해야 하는가?

위와 같은 모호함이 발생한다.

![](https://i.imgur.com/pwLUcLM.png)

  
  

### 상속 방법 (extends)

```
//부모 클래스 생성 
class 부모{ } 

//부모 클래스 상속 
class 자식 extends 부모{ }
```

  
  
  

## 02\. super, super()

자바에서는 자식 객체를 생성하면, 부모 객체를 먼저 생성한 후, 자식 객체가 그다음에 생성한다.

부모 클래스(ParentBook)는 명시적 생성자 선언이 없었고, 자식 클래스(ChildBook)는 명시적 생성자 선언이 존재한다.

**그러면 이때 부모 클래스의 생성자 선언**은, 자식 클래스의 생성자 선언 내부에 맨 첫 줄에 **super();** 라고 생성된다.

부모의 기본 생성자 선언을 포함해서 명시적 생성자 선언이 없었으므로, 컴파일러가 super(); 를 알아서 생성합니다. 그리고 그 super(); 는 부모 클래스의 기본 생성자를 컴파일러가 호출한다.

**‘super’ 키워드는 부모 클래스(객체)를 나타내는 것임을 기억하면 된다.**

### super

super 키워드는 부모 클래스로부터 상속받은 필드나 메서드를 자식 클래스에서 참조하는 데 사용하는 참조 변수이다.

인스턴스 변수의 이름과 지역 변수의 이름이 같을 경우 인스턴스 변수 앞에서 this 키워드를 사용하여 구분할 수 있다.

이와 마찬가지로 부모 클래스와 자식 클래스의 멤버 이름이 같을 경우 super 키워드를 사용하여 구별할 수 있다.

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

### super()

this() 메서드가 같은 클래스의 다른 생성자를 호출할 때 사용된다면,

super() 메서드는 부모 클래스의 생성자를 호출할 때 사용된다.

클래스에 생성자가 하나도 정의되어 있지 않아야만, 자동으로 기본 생성자를 추가한다.

부모 클래스에 매개변수를 가지는 생성자를 하나라도 선언했다면,

부모 클래스에는 기본 생성자가 자동으로 추가되지 않는다.

```
class Parent {
    int a;
    Parent(int n) { a = n; }
}

// 오류 발생
class Child extends Parent {
    int b;
    Child() {
        super(); // a의 값을 지정 할 수 없음
        b = 20;
    }
}

// 오류 해결
class Parent {
    int a;
    Parent() { a = 10; }
    Parent(int n) { a = n; }
}
```

  
  

## 03\. 오버라이딩 (Overriding)

**부모 클래스로부터 상속받은 메서드의 내용을 재정의(변경) 하는 것**을 오버라이딩이라고 한다.

물론 상속받은 메서드를 그대로 사용해도 되지만 자식클래스에서 변경해야 하는 경우가 많다.

이렇게 **변경이 이루어지는 경우에 부모메서드를 오버라이딩**한다.

> 1\. 자식 클래스의 오버라이딩 하려는 메서드는 부모 클래스의 메서드와  
>   
>  - 이름이 같아야 한다.  
>  - 매개변수가 같아야 한다.  
>  - 반환타입이 같아야 한다.   
>   
>   
> 2\. 접근 제어자는 조상클래스의 메서드보다 좁은 범위로 변경할 수 없다.  
> ex) 부모클래스 : public void xxx( ){ . . . } , 자식클래스 : protectecd void xxx( ){ . . . } // 에러!!
> 
> 참고: public -> protecd, -> (default), -> private 접근 범위가 좁아짐  
>   
>   
> 3\. 부모 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.  
>   
> ex) 부모클래스 : void xxx ( ) throws IOException, SQLException { . . . }  
> 자식클래스: void xxx ( ) throws Exception { . . . }  
>   
> 단순 개수 문제가 아님. Exception 은 모든 예외의 최고 부모이다. 가장 많은 개수의 예외를 던질 수 있다.  
>   
>   
> 
> **4\. 인스턴스 메서드를 static 메서드 또는 그 반대로 변경할 수 없다.  
>   
> **

### 예시

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