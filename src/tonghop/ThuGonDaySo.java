package tonghop;

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
public class ThuGonDaySo {

    static boolean ok = true;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int t = scn.nextInt();
            st.push(t);
        }

        while (ok) {
            ok = false;
            for (int i = 0; i < st.size() - 1; i++) {
                if ((st.get(i) + st.get(i + 1))%2==0) {
                    int x = i;
                    ok = true;
                    st.remove(i);
                    st.remove(i);
                    i=x;
                }
            }
            //1 5 5 8 6 4 3 9 5 3


        }
        System.out.println(st.size());
    }
}
