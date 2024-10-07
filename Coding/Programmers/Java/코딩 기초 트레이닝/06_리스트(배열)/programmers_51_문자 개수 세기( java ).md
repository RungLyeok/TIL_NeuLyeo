# [ Programmers ] 문자 개수 세기 ( java ) 51 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181902

## 문제 
### 문제 설명
알파벳 대소문자로만 이루어진 문자열 `my_string`이 주어질 때, `my_string`에서 'A'의 개수, `my_string`에서 'B'의 개수,..., `my_string`에서 'Z'의 개수, `my_string`에서 'a'의 개수, `my_string`에서 'b'의 개수,..., `my_string`에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- 1 ≤ `my_string`의 길이 ≤ 1,000

### 입출력 예
![](https://i.imgur.com/0pk9JHM.png)


## 문제 풀이
### 코드 설명
**코드의 목적:**

이 코드는 주어진 문자열(my_string)에서 각 알파벳이 몇 번 등장하는지를 계산하는 기능을 가진 알고리즘입니다.

**코드의 주요 구조:**

1. 클래스 정의: Solution이라는 이름의 클래스를 정의합니다.
2. 메서드 정의: solution이라는 이름의 메서드를 정의합니다. 이 메서드는 문자열(my_string)을 인자로 받아 처리합니다.

**코드의 주요 알고리즘:**

1. 문자열을 순회하면서 각 문자가 알파벳인지 확인합니다.
2. 알파벳이라면 대문자인지 소문자인지를 확인합니다.
3. 대문자라면 해당 문자의 ASCII 코드에서 'A'의 ASCII 코드를 빼서 인덱스를 구하고, 소문자라면 'a'를 빼고 26을 더해서 인덱스를 구합니다.
4. 해당 인덱스의 값을 1 증가시킵니다.

**코드의 핵심:**

1. 문자열을 char 배열로 변환하여 순회합니다.
2. Character 클래스의 isLetter, isUpperCase 메서드를 이용하여 문자의 종류를 판별합니다.
3. ASCII 코드를 이용하여 알파벳의 인덱스를 계산합니다.

### 풀이
```
class Solution {
    public int[] solution(String my_string) {
        
        int[] answer = new int[52];
        
        // 문자열을 순회하면서 각 문자가 알파벳인지 확인
        for (char c : my_string.toCharArray()) {
            if(Character.isLetter(c)) {
                
                // 대문자라면 'A'를 빼서 인덱스를 구하고, 소문자라면 'a'를 빼고 26을 더해서 인덱스를 구함
                if (Character.isUpperCase(c)) {
                    answer[c - 'A']++;    
                } else {
                    answer[c - 'a' + 26]++;
                }
            }
        }
        
        // 각 알파벳의 등장 횟수를 담은 배열을 반환
        return answer;
    }
}
```

