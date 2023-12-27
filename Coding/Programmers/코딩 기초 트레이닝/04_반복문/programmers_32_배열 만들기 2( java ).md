




# [ Programmers ] 배열 만들기 2 ( java ) 32 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181921

## 문제 
### 문제 설명
정수 `l`과 `r`이 주어졌을 때, `l` 이상 `r`이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

### 제한사항
- 1 ≤ `l` ≤ `r` ≤ 1,000,000

### 입출력 예
![](https://i.imgur.com/KlGBALW.png)


## 문제 풀이
### 코드 설명
**코드의 목적:**

- 이 코드는 주어진 범위 `l`부터 `r`까지의 정수 중 0과 5로만 구성된 숫자들을 찾아 배열로 반환하는 알고리즘을 구현합니다.

**코드의 주요 구조:**

1. Import: `ArrayList` 클래스를 import 합니다.
2. 클래스 정의: `Solution` 클래스를 정의합니다.
3. 메서드 정의: `solution` 메서드를 정의합니다.

**코드의 주요 알고리즘:**

1. 결과 리스트 생성: `result` 변수를 `ArrayList`로 생성하여 조건에 맞는 숫자들을 저장할 리스트를 준비합니다.
2. 범위 내 숫자 순회:
    - `l`부터 `r`까지의 모든 숫자를 순회하면서 다음을 수행합니다.
3. 문자열 변환 및 검사:
    - 현재 숫자 `i`를 문자열 `str`로 변환합니다.
    - `str.chars().allMatch(c -> c == '0' || c == '5')`를 사용하여 `str`의 모든 문자가 '0' 또는 '5'인지 확인합니다.
4. 조건에 맞는 숫자 저장:
    - 3번의 조건이 참이면 `result` 리스트에 `i`를 추가합니다.
5. 결과 반환:
    - `result` 리스트가 비어있으면 `-1`을 포함한 배열을 반환합니다.
    - 그렇지 않으면 `result` 리스트를 `int` 배열로 변환하여 반환합니다.

**코드의 핵심:**

- `ArrayList`를 사용하여 조건에 맞는 숫자들을 저장합니다.
- `String.chars().allMatch()` 메서드를 사용하여 문자열의 모든 문자가 특정 조건을 만족하는지 확인합니다.
- `Stream` API를 사용하여 `ArrayList`를 `int` 배열로 변환합니다.

### 풀이
```
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        // 결과 저장할 리스트
        ArrayList<Integer> result = new ArrayList<>();

        // 범위 내 숫자 순회
        for (int i = l; i <= r; i++) {
            // 문자열로 변환
            String str = String.valueOf(i);

            // 0과 5로만 구성된 숫자인지 확인
            if (str.chars().allMatch(c -> c == '0' || c == '5')) {
                result.add(i);
            }
        }

        // 결과 반환
        return result.isEmpty() ? new int[]{-1} : result.stream().mapToInt(Integer::intValue).toArray();
    }
}
```

```
import java.util.stream.IntStream;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        IntStream.rangeClosed(l, r)
            .filter(n -> String.valueOf(n).chars().
                   allMatch(c -> c == '0' || c == '5'))
            .forEach(list :: add);
        
        return list.isEmpty() ? new int[]{-1} : 
        list.stream().mapToInt(Integer::intValue).toArray();
    }
}
```