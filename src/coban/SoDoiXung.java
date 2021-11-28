package coban;

import java.util.Scanner;

public class SoDoiXung {
    public static final Scanner sc = new Scanner(System.in);

    public static int[] addMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int solution(int[] a) {
        int check = 1;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - i - 1]) {
                check = 0;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = addMang(n);
            if (solution(arr) == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
