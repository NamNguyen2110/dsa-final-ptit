package tonghop;

import java.util.Scanner;
import java.util.Vector;

public class SapXepNoiBotNgc {
    static int n, a[];
    static int count;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            count=1;
            n = scn.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scn.nextInt();
            }
            sapxep(n, a);
        }
    }

    private static void sapxep(int n, int[] a) {
        Vector<String> vt = new Vector<>();
        while (true) {
            boolean ok = true;
            String tmp = "";
            for (int i = 0; i < n - 1; i++) {

                if (a[i] > a[i + 1]) {
                    ok = false;
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }

            }
            if(ok) break;
            tmp = "Buoc " + count + ": ";
            for (int k = 0; k < n; k++) {
                tmp += a[k] + " ";
            }
            count++;
            vt.add(tmp);
        }
        for (int k = vt.size() - 1; k >= 0; k--) {
            System.out.println(vt.get(k));
        }
    }
}
