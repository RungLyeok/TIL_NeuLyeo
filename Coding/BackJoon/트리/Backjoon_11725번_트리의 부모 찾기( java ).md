# \[ Backjoon - 11725번 \] 트리의 부모 찾기 ( java )

https://www.acmicpc.net/problem/11725


## 문제
루트 없는 트리가 주어진다. 이때, 트리의 루트를 1이라고 정했을 때, 각 노드의 부모를 구하는 프로그램을 작성하시오.



### 입력
첫째 줄에 노드의 개수 N (2 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N-1개의 줄에 트리 상에서 연결된 두 정점이 주어진다.

### 출력
첫째 줄부터 N-1개의 줄에 각 노드의 부모 노드 번호를 2번 노드부터 순서대로 출력한다.

### 예제
![](https://i.imgur.com/4SnL66S.png) ![](https://i.imgur.com/dJ4kzTS.png)

## 문제 풀이
### 코드 설명
**코드의 목적:**

- 이 코드는 트리의 각 노드의 부모 노드를 찾는 알고리즘을 구현합니다.
- 깊이 우선 탐색(DFS)을 사용하여 트리를 탐색하며 각 노드의 부모를 기록합니다.

**코드의 주요 구조:**

1. 입력: 노드의 개수와 간선 정보 입력
2. 그래프 표현: 인접 리스트로 트리 표현
3. DFS 수행: 각 노드의 부모를 찾기 위해 DFS 탐색
4. 결과 출력: 루트 노드(1번 노드)를 제외한 각 노드의 부모 노드 번호 출력

**코드의 주요 알고리즘:**

**DFS 함수:**

- 현재 노드(`current`)에서 인접한 노드들을 순회합니다.
- 인접한 노드(`child`)가 이전 노드(`prev`)가 아닌 경우,
    - 현재 노드를 인접 노드의 부모로 기록합니다(`parent[child] = current`).
    - 인접 노드를 시작점으로 DFS를 재귀적으로 수행합니다(`dfs(tree, parent, child, current)`).

**코드의 흐름:**

1. 입력: 노드 개수(`N`)와 간선 정보 입력
2. 그래프 표현: 인접 리스트 `tree`와 부모 노드 기록을 위한 배열 `parent` 생성
3. DFS 수행: 노드 1을 시작점으로 DFS 수행 (`dfs(tree, parent, 1, 0)`)
4. 결과 출력: 루트 노드(1번 노드)를 제외한 각 노드의 부모 노드 번호 출력

**코드의 핵심:**

- DFS 탐색을 통해 트리를 순회하면서 각 노드의 부모를 기록합니다.
- 인접 리스트 기반의 그래프 표현을 사용하여 탐색을 효율적으로 수행합니다.

### 풀이
```
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  
    // 입력: 노드의 개수와 간선 정보 입력
    Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt();

    ArrayList<Integer>[] tree = new ArrayList[N + 1]; // 인접 리스트
    int[] parent = new int[N + 1]; // 각 노드의 부모 노드 저장

    // 그래프 표현: 인접 리스트로 트리 표현
    for (int i = 1; i <= N; i++) {
      tree[i] = new ArrayList<>();
    }
    
    for (int i = 0; i < N - 1; i++) {
      int u = scanner.nextInt();
      int v = scanner.nextInt();
      tree[u].add(v);
      tree[v].add(u);
    }

    // DFS 수행: 각 노드의 부모를 찾기 위해 DFS 탐색
    dfs(tree, parent, 1, 0);

    // 결과 출력: 루트 노드(1번 노드)를 제외한 각 노드의 부모 노드 번호 출력
    for (int i = 2; i <= N; i++) {
      System.out.println(parent[i]);
    }

    scanner.close();
  }

  // DFS 함수: 현재 노드에서 인접한 노드들을 순회하며 부모 노드를 기록
  private static void dfs(ArrayList<Integer>[] tree, int[] parent, int current, int prev) {
    for (int child : tree[current]) {  // 현재 노드에서 인접한 노드들을 순회
      if (child != prev) {  // 이전 노드가 아닌 경우
        parent[child] = current;  // 현재 노드를 인접 노드의 부모로 기록
        dfs(tree, parent, child, current);  // 인접 노드를 시작점으로 DFS 재귀 호출
      }
    }
  }
}
```
