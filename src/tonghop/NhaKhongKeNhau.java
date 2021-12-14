package tonghop;

import java.util.Scanner;

public class NhaKhongKeNhau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scn.nextInt();
            }
            System.out.println(qhd(a, n));
        }
    }

    private static int qhd(int[] a, int n) {
        int i, j;
        int f[] = new int[n];
        int kq = 0;
        f[0] = a[0];
        f[1] = Math.max(a[1], f[0]);
        for (i = 2; i < n; i++) {
            f[i] = Math.max(f[i - 2] + a[i], f[i - 1]);
        }
        return f[n - 1];
    }
}
