package tonghop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KieuTrinh
 */
public class RutGonXauKyTu {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        Vector<Character> vector = new Vector<>();
        for (int i = 0; i < s.length(); i++) {
            vector.add(s.charAt(i));
        }
       
        while (checkSize(vector)) {
            for (int i = 0; i < vector.size()-1; i++) {
                if (vector.get(i).equals(vector.get(i + 1))) {
                    vector.remove(i);
                    vector.remove(i);
                    break;
                }         
            }
            
        }
        
        if(vector.size()==0) System.out.println("Empty String");
        else{
            for(int i=0;i<vector.size();i++){
                System.out.print(vector.get(i));
            }
        }
    }
    
    private static boolean checkSize(Vector<Character> vector) {
        for (int i = 0; i < vector.size()-1; i++) {
            if(vector.get(i).equals(vector.get(i+1))) return true;
        }
        return false;
    }
}
