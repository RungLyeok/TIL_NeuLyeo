package 입출력과사칙연산;

// https://www.acmicpc.net/problem/10430
// 문제 :    (A+B)%C는 ((A%C) + (B%C))%C와 같을까?
//          (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//          세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 A, B, C가 순서대로 주어진다. (2≤ A, B, C ≤ 10000)
// 출력 : 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Backjoon_09_10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if((a >= 2  && a <= 10000) && (b >= 2  && b <= 10000) && (c >= 2  && c <= 10000)  ) {

            System.out.println((a + b) % c);
            System.out.println(((a % c) + (b % c)) % c);
            System.out.println((a * b) % c);
            System.out.println(((a % c) * (b % c)) % c);
        }
    }
}
