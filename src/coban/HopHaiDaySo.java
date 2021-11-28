package coban;

import java.util.*;

public class HopHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
            set.add(a1[i]);
        }
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
            set.add(a2[i]);
        }
        set.stream().sorted().forEach(s -> System.out.print((s + " ")));
    }
}
