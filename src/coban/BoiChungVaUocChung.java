package coban;

import java.util.Scanner;

public class BoiChungVaUocChung {
    private static final Scanner sc = new Scanner(System.in);

    public static long USCLN(long a, long b) {
        long temp1 = a;
        long temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        return temp1;
    }

    public static long BSCNN(long a, long b) {
        return (a * b) / USCLN(a, b);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(BSCNN(a, b)+" "+USCLN(a, b));
        }
    }
}
