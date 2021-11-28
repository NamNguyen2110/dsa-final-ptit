package doituong.J05079;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<LopHoc> list = new ArrayList<>();
        LopHoc lopHoc = new LopHoc();
        while (t-- > 0) {
            lopHoc.setMa(sc.nextLine());
            lopHoc.setTen(sc.nextLine());
            lopHoc.setNhom(sc.nextLine());
            lopHoc.setGv(sc.nextLine());
            list.add(lopHoc);
            list.add(lopHoc);
        }
        int t1 = Integer.parseInt(sc.nextLine());
        String ma = null;
        while (t1-- > 0) {
            ma = sc.nextLine();
            LopHoc lopHoc1 = new LopHoc();
        }


    }
}
