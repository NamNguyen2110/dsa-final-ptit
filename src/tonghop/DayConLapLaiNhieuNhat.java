package tonghop;

import java.util.Scanner;

public class DayConLapLaiNhieuNhat {
    static int c[][];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0){
            int n = scn.nextInt();
            char s[] = scn.next().toCharArray();
            System.out.println(qhd(n,s));
        }
    }

    private static int qhd(int n,char[] s){
        c = new int[n+1][n+1];
        if(n==0) return 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s[i-1] == s[j-1] && i!=j) c[i][j] = c[i-1][j-1]+1;
                else c[i][j] = Math.max(c[i-1][j],c[i][j-1]);
            }
        }
        return c[n][n];
    }
}
