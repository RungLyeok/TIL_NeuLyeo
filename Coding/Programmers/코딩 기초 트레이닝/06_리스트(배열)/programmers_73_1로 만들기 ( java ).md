# [ Programmers ] 1로 만들기 ( java ) 73 / 124
https://school.programmers.co.kr/learn/courses/30/lessons/181880

## 문제 설명

정수가 있을 때, 짝수라면 반으로 나누고, 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다. 예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.

- 10 / 2 = 5
- (5 - 1) / 2 = 4
- 4 / 2 = 2
- 2 / 2 = 1

위와 같이 4번의 나누기 연산으로 1이 되었습니다.

정수들이 담긴 리스트 `num_list`가 주어질 때, `num_list`의 모든 원소를 1로 만들기 위해서 필요한 나누기 연산의 횟수를 return하도록 solution 함수를 완성해주세요.


### 제한사항

- 3 ≤ `num_list`의 길이 ≤ 15
- 1 ≤ `num_list`의 원소 ≤ 30


### 입출력 예

|num_list|result|
|---|---|
|[12, 4, 15, 1, 14]|11|


### 입출력 예 설명

입출력 예 #1

- 12는 3번, 4는 2번, 15는 3번, 1은 0번, 14는 3번의 연산이 필요하기 때문에 총 11번의 연산이 필요합니다.

## 문제 풀이
### 코드 설명

- 코드의 목적:
    
    - 주어진 숫자 배열의 각 원소에 특정 연산을 수행
    - 연산 결과를 합계
    - 연산 내용: 숫자가 홀수일 경우 1을 빼고, 짝수일 경우 2로 나눔
    - 연산은 숫자가 1이 될 때까지 반복하며, 연산 횟수를 세어 합계
- 코드의 주요 구조:
    
    - Solution 클래스와 두 개의 메소드로 구성
    - 메인 메소드인 solution에서 숫자 배열을 스트림으로 변환
    - 각 원소에 대해 count 메소드를 호출하고 결과를 합계하여 반환
- 코드의 주요 알고리즘:
    
    - 스트림과 람다를 활용한 함수형 프로그래밍 스타일 사용
    - count 메소드에서 주어진 숫자에 대한 연산을 반복문으로 구현
- 코드의 핵심:
    
    - 주어진 숫자 배열의 각 원소에 특정 연산을 수행하고 결과를 합계하는 것
    - 스트림과 람다, 반복문 등을 효율적으로 사용

### 풀이
```
import java.util.Arrays;

// Solution 클래스 정의
class Solution {

    // solution 메소드 정의, 정수 배열을 매개변수로 받음
    public int solution(int[] num_list) {
        
        // 배열의 각 원소에 대해 count 메소드를 호출하고 그 결과들을 합계하여 반환
        return Arrays.stream(num_list).map(x -> count(x)).sum();
    }
    
    // count 메소드 정의, 정수를 매개변수로 받음
    private int count(int n) {
        // 연산 횟수를 저장할 변수 정의
        int count = 0;
        
        // 입력받은 수가 1이 될 때까지 반복
        while(n != 1) {
            // 입력받은 수가 짝수라면 2로 나누고, 홀수라면 1을 빼서 2로 나눔
            n = n % 2 == 0 ? n / 2 : (n - 1) / 2;
            // 연산 횟수 증가
            count++;
        }
        
        // 연산 횟수 반환
        return count;
    } 
}
```

