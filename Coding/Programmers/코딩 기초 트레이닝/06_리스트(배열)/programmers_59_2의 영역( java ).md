# [ Programmers ] 2의 영역 ( java ) 59 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181894

## 문제 
### 문제 설명
정수 배열 `arr`가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.

단, `arr`에 2가 없는 경우 [-1]을 return 합니다.
### 제한사항
- 1 ≤ `arr`의 길이 ≤ 100,000
    - 1 ≤ `arr`의 원소 ≤ 10

### 입출력 예
![](https://i.imgur.com/QRbu1dl.png)

## 문제 풀이
### 코드 설명

**코드의 목적:**

이 코드는 주어진 배열에서 값이 2인 첫 번째 원소와 마지막 원소 사이의 구간을 새로운 배열로 반환하는 기능을 가진 알고리즘입니다.

**코드의 주요 구조:**

1. 클래스 정의: Solution이라는 이름의 클래스를 정의합니다.
2. 메서드 정의: solution이라는 이름의 메서드를 정의합니다. 이 메서드는 정수 배열(arr)를 인자로 받아 처리합니다.

**코드의 주요 알고리즘:**

1. 배열에서 값이 2인 첫 번째 원소와 마지막 원소의 위치를 찾습니다.
2. 만약 배열에 값이 2인 원소가 없다면 -1을 포함하는 새로운 배열을 반환합니다.
3. 그렇지 않다면 첫 번째 원소와 마지막 원소 사이의 구간을 새로운 배열로 반환합니다.

**코드의 핵심:**

1. Arrays.stream과 Collectors.toList를 이용하여 배열을 리스트로 변환합니다.
2. List의 indexOf와 lastIndexOf 메서드를 이용하여 값이 2인 첫 번째 원소와 마지막 원소의 위치를 찾습니다.
3. Arrays.copyOfRange를 이용하여 원하는 구간을 새로운 배열로 복사합니다.

### 풀이
```
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        // 배열에서 값이 2인 첫 번째 원소와 마지막 원소의 위치를 찾음
        int sn = Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(2);
        int en = Arrays.stream(arr).boxed().collect(Collectors.toList()).lastIndexOf(2);
        
        // 만약 배열에 값이 2인 원소가 없다면 -1을 포함하는 새로운 배열을 반환
        // 그렇지 않다면 첫 번째 원소와 마지막 원소 사이의 구간을 새로운 배열로 반환
        return sn == -1 ? new int[]{-1} : Arrays.copyOfRange(arr, sn, en + 1);
    }
}
```

