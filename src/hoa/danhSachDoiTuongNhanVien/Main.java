package hoa.danhSachDoiTuongNhanVien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<NhanVien> list = new ArrayList<NhanVien>();
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= n; i++) {
			NhanVien nv = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
					sc.nextLine());
			list.add(nv);
		}
//		Collections.sort(list);
		for (NhanVien nv : list)
			System.out.println(nv);
	}

}
