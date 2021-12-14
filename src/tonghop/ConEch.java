package tonghop;

import java.util.Scanner;

public class ConEch {
    public static void main(String[] args) {
        long[] f = new long[55];
        f[1] = 1;f[2]=2;f[3]=4;
        for(int i=4;i<=50;i++){
            f[i] = f[i-1]+f[i-2]+f[i-3];
        }
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0){
            int n = scn.nextInt();
            System.out.println(f[n]);
        }
    }
}
