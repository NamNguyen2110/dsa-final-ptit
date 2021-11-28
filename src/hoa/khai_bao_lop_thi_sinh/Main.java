package hoa.khai_bao_lop_thi_sinh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ThiSinh t = new ThiSinh(sc.nextLine(), sc.next(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
		System.out.println(t);
	}

}
