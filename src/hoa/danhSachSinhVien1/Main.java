package hoa.danhSachSinhVien1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		ArrayList<SinhVien> ds = new ArrayList<>();
		int n = Integer.parseInt(in.nextLine());

		for (int i = 1; i <= n; i++) {
			SinhVien sv = new SinhVien(i, in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()));
			ds.add(sv);
		}

		for (SinhVien s : ds) {
			System.out.println(s);
		}
	}

}
