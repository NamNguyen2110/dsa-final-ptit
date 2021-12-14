package tonghop;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;
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
public class DiaChiEmail {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        
        List<String> email = new ArrayList<String>();
        while (t-- > 0) {
            int count=0;
            String s = scn.nextLine();
            String[] words = s.trim().split("\\s+");
            String s2 = "";
            s2+=words[words.length-1].toLowerCase();
            for (int w = 0; w < words.length - 1; w++) {
                s2+=words[w].toLowerCase().charAt(0);
            }
            email.add(s2);
            for(int i=0;i<email.size();i++){ 
                if(s2.equals(email.get(i))){
                    count++;
                }
            }
            if(count!=1) s2+=count;     
            System.out.println(s2 + "@ptit.edu.vn");
        }
    }

}
