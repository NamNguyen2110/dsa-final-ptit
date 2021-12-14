package tonghop;

import java.util.Collections;
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
public class TongNhoNhat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n = scn.nextInt();
            Stack<Integer> st = new Stack<>();
            for(int i=0;i<n;i++){
                int x = scn.nextInt();
                if(x!=0)st.push(x);
            }
            Collections.sort(st);
            long so1 =0;
            long so2=0;
            long tong=0;
            for(int i=0;i<st.size();i++){
                if(i%2==0)so1 = so1*10+st.get(i);
                else so2 = so2*10+st.get(i);
            }
            System.out.println(so1+so2);
        }
    }
}
