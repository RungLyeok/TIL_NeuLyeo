# [ Programmers ] 글자 이어 붙여 문자열 만들기 ( java ) 38 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181915

## 문제 
### 문제 설명
문자열 `my_string`과 정수 배열 `index_list`가 매개변수로 주어집니다. `my_string`의 `index_list`의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- 1 ≤ `my_string`의 길이 ≤ 1,000
- `my_string`의 원소는 영소문자로 이루어져 있습니다.
- 1 ≤ `index_list`의 길이 ≤ 1,000
- 0 ≤ `index_list`의 원소 < `my_string`의 길이

### 입출력 예
![](https://i.imgur.com/sOb9PYm.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

- 이 코드는 주어진 문자열 `my_string`에서 `index_list`에 포함된 인덱스에 해당하는 문자들을 추출하여 새로운 문자열을 만드는 알고리즘을 구현합니다.

**코드의 주요 구조:**

1. 클래스 정의: `Solution` 클래스를 정의합니다.
2. 메서드 정의: `solution` 메서드를 정의합니다.

**코드의 주요 알고리즘:**

1. StringBuilder 생성: 결과 문자열을 저장할 `StringBuilder` 객체 `sb`를 생성합니다.
2. 인덱스 순회: `index_list`의 각 인덱스 `n`에 대해 다음을 수행합니다.
    - `my_string`의 `n`번째 문자를 `StringBuilder`에 추가합니다.
3. 결과 반환: `StringBuilder`에 저장된 문자열을 반환합니다.

**코드의 핵심:**

- `StringBuilder`를 사용하여 문자열을 효율적으로 조작합니다.
- `charAt` 메서드를 사용하여 문자열의 특정 인덱스에 있는 문자를 추출합니다.
- 반복문을 사용하여 `index_list`의 각 인덱스에 해당하는 문자를 차례대로 추출합니다.

### 풀이
```
class Solution {
    public String solution(String my_string, int[] index_list) {
        // 결과 문자열 저장할 StringBuilder 생성
        StringBuilder sb = new StringBuilder();

        // index_list의 각 인덱스에 해당하는 문자를 추출하여 추가
        for (int n : index_list) {
            sb.append(my_string.charAt(n));  // my_string의 n번째 문자 추출
        }

        // 결과 문자열 반환
        return sb.toString();
    }
}

```

```
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[] index_list) {
        return IntStream.of(index_list).mapToObj(i -> my_string.charAt(i))
            .map(String::valueOf).collect(Collectors.joining());
    }
}
```