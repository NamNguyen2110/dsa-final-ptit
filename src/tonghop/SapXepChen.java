package tonghop;

import java.util.ArrayList;
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
public class SapXepChen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        sapxep(arr, n);
    }
    private static void sapxep(int a[],int n){
        System.out.println("Buoc 0: "+a[0]);
        for(int i=1;i<n;i++){
            int j = i-1;
            int t = a[i];
            while(j>=0 && t<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=t;
            System.out.print("Buoc "+i+": ");
            for(int k=0;k<=i;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
        }
    }
}
