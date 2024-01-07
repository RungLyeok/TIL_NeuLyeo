# [ Programmers ] 배열에서 문자열 대소문자 변환하기 ( java ) 78 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181875

## 문제 설명

문자열 배열 `strArr`가 주어집니다. 모든 원소가 알파벳으로만 이루어져 있을 때, 배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로, 짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.


### 제한사항

- 1 ≤ `strArr` ≤ 20
    - 1 ≤ `strArr`의 원소의 길이 ≤ 20
    - `strArr`의 원소는 알파벳으로 이루어진 문자열 입니다.


### 입출력 예

|strArr|result|
|---|---|
|["AAA","BBB","CCC","DDD"]|["aaa","BBB","ccc","DDD"]|
|["aBc","AbC"]|["abc","ABC"]|

### 입출력 예 설명

입출력 예 #1

- `strArr[0]`과 `strArr[2]`는 짝수번째 인덱스의 문자열이므로 모두 소문자로 바꿔서 "aaa"와 "ccc"가 됩니다.
- `strArr[1]`과 `strArr[3]`는 홀수번째 인덱스의 문자열인데 원래 대문자이므로 그대로 둡니다.
- 따라서 ["aaa","BBB","ccc","DDD"]를 return 합니다.

입출력 예 #2

- `strArr[0]`은 짝수번째 인덱스의 문자열이므로 소문자로 바꿔서 "abc"가 됩니다.
- `strArr[1]`은 홀수번째 인덱스의 문자열이므로 대문자로 바꿔서 "ABC"가 됩니다.
- 따라서 ["abc","ABC"]를 return 합니다.


## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 주어진 문자열 배열(strArr)의 원소를 인덱스가 짝수인 경우 소문자로, 홀수인 경우 대문자로 변환
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서 for loop를 사용하여 배열의 원소를 순회하며 변환하고 결과를 반환
- 코드의 주요 알고리즘:
    
    - toLowerCase, toUpperCase 메소드를 사용하여 문자열을 소문자 또는 대문자로 변환
    - 삼항 연산자를 사용하여 인덱스가 짝수인지 홀수인지에 따라 다른 변환을 선택
- 코드의 핵심:
    
    - 주어진 문자열 배열의 원소를 인덱스가 짝수인 경우 소문자로, 홀수인 경우 대문자로 변환하는 것
    - toLowerCase, toUpperCase 메소드와 삼항 연산자 등을 효율적으로 사용

### 풀이
```
class Solution {

    // solution 메소드 정의, 문자열 배열을 매개변수로 받음
    public String[] solution(String[] strArr) {
        
        // 배열의 모든 원소를 순회하며 변환
        for (int i = 0; i < strArr.length; i++) {
            // 인덱스가 짝수인 경우 원소를 소문자로, 홀수인 경우 원소를 대문자로 변환
            strArr[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase(); 
        }
        
        // 변환된 배열을 반환
        return strArr;
    }
}
```

