package hoa.sapXepTheoMaSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<SinhVien> ds = new ArrayList<>();
		while (in.hasNextLine()) {
//			System.out.println(in.nextLine());
			SinhVien sv = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
			ds.add(sv);
		}
		Collections.sort(ds);

		for (SinhVien s : ds) {
			System.out.println(s);
		}
	}
}
