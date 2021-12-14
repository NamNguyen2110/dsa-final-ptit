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
public class HoanViNguoc {

    
    static boolean ok = true;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            ok = true;
            int n = scn.nextInt();
            int[] arr = new int[n];
            iNit(n,arr);
            while(ok){
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
                System.out.print(" ");
                nextHV(n, arr);
            }
            System.out.println("");
        }
    }

    private static void iNit(int n,int a[]) {
        for(int i=0;i<n;i++){
            a[i] = n-i;
        }
    }
    
    private static void nextHV(int n,int arr[]){
        while(n>=2 && arr[n-2]<arr[n-1]){
            n--;
        }
        
        if(n>=2){
            int m = arr.length-1;
            while(arr[n-2] < arr[m]){
                m--;
            }
            int t = arr[n-2];
            arr[n-2] = arr[m];
            arr[m]=t;
            
            sort(arr,n-1,arr.length-1);
        }
        else{
            ok = false;
        }
        
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
    }
    private static void sort(int[] arr, int n, int i) {
        for(int k=n;k<=i-1;k++){
            for(int j=k+1;j<=i;j++){
                if(arr[k]<arr[j]){
                    int t = arr[k];
                    arr[k] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}


