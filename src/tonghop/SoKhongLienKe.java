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
public class SoKhongLienKe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            long n = scn.nextLong();
            if(mod10(n)&&two2(n)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    
    private static boolean mod10(long n){
        int tong=0;
        while(n>0){
            tong+=n%10;
            n/=10;
        }
        return tong%10==0;
    }
    
    private static boolean two2(long n){
        int tong=0;
        int t=(int) (n%10+2);
        while(n>0){
            int x = (int) (n%10);
            if(Math.abs(t-x)==2){
                t = (int) (n%10);
                n/=10;
            }
            else return false;
        }
        return true;
    }
}
