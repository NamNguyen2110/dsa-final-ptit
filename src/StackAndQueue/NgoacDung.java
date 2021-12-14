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
public class NgoacDung {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        while (t-- > 0) {
            String s = scan.nextLine();
            if (kiemTra(s) == true) {

                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean kiemTra(String s) {
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                myStack.push(c);
            } else {
                if (myStack.isEmpty()) {
                    return false;
                }
                char checkPeek = myStack.peek();
                if ((c == '}' && checkPeek == '{') || (c == ')' && checkPeek == '(') || (c == ']' && checkPeek == '[')) {
                    myStack.pop();
                } else {
                    return false;
                }
            }

        }

        return myStack.isEmpty();
    }

}
