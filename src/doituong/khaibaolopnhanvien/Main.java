package doituong.khaibaolopnhanvien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(
                "00001",
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine()
        );
        System.out.println(nv);
    }
}
