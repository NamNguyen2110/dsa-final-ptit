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
public class DaoTu {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());

        while (t-- > 0) {
            String str = scn.nextLine();
            String[] arr = str.trim().split("\\s+");
            Stack<String> stacks = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                String s = "";
                for (int j = arr[i].length() - 1; j >= 0; j--) {
                    s += arr[i].charAt(j);

                }
                stacks.push(s);
            }
            for(int i=0;i<stacks.size();i++){
                System.out.print(stacks.get(i)+" ");
            }
            System.out.println("");
        }
        
        
    }
}
