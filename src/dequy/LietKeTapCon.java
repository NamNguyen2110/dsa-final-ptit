package dequy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LietKeTapCon {
    static int n;
    static int[] b = new int[30];
    static String s;
    static ArrayList<String> kq;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t-- > 0) {
            b = new int[30];
            kq = new ArrayList<>();
            n = in.nextInt();
            s = in.next();

            quayLui(1);
            Collections.sort(kq);
            for (String s : kq) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    private static void quayLui(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n) {
                xuLy();
            } else quayLui(i + 1);
        }
    }

    private static void xuLy() {
        StringBuilder t = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (b[i] == 1) {
                t.append(s.charAt(i - 1));
            }
        }
        kq.add(t.toString());

    }
}
