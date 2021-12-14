package tonghop;

import java.util.ArrayList;
import java.util.List;
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
public class XauNhiPhanKeTiep {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String s = scn.nextLine();
            String s2 = "";
            int n = s.length() - 1;
            while (n>=0 && s.charAt(n) == '1') {
                n--;  
                s2 = '0' + s2;
            }
            if (n >= 0) {
                s2 = '1' + s2;
                for (int i = n - 1; i >= 0; i--) {
                    s2 = s.charAt(i) + s2;
                }
                System.out.println(s2);
            }
            else{
                System.out.println(s2);
            }
            
        }
    }
}
