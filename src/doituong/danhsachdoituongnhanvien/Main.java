package doituong.danhsachdoituongnhanvien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<NhanVien> list = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            NhanVien nv = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(nv);
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
