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
public class TongCacChuSo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-->0){
            String s = scn.nextLine();
            long tong = 0;
            String s2="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9') tong += s.charAt(i)-'0';
                else s2 = s2+s.charAt(i);
            }
            char[] chars = s2.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            System.out.println(sorted+""+tong);
        }
    }
}
