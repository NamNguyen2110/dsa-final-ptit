package tonghop;

import java.util.Collections;
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
public class HopCua2DaySo {

    static Stack<Integer> stacks = new Stack<>();
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scn.nextInt();
        int m = scn.nextInt();
        addInt(n);
        addInt(m);
        Collections.sort(stacks);
        for(int i=0;i<stacks.size();i++){
            System.out.print(stacks.get(i)+" ");
        }
    }

    private static void addInt(int n) {
        for (int i = 0; i < n; i++) {
            int t = scn.nextInt();
            if(stacks.empty()) stacks.add(t);
            for (int j = 0; j < stacks.size(); j++) {
                if (t != stacks.get(j)) {
                    if (j == stacks.size() - 1) {
                        stacks.add(t);
                        break;
                    }
                    continue;
                } else {
                    break;
                }
            }
        }
    }
}
