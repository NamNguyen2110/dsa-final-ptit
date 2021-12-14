package tonghop;

import java.util.*;

public class PhanTichSo {
    static int n;
    static int[] a;
    static Stack<String> str;
    static Stack<Integer> st;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            n = scn.nextInt();
            a = new int[n];
            st = new Stack<>();
            str = new Stack<>();
            for (int i = 0; i < n; i++) {
                a[i] = i + 1;
            }
            Arrays.sort(a);
            quaylui(1, 0);
            str.sort(Comparator.reverseOrder());
            if (n == 10) {
                System.out.print(str.get(str.size() - 2));
                for (int i = 0; i < str.size(); i++) {
                    if (i != str.size() - 2) System.out.print(str.get(i));
                }
            } else {
                for (int i = 0; i < str.size(); i++) {
                    System.out.print(str.get(i));
                }
            }
            System.out.println();
        }
    }

    private static void quaylui(int i, long tong) {
        if (tong > n) return;
        if (tong == n) {
            String tmp = "(";
            for (int k = st.size() - 1; k > 0; k--) {
                tmp += st.get(k) + " ";
            }
            tmp += st.get(0) + ") ";
            str.push(tmp);
            return;
        }
        for (int j = i; j <= n; j++) {
            if (tong + a[j - 1] <= n) {
                st.push(a[j - 1]);
                quaylui(j, tong + a[j - 1]);
                st.pop();
            }
        }
    }
}
