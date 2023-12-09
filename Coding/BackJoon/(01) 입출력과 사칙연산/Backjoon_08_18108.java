package 입출력과사칙연산;

// https://www.acmicpc.net/problem/18108
// 문제 : ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다.
// 공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.
// 불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다.
// 반면, 우리나라는서기 연도를 사용하고 있다. 불기 연도가 주어질 때 이를 서기연도로 바꿔 주는 프로그램을 작성하시오.
// 입력 : 서기 연도를 알아보고 싶은 불기 연도_y_가주어진다. (1000 ≤_y_≤ 3000)
// 출력 : 불기 연도를 서기 연도로 변환한 결과를 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Backjoon_08_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        if(year > 1000 && year <= 3000 ) {

            System.out.print(year - 543);
        }
    }
}
