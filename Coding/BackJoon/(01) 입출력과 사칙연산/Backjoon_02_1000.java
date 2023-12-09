package 입출력과사칙연산;

// https://www.acmicpc.net/problem/1000
// 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 출력 : 첫째 줄에 A+B를 출력한다.

import java.util.Scanner;

public class Backjoon_02_1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b = 0 ;

        a = sc.nextInt();
        b = sc.nextInt();

        if((a > 0 && a < 10) || (b > 0 && b < 10)){
            System.out.print(a + b);
        }

        sc.close();
    }
}
