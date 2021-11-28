package coban;

import java.util.*;

public class RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
//        System.out.println(solution(a));
        solution(a);
    }

    private static void solution(String a) {
        int sum = 0;
        StringBuilder s1 = new StringBuilder();
        String[] s = a.split("");
        List<String> list = new ArrayList<>(Arrays.asList(s));
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (Objects.equals(s[i], s[j])) {
                    list.remove(i);
                    sum++;
                }
                if (sum % 2 == 0) {
                    list.remove(i);
                }
            }
        }
        System.out.println(list);
    }
}
