package Baekjoon.A;

import org.w3c.dom.ls.LSOutput;

public class BaekJoon9 {
    public static void main(String[] args) {
        /*
        (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
        (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
        세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
         */

        int a = 5;
        int b = 8;
        int c = 4;

        if (((a + b) % c) == ((a % c) + (b % c) % c)) {
            System.out.println("같다");
        } else {
            System.out.println("같지 않음");
        }
        System.out.println("첫번째 연산: " + ((a + b) % c));
        System.out.println("두번째 연산: " + ((a % c) + (b % c) % c));

        if (((a * b) % c) == ((a % c) * (b % c) % c)) {
            System.out.println("같다");
        } else {
            System.out.println("같지 않음");
        }
        System.out.println("첫번째 연산: " + ((a * b) % c));
        System.out.println("두번째 연산: " + ((a % c) * (b % c) % c));
    }
}
