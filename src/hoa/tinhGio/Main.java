package hoa.tinhGio;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		List<NguoiChoi> list = new ArrayList<NguoiChoi>();
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < t; i++) {
			NguoiChoi n = new NguoiChoi(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			n.tinhThoiGian();
			list.add(n);
		}
		Collections.sort(list);
		for (NguoiChoi c : list)
			System.out.println(c);
	}

}
