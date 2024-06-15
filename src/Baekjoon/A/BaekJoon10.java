package Baekjoon.A;

public class BaekJoon10 {
    public static void main(String[] args) {
        /*
        (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
        (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에
        들어갈 값을 구하는 프로그램을 작성하시오.
        */
        int a = 472;
        int b = 385;
        int sum1 = (b % 10) * a;
        int sum2 = (((b % 100) / 10) * a) * 10;
        int sum3 = ((b / 100) * a) * 100;

        System.out.println(sum1); // 5*472
        System.out.println(sum2); // 8*472*10
        System.out.println(sum3); // 3*472*100
        System.out.println(sum1 + sum2 + sum3);

    }
}
