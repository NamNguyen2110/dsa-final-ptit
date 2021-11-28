package hoa.baiToanTinhCong;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		NhanVien n = new NhanVien(i, sc.nextLine(), Float.parseFloat(sc.nextLine()), Integer.parseInt(sc.nextLine()),
				sc.nextLine());
		n.tinhThuNhap();
		System.out.println(n);
	}
}
