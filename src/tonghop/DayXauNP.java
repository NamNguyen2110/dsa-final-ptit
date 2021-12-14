package tonghop;

import java.util.Scanner;

public class DayXauNP {
    static int n;
    static long k;
    static long a[] = new long[100];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        INit();
        while(t-->0){
            n = scn.nextInt();
            k = scn.nextLong();
            System.out.println(dequi(n,k));
        }
    }

    private static int dequi(int n, long k) {
        if(n==1) return 0;
        if(n==2) return 1;
        if(k<=a[n-2]) return dequi(n-2,k);
        return dequi(n-1,k-a[n-2]);
    }
    private static void INit(){
        a[1]=1;
        a[2]=1;
        for(int j=3;j<93;j++){
            a[j] = a[j-2]+a[j-1];
        }
    }
}
