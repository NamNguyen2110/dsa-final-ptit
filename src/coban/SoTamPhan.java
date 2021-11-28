package coban;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next();
            if (solution(n)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }

    private static boolean solution(String n) {
        boolean check = false;
        String[] arr = n.split("");
        List<Integer> list = Arrays.stream(arr).map(Integer::parseInt).collect(Collectors.toList());
        for (Integer i : list) {
            if (i == 0 || i == 1 || i == 2) {
                check = true;
            } else {
                return false;
            }
        }
        return check;
    }
}
