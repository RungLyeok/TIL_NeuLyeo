




# [ Programmers ] 콜라츠 수열 만들기 ( java ) 34 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181919

## 문제 
### 문제 설명
모든 자연수 `x`에 대해서 현재 값이 `x`이면 `x`가 짝수일 때는 2로 나누고, `x`가 홀수일 때는 `3 * x + 1`로 바꾸는 계산을 계속해서 반복하면 언젠가는 반드시 `x`가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.

그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.

계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 알려져 있습니다.

임의의 1,000 보다 작거나 같은 양의 정수 `n`이 주어질 때 초기값이 `n`인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요.

### 제한사항
- 1 ≤ `n` ≤ 1,000

### 입출력 예
![](https://i.imgur.com/cOk9ai7.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

- 이 코드는 주어진 숫자 `n`에 대해 콜라츠 추측의 수열을 생성하여 배열로 반환하는 알고리즘을 구현합니다.

**콜라츠 추측(Collatz Conjecture):**

- 어떤 자연수에 대해 다음 과정을 반복하면 항상 1에 도달한다는 추측입니다.
- 과정:
    1. 짝수라면 2로 나눈다.
    2. 홀수라면 3을 곱하고 1을 더한다.

**코드의 주요 구조:**

1. Import: `ArrayList` 클래스를 import 합니다.
2. 클래스 정의: `Solution` 클래스를 정의합니다.
3. 메서드 정의: `solution` 메서드를 정의합니다.

**코드의 주요 알고리즘:**

1. 리스트 생성: `l` 변수를 `ArrayList`로 생성하여 콜라츠 수열을 저장할 리스트를 준비합니다.
2. 초기값 추가: `l` 리스트에 `n`을 추가합니다.
3. 콜라츠 추측 반복:
    - `n`이 1이 될 때까지 다음을 반복합니다.
    - `n`이 짝수라면 2로 나누고 (`n / 2`), 홀수라면 3을 곱하고 1을 더합니다 (`3 * n + 1`).
    - 새로운 `n` 값을 `l` 리스트에 추가합니다.
4. 결과 반환: `l` 리스트를 `int` 배열로 변환하여 반환합니다.

**코드의 핵심:**

- `ArrayList`를 사용하여 콜라츠 수열을 저장합니다.
- 삼항 연산자 (`? :`)를 사용하여 짝수와 홀수의 경우를 간결하게 표현합니다.
- `Stream` API를 사용하여 `ArrayList`를 `int` 배열로 변환합니다.

### 풀이
```
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        // 콜라츠 수열 저장할 리스트
        ArrayList<Integer> l = new ArrayList<>();

        // 초기값 추가
        l.add(n);

        // 콜라츠 추측 반복
        while (n != 1) {
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;  // 짝수면 2로 나누고, 홀수면 3 * n + 1
            l.add(n);  // 새로운 n 값 추가
        }

        // 리스트를 배열로 변환하여 반환
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}
```

