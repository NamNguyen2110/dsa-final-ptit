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
public class SoFiboThuN {

    static long m = 1000000007;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            long n = scn.nextLong();
            System.out.println(fib(n) % m);
        }
    }

    static long fib(long n) {
        long F[][] = new long[][]{{1, 1}, {1, 0}};
        if (n == 0) {
            return 0;
        }
        power(F, n - 1);

        return F[0][0] % m;
    }

    static void multiply(long F[][], long M[][]) {
        long x = (F[0][0] * M[0][0] % m + F[0][1] * M[1][0] % m) % m;
        long y = (F[0][0] * M[0][1] % m + F[0][1] * M[1][1] % m) % m;
        long z = (F[1][0] * M[0][0] % m + F[1][1] * M[1][0] % m) % m;
        long w = (F[1][0] * M[0][1] % m + F[1][1] * M[1][1] % m) % m;

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }

    static void power(long F[][], long n) {
        if (n == 0 || n == 1) {
            return;
        }
        long M[][] = new long[][]{{1, 1}, {1, 0}};

        power(F, n / 2);
        multiply(F, F);

        if (n % 2 != 0) {
            multiply(F, M);
        }
    }
}
