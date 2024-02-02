# [ Programmers ] 문자열 묶기 ( java ) 98 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181855

## 문제 설명

문자열 배열 `strArr`이 주어집니다. `strArr`의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.


### 제한사항

- 1 ≤ `strArr`의 길이 ≤ 100,000
    - 1 ≤ `strArr`의 원소의 길이 ≤ 30
    - `strArr`의 원소들은 알파벳 소문자로 이루어진 문자열입니다.


### 입출력 예

|strArr|result|
|---|---|
|["a","bc","d","efg","hi"]|2|


### 입출력 예 설명

**입출력 예 #1**

- 각 문자열들을 길이에 맞게 그룹으로 묶으면 다음과 같습니다.

|문자열 길이|문자열 목록|개수|
|---|---|---|
|1|["a","d"]|2|
|2|["bc","hi"]|2|
|3|["efg"]|1|

- 개수의 최댓값은 2이므로 2를 return 합니다.

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 이 코드는 주어진 문자열 배열에서 가장 긴 문자열의 개수를 찾는 것입니다. 각 문자열의 길이를 key로, 그 길이를 가진 문자열의 개수를 value로 하는 HashMap을 생성하고, 그 중 가장 큰 value를 찾습니다.
- 코드의 주요 구조:
    
    - 이 코드는 입력으로 문자열 배열을 받습니다. 이후, 각 문자열의 길이를 key로, 그 길이를 가진 문자열의 개수를 value로 하는 HashMap을 생성합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 문자열 배열을 순회하면서 각 문자열의 길이를 key로, 그 길이를 가진 문자열의 개수를 value로 하는 HashMap을 생성하고, 그 중 가장 큰 value를 찾는 것입니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 HashMap 데이터 구조를 사용하여 문자열의 길이와 그 길이를 가진 문자열의 개수를 저장하고, 이를 바탕으로 가장 많은 문자열의 길이를 찾는 것입니다.

### 풀이
```
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();  // 문자열의 길이와 그 길이를 가진 문자열의 개수를 저장할 HashMap을 생성합니다.
        
        // 문자열 배열을 순회하면서 각 문자열의 길이를 key로, 그 길이를 가진 문자열의 개수를 value로 하는 HashMap을 생성합니다.
        for (String str : strArr) {
            int n = str.length();  // 문자열의 길이를 계산합니다.
            map.put(n, map.getOrDefault(n , 0) + 1);  // 문자열의 길이와 그 길이를 가진 문자열의 개수를 HashMap에 저장합니다.
        }
        
        // HashMap의 value 중 가장 큰 값을 찾습니다.
        int answer = map.values().stream().max(Integer::compare).get();
        return answer;  // 가장 큰 값을 반환합니다.
    }
}
```

