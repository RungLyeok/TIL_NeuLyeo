# [ Programmers ] 접미사 배열 ( java ) 44 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181909

## 문제 
### 문제 설명
어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.  

문자열 `my_string`이 매개변수로 주어질 때, `my_string`의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- `my_string`은 알파벳 소문자로만 이루어져 있습니다.
- 1 ≤ `my_string`의 길이 ≤ 100

### 입출력 예
![](https://i.imgur.com/CdiS1Mb.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

- 이 코드는 주어진 문자열 `my_string`의 모든 접미사들을 생성하고 사전순으로 정렬하여 문자열 배열로 반환하는 알고리즘을 구현합니다.

**코드의 주요 구조:**

1. Import: `ArrayList`와 `List` 클래스를 import 합니다.
2. 클래스 정의: `Solution` 클래스를 정의합니다.
3. 메서드 정의: `solution` 메서드를 정의합니다.

**코드의 주요 알고리즘:**

1. 리스트 생성: 접미사들을 저장할 `ArrayList` 객체 `list`를 생성합니다.
2. 문자열 순회: `my_string`의 각 인덱스 `i`에 대해 다음을 수행합니다.
    - `i`부터 끝까지의 부분 문자열을 추출하여 `list`에 추가합니다.
3. 정렬: `list`를 사전순으로 정렬합니다.
4. 결과 반환: `list`의 요소들을 문자열 배열로 변환하여 반환합니다.

**코드의 핵심:**

- `substring` 메서드를 사용하여 문자열에서 부분 문자열을 추출합니다.
- 반복문을 사용하여 문자열의 모든 접미사를 생성합니다.
- `sort` 메서드와 `String::compareTo`를 사용하여 문자열을 사전순으로 정렬합니다.
- `toArray` 메서드를 사용하여 ArrayList를 문자열 배열로 변환합니다.

### 풀이
```
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        // 접미사 저장할 ArrayList
        List<String> list = new ArrayList<>();

        // 모든 접미사 생성
        for (int i = 0; i < my_string.length(); i++) {
            // i부터 끝까지의 부분 문자열을 접미사로 추가
            list.add(my_string.substring(i));
        }

        // 접미사들을 사전순으로 정렬
        list.sort(String::compareTo);  // 사전순 비교

        // 문자열 배열로 변환하여 반환
        return list.toArray(new String[0]);
    }
}
```

