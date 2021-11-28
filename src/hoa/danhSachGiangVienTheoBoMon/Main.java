package hoa.danhSachGiangVienTheoBoMon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<GiangVien> ds = new ArrayList<>();
		int t = Integer.parseInt(in.nextLine());
		for (int i = 1; i <= t; i++) {
			GiangVien gv = new GiangVien(i, in.nextLine(), in.nextLine());
			ds.add(gv);
		}
		int q = Integer.parseInt(in.nextLine());
		while (q-- > 0) {
			String bomon = in.nextLine();
			String a[] = bomon.trim().split("\\s");
			String s = "";
			for (int i = 0; i < a.length; i++) {
				s += Character.toUpperCase(a[i].charAt(0));
			}
			System.out.println("DANH SACH GIANG VIEN BO MON " + s.toUpperCase() + ":");
			for (GiangVien g : ds) {
				if (g.getBoMon().toLowerCase().equals(bomon.toLowerCase()))
					System.out.println(g);
			}
		}
	}

}
