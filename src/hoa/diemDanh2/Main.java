package hoa.diemDanh2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<SinhVien> list = new ArrayList<SinhVien>();
		int t = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < t; i++) {
			SinhVien s = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
			list.add(s);
		}
		while (t-- > 0) {
			String ma = sc.next();
			for (SinhVien s : list) {
				if (s.getMa().equals(ma)) {
					s.setDldd(sc.next());
					s.tinhCC();
					break;
				}
			}
		}
		String lop = sc.next();
		for (SinhVien s : list) {
			if (s.getLop().equals(lop))
				System.out.println(s);
		}

	}
}
