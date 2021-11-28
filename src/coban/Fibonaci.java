package coban;

import java.util.Scanner;

public class Fibonaci {
    private static final Scanner sc = new Scanner(System.in);

    public static long[] fib(int n) {
        long[] f = new long[100];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(fib(n)[n]);
        }
    }
}
