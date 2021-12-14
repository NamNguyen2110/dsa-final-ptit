package tonghop;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class DiChuyenTrongMeCung {
    static int n, a[][];
    static Vector<String> vt;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            n = scn.nextInt();
            a = new int[n][n];
            vt = new Vector<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scn.nextInt();
                }
            }
            quaylui(0, 0, "");
            if (vt.size() == 0 || a[0][0]==0) System.out.println(-1);
            else {
                for (int i = 0; i < vt.size(); i++) {
                    System.out.print(vt.get(i) + " ");
                }
                System.out.println();
            }
        }
    }

    private static void quaylui(int i, int j, String s) {
        if (i == n - 1 && j == n - 1 && a[i][j] == 1) vt.add(s);
        if (i < n - 1 && a[i + 1][j] == 1) quaylui(i + 1, j, s + "D");
        if (j < n - 1 && a[i][j + 1] == 1) quaylui(i, j + 1, s + "R");
    }

}
