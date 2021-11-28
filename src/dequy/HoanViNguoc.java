package dequy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HoanViNguoc {
    static int n, a[];
    static boolean b[];

    static ArrayList<String> list;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            n = in.nextInt();
            b = new boolean[n];
            a = new int[11];
            list = new ArrayList<>();
            hoanVi(0);

            Collections.reverse(list);
            for (String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    public static void hoanVi(int k) {
        for (int j = 0; j < n; j++) {
            if (!b[j]) {
                a[k] = j + 1;
                b[j] = true;
                if (k == n - 1) result();
                else hoanVi(k + 1);
                b[j] = false;
            }

        }
    }

    private static void result() {
        String t = "";
        for (int i = 0; i < n; i++) {
            t += a[i];
        }
        list.add(t);

    }


}
