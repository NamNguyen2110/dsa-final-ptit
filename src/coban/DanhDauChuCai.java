package coban;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String[] b = a.split("");
        Set<String> s = new HashSet<>(Arrays.asList(b));
        System.out.println(s.size());

    }
}
