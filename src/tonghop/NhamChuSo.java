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
public class NhamChuSo {
    private static long sumMin,sumMax;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long a = scn.nextLong();
        long b = scn.nextLong();
        TongAB(a,b);
        System.out.println(sumMin+" "+sumMax);
    }

    private static void TongAB(long a, long b) {
        sumMin = a+b;
        sumMax = a+b;
        int dem=0;
        while(a>0 || b>0){
            if(a%10==6){
                sumMin -= (long) Math.pow(10, dem);
            }
            if(a%10==5){
                sumMax += (long) Math.pow(10, dem);
            }
            if(b%10==6){
                sumMin -= (long) Math.pow(10, dem);
            }
            if(b%10==5){
                sumMax += (long) Math.pow(10, dem);
            }
            a/=10;
            b/=10;
            dem++;
        }
    }
}
