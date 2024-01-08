# [ Programmers ] rny_string ( java ) 90 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181863

## 문제 설명

'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 문자열 `rny_string`이 주어질 때, `rny_string`의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.


### 제한사항

- 1 ≤ `rny_string`의 길이 ≤ 100
- `rny_string`은 영소문자로만 이루어져 있습니다.


### 입출력 예

|rny_string|result|
|---|---|
|"masterpiece"|"rnasterpiece"|
|"programmers"|"prograrnrners"|
|"jerry"|"jerry"|
|"burn"|"burn"|


### 입출력 예 설명

입출력 예 #1

- 예제 1번의 `rny_string`의 'm'을 "rn"으로 바꾸는 과정을 표로 나타내면 다음과 같습니다.
    
|rny_string|m|a|s|t|e|r|p|i|e|c|e|
    |---|---|---|---|---|---|---|---|---|---|---|---|
    |result|rn|a|s|t|e|r|p|i|e|c|e|
    
따라서 "rnasterpiece"를 return 합니다.
    

입출력 예 #2

- 예제 2번의 `rny_string`의 'm'을 "rn"으로 바꾸는 과정을 표로 나타내면 다음과 같습니다.
    
|rny_string|p|r|o|g|r|a|m|m|e|r|s|
    |---|---|---|---|---|---|---|---|---|---|---|---|
|result|p|r|o|g|r|a|rn|rn|e|r|s|
        
따라서 "prograrnrners"를 return 합니다.
    

입출력 예 #3

- 예제 3번의 `rny_string`에는 'm'이 없습니다. 따라서 `rny_string` 그대로인 "jerry"를 return 합니다.

입출력 예 #4

- 예제 4번의 `rny_string`에는 'm'이 없습니다. 따라서 `rny_string` 그대로인 "burn"를 return 합니다.

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 주어진 문자열(rny_string)에서 'm'을 'rn'으로 변경합니다.
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서 replace 메소드를 사용하여 문자열 변경을 수행합니다.
- 코드의 주요 알고리즘:
    
    - replace 메소드를 사용하여 문자열에서 'm'을 'rn'으로 변경합니다.
- 코드의 핵심:
    
    - 주어진 문자열에서 특정 문자를 다른 문자로 변경하는 것

### 풀이
```
class Solution {

    // solution 메소드 정의, 주어진 문자열을 매개변수로 받음
    public String solution(String rny_string) {
        
        // 문자열에서 'm'을 'rn'으로 변경하고 변경된 문자열을 반환
        return rny_string.replace("m", "rn");
    }
}

```

