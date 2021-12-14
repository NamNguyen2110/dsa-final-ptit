/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class BieuThucDung {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        while (t-- > 0) {
            String s = scan.nextLine();
            System.out.println(XuLy(s));
        }
    }
    
    public static int XuLy(String s) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == ']' && myStack.size() == 0) {
                myStack.push(c);
            } else if (c == ']') {
                if (myStack.size() > 0 && myStack.pop() == '[') {
                    myStack.pop();
                    
                } else  {
                    myStack.push(c);
                }
            }
        }
        
        int d1 = 0;
        int d2 = 0;
               
        while (myStack.size() > 0) {
            if (myStack.peek() == '[') {
                d1++;
            } else {
                d1++;
            }
            myStack.pop();
        }
        int RS = d1 / 2 + d2 / 2 + d1 % 2 + d2 % 2;
        
        return RS;
        
    }
    
}
