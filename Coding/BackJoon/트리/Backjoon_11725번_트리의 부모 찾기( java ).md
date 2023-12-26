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
**1. 입력 받기:**

- `Scanner`를 사용하여 입력값을 읽습니다.
- `N`: 트리의 노드 개수
- `N - 1`개의 간선 정보: 각 간선은 두 노드의 쌍으로 주어집니다.

**2. 트리와 부모 노드 배열 초기화:**

- `ArrayList<Integer>[] tree`: 트리의 인접 리스트 표현을 위한 배열입니다. 각 인덱스는 노드를 나타내고, 해당 인덱스의 `ArrayList`에는 연결된 노드들이 저장됩니다.
- `int[] parent`: 각 노드의 부모 노드를 저장할 배열입니다.

**3. 트리 구성:**

- 입력받은 간선 정보를 바탕으로 `tree` 배열에 인접 노드들을 추가합니다.

**4. DFS를 통한 부모 노드 찾기:**

- `dfs` 함수에서 깊이 우선 탐색을 사용하여 각 노드의 부모 노드를 찾습니다.
    - 현재 노드의 인접 노드들을 반복합니다.
    - 인접 노드가 이전 노드가 아닌 경우(순환 방지):
        - 인접 노드의 부모 노드를 현재 노드로 저장합니다.
        - 인접 노드를 시작점으로 다시 DFS를 수행합니다.

**`dfs` 함수:**

```
private static void dfs(ArrayList<Integer>[] tree, int[] parent, int current, int prev) {
    for (int child : tree[current]) {
        if (child != prev) {
            // 이전 노드로 돌아가는 순환을 방지
            parent[child] = current;
            dfs(tree, parent, child, current);
        }
    }
}
```

- `dfs` 함수는 깊이 우선 탐색을 수행하며 현재 노드의 인접 노드들을 재귀적으로 탐색합니다.
- `child != prev` 조건은 이전 노드로 돌아가는 순환을 방지합니다.

**5. 부모 노드 출력:**

- 루트 노드(1번 노드)를 제외한 모든 노드의 부모 노드를 출력합니다.

### 풀이
```
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer>[] tree = new ArrayList[N + 1];
        int[] parent = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            tree[u].add(v);
            tree[v].add(u);
        }

        dfs(tree, parent, 1, 0);

        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }

        scanner.close();
    }

    private static void dfs(ArrayList<Integer>[] tree, int[] parent, int current, int prev) {
        for (int child : tree[current]) {
            if (child != prev) {
                parent[child] = current;
                dfs(tree, parent, child, current);
            }
        }
    }
}
```
