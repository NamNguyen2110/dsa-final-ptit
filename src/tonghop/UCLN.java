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
public class UCLN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        while(n-->0){
            long a = scn.nextLong();
            long b = scn.nextLong();
            System.out.println(BCNN(a, b)+" "+UCLN(a, b));
        }
    }
    
    private static long UCLN(long a,long b){
        while(a*b>0){
            if(a>b) a%=b;
            else b%=a;
        }
        return a+b;
    }
    
    private static long BCNN(long a,long b){
        return a/UCLN(a, b)*b;
    }
}
