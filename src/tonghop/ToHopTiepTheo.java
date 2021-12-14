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
public class ToHopTiepTheo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-->0){
            int n = scn.nextInt();
            int k = scn.nextInt();
            int[] arr = new int[k];
            for(int i=0;i<k;i++){
                arr[i]=scn.nextInt();
            }
            
            System.out.println(nextToHop(n,k,arr));
        }
    }

    private static int nextToHop(int n, int k, int[] arr) {
        int count = 0;
        int[] brr = new int[k];
        for(int x=0;x<arr.length;x++){
            brr[x]=arr[x];
        }
        int i = arr.length-1;
        while( i>0 && arr[i-1] == n+i-k){
            i--;
        }
        if(i>0){
            arr[i-1]+=1;
            for(int j=i;j<arr.length;j++){
                arr[j]=arr[i-1]+j-i+1;
            }
//            for(int j=0;j<arr.length;j++){
//                System.out.print(arr[j]+" ");
//            }
//            sortASC(arr);
//            sortASC(brr);
            for(int x=0;x<arr.length;x++){
                for(int y=0;y<brr.length;y++){
                    if(brr[x]==arr[y]){
                        count++;
                        continue;
                    }
                }
            }
            return k-count;
        }
        else{
            count = k;
        }
        return count;
    }
    
    public static void sortASC(int [] arr) {
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}

