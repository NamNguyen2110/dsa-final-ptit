package tonghop;

import java.util.Scanner;

public class ToHopCNK {
    static int c[][];

    public static void main(String[] args) {
        c = new int[1005][1005];
        Scanner scn = new Scanner(System.in);

        int mod = (int) 1e9 + 7;
        for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) c[i][j] = 1;
                else c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]) % mod;
            }
        }
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            System.out.println(c[n][k]);
        }
    }
}
