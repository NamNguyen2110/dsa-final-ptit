package hoa.phan_so;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PhanSo p = new PhanSo(sc.nextLong(), sc.nextLong());
		p.rutGon();
		System.out.println(p);
	}

}
