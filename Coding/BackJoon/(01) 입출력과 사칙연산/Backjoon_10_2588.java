package 입출력과사칙연산;

// https://www.acmicpc.net/problem/2588
// 문제 : (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//       (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
// 출력 : 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Backjoon_10_2588 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int a100 = a / 100;
        int a10 = (a - a100 * 100) / 10;
        int a1 = a - a100 * 100 - a10 * 10;

        int b100 = b / 100;
        int b10 = (b - b100 * 100) / 10;
        int b1 = b - b100 * 100 - b10 * 10;

        System.out.println((a1 * b1) + (a10 * b1 * 10)+ (a100 * b1 * 100));
        System.out.println((a1 * b10) + (a10 * b10 * 10)+ (a100 * b10 * 100));
        System.out.println((a1 * b100) + (a10 * b100 * 10)+ (a100 * b100 * 100));
        System.out.println(a * b);
    }
}

