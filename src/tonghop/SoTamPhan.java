package tonghop;

import java.util.Scanner;
public class SoTamPhan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-->0){
            String str = scn.nextLine();
            if(checkTP(str)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean checkTP(String str) {
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0' && str.charAt(i)!='1' && str.charAt(i)!='2') return false;
        }
        return true;
    }
}
