package Baekjoon.A;

import java.util.Scanner;

public class BaekJoon7 {
    public static void main(String[] args) {
        /*
        준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다.
        준하는 놀람을 ??!로 표현한다. 준하가 가입하려고 하는 사이트에 이미
        존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
         */

        Scanner scanner = new Scanner(System.in);

        // 이미 가입되어 있는 아이디
        String aID = "joonas";


        System.out.print("새로 만드는 아이디를 입력하세요: ");
        String myID = scanner.nextLine();

        // aID와 같을시 입력한 myID뒤에 ??!를 붙임
        if (aID.equals(myID)) {
            System.out.println(myID + "??!");
        }
        scanner.close();
    }
}
