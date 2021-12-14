package tonghop;

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
public class ChuanHoaHoTen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while (t-- > 0) {
            String s = scn.nextLine();
            String[] words = s.split("\\s+");
            String s2="";
            System.out.println(words[1]);
            for(String w : words){
                for(int i=0;i<w.length();i++){
                    if(i==0) s2 += w.toUpperCase().charAt(i);
                    else s2+=w.toLowerCase().charAt(i);
                }
                s2+=" ";
            }
            System.out.println(s2);
        }
    }
}
