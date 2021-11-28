package hoa.timThuKhoaKiThi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		List<ThiSinh> list = new ArrayList<ThiSinh>();
		while (t-- > 0) {
			ThiSinh n = new ThiSinh(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()),
					Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
			list.add(n);
		}
		Collections.sort(list);
		float diemMax = list.get(0).getTong();
		for (ThiSinh i : list) {
			if (i.getTong() == diemMax)
				System.out.println(i);
		}
	}
}
