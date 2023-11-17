# [ BASIC MATH ] 01. 집합 ( set )
## 집합 ( set )
어떤 명확한 조건을 만족시키는 서로 다른 대상들의 모임

### 표현 방법
#### 원소나열법
집합의 원소를 나열하여 집합을 표현하는 방법이다. 

중괄호 '{}' 속에 쉼표 ','로 구별하여 나열한다. 

예를 들어, 다음과 같다.

- {1, 2, 3}
- {흰색, 검은색}
#### 조건제시법
그대로 집합의 원소인지를 판단하는 조건을 제시하여 집합을 표현하는 방법이다.

중괄호 '{}' 속을 수직선 '|'이나 쌍점 ':'을 써서 두 구역으로 나눈 뒤, 왼쪽 구역에 집합의 원소를 나타내는 식을 적고, 오른쪽 구역에 원소가 만족시킬 조건을 적는다. 

예를 들어, 다음과 같다.

- {n|n은 자연수, 1 ≤ _n_ ≤ 5}는 1부터 5까지의 모든 자연수의 집합이다.
- {2n|n은 정수는 모든 짝수의 집합이다.

#### 벤 다이어그램

집합을 나타내는 원을 그려 집합을 표현하는 방법이다. 

어떤 원의 안쪽은 그 원이 나타내는 집합에 속하는 부분, 바깥쪽은 그 집합에 속하지 않는 부분을 의미한다.

두 원이 겹치는 부분은 두 집합에 공통으로 속하는 부분을 나타낸다. 

어떤 원이 다른 원의 안쪽에 놓인다면, 집합의 모든 원소가 다른 집합의 원소라는 의미인데, 이때 첫째 집합이 둘째 집합의 부분 집합이라고 한다. 

원이 서로 겹치는 두 집합은 공통 원소가 있는 집합을 의미하며, 원이 서로 겹치지 않는 두 집합은 공통 원소가 없는 집합, 즉 서로소 집합을 의미한다.

![](https://i.imgur.com/ZKvMB47.png)


## 교집합 ( ∩ )

두 집합의 원소 중 겹친 부분의 집합

```
A = { 1, 2, 3 }        B  =  { 2, 3, 4 } 일 때

교집합은  다음과 같습니다.

A ∩ B = { 2, 3 }       <-- 두 집합 중 겹친 원소만
```
## 합집합 ( ∪ )

 두 집합의 원소들을 모두 모은 집합
 
```
A = { 1, 2, 3 }        B  =  { 2, 3, 4 } 일 때

합집합은  다음과 같습니다.

A ∪ B = { 1, 2, 3, 4 }       <-- 두 집합  원소 모두
```

## 여집합 ![](https://i.imgur.com/9MCjDdW.png)

여집합이란 여분이란 뜻의 나머지란 의미이다

따라서, 나머지들을 모은 것이 여집합이다.

전체에서 그 집합을 제외하고 남은 집합이다.

```
남녀공학인 학교에서 남학생의 집합을  A 라고 하면
A = {  남학생 모두 }     <-- 남학생들의 집합

남학생 모두를 집합 A 라고 하면 그 여집합( Ac )은 다음과 같다.
Ac = { 여학생 모두 }   <-- 전교생에서 남학생을 뺸 여학생

이 때 전교생은 전체 집합 ( 기호  :  U ) 이 된다.

전교생 = 남학생  + 여학생

U = A  U  Ac      <--- 남학생과 여학생의 합집합은 전체집합
```
## Java 
### HashSet 이용
 HashSet은 원소의 중복을 허용하지 않는다.
 
```
// 교집합  
HashSet a = new HashSet(Arrays.asList(1, 2, 3, 4, 5));  
HashSet b = new HashSet(Arrays.asList(2, 4, 6, 8, 10));  
a.retainAll(b); 
System.out.println("교집합 : " + a); 
// 교집합 : [2, 4]

// 합집합  
a.addAll(b);  
System.out.println("합집합 : " + a);  
// 합집합 : [1, 2, 3, 4, 5, 6, 8, 10]

// 차집합  
a.removeAll(b);  
System.out.println("차집합 : " + a); 
// 차집합 : [1, 3, 5]
```
### ArrayList 사용 (집합 관련 연산 사용 X)
```
class MySet{  

    // ArrayLIst  
    ArrayList<Integer> list;  
    // 생성자 1     
    MySet() {  
        this.list = new ArrayList<Integer>();  
    }  
    
    // 생성자 2    
    MySet(int[] arr) {  
        this.list = new ArrayList<Integer>();  
  
        for (int item : arr) {  
            this.list.add(item);  
        }  
    }  
    
    // 원소 추가 (중복 X)    
    public void add(int x){  
        for (int item : this.list) {  
            if (item == x){  
                return;  
            }  
        }  
        this.list.add(x);  
    }  
    
    // 교집합  
    public MySet retainAll(MySet b) {  
        MySet result = new MySet();  
  
        for (int itemA : this.list) { // A집합 원소를 도는 반복문  
            for (int itemB : b.list) {  // B집합 원소를 도는 반복문
                if (itemA == itemB) { // A, B 원소가 같으면 원소 추가
                    result.add(itemA);  
                }  
            }  
        }  
        return result;  
    }  
    
    // 합집합  
    public MySet addAll(MySet b) {  
        MySet result = new MySet();  
  
        for (int itemA : this.list) { // A집합 원소 추가
            result.add(itemA);  
        }  
        for (int itemB : b.list) {  // B집합 원소 추가
            result.add(itemB);  
        }  
        return result;  
    }  
    
    // 차집합  
    public MySet removeAll(MySet b) {  
        MySet result = new MySet();  
  
        for (int itemA : this.list) {  A집합 원소를 도는 반복문
            boolean containFlag = false; // 포함 논리값 거짓
  
            for (int itemB : b.list) { // B집합 원소를 도는 반복문
                if (itemA == itemB) {   // A, B 원소가 같으면
                    containFlag = true; // 포함 논리값 참  
                    break;  // 반복문 종료, 다음 A의 원소로
                }  
  
            }  
            if (!containFlag) {  // 포함하지 않으면 원소 추가
                result.add(itemA);  
            }  
        }  
        return result;  
    }  
} 

public class practiceSet {  
    public static void main(String[] args){  
        MySet a = new MySet();   
        a = new MySet(new int[]{1, 2, 3, 4, 5});  
        MySet b = new MySet(new int[]{2, 4, 6, 8, 10});  
  
        MySet result = a.retainAll(b);  
        System.out.println("교집합 : " + result.list);
        // 교집합 : [2, 4]
  
        result = a.addAll(b);  
        System.out.println("합집합 : " + result.list);
        // 합집합 : [1, 2, 3, 4, 5, 6, 8, 10]
  
        result = a.removeAll(b);  
        System.out.println("차집합 : " + result.list);
        // 차집합 : [1, 3, 5]
    }  
}
```
### reference
https://ko.wikipedia.org/wiki/%EC%A7%91%ED%95%A9

