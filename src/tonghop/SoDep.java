package tonghop;

import java.util.Arrays;
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
public class SoDep {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String s = scn.nextLine();
            if(checkSoDep(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean checkSoDep(String s) {
        int n = s.length() / 2;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i) || (s.charAt(i)-'0')%2!=0) {
                return false;
            }
        }
        return true;
    }
}
