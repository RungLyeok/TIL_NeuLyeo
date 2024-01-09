# [ Programmers ] 빈 배열에 추가, 삭제하기 ( java ) 93 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181860

## 문제 설명

아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 길이가 같은 정수 배열 `arr`과 boolean 배열 `flag`가 매개변수로 주어질 때, `flag`를 차례대로 순회하며 `flag[i]`가 true라면 X의 뒤에 `arr[i]`를 `arr[i]` × 2 번 추가하고, `flag[i]`가 false라면 X에서 마지막 `arr[i]`개의 원소를 제거한 뒤 X를 return 하는 solution 함수를 작성해 주세요.


### 제한사항

- 1 ≤ `arr`의 길이 = `flag`의 길이 ≤ 100
- `arr`의 모든 원소는 1 이상 9 이하의 정수입니다.
- 현재 X의 길이보다 더 많은 원소를 빼는 입력은 주어지지 않습니다.


### 입출력 예

|arr|flag|result|
|---|---|---|
|[3, 2, 4, 1, 3]|[true, false, true, false, false]|[3, 3, 3, 3, 4, 4, 4, 4]|


### 입출력 예 설명

입출력 예 #1

- 예제 1번에서 X의 변화를 표로 나타내면 다음과 같습니다
    
|i|flag[i]|arr[i]|X|
    |---|---|---|---|
    ||||[]|
    |0|true|3|[3, 3, 3, 3, 3, 3]|
    |1|false|2|[3, 3, 3, 3]|
    |2|true|4|[3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4]|
    |3|false|1|[3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4]|
    |4|false|3|[3, 3, 3, 3, 4, 4, 4, 4]|
    
따라서 [3, 3, 3, 3, 4, 4, 4, 4]를 return 합니다.

## 문제 풀이
### 코드 설명
- 코드의 목적:
    
    - 두 개의 배열, 정수 배열(arr)과 불리언 배열(flag)를 입력으로 받아, flag 배열의 각 원소가 참이면 해당하는 arr 원소를 그 값의 두 배만큼 ArrayList에 추가하고, 거짓이면 arr 원소의 값만큼 ArrayList의 마지막 원소를 제거합니다. 이후 ArrayList를 정수 배열로 변환하여 반환합니다.
- 코드의 주요 구조:
    
    - Solution 클래스와 solution 메소드로 구성
    - solution 메소드에서는 ArrayList를 사용하여 반복된 정수를 저장하고, 이를 스트림 API를 이용해 정수 배열로 변환합니다.
- 코드의 주요 알고리즘:
    
    - ArrayList와 for loop를 사용하여 주어진 배열의 각 원소를 그 값의 두 배만큼 반복해서 새로운 리스트에 추가하거나 리스트의 마지막 원소를 제거합니다.
    - 스트림 API의 mapToInt와 toArray 메소드를 사용하여 리스트를 정수 배열로 변환합니다.
- 코드의 핵심:
    
    - 주어진 배열의 각 원소를 그 값의 두 배만큼 반복해서 새로운 배열에 추가하거나, 배열의 마지막 원소를 제거하는 것
    - ArrayList와 스트림 API를 효율적으로 사용하여 배열 처리를 수행하는 것

### 풀이
```
import java.util.ArrayList;

class Solution {

    // solution 메소드 정의, 주어진 정수 배열과 불리언 배열을 매개변수로 받음
    public int[] solution(int[] arr, boolean[] flag) {
        
        // 반복된 정수를 저장할 ArrayList를 생성
        ArrayList<Integer> x = new ArrayList<>();

        // 주어진 배열의 각 원소를 그 값의 두 배만큼 반복해서 새로운 리스트에 추가하거나 리스트의 마지막 원소를 제거
        for (int i = 0; i < flag.length; i++) {
            int n = arr[i];

            if (flag[i]) {

                for (int j = 0; j < n * 2; j++) {
                    x.add(n);
                }
                
            } else {
                
                for (int j = 0; j < n; j++) {
                    x.remove(x.size() - 1);
                }
            }
        }

        // 리스트를 정수 배열로 변환하여 반환
        return x.stream().mapToInt(Integer::intValue).toArray();
    }
}
```

