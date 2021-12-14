/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndQueue;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class PhanTuBenPhai {
    public static void main(String[] args) {
        Xuly();
    }
    
    
    public static void Xuly(){
        
        int a [] = {4,5,2,25};
        ArrayList<Integer> listB = new ArrayList<>();
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j <a.length; j++) {
                if(a[i] < a[j])
                    myStack.push(a[j]);
                
                System.out.println(myStack.peek());
                while (myStack.size()!=0) {                    
                    myStack.pop();
                }
                    
            }
                  
        }
       
        
    }
}
