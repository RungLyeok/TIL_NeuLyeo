# [ Programmers ] _ 의상 ( java )
https://school.programmers.co.kr/learn/courses/30/lessons/42578
## 문제 
### 문제 설명
![](https://i.imgur.com/ydPsr3Y.png)

### 제한사항
![](https://i.imgur.com/yYJYsmi.png)

### 입출력 예
![](https://i.imgur.com/5O8Ch8i.png)

![](https://i.imgur.com/qa9zrrN.png)

## 문제 풀이
의상의 조합을 계산하는 문제입니다. 의상의 종류마다 몇가지 의상이 있는지 카운트해 주면 됩니다. 이를 위해서는 Map을 이용해 카운트해 주면 됩니다.

Map<String, Integer> 형식의 Map을 만들고, 의상의 종류를 Key로, 의상의 개수를 Value로 합니다. 모든 clothes를 순회하면서 의상 종류가 한번씩 나올 때 마다 카운트하여 총 몇개의 의상이 있는지 셉니다.

그 다음에는 의상의 조합 가짓수를 구합니다. Map에 저장된 모든 숫자에 +1한 다음 서로 곱해줍니다. +1해주는 이유는 해당 종류의 의상을 착용하지 않을 수도 있기 때문입니다.

그 다음 -1해 주면 답이 됩니다. -1해주는 이유는 아무런 의상도 사용하지 않은 경우는 제외해야 하기 때문입니다.
### 문제 접근 ( 알고리즘 )
- 2차원 배열인 [ 의상의 이름, 의상의 종류 ]를 의상 종류의 개수가 몇 개인지 분류해서 Hash Map에 담아야 한다.
	- 예시 입력 : [ [ "yellow_hat", "headgear" ], [ "blue_sunglasses", "eyewear" ], [ "green_turban", "headgear" ] ]
		- 옷의 종류는 : `headgear` , `eyewear` 
		- 그 옷의 종류의 개수 : [`headgear`: 2개] , [`eyewear`, 1개]
		  
	- 출력 : 위 옷을 입는 경우의 수를 계산한다.
		- 옷의 종류 마다 안 입는 경우가 있어 옷의 종류마다 +1를 해줘야 한다.\
			- ( 2 + 1 ) * ( 1 + 1) = 6
		- 옷을 모두 안입는 경우는 빼야하기 때문에 -1를 한다.
			- 6 - 1 = 5
		
### 풀이
#### ArrayList 사용
```
import java.util.HashMap;
  
public class Solution {  
	public int solution(String[][] clothes) {  
  
	    // (key:의상의 종류, value:의상 개수) 를 담을 HashMap 선언  
	    HashMap<String, Integer> map = new HashMap<String, Integer>();  
  
	    // 입력 배열 만큼 반복  
	    for (int i = 0; i < clothes.length; i++) {  
  
	        // Map에 추가하려는 의상의 종류가 없는 경우  
	        if (map.containsKey(clothes[i][1]) == false) {  
	            // Map에 (의상종류, 1) 을 추가한다.  
	            map.put(clothes[i][1], 1);  
  
	        } else {  
	            // Map에 추가하려는 의상의 종류가 이미 있는 경우  
	            // Map에 (의상종류, n + 1)을 해준다.  
	            map.replace(clothes[i][1], map.get(clothes[i][1])+1);  
	        }  
	    }  
  
	    int answer = 1;  
	  
	    // Map의 key(의상 종류)를 순회한다.  
	    for (String keys : map.keySet()) {  
  
	        // map.get(key) 는 value(의상의 개수)를 반환  
	        // answer = 옷 종류에 대한 경의우 수(곱의 법칙)  
	        // +1를 하는 이유 : 그 의상을 안입는 경우의 수 추가  
	        answer *= (map.get(keys) + 1);  
	        System.out.println("answer = " + answer);  
	    }  
  
	    // -1를 하는 이유 : 모든 종류를 안입는 경우를 빼야함  
	    return answer - 1;  
	}
}
```

![](https://i.imgur.com/fw1e0jj.png)
