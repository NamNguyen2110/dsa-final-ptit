package hoa.baiToanTuyenSinh;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ThiSinh t = new ThiSinh(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()),
				Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
		t.xetDiem();
		System.out.println(t);
	}
}
