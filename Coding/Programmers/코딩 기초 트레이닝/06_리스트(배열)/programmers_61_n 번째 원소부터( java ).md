# [ Programmers ] n 번째 원소부터 ( java ) 61 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181892

## 문제 
### 문제 설명
정수 리스트 `num_list`와 정수 `n`이 주어질 때, `n` 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요
### 제한사항
-  2 ≤ `num_list`의 길이 ≤ 30
- 1 ≤ `num_list`의 원소 ≤ 9
- 1 ≤ `n` ≤ `num_list`의 길이

### 입출력 예
![](https://i.imgur.com/Kc8PWzM.png)

## 문제 풀이
### 코드 설명

**코드의 목적:**

이 코드는 주어진 배열에서 n번째 원소부터 마지막 원소까지의 구간을 새로운 배열로 반환하는 기능을 가진 알고리즘입니다.

**코드의 주요 구조:**

1. 클래스 정의: Solution이라는 이름의 클래스를 정의합니다.
2. 메서드 정의: solution이라는 이름의 메서드를 정의합니다. 이 메서드는 정수 배열(num_list)와 정수(n)를 인자로 받아 처리합니다.

**코드의 주요 알고리즘:**

1. 배열의 n번째 원소부터 마지막 원소까지의 구간을 새로운 배열로 복사하여 반환합니다.

**코드의 핵심:**

1. Arrays.copyOfRange를 이용하여 원하는 구간을 새로운 배열로 복사합니다.

### 풀이
```
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        // 배열의 n번째 원소부터 마지막 원소까지의 구간을 새로운 배열로 복사하여 반환
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}
```

