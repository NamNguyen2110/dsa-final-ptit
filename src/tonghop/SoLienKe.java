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
public class SoLienKe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-->0){
            String str = scn.nextLine();
            if(checkTP(str)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean checkTP(String str) {
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)-str.charAt(i+1) == -1 || str.charAt(i)-str.charAt(i+1) == 1) continue;
            else return false;
        }
        return true;
    }
}
