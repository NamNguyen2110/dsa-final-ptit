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
public class GapDoiDaySo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-->0){
            int n = scn.nextInt();
            long k = scn.nextLong();
            System.out.println(search(n, k));
        }
    }
    
    
    private static int search(int n,long k){
        if(n==1) return 1;
        if(k == (long)Math.pow(2, n-1)) return n;
        if(k < (long)Math.pow(2.0,n-1)) return search(n-1, k);
        return search(n-1,  (k-(long)Math.pow(2, n-1)));
    }
}