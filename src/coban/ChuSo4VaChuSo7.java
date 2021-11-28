package coban;

import java.util.Scanner;

public class ChuSo4VaChuSo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] arr = n.toCharArray();
        int sum = 0;
        for (char c : arr) {
            if (c == '7' || c == '4') {
                sum++;
            }
        }
        if(sum == 4 || sum == 7){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
