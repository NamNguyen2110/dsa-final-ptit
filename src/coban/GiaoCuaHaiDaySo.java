package coban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int k : a1) {
            for (int i : a2) {
                if (k == i) {
                    list.add(k);
                }
            }
        }
        Collections.sort(list);
        StringBuilder s = new StringBuilder();
        for (Integer s1 : list) {
            s.append(s1).append(" ");
        }
        System.out.print(s.toString().trim());

    }
}
