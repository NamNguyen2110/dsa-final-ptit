package tonghop;

import java.util.*;

public class MayATM1 {
    static long s;
    static int n, k;
    static int[] a,b;
    static Vector<Integer> vt;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            vt = new Vector<>();
            n = scn.nextInt();
            s = scn.nextLong();
            a = new int[31];
            b = new int[31];
            for(int i=1;i<=n;i++){
                a[i] = scn.nextInt();
            }
            k =1;
            while(k<=n){
                quaylui(1);
                if(vt.size()>0){
                    System.out.println(vt.get(0));
                    break;
                }
                else k++;
                if(k>n) System.out.println(-1);
            }
        }
    }

    private static void quaylui(int i) {
        for(int j=b[i-1]+1;j<=n-k+i;j++){
            b[i]=j;
            if(i==k){
                long tong=0;
                for(int q =1;q<=k;q++){
                    tong+=a[b[q]];

                }
                if(tong==s){
                    vt.add(k);
                    break;
                }
            }
            else quaylui(i+1);
        }
    }

}
