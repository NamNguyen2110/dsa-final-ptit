package coban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SapXepChenLietKeNguoc {
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
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
                StringBuilder s = new StringBuilder();
                s.append("Buoc ").append(i + 1).append(": ");
                for (int value : a) {
                    s.append(value).append(" ");
                }
                list.add(s.toString().trim());
            }
        }
        Collections.reverse(list);
        list.forEach(System.out::println);
    }
}
