package tonghop;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KieuTrinh
 */
public class test {
    static int n,k;
    static int[] a,b;
    static Stack<String> st;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Vector<Vector<Integer>> vt = new Vector<>();
             st = new Stack<String>();
            n = sc.nextInt(); k = sc.nextInt();
            a = new int[n+1];
            b = new int[n+1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            
            quaylui(1);
            Collections.sort(st);
            for(int i=0;i<st.size();i++){
                for(int j=0;j<st.get(i).length();j++){
                    System.out.print(st.get(i).charAt(j)+" ");
                }
                System.out.println("");
            }
        }
    }

    private static void quaylui(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if(i == n){
                xuli();
            } else{
                quaylui(i+1);
            }
        }
    }

    private static void xuli() {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(b[i] == 1){
                count++;
            }
        }
        if(count == k){
            String tmp="";
            for (int i = 1; i <= n; i++) {
                if(b[i] == 1){
                    tmp+=a[i];
                }
            }
            st.push(tmp);
        }
    }
}

