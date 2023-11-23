# [ BASIC MATH ] 01. 집합 ( set ) _ with java

Java를 이용하여 집합 ( set )을 간단하게 구현한다.

## Hashset을 이용하여 구현
https://leungnyeok.tistory.com/entry/Java-HashSet-%EC%9D%B4%EB%9E%80
HashSet은 집합 연산 메소드를 제공하기 때문에 쉽게 구현 가능하다.
결과를 확인한 값들은 주석처리 후 다음 결과를 확인해야 옳바른 결과를 확인할 수 있다.
```
import java.util.Arrays;  
import java.util.HashSet;  
  
public class a_Set {  
    public static void main(String[] args){  
        // 집합 연산  
        System.out.println("== 집합 연산 ==");  
        // 집합 a, b
        HashSet a = new HashSet(Arrays.asList(1, 2, 3, 4, 5));  
        HashSet b = new HashSet(Arrays.asList(2, 4, 6, 8, 10));  
        
        // 1. 교집합 : a,b 원소가 같은 부분 
        a.retainAll(b);  
        System.out.println("교집합 : " + a); // 교집합 : [2, 4]

        // 2. 합집합 ; a,b 두 집합의 원소를 모두 모은 집합
        a.addAll(b);  
        System.out.println("합집합 : " + a); // 합집합 : [1, 2, 3, 4, 5, 6, 8, 10]

        // 3. 차집합  
        a.removeAll(b);  
        System.out.println("차집합 : " + a); // 차집합 : [1, 3, 5]
    }  
}
```


## ArrayList를 사용하여 구현 ( 집합 관련 연산 사용 X )
```
import java.util.ArrayList;

class MySet{  

    // ArrayLIst  
    ArrayList<Integer> list;  
    
    // 생성자 1     
    MySet() {  
        this.list = new ArrayList<Integer>();  
    }  
    
    // 생성자 2 
    // 배열을 입력받고 배열안의 원소를 모두 list 안에 넣는다.
    MySet(int[] arr) {  
        this.list = new ArrayList<Integer>();  
        for (int item : arr) {  
            this.list.add(item);  
        }  
    }  
    
    // 원소 추가 (중복 X)    
    public void add(int x){
    	// list 순회
        for (int item : this.list) {  
        	// 넣으려는 값 x 와 list의 data가 같은 경우
            if (item == x){  
                return;  
            }  
        } 
        // 같은 값이 없으면 추가
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
            boolean containFlag = false;
  
            for (int itemB : b.list) { // B집합 원소를 도는 반복문
                if (itemA == itemB) {   // A, B 원소가 같으면
                    containFlag = true; // A의 원소가 B집합에 포함되어 있음
                    break;  // 반복문 종료, 다음 A집합의 원소로
                }  
            }  
            if (!containFlag) {  // A집합의 원소가 B집합에 없으면 원소 추가
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