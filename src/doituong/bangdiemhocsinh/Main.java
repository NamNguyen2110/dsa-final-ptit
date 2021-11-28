package doituong.bangdiemhocsinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<HocSinh> list = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            HocSinh hs = new HocSinh(i, sc.nextLine()
                    , sc.nextFloat()
                    , sc.nextFloat()
                    , sc.nextFloat()
                    , sc.nextFloat()
                    , sc.nextFloat()
                    , sc.nextFloat()
                    , sc.nextFloat()
                    , sc.nextFloat()
                    , sc.nextFloat()
                    , sc.nextFloat()
            );
            list.add(hs);
        }
        list.stream().sorted().forEach(System.out::println);
    }
}
