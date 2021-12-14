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
public class SoNPTu1ToiN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        
        while(t-->0){
            int n = scn.nextInt();
            for(int i=1;i<=n;i++){
                System.out.print(NP(i)+" ");
            }
            System.out.println("");
        }
    }

    private static String NP(int i) {
        String str ="";
        while(i>0){
            if(i%2==0) str = '0'+str;
            else str = '1'+str;
            i/=2;
        }
        return str;
    }
    
}
