# [ Programmers ] _ 숫자 문자열과 영단어 ( java )

https://school.programmers.co.kr/learn/courses/30/lessons/81301?language=java
## 문제 
### 문제 설명
네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.  
  
다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

- 1478 → "one4seveneight"
- 234567 → "23four5six7"
- 10203 → "1zerotwozero3"

이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 `s`가 매개변수로 주어집니다. `s`가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.

![](https://i.imgur.com/RvilwM0.png)


### 제한사항
- 1 ≤ `s`의 길이 ≤ 50
- `s`가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
- return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 `s`로 주어집니다.

### 입출력 예
![](https://i.imgur.com/h2JAoNo.png)






## 문제 풀이
### 문제 접근
- 0 ~ 9 까지의 영단어를 담은 문자형 배열을 만든다.

- .replace( )  이용하여 입력받은 문자열 s 의 영단어 들을 숫자로 바꾼다.
	- s = s.replace(num[i], Integer.toString(i));
	- s 는 문자열이기 때문에 바꾸는 숫자을 문자열로 바꿔서 넣어줘야 한다.
	  
- 반환 값은 정수형 이기때문에 문자열 s를 정수형으로 바꾼다.
	- integer.parseInt(s);


### 풀이
```
class Solution {
    public int solution(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            
        for (int i = 0; i < num.length; i++) {
            s = s.replace(num[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}
```

![](https://i.imgur.com/zG85oKd.png)












