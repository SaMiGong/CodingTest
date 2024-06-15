package Baekjoon.B;

import java.util.Scanner;

public class BeakJoon6 {
    public static void main(String[] args) {
        /*
        KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는
        인공지능 오븐을 개발하려고 한다. 인공지능 오븐을 사용하는 방법은
        적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다.
        그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
        또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이
        요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
        훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때,
        오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
        */
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int t = scanner.nextInt();

        while (true) {
            if (m + t >= 60) { // 60이상이면 들어가기
                h += 1; // 60이상이니까 1시간 추가
                t -= 60; // 1시간 추가했으니 t에서 60감소
                if (h > 23) { // 만약 h가 24가 될 시 -24함으로써 0으로 만들어준다
                    h -= 24;
                }
            } else {
                m += t;
                break;
            }
        }
//        if (h < 0 || h > 23) {
//            System.out.println("에러");
//        }
//        if (0 < m || m > 59) {
//            System.out.println("에러");
//        }
//        if (t < 0 || t > 1000) {
//            System.out.println("에러");
//        }
        System.out.println(h + ":" + m);
    }
}
