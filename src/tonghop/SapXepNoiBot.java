package tonghop;

import java.util.Scanner;

public class SapXepNoiBot {
    static int n, a[];
    static int count = 1;

    public static void main(String[] args) {
        boolean ok = true;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        while (true) {
            ok = true;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    ok = false;
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }
            }
            if(ok) break;
            System.out.print("Buoc "+count+": ");
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            count++;
            System.out.println();

        }
    }
}
