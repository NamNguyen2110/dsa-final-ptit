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
public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long tong = 0;
        for(int i=1;i<=n;i++){
            tong+=giaiThua(i);
        }
        System.out.println(tong);
    }

    private static long giaiThua(int n) {
        if(n==1) return 1;
        return n*giaiThua(n-1);
    }
}
