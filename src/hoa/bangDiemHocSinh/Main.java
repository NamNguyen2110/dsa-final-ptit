package hoa.bangDiemHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<HocSinh> list = new ArrayList<HocSinh>();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= n; i++) {
			HocSinh h = new HocSinh(i, sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(),
					sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
			sc.nextLine();
			h.tinhHLvsTB();
			list.add(h);
		}
		Collections.sort(list);
		for (HocSinh i : list)
			System.out.println(i);
	}

}
