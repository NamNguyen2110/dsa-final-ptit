package hoa.tinhTien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		List<HoaDon> list = new ArrayList<HoaDon>();
		while (t-- > 0) {
			HoaDon h = new HoaDon(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),
					Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
			list.add(h);
		}
		Collections.sort(list);
		for (HoaDon h : list)
			System.out.println(h);
	}
}
