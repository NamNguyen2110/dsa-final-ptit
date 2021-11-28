package coban;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            if (solution(a)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }

    private static boolean solution(String a) {
        boolean check = false;
        List<Integer> s = Arrays.stream(a.split("")).map(Integer::parseInt).collect(Collectors.toList());
        int i = s.size() - 1;
        while (i > 0) {
            if (Math.abs(s.get(i) - s.get(i - 1)) == 1) {
                check = true;
            } else {
                return false;
            }
            i--;
        }
        return check;
    }
}
