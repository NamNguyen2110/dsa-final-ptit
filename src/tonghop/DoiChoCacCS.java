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
public class DoiChoCacCS {
    static String s;
    static int k;
    static String max;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();
        while(t-->0){
            k = scn.nextInt();
            s = scn.next();
            max = s;
            timSoMAX(s.toCharArray(), k);
            System.out.println(max);
        }
    }
    
    private static void timSoMAX(char[] str,int k){
        if(k==0) return;
        int n = str.length;
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(str[i]<str[j]){
                    char c = str[i];
                    str[i] = str[j];
                    str[j] = c;
                    if(max.compareTo(String.valueOf(str))<0) max = String.valueOf(str);
                    timSoMAX(str, k-1);
                    char c2 = str[i];
                    str[i] = str[j];
                    str[j]=c2;
                }
            }
        }
    }

}
