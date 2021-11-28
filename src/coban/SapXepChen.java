package coban;

import java.util.Scanner;

public class SapXepChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sapxep(a);
    }

    private static void sapxep(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            StringBuilder s = new StringBuilder();
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            s.append("Buoc ").append(i - 1).append(": ");
            s.append(arr[key]).append(" ");
            System.out.println(s.toString().trim());
        }
    }
}
