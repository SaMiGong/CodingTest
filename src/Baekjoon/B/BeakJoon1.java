package Baekjoon.B;

import java.util.Scanner;

public class BeakJoon1 {
    public static void main(String[] args) {
        /*
        두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
        A가 B보다 큰 경우에는 '>'를 출력한다.
        A가 B보다 작은 경우에는 '<'를 출력한다.
        A와 B가 같은 경우에는 '=='를 출력한다.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("두번째 숫자를 입력하세요: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
