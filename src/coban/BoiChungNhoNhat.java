package coban;

import java.math.BigInteger;
import java.util.Scanner;

public class BoiChungNhoNhat {
    public static BigInteger BCNN(BigInteger number1, BigInteger number2) {
        BigInteger gcd = number1.gcd(number2);
        BigInteger absProduct = number1.multiply(number2).abs();
        return absProduct.divide(gcd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
//        System.out.println(USCLN(new BigInteger("1221"), new BigInteger("1234567891011121314151617181920212223242526272829")));
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(BCNN(a, b));
        }
    }
}
