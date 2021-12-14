package tonghop;

import java.util.Scanner;
import java.util.Vector;

public class SapXepChonNgc {
    static int a[],n;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scn.nextInt();
        }
        sapxep(n,a);
    }

    private static void sapxep(int n, int[] a) {
        Vector<String> vt = new Vector<>();

        for(int i=0;i<n-1;i++){
            int t=-1;
            String tmp="";
            int min = a[i];
            for(int j=i+1;j<n;j++){
                if(min>a[j]){
                    min = a[j];
                    t = j;
                }
            }
            if(t!=-1) {
                int x = a[i];
                a[i] = min;
                a[t] = x;
            }
            tmp += "Buoc "+(i+1)+": ";
            for(int k=0;k<n;k++){
                tmp+=a[k]+" ";
            }
            vt.add(tmp);

        }
        for(int k= vt.size()-1;k>=0;k--){
            System.out.println(vt.get(k));
        }
    }
}
