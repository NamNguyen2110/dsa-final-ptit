package tonghop;

import java.util.Scanner;

public class BaiToanQuanHau {
    static int[] a;
    static int n;
    static int count;
    static boolean[] b,xuoi,nguoc;
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            count = 0;
            n = scn.nextInt();
            a = new int[n+1];
            b = new boolean[11];
            xuoi = new boolean[20];
            nguoc = new boolean[20];

            quaylui(1);
            System.out.println(count);
        }
    }

    private static void quaylui(int i) {
        for(int j=1;j<=n;j++){
            if(!b[j] && !xuoi[i-j+n] && !nguoc[i+j-1]){
                a[i] = j;
                b[j] = true;
                xuoi[i-j+n] = true;
                nguoc[i+j-1]= true;

                if(i==n) {
                    count++;
                }
                else quaylui(i+1);
                b[j] = false;
                xuoi[i-j+n] = false;
                nguoc[i+j-1]= false;
            }
        }
    }
}
