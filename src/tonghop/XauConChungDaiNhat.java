package tonghop;

import java.util.Scanner;

public class XauConChungDaiNhat {
    static int c[][];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0){
            char s1[] = scn.next().toCharArray();
            char s2[] = scn.next().toCharArray();
            System.out.println(qhd(s1,s2));
        }
    }

    private static int qhd(char[] s1, char[] s2) {
        int n = s1.length;int m = s2.length;
        c = new int[n+1][m+1];
        if(n==0 || m==0) return 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1[i-1] == s2[j-1]) c[i][j] = c[i-1][j-1]+1;
                else c[i][j] = Math.max(c[i-1][j],c[i][j-1]);
            }
        }
        return c[n][m];
    }
}
