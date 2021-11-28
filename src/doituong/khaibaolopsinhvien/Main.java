package doituong.khaibaolopsinhvien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien("B20DCCN001",
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextFloat());
        System.out.println(sv);
    }
}
