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
public class KiemTraBieuThuc {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        while (t-- > 0) {
            String s = scan.nextLine();
            Xuly(s);
        }

    }

    public static void Xuly(String s) {
        Stack<Character> myStack = new Stack<>();
        boolean check = false ;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ')') {
                myStack.push(c);
            } else {
                    check = true;
                char test = myStack.peek();

                myStack.pop();

                while (test != '(') {
                    if (test == '+' || test == '-' || test == '*' || test == '/') 
                        check =  false;
                        test = myStack.peek();
                        myStack.pop();
                        
                    
                }
                    if(check) break;
            }
            
            
        }
          if(check == true ){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

       
    }

}
