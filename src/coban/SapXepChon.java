package coban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SapXepChon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sapxep(a);
    }

    private static void sapxep(int[] a) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            int m = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[m]) {
                    m = j;
                }
            }
            int temp = a[m];
            a[m] = a[i];
            a[i] = temp;
            StringBuilder builder = new StringBuilder();
            builder.append("Buoc ").append(i + 1).append(": ");
            for (int k : a) {
                builder.append(k).append(" ");
            }
            list.add(builder.toString().trim());
        }
        Collections.reverse(list);
        list.forEach(System.out::println);
    }
}
