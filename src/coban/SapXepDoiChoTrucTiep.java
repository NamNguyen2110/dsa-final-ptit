package coban;

import java.util.*;

public class SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            sapxep(a);
        }
    }

    private static void sapxep(int[] a) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
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
