package coban;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HoanViKeTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int i = a.length - 1;
            if (a[i] > a[i - 1]) {
                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
            }
            StringBuilder s = new StringBuilder();
            for (int j = a.length - 1; j > 0; j--) {
                if (a[i] > a[i - 1]) {
                    for (int a1 : a) {
                        s.append(a1).append(" ");
                    }
                } else {
                    Collections.reverse(Arrays.stream(a).boxed().collect(Collectors.toList()));
                    for (int a1 : a) {
                        s.append(a1).append(" ");
                    }
                }
            }
            System.out.println(s.toString().trim());

        }
    }
}
