package tonghop;

import java.util.Arrays;
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
public class LietKeTapCon {
    static char c[];
    static int b[];
    static int n;
    static Vector<String> vt;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            n = Integer.parseInt(scn.nextLine());
            c = scn.nextLine().toCharArray();
            b = new int[c.length+1];
            vt = new Vector<>();
            quaylui(1);
            Collections.sort(vt);
            for(int i=0;i<vt.size();i++){
                System.out.print(vt.get(i)+" ");
            }
            System.out.println();
        }
    }

    private static void quaylui(int i) {
        for(int j=0;j<=1;j++){
            b[i]= j;
            if(i==n) xuly();
            else quaylui(i+1);
        }
    }

    private static void xuly() {
        String tmp ="";
        for(int k=1;k<=n;k++){
            if(b[k]==1) tmp+=c[k-1];
        }
        vt.add(tmp);
    }
}
