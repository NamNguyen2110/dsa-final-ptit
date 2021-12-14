package tonghop;

import java.util.Scanner;

public class DayConTang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scn.nextInt();
        }
        System.out.println(qhd(a,n));
    }

    private static int qhd(int[] a, int n) {
        int i,j;
        int f[] = new int[n];
        int kq=0;
        f[0]=1;
        for(i=1;i<n;i++){
            f[i]=1;
            for(j=0;j<i;j++){
                if(a[i]>a[j]) f[i] = Math.max(f[j]+1,f[i]);
            }
            kq = Math.max(kq,f[i]);
        }
        return kq;
    }
}
