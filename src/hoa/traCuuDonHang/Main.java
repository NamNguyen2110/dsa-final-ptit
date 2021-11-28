package hoa.traCuuDonHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		List<DonHang> list = new ArrayList<DonHang>();
		while (t-- > 0) {
			DonHang d = new DonHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
					Integer.parseInt(sc.nextLine()));
			d.tinhTien();
			list.add(d);
		}
		for (DonHang i : list)
			System.out.println(i);
	}

}
