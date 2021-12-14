package tonghop;

import java.util.Arrays;
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
public class ToHopCoTongSoX {

    
    static int n;
    static long s;
    static int a[];
    static Stack<Integer> vector= new Stack<>();
    static boolean ok = true;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            ok = true;
            n = scn.nextInt();
            s = scn.nextLong();
            a= new int[n];
            vector.clear();
            for(int i=0;i<n;i++){
                a[i] = scn.nextInt();
            }
            Arrays.sort(a);
            quaylui(1,0,vector);
            if(ok) System.out.print(-1);
            System.out.println();
        }
    }
    
    private static void quaylui(int i,long tong,Stack<Integer> v) {
        if(tong>s) return;
        if(tong==s){
            ok = false;
            System.out.print("[");
            for(int k=0;k<v.size()-1;k++) {
                System.out.print(v.get(k) + " ");
            }
            System.out.print(v.get(v.size() - 1) + "]");
            return;
        }
        for(int j=i;j<=n;j++){
            if(tong+a[j-1]<=s){
                v.push(a[j-1]);
                quaylui(j,tong+a[j-1],v);
                v.pop();
            }
        }
    }
}
