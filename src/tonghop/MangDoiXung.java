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
public class MangDoiXung {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-->0){
            long n = scn.nextLong();
            long a[] = new long[Integer.parseInt(String.valueOf(n))];
            for(int i=0;i<n;i++){
                a[i] = scn.nextLong();
            }
            
            if(checkDoiXung(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    private static boolean checkDoiXung(long a[]){
        if(a.length == 1) return true;
        for(int i=0;i<a.length/2;i++){
            if(a[i]!=a[a.length-1-i])return false;
        }
        return true;
    }
}
