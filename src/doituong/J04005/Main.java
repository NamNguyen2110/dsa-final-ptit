package doituong.J04005;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String date = sc.next();
        float diem1 = sc.nextFloat();
        float diem2 = sc.nextFloat();
        float diem3 = sc.nextFloat();
        ThiSinh thiSinh = new ThiSinh(name, LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy")), diem1, diem2, diem3);
        System.out.println(thiSinh);
    }
}
