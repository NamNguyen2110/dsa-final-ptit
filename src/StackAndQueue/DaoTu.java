/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class DaoTu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        while(t-->0){
            String s =scan.nextLine();
            System.out.println(DaoTU(s));
        }
    }

    public static String DaoTU(String s) {
        Stack<Character> myStack = new Stack<>();
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                myStack.push(c);
            }
         
            while(!myStack.isEmpty()){
                sb.append(myStack.pop());
            }
            sb.append(" ");
        }
        

        return sb.toString();
    }

}
