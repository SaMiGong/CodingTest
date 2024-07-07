package Baekjoon.C;

import java.util.Scanner;

public class BeakJoon5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = "";
        sc.close();

        for (int i = 1; i <= (N / 4); i++) {
            str += "long ";
        }
        System.out.println(str + "int");
    }
}
