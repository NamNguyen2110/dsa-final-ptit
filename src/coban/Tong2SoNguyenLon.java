package coban;

import java.math.BigInteger;
import java.util.Scanner;

public class Tong2SoNguyenLon {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.add(b));
    }
}
