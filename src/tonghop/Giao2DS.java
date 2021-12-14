package tonghop;

import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KieuTrinh
 */
public class Giao2DS {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "";
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[m];
        boolean[] Arr = new boolean[1001];
        boolean[] Brr = new boolean[1001];
//        for (int i = 0; i <= 1000; i++) {
//            Arr[i]=false;
//            Brr[i]=false;
//        }
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            Arr[arr[i]] = true;
        }
        for (int j = 0; j < m; j++) {
            brr[j] = scn.nextInt();
            Brr[brr[j]] = true;
        }

        for (int i = 0; i <= 1000; i++) {
            if (Arr[i] && Brr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
