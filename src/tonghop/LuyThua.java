package tonghop;

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
public class LuyThua {

    private static final long M = 1000000007;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            long n = scn.nextLong();
            long k = scn.nextLong();
            long result = 1;
            while (k > 0) {
                if (k % 2 == 1) {
                    result = result * n % M;
                }
                k = k / 2;
                n =((n*n)%M);
            }
            
            System.out.println(result);
        }
    }
}
