package tonghop;

import static java.lang.Math.pow;
import java.util.Collections;
import java.util.Scanner;
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
public class SoKhoiLapPhuong {

    static int n,k,a[];
    static Vector<Long> vector;
    static String str;
    static long tong;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            vector = new Vector<>();
            str = scn.nextLine();
            n = str.length();
            k = 0;
            a = new int[n + 1];
            quaylui(1);
            Collections.sort(vector);
            if(vector.size()!=0) System.out.println(vector.get(vector.size()-1));
            else System.out.println(-1);
        }
    }

    private static boolean checkLP(long n) {
        if(n ==0) return false;
        long t = (long) Math.round(pow(n, 1.0 / 3));
        if (n == pow(t, 3)) {
            return true;
        }
        return false;
    }

    private static void quaylui(int i) {
        for(int j=0;j<=1;j++){
            a[i] = j;
            if(i==n){
                tong=0;
                for(int k=1;k<=n;k++){
                    if(a[k]==1) tong=10*tong+ str.charAt(k-1)-'0';
                }
                if(checkLP(tong)) vector.add(tong);
            }
            else quaylui(i+1);
        }
    }
}
