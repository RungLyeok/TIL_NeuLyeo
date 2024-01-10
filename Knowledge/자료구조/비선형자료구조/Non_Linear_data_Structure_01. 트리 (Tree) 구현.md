# \[ Non Linear Data Structure \] 트리 구현 (Java)

## 배열을 이용한 이진 트리 구성
```
class BinaryTree {  
    // 문자 배열  
    char[] arr;  
  
    // 생성자  
    BinaryTree(char[] data) {  
        this.arr = data.clone();  
    }  
  
  
    // 전위 순회  
    // 순서 : 현재 - 왼쪽 - 오른쪽  
    // A B D H I E J C F G  
    public void preOrder(int idx) {  
        // 현재 idx에 해당하는 data 출력  
        System.out.print(this.arr[idx] + " ");  
  
        // 왼쪽, 오른쪽 자식 노드  
        int left = 2 * idx + 1;  
        int right = 2 * idx + 2;  
  
        // left가 arr 크기 보다 작은 경우  
        // 왼쪽 노드가 존재하는 경우  
        if (left < this.arr.length) {  
            // 왼쪽 노드로 이동  
            this.preOrder(left);  
        }  
        // right가 arr 크기 보다 작은 경우  
        // 오른쪽 노드가 존재하는 경우  
        if (right < this.arr.length) {  
            this.preOrder(right);  
        }  
    }  
  
    // 중위 순회 코드  
    // 순서 : 왼쪽 - 현재 - 오른쪽  
    public void inOrder(int idx) {  
        // 왼쪽, 오른쪽 자식 노드  
        int left = 2 * idx + 1;  
        int right = 2 * idx + 2;  
  
        // 왼쪽 자식 노드가 있는 경우, 끝까지 내려간 후  
        if (left < this.arr.length) {  
            // 왼쪽 자식 노드 출력  
            this.inOrder(left);  
        }  
  
        // 현재 노드 출력  
        System.out.print(this.arr[idx] + " ");  
  
        // 오른쪽 자식 노드가 있는 경우  
        if (right < this.arr.length) {  
            // 오른쪽 자식 노드 출력  
            this.inOrder(right);  
        }  
    }  
  
    // 후위 순회  
    // 순서 : 왼쪽 - 오른쪽 - 현재  
    public void postOrder(int idx) {  
        // 왼쪽, 오른쪽 자식 노드  
        int left = 2 * idx + 1;  
        int right = 2 * idx + 2;  
  
        // 왼쪽 자식 노드가 있는 경우  
        if (left < this.arr.length) {  
            // 왼쪽 자식 노드로 이동, 출력  
            this.postOrder(left);  
        }  
  
        // 오른쪽 자식 노드가 있는 경우  
        if (right < this.arr.length) {  
            // 오른쪽 자식 노드로 이동, 출력  
            this.postOrder(right);  
        }  
  
        // 마지막으로 현재 노드 출력  
        System.out.print(this.arr[idx] + " ");  
    }  
  
    // 레벨 순회  
    // 배열에서는 순서대로 출력하면 된다.  
    public void levelOrder(int idx) {  
        for (int i = idx; i < this.arr.length; i++) {  
            System.out.print(this.arr[i] + " ");  
        }  
        System.out.println();  
    }  
}
```

```
public class main {  
    public static void main(String[] args) {  
		// 배열 생성
        char[] arr = new char[10];  
  
        // A ~ J 까지 배열에 넣는 반복문  
        for (int i = 0; i < arr.length; i++) {  
            arr[i] = (char)('A' + i);  
        }  
        
	    //                  (0:A)
		//          (1:B)           (2:C) 
		//    (3:D)      (4:E)    (5:F)(6:G)
		// (7:H) (8:I) (9:J)

		// 트리 생성
        BinaryTree bt = new BinaryTree(arr);  
  
	    // 전위 순회 : A B D H I E J C F G 
        bt.preOrder(0);
        System.out.println();  
  
	    // 중위 순회 : H D I B J E A F C G 
        bt.inOrder(0);  
        System.out.println();  
  
        // 후위 순회 : H I D J E B F G C A
        bt.postOrder(0);  
        System.out.println();  
  
        // 레벨 순회 : A B C D E F G H I J
        bt.levelOrder(0);  
        System.out.println();  
    }  
}
```

## 연결 리스트를 이용한 이진 트리 구성
```
import java.util.LinkedList;  
import java.util.Queue;  
  
class Node {  
    char data;  
    // 왼쪽 자식 노드를 가리키는 링크  
    Node left;  
    // 오른쪽 자식 노드를 가리키는 링크  
    Node right;  
  
    // 생성자  
    Node(char data, Node left, Node right) {  
        this.data = data;  
        this.left = left;  
        this.right = right;  
    }  
}  
  
class BinaryTree2 {  
    Node head;  
  
    // 기본 생성자  
    BinaryTree2() {}  
  
    // 배열을 받아 연결  
    BinaryTree2(char[] arr) {  
        Node[] nodes = new Node[arr.length];  
        for (int i = 0; i < arr.length; i++) {  
            // 모든 요소들을 노드로 만들어 배열에 넣어 준다.  
            nodes[i] = new Node(arr[i], null, null);  
        }  
  
        // 현재 노드에 대해 자식 노드를 연결하는 반복문  
        for (int i = 0; i < arr.length; i++) {  
            // 왼쪽 자식 노드의 인덱스  
            int left = 2 * i + 1;  
            // 오른쪽 자신 노드의 인덱스  
            int right = 2 * i + 2;  
  
            // 왼쪽 자식 노드 범위 확인  
            if (left < arr.length) {  
                // 현재 노드 왼쪽 링크에 연결  
                nodes[i].left = nodes[left];  
            }  
  
            // 오른쪽 자식 노드 범위 확인  
            if (right < arr.length) {  
                // 현재 노드 오른쪽 링크에 연결  
                nodes[i].right = nodes[right];  
            }  
  
        }  
        // head 노드 연결  
        this.head = nodes[0];  
    }  
  
    // 전위 순회  
    public void preOrder(Node node) {  
        // 재귀 함수 탈출 조건  
        if (node == null) {  
            return;  
        }  
  
        // 현재 츌력  
        System.out.print(node.data + " ");  
        // 왼쪽 자식 노드 탐색  
        preOrder(node.left);  
        // 오른쪽 자식 노드 탐색  
        preOrder(node.right);  
    }  
  
    // 중위 순회  
    public void inOrder(Node node) {  
        // 재귀 함수 탈출 조건  
        if (node == null) {  
            return;  
        }  
  
        // 왼쪽 자식 노드 탐색  
        inOrder(node.left);  
        // 현재 노드 출력  
        System.out.print(node.data + " ");  
        // 오른쪽 자식 노드 탐색  
        inOrder(node.right);  
    }  
  
    // 후위 순회  
    public void postOrder(Node node) {  
        // 재귀 함수 탈출 조건  
        if (node == null) {  
            return;  
        }  
  
        // 왼쪽 자식 노드 탐색  
        postOrder(node.left);  
        // 오른쪽 자식 노드 탐색  
        postOrder(node.right);  
        // 현재 노드 출력  
        System.out.print(node.data + " ");  
    }  
  
    // 레벨 순회  
    // 큐 구조를 이용 한다.  
    public void levelOrder(Node node) {  
        // 큐 선언  
        Queue<Node> queue = new LinkedList();  
  
        // 큐에 루트 노드 입력  
        queue.add(node);  
  
        // 큐가 빌 때 까지 반복  
        while (!queue.isEmpty()) {  
            // 노드를 하나 꺼낸다.  
            Node cur = queue.poll();  
            System.out.print(cur.data + " ");  
  
            // 꺼낸 노드의 왼쪽 링크가 있으면  
            if (cur.left != null) {  
                // 큐에 넣는다.  
                queue.offer(cur.left);  
            }  
  
            // 꺼낸 노드의 오른쪽 링크가 있으면  
            if (cur.right != null) {  
                // 큐에 넣는다.  
                queue.offer(cur.right);  
            }  
        }  
    }  
}  

 ```
 
```
public class main {  
    public static void main(String[] args) { 
	    // 배열 생성
        char[] arr = new char[10];  
	    // 배열 초기화
        for (int i = 0; i < arr.length; i++) {  
            arr[i] = (char)('A' + i);  
        }  
  
        BinaryTree2 bt = new BinaryTree2(arr);  
  
        // 전위 순회 : A B D H I E J C F G
        bt.preOrder(bt.head); 
        System.out.println();  
  
        // 중위 순회 : H D I B J E A F C G
        bt.inOrder(bt.head);
        System.out.println();  
  
        // 후위 순회 : H I D J E B F G C A 
        bt.postOrder(bt.head);
        System.out.println();  
  
        // 레벨 순회 : A B C D E F G H I J  
        bt.levelOrder(bt.head);
        System.out.println();  
    }  
}
```