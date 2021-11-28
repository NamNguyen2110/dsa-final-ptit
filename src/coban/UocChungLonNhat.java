package coban;

import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public class UocChungLonNhat {
    public static final Scanner sc = new Scanner(System.in);

    public static BigInteger USCLN(BigInteger a, BigInteger b) {
        return a.gcd(b);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
//        System.out.println(USCLN(new BigInteger("1221"), new BigInteger("1234567891011121314151617181920212223242526272829")));
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(USCLN(a, b));
        }
    }
}
