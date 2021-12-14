package tonghop;

import java.util.Scanner;

public class BaiToanQuanHau2 {
    static int[][] a;
    static int[] c;
    static long tong;
    static long max;
    static boolean[] cot,xuoi,nguoc;
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            max =0;
            a = new int[102][102];
            c = new int[102];
            for(int i=1;i<=8;i++){
                for(int j=1;j<=8;j++){
                    a[i][j] = scn.nextInt();
                }
            }
            cot = new boolean[102];
            xuoi = new boolean[102];
            nguoc = new boolean[102];

            quaylui(1);
            System.out.println(max);
        }
    }

    private static void quaylui(int i) {
        for(int j=1;j<=8;j++){
            if(!cot[j] && !xuoi[i-j+8] && !nguoc[i+j-1]){
                c[i] = j;
                cot[j] = true;
                xuoi[i-j+8] = true;
                nguoc[i+j-1]= true;

                if(i==8) {
                    tong=0;
                    for(int k=1;k<=8;k++){
                        tong+=a[k][c[k]];
                    }
                    if(max<tong) max = tong;
                }
                else quaylui(i+1);
                cot[j] = false;
                xuoi[i-j+8] = false;
                nguoc[i+j-1]= false;
            }
        }
    }
}
