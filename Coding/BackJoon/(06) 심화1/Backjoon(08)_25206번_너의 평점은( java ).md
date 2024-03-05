





# \[ Backjoon - 25206번 \] 너의 평점은 ( java )

https://www.acmicpc.net/problem/25206

## 문제
인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!

치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.

전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.

인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.

|   |   |
|---|---|
|A+|4.5|
|A0|4.0|
|B+|3.5|
|B0|3.0|
|C+|2.5|
|C0|2.0|
|D+|1.5|
|D0|1.0|
|F|0.0|

P/F 과목의 경우 등급이 `P`또는 `F`로 표시되는데, 등급이 `P`인 과목은 계산에서 제외해야 한다.

과연 치훈이는 무사히 졸업할 수 있을까?

## 입력

**20**줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.

## 출력

치훈이의 전공평점을 출력한다.

정답과의 절대오차 또는 상대오차가 10−4\(10^{-4}\) 이하이면 정답으로 인정한다.
## 제한

- 1 ≤ 과목명의 길이 ≤ 50
- 과목명은 알파벳 대소문자 또는 숫자로만 이루어져 있으며, 띄어쓰기 없이 주어진다. 입력으로 주어지는 모든 과목명은 서로 다르다.
- 학점은 `1.0`,`2.0`,`3.0`,`4.0`중 하나이다.
- 등급은 `A+`,`A0`,`B+`,`B0`,`C+`,`C0`,`D+`,`D0`,`F`,`P`중 하나이다.
- 적어도 한 과목은 등급이 `P`가 아님이 보장된다.

## 예제
### 예제 입력 1

ObjectOrientedProgramming1 3.0 A+
IntroductiontoComputerEngineering 3.0 A+
ObjectOrientedProgramming2 3.0 A0
CreativeComputerEngineeringDesign 3.0 A+
AssemblyLanguage 3.0 A+
InternetProgramming 3.0 B0
ApplicationProgramminginJava 3.0 A0
SystemProgramming 3.0 B0
OperatingSystem 3.0 B0
WirelessCommunicationsandNetworking 3.0 C+
LogicCircuits 3.0 B0
DataStructure 4.0 A+
MicroprocessorApplication 3.0 B+
EmbeddedSoftware 3.0 C0
ComputerSecurity 3.0 D+
Database 3.0 C+
Algorithm 3.0 B0
CapstoneDesigninCSE 3.0 B+
CompilerDesign 3.0 D0
ProblemSolving 4.0 P

### 예제 출력 1

3.284483

## 문제 풀이
### 코드설명
- 코드의 목적:
    
    - 이 코드는 사용자로부터 입력받은 학생들의 과목별 학점과 학점에 따른 평점을 바탕으로, 전체 평균 평점을 계산해 출력하는 것입니다.
- 코드의 주요 구조:
    
    - 이 코드는 먼저 과목별 학점에 따른 평점을 HashMap에 저장합니다. 그 후, 사용자로부터 학생들의 과목별 학점을 입력받아 전체 평균 평점을 계산하고 출력합니다.
- 코드의 주요 알고리즘:
    
    - 이 코드는 Java 8의 Stream API를 사용하여 간결하고 명확한 코드를 작성하고 있습니다.
- 코드의 핵심:
    
    - 이 코드의 핵심은 입력받은 과목별 학점에 따른 평점을 바탕으로 전체 평균 평점을 계산하여 출력하는 것입니다.


### 풀이

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.stream.IntStream;

public class _08_너의평점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arrS = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        Double[] arrD = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};

        // 과목별 학점에 따른 평점을 HashMap에 저장합니다.
        HashMap<String, Double> grade = new HashMap<>();
        IntStream.range(0, arrS.length).forEach(i -> grade.put(arrS[i], arrD[i]));

        // 전체 학점과 평점의 합을 저장할 배열을 선언합니다.
        double[] sum = {0.0, 0.0};

        // 사용자로부터 학생들의 과목별 학점을 입력받아 전체 평균 평점을 계산합니다.
        for (int i = 0; i < 20; i++) {
            String[] arr = br.readLine().split(" ");
            if (!arr[2].equals("P")) {
                double d = Double.parseDouble(arr[1]);
                sum[0] += d;
                sum[1] += d * grade.get(arr[2]);
            }
        }

        // 전체 평균 평점을 출력합니다.
        System.out.printf("%.6f", sum[1] / sum[0]);
    }
}
```

