package coban;

import java.math.BigInteger;
import java.util.Scanner;

public class Hieu2SoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        System.out.print(a1.subtract(b1));
    }
}
