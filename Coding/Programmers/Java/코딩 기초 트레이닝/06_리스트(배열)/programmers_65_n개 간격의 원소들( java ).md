# [ Programmers ] n개 간격의 원소들 ( java ) 65 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181888

## 문제 설명

정수 리스트 `num_list`와 정수 `n`이 주어질 때, `num_list`의 첫 번째 원소부터 마지막 원소까지 `n`개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.


### 제한사항

- 5 ≤ `num_list`의 길이 ≤ 20
- 1 ≤ `num_list`의 원소 ≤ 9
- 1 ≤ `n` ≤ 4


### 입출력 예

|num_list|n|result|
|---|---|---|
|[4, 2, 6, 1, 7, 6]|2|[4, 6, 7]|
|[4, 2, 6, 1, 7, 6]|4|[4, 7]|


### 입출력 예 설명

입출력 예 #1

- [4, 2, 6, 1, 7, 6]에서 2개 간격으로 저장되어 있는 원소들은 [4, 6, 7]입니다.

입출력 예 #2

- [4, 2, 6, 1, 7, 6]에서 4개 간격으로 저장되어 있는 원소들은 [4, 7]입니다.

## 문제 풀이
### 코드 설명

**코드의 목적:**

이 코드는 주어진 정수 배열에서 인덱스가 n의 배수인 원소들만을 선택하여 새로운 배열로 반환하는 기능을 가진 알고리즘입니다.

**코드의 주요 구조:**

1. ArrayList 정의: Integer 형태의 ArrayList를 정의합니다.
2. for문: 주어진 배열의 각 원소에 대해 반복문을 실행합니다.
3. 조건문: 원소의 인덱스가 n의 배수인 경우, 해당 원소를 ArrayList에 추가합니다.
4. 반환: ArrayList의 원소들을 배열로 변환하여 반환합니다.

**코드의 주요 알고리즘:**

1. 배열의 각 원소에 대해 반복문을 실행합니다.
2. 원소의 인덱스가 n의 배수인 경우, 해당 원소를 ArrayList에 추가합니다.
3. ArrayList의 원소들을 배열로 변환하여 반환합니다.

**코드의 핵심:**

1. for문과 if문을 이용하여 원소의 인덱스가 n의 배수인 경우를 찾아냅니다.
2. ArrayList의 add 메서드를 이용하여 원소를 추가합니다.
3. ArrayList의 stream과 mapToInt를 이용하여 ArrayList의 원소들을 배열로 변환합니다.

### 풀이
```
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
    
        // Integer 형태의 ArrayList를 정의
        ArrayList<Integer> list = new ArrayList<>();

        // 주어진 배열의 각 원소에 대해 반복문을 실행
        for (int i = 0; i < num_list.length; i++) {
        
            // 원소의 인덱스가 n의 배수인 경우, 해당 원소를 ArrayList에 추가
            if(i % n == 0) {
                list.add(num_list[i]);
            }
        }

        // ArrayList의 원소들을 배열로 변환하여 반환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
```

