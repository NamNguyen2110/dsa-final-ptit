package hoa.lietKeSinhVienTheoNganh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<SinhVien> ds = new ArrayList<>();
		int t = Integer.parseInt(in.nextLine());
		while (t-- > 0) {
			SinhVien sv = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
			ds.add(sv);
		}
		int q = Integer.parseInt(in.nextLine());
		while (q-- > 0) {
			String nganh = in.nextLine();
			System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() + ":");
			for (SinhVien s : ds) {
				if (s.getNganh().toLowerCase().equals(nganh.toLowerCase()))
					System.out.println(s);
			}
		}

	}
}
