package Baekjoon.C;

import java.util.Scanner;

public class BeakJoon13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array1[] = new int[n];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == x)
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
