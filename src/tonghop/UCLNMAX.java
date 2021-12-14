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
public class UCLNMAX {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        while(n-->0){
            long a = Long.parseLong(scn.nextLine());
            String b = scn.nextLine();
            System.out.println(UCLN(a, reduceValue(a, b)));
        }
    }
    private static long UCLN(long a,long b){
        while(a*b>0){
            if(a>b) a%=b;
            else b%=a;
        }
        return a+b;
    }
    private static long reduceValue(long a,String b){
        long mod = 0;
        for(int i=0;i<b.length();i++){
            mod = (mod*10 + b.charAt(i) - '0')%a;
        }
        return mod;
    }

}
