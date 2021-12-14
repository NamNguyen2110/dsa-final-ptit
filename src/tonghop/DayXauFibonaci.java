package tonghop;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KieuTrinh
 */
public class DayXauFibonaci {

    static long F[] = new long[100];

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        Init();
        while (t-- > 0) {
            int n = scn.nextInt();
            long i = scn.nextLong();
            System.out.println(xauFibonaci(n, i));
        }
    }

    private static String xauFibonaci(int n, long i) {
        if (n == 1) {
            return "A";
        }
        if (n == 2) {
            return "B";
        }
        if (i <= F[n - 2]) {
            return xauFibonaci(n - 2, i);
        }
        return xauFibonaci(n - 1, i - F[n - 2]);
    }

    private static void Init() {
        F[1] = 1;
        F[2] = 1;
        for (int j = 3; j< 93; j++) {
            F[j] = F[j - 2] + F[j - 1];
        }
    }

}
