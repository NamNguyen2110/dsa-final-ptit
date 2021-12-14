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
public class ChuSo4vaSo7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '4'||str.charAt(i)=='7') {
                count++;
            }
        }
        
        if(count == 4 || count == 7){
            System.out.println("YES");
        }
        else System.out.println("NO");
        
    }

}
