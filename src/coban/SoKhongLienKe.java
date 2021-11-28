package coban;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoKhongLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            List<Integer> s = Arrays.stream(a.split("")).map(Integer::parseInt).collect(Collectors.toList());
            if (solution(s) && isSumEqual10(s)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }

    private static boolean solution(List<Integer> s) {
        boolean check = false;
        int i = s.size() - 1;
        while (i > 0) {
            if (Math.abs(s.get(i) - s.get(i - 1)) == 2) {
                check = true;
            } else {
                return false;
            }
            i--;
        }
        return check;
    }

    private static boolean isSumEqual10(List<Integer> s) {
        return s.stream().mapToInt(i -> i).sum() % 10 == 0;
    }
}
