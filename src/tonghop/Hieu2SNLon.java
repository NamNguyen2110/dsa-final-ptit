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
public class Hieu2SNLon {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BigInteger a = scn.nextBigInteger();
        BigInteger b = scn.nextBigInteger();
        System.out.println(a.add(b));
    }
}
