package hoa.sapXepSinhVienTheoLop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<SinhVien> ds = new ArrayList<>();
		int n = Integer.parseInt(in.nextLine());

		for (int i = 1; i <= n; i++) {
			SinhVien sv = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
			ds.add(sv);
		}
		Collections.sort(ds);

		for (SinhVien s : ds) {
			System.out.println(s);
		}
	}

}
