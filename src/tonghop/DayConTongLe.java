package tonghop;

import java.util.Arrays;
import java.util.Collections;
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
public class DayConTongLe {

    static int a[], b[], n;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            a = new int[20];
            b = new int[20];
            n = scn.nextInt();
            int x[] = new int[n];
            for(int i=0;i<n;i++){
                x[i] = scn.nextInt();
            }
            Arrays.sort(x);
            for(int i=1;i<=n;i++) a[i] = x[n-i];
            quaylui(1);
        }
    }

    private static void quaylui(int i) {
        for(int j=0;j<=1;j++){
            b[i] = j;
            if(i==n) xuly();
            else quaylui(i+1);
        }
    }

    private static void xuly() {
        int tong=0,i;
        for(i = 1;i<=n;i++)tong+=a[i]*b[i];
        if(tong%2==1){
            for(i=1;i<=n;i++){
                if(b[i]==1) System.out.print(a[i]+" ");
            }
            System.out.println("");
        }
    }
}
