package doituong.J04003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p = new PhanSo(sc.nextLong(), sc.nextLong());
        p.rutGon();
        System.out.println(p);
    }
}
