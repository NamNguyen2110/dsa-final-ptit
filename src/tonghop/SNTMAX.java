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
public class SNTMAX {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-->0){
            long n = scn.nextLong();
            long i = 2;
            long a = 0;
            long n2 = n;
            long m = (long) Math.sqrt(n);
            while(n>1){
                if(n%i==0){
                    n = n/i;
                    a = i;
                }
                else i++;               
                if(i>m){
                    break;
                }
            }
            if(n>1) a = n;
            System.out.println(a);
        }
    }
}
