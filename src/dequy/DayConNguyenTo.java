package dequy;

import java.util.Arrays;
import java.util.Scanner;

public class DayConNguyenTo {
    private static int[] b = new int[30];
    private static int n = 0;
    private static int[] a = new int[20];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            b = new int[20];
            a = new int[20];
            n = in.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
            }
            Arrays.sort(x);
            for (int i = 1; i <= n; i++) {
                a[i] = x[n - 1];
            }
        }
        quaylui(1);
    }

    private static void quaylui(int i) {
        for (int j = 0; j < 1; j++) {

        }
    }
}
