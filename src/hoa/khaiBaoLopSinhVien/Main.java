package hoa.khaiBaoLopSinhVien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SinhVien s = new SinhVien(sc.nextLine(), sc.next(), sc.next(), sc.nextFloat());
		System.out.println(s);
	}

}
