package coban;

import java.util.Scanner;

public class XauNhiPhanKeTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            System.out.println(solution(n));
        }
    }

    private static String solution(String s) {
        char[] c = s.toCharArray();
        int i = c.length - 1;
        while (i >= 0 && c[i] == '1') {
            c[i] = '0';
            i--;
        }
        if (i >= 0) {
            c[i] = '1';
        }
        return new String(c);
    }
}
