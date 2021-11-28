package hoa.tinhThuNhapGiaoVien;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GiaoVien g = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextInt());
		System.out.println(g);
	}

}
