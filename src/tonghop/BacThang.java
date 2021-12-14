package tonghop;

import java.util.Scanner;

public class BacThang {
    static int n, k;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            n = scn.nextInt();
            k = scn.nextInt();
            System.out.println(demCach(n, k));
        }
    }

    private static int demCach(int n, int k) {
        int mod = (int) 1e9 + 7;
        int f[] = new int[n + 1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, k); j++) {
                f[i] = (f[i] + f[i - j]) % mod;
            }
        }
        return f[n];
    }
}
