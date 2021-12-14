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
public class SoFibonci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-->0){
            int n = scn.nextInt();
            System.out.println(Fibonaci(n));
        }
    }

    private static long Fibonaci(int n) {
        if(n<3) return 1;
        long F1 = 1;
        long F2 = 1;
        long F3 = 0;
        for(int i=3;i<=n;i++){
            F3=F1+F2;
            F1=F2;
            F2=F3;
        }
        return F3;
    }
}
