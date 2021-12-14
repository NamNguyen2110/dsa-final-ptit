package tonghop;

import java.util.Scanner;

public class XauConDoiXungMAX {
    static int c[][];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0){
            char[] s = scn.next().toCharArray();
            System.out.println(qhd(s));
        }
    }

    private static int qhd(char[] s) {
        int n = s.length;
        c = new int[n+1][n+1];
        if(n==0) return 0;
        if(n==1) return 1;
        for(int i=0;i<n;i++){
            c[i][i]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s[i] == s[j]) c[i][j] = c[i+1][j-1]+2;
            }
        }
        return c[n][n];
    }
}
