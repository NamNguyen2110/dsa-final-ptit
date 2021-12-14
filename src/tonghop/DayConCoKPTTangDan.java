package tonghop;

import java.util.Arrays;
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
public class DayConCoKPTTangDan {

    static int a[], b[], n, k;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {

            n = scn.nextInt();
            k = scn.nextInt();
            a = new int[n + 1];
            b = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = scn.nextInt();
            }
            Arrays.sort(a);
            quaylui(1);
        }
    }

    private static void quaylui(int i) {
        for (int j = b[i-1]+1; j<=n-k+i; j++) {
            b[i] = j;
            if (i == k) {
                in();
            } else {
                quaylui(i + 1);
            }
        }
    }

    private static void in() {
        for (int j = 1; j <= k; j++) {
            System.out.print(a[b[j]]+" ");
        }
        System.out.println("");
    }
}


//1 2 3 4

