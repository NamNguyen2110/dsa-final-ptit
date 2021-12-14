package tonghop;

import java.util.Arrays;
import java.util.Scanner;

public class DayConCoTongSoNT {
    static int n,a[],b[],x[];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0){
            n = scn.nextInt();
            a = new int[n+1];
            b = new int[n+1];
            x = new int[n];
            for(int i=0;i<n;i++){
                x[i] = scn.nextInt();
            }
            Arrays.sort(x);
            for(int i=1;i<=n;i++){
                a[i]=x[n-i];
            }
            quaylui(1);
        }
    }

    private static void quaylui(int i) {
        for(int j=0;j<=1;j++){
            b[i]=j;
            if(i==n) xuly();
            else quaylui(i+1);
        }
    }

    private static void xuly() {
        int tong=0;
        for(int j=1;j<=n;j++){
            tong+=a[j]*b[j];

        }
        if(checkSNT(tong)){
            for(int k=1;k<=n;k++)if(b[k]==1) System.out.print(a[k]+" ");
            System.out.println();
        }
    }
    static private boolean checkSNT(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
