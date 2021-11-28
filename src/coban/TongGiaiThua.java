package coban;

import java.util.Scanner;

public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long k = 0;
        for (int i = 1; i <= a; i++) {
            k += giaiThua(i);
        }
        System.out.print(k);

    }

    public static long giaiThua(int a) {
        if (a == 1) return 1;
        if (a == 0) return 0;
        return (a * giaiThua(a - 1));
    }
}
