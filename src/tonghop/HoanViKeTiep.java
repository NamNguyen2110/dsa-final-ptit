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
public class HoanViKeTiep {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            HVKT(n-1, arr);
            System.out.println("");
        }
        
    }
    
    private static void HVKT(int n,int arr[]){
        while(n>0 && arr[n-1]>arr[n]){
            n--;
        }
        
        if(n>0){
            int m = arr.length-1;
            while(arr[n-1] > arr[m]){
                m--;
            }
            int t = arr[n-1];
            arr[n-1] = arr[m];
            arr[m]=t;
            
            sort(arr,n,arr.length-1);
        }
        else{
            for(int i=0;i<arr.length;i++){
                arr[i]=i+1;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void sort(int[] arr, int n, int i) {
        for(int k=n;k<=i-1;k++){
            for(int j=k+1;j<=i;j++){
                if(arr[k]>arr[j]){
                    int t = arr[k];
                    arr[k] = arr[j];
                    arr[j]=t;
                }
            }
        }
    }
}


//1 2 5 4 3
//1 3 2 4 5
