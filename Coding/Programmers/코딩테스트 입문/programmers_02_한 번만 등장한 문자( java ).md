# [ Programmers ] 한 번만 등장한 문자 ( java )

https://school.programmers.co.kr/learn/courses/30/lessons/120896?language=java
## 문제 
### 문제 설명
문자열 `s`가 매개변수로 주어집니다. `s`에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

### 제한사항
- 0 < `s`의 길이 < 1,000
- `s`는 소문자로만 이루어져 있습니다.

### 입출력 예
  ![](https://i.imgur.com/r0UaVMc.png)






## 문제 풀이
### 코드 설명
**1. 클래스 및 함수 정의:**

- `class Solution`: 솔루션을 담고 있는 클래스를 정의합니다.
- `public String solution(String s)`: 문자열 `s`를 입력받아 문자열을 반환하는 함수입니다.

**2. TreeMap 생성:**

- `TreeMap<String, Integer> tm = new TreeMap<>();`: 문자와 문자의 개수를 저장할 `TreeMap`을 생성합니다. `TreeMap`을 사용하여 문자를 자동으로 정렬합니다.

**3. 문자의 개수 계산:**

- `for(String c : s.split("")){ ... }`: 입력 문자열을 문자 단위로 쪼개어 반복하면서 다음을 수행합니다.
    - `tm.put(c, tm.getOrDefault(c, 0) + 1);`: 현재 문자가 `TreeMap`에 존재하면 값을 1 증가시키고, 존재하지 않으면 0을 기본값으로 설정한 후 1로 초기화합니다.

**4. 한 번만 등장하는 문자 추출:**

- `StringBuilder sb = new StringBuilder();`: 결과 문자열을 만들기 위한 `StringBuilder`를 생성합니다.
- `for(Map.Entry<String, Integer> entry : tm.entrySet()) { ... }`: `TreeMap`의 모든 항목을 반복하면서 다음을 수행합니다.
    - `if (entry.getValue() == 1) { ... }`: 문자의 개수가 1인 경우 다음을 수행합니다.
        - `sb.append(entry.getKey());`: `StringBuilder`에 해당 문자를 추가합니다.

**5. 결과 반환:**

- `return sb.toString();`: 추출된 문자들을 문자열로 만들어 반환합니다.

**코드의 역할:**

이 코드는 입력 문자열에서 한 번만 등장하는 문자들을 추출하여 정렬된 순서로 반환하는 역할을 합니다.

### 풀이
```
import java.util.*;
class Solution {
    public String solution(String s) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        for(String c : s.split("")){
            tm.put(c, tm.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> entry : tm.entrySet()) {
            if (entry.getValue() == 1) {
                sb.append(entry.getKey());
            }
        }
        
        return sb.toString();
    }
}
```
















