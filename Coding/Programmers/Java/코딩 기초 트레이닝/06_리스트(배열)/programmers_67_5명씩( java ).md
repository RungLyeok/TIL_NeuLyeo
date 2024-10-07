# [ Programmers ] 5명씩 ( java ) 67 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181886

## 문제 설명

최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 `names`가 주어질 때, 앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요. 마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.



### 제한사항

- 5 ≤ `names`의 길이 ≤ 30
- 1 ≤ `names`의 원소의 길이 ≤ 10
- `names`의 원소는 영어 알파벳 소문자로만 이루어져 있습니다.



### 입출력 예

|names|result|
|---|---|
|["nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"]|["nami", "vex"]|



### 입출력 예 설명

입출력 예 #1

- 앞에서부터 5명씩 두 그룹으로 묶을 수 있습니다. ["nami", "ahri", "jayce", "garen", "ivern"], ["vex", "jinx"] 이 두 그룹에서 가장 앞에 서있는 사람들의 이름을 담은 리스트인 ["nami", "vex"]를 return합니다.


## 문제 풀이
### 코드 설명

**코드의 목적:**

이 코드는 주어진 문자열 배열에서 인덱스가 5의 배수인 원소들만을 선택하여 새로운 배열로 반환하는 기능을 가진 알고리즘입니다.

**코드의 주요 구조:**

1. ArrayList 정의: String 형태의 ArrayList를 정의합니다.
2. for문: 주어진 배열의 각 원소에 대해 반복문을 실행합니다.
3. 조건문: 원소의 인덱스가 5의 배수인 경우, 해당 원소를 ArrayList에 추가합니다.
4. 반환: ArrayList의 원소들을 배열로 변환하여 반환합니다.

**코드의 주요 알고리즘:**

1. 배열의 각 원소에 대해 반복문을 실행합니다.
2. 원소의 인덱스가 5의 배수인 경우, 해당 원소를 ArrayList에 추가합니다.
3. ArrayList의 원소들을 배열로 변환하여 반환합니다.

**코드의 핵심:**

1. for문과 if문을 이용하여 원소의 인덱스가 5의 배수인 경우를 찾아냅니다.
2. ArrayList의 add 메서드를 이용하여 원소를 추가합니다.
3. ArrayList의 toArray 메서드를 이용하여 ArrayList의 원소들을 배열로 변환합니다.

### 풀이
```
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] names) {
        // String 형태의 ArrayList를 정의
        ArrayList<String> list = new ArrayList<>();
        
        // 주어진 배열의 각 원소에 대해 반복문을 실행
        for (int i = 0; i < names.length; i++) {
            // 원소의 인덱스가 5의 배수인 경우, 해당 원소를 ArrayList에 추가
            if (i % 5 == 0) {
                list.add(names[i]);
            }
        }
        
        // ArrayList의 원소들을 배열로 변환하여 반환
        return list.toArray(new String[0]);
    }
}
```

