





# \[ Backjoon - 1316번 \] 그룹 단어 체커 ( java )

https://www.acmicpc.net/problem/1316

## 문제
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

## 입력

첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

## 출력

첫째 줄에 그룹 단어의 개수를 출력한다.
## 예제
### 예제 입력 1 

3
happy
new
year

### 예제 출력 1 

3

### 예제 입력 2 

4
aba
abab
abcabc
a

### 예제 출력 2 
1

## 문제 풀이
### 코드설명
-  코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 문자열 중 '그룹 단어'의 개수를 찾는 것입니다. '그룹 단어'란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말합니다.
- 코드의 주요 구조:
    
    - 이 코드는 사용자로부터 n개의 문자열을 입력받습니다. 그 후, 각 문자열이 '그룹 단어'인지를 판단하고, '그룹 단어'의 개수를 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 문자열 처리 함수와 HashSet 자료구조를 사용하여 각 문자열이 '그룹 단어'인지를 판단하는 것입니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 문자열의 각 문자가 연속해서 나타나는 경우만을 찾아내는 것입니다. 이를 위해 이전 문자와 현재 문자를 비교하고, HashSet을 사용하여 이미 나타난 문자를 체크합니다.


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _07_그룹단어체커 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = n;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            HashSet<Character> check = new HashSet<>();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                // 이전 문자와 현재 문자가 다르고, 현재 문자가 이미 나타난 경우 '그룹 단어'가 아닙니다.
                if (j > 0 && str.charAt(j - 1) != c && check.contains(c)) {
                    answer--;
                    break;
                }
                
                // 현재 문자를 HashSet에 추가합니다.
                check.add(c);
            }
        }

        // '그룹 단어'의 개수를 출력합니다.
        System.out.println(answer);
    }
}
```

