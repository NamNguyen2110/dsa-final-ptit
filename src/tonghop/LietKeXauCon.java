package tonghop;

import java.util.ArrayList;
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
public class LietKeXauCon {

    static int b[], n;
    static String s;
    static ArrayList<String> kq;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {

            n = Integer.parseInt(scn.nextLine());
            s = scn.nextLine();
            b = new int[20];
            kq = new ArrayList<>();
            quaylui(1);
            Collections.sort(kq);
            for (String s : kq) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }

    private static void quaylui(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n) {
                xuly();
            } else {
                quaylui(i + 1);
            }
        }
    }

    private static void xuly() {
        String temp = "";
        for (int j = 1; j <= n; j++) {
            if (b[j] == 1) {
                temp += s.charAt(j-1);
            }
        }
        kq.add(temp);
    }
}
