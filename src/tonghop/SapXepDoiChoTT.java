package tonghop;

import java.util.Scanner;

public class SapXepDoiChoTT {
    static int n,a[],count=1;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scn.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int t =a[i];
                    a[i] = a[j];
                    a[j]=t;
                }
            }
            System.out.print("Buoc "+count+": ");
            for(int k=0;k<n;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println();
            count++;
        }
    }
}
