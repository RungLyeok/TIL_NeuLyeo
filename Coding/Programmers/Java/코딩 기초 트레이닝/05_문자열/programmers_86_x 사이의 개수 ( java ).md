# [ Programmers ] x 사이의 개수 ( java ) 86 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181867

## 문제 설명

문자열 `myString`이 주어집니다. `myString`을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.


### 제한사항

- 1 ≤ `myString`의 길이 ≤ 100,000
    - `myString`은 알파벳 소문자로 이루어진 문자열입니다.


### 입출력 예

|myString|result|
|---|---|
|"oxooxoxxox"|[1, 2, 1, 0, 1, 0]|
|"xabcxdefxghi"|[0, 3, 3, 3]|


### 입출력 예 설명

입출력 예 #1

- "x"를 기준으로 문자열을 나누면 ["o", "oo", "o", "", "o", ""]가 됩니다. 각각의 길이로 배열을 만들면 [1, 2, 1, 0, 1, 0]입니다. 따라서 [1, 2, 1, 0, 1, 0]을 return 합니다.

입출력 예 #2

- "x"를 기준으로 문자열을 나누면 ["", "abc", "def", "ghi"]가 됩니다. 각각의 길이로 배열을 만들면 [0, 3, 3, 3]입니다. 따라서 [0, 3, 3, 3]을 return 합니다.


## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 주어진 문자열(myString)에서 'x' 문자가 나오기 전까지 연속된 문자의 갯수를 세어 배열로 반환합니다. 마지막 'x' 이후의 문자 갯수도 포함합니다.
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서 ArrayList, for loop, charAt 메소드, Stream API를 사용하여 문자 갯수를 계산하고 배열로 변환합니다.
- 코드의 주요 알고리즘:
    
    - for loop를 사용하여 문자열을 순회하며 특정 문자('x')가 나올 때까지의 문자 갯수를 세고, 이를 ArrayList에 추가합니다.
    - Stream API의 mapToInt 메소드를 사용하여 Integer 리스트를 int 배열로 변환합니다.
- 코드의 핵심:
    
    - 주어진 문자열에서 특정 문자가 나오기 전까지의 문자 갯수를 계산하는 것
    - ArrayList와 Stream API를 효율적으로 사용하여 결과를 배열로 변환하는 것

### 풀이
```
import java.util.ArrayList;

class Solution {

    // solution 메소드 정의, 문자열을 매개변수로 받음
    public int[] solution(String myString) {
        // 문자 갯수를 저장할 ArrayList 생성
        ArrayList<Integer> list = new ArrayList<>();
        
        // 문자 갯수를 저장할 변수 초기화
        int n = 0;

        // 문자열을 순회하며 'x'가 나오기 전까지의 문자 갯수를 세어 ArrayList에 추가
        for (int i = 0; i < myString.length(); i++) {

            if (myString.charAt(i) != 'x') {
                n++;
            } else {
                list.add(n);
                n = 0;
            }
        }
        
        // 마지막 'x' 이후의 문자 갯수를 ArrayList에 추가
        list.add(n);
        
        // ArrayList를 int 배열로 변환하여 반환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
```

