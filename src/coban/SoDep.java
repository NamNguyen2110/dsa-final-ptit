package coban;

import java.util.Scanner;

public class SoDep {
    private static final Scanner sc = new Scanner(System.in);

    public static boolean reverse(String a) {
        StringBuilder s = new StringBuilder(a);
        return s.reverse().toString().equals(a);
    }

    public static boolean beautifulNumber(String a) {
        char[] b = a.toCharArray();
        for (char c : b) {
            if (c % 2 == 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            if (reverse(a) && beautifulNumber(a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
