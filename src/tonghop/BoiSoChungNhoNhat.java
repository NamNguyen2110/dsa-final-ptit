package tonghop;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KieuTrinh
 */
public class BoiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            BigInteger a = scn.nextBigInteger();
            BigInteger b = scn.nextBigInteger();
            System.out.println(a.multiply(b).divide(a.gcd(b)));
        }
    }
}
