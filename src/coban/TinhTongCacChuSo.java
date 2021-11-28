package coban;

import java.util.*;

public class TinhTongCacChuSo {
    private static final Scanner sc = new Scanner(System.in);

    public static String solution(String a) {
        String[] n = a.split("");
        List<String> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        for (String s : n) {
            if (s.matches("^[0-9][A-Za-z0-9 -]*$")) {
                a2.add(Integer.valueOf(s));
            } else {
                a1.add(s);
            }
        }
        Collections.sort(a1);
        int sum = 0;
        for (Integer a11 : a2) {
            sum += a11;
        }
        StringBuilder builder = new StringBuilder();
        for (String s3 : a1) {
            builder.append(s3);
        }
        builder.append(sum);
        return builder.toString().trim();
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            System.out.println(solution(a));
        }
    }
}
