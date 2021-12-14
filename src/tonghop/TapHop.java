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
public class TapHop {
    static int n,k,s,a[];
    static int count;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            count = 0;
            n = scn.nextInt();
            k = scn.nextInt();
            s = scn.nextInt();
            a = new int[30];

            if (n == 0 && k == 0 && s == 0) {
                break;
            }
            System.out.println(quaylui(1));
            //quaylui(1);
        }
    }

    private static int quaylui(int i) {

        for(int j=a[i-1]+1;j<=n-k+i;j++){
            a[i]=j;
            if(i==k){
                int tong = 0;
                for(int q = 1;q<=k;q++){
                    tong+=a[q];
                    
                }
                if(tong==s) count++;
            }
            else quaylui(i+1);
        }
        return count;
    }
}
