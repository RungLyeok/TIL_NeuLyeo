# [ Programmers ] 주사위 게임 3 ( java ) 37 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181916

## 문제 
### 문제 설명
1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.

- 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
- 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
- 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
- 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
- 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.

네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 `a`, `b`, `c`, `d`로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

### 제한사항
- `a`, `b`, `c`, `d`는 1 이상 6 이하의 정수입니다.

### 입출력 예
![](https://i.imgur.com/bZGzone.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

- 이 코드는 네 개의 정수 `a`, `b`, `c`, `d`를 받아 특정 규칙에 따라 계산된 값을 반환하는 알고리즘을 구현합니다.

**코드의 주요 구조:**

1. Import: 필요한 클래스들을 import 합니다.
2. 클래스 정의: `Solution` 클래스를 정의합니다.
3. 메서드 정의: `solution` 메서드를 정의합니다.

**코드의 주요 알고리즘:**

1. 리스트 생성: 숫자들을 담은 리스트 `list`를 생성합니다.
2. 숫자 빈도수 세기: `HashMap`을 사용하여 각 숫자의 등장 횟수를 셉니다.
3. 빈도수에 따라 정렬: `Map.Entry`의 값(빈도수)을 기준으로 내림차순 정렬합니다.
4. 빈도수에 따른 계산:
    - 가장 많이 등장하는 숫자의 빈도수 `cnt`에 따라 다음을 수행합니다.
        - `cnt == 4`: 네 숫자가 모두 같으므로 `a * 1111`을 반환합니다.
        - `cnt == 3`: 세 숫자가 같으므로 `10 * p + q`의 제곱을 반환합니다.
        - `cnt == 2`: 두 숫자가 같고 나머지 숫자도 같으면 `(p + q) * Math.abs(p - q)`를 반환하고, 한 숫자만 두 번 등장하면 `q * r`을 반환합니다.
        - 그 외: 가장 작은 숫자를 반환합니다.

**코드의 핵심:**

- `HashMap`을 사용하여 숫자의 빈도수를 효과적으로 계산합니다.
- `Map.Entry`를 정렬하여 가장 많이 등장하는 숫자를 쉽게 찾습니다.
- 조건문을 사용하여 숫자들의 등장 빈도수에 따라 계산을 다르게 수행합니다.

### 풀이
```
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
import java.util.stream.Collectors;

class Solution {
    public int solution(int a, int b, int c, int d) {
        // 숫자 리스트 생성
        List<Integer> list = List.of(a, b, c, d);

        // 숫자 빈도수 세기
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : list) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // 빈도수에 따라 정렬
        List<Map.Entry<Integer, Integer>> sortedM = map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toList());

        // 빈도수에 따른 계산
        int cnt = sortedM.get(0).getValue();
        if (cnt == 4) {
            // 네 숫자 모두 같음
            return a * 1111;
        } else if (cnt == 3) {
            // 세 숫자 같음
            int p = sortedM.get(0).getKey();
            int q = sortedM.get(1).getKey();
            return (int)Math.pow(10 * p + q, 2);
        } else if (cnt == 2) {
            // 두 숫자 같음
            int p = sortedM.get(0).getKey();
            int q = sortedM.get(1).getKey();

            if (sortedM.get(0).getValue() == sortedM.get(1).getValue()) {
                // 두 숫자 빈도수 같음
                return (p + q) * Math.abs(p - q);
            } else {
                // 한 숫자만 두 번 등장
                int r = sortedM.get(2).getKey();
                return q * r;
            }
        } else {
            // 가장 작은 숫자 반환
            return map.keySet().stream().min(Integer::compare).orElse(0);
        }
    }
}
```