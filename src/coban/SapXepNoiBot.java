package coban;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SapXepNoiBot {
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
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int k : a) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
