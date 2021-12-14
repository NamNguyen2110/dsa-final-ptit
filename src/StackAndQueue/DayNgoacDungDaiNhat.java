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
public class DayNgoacDungDaiNhat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        while (t-- > 0) {
            String s = scan.nextLine();
           
                System.out.println(DayNgoac(s));
            
        }

    }

    public static int DayNgoac(String s) {
        int t = -1 ; 
        int res = 0 ;
        Stack<Integer> myStack = new Stack<>();
        myStack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
           if(c == '('){
               myStack.push(i);
           }else{
               myStack.pop();
               if(myStack.size() > 0){
                   res = Math.max(res, i-myStack.peek());
               }if(myStack.size()==0){
                   myStack.push(i);
               }
           }

        }
       return res;
    }

}
