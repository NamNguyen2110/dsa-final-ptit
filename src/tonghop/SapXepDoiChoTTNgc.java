package tonghop;

import java.util.Scanner;
import java.util.Vector;

public class SapXepDoiChoTTNgc {
    static int n,a[];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            n = scn.nextInt();
            a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = scn.nextInt();
            }
            sapxep(n,a);
        }
    }

    private static void sapxep(int n, int[] a) {
        Vector<String> vt = new Vector<>();
        for(int i=0;i<n-1;i++){
            String tmp="";
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int t = a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
            tmp+="Buoc "+(i+1)+": ";
            for(int k=0;k<n;k++){
                tmp+=a[k]+" ";
            }
            vt.add(tmp);
        }
        for(int i= vt.size()-1;i>=0;i--){
            System.out.println(vt.get(i));
        }
    }
}
