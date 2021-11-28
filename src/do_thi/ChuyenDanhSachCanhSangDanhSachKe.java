package do_thi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChuyenDanhSachCanhSangDanhSachKe {
	static int n, m;
	static ArrayList<Integer>[] dske = new ArrayList[1005];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			for (int i = 0; i <= 1000; i++) {
				dske[i] = new ArrayList<Integer>();
			}
			for (int i = 1; i <= m; i++) {
				int u = sc.nextInt(), v = sc.nextInt();
				dske[u].add(v);
				dske[v].add(u);
			}
			for (int i = 1; i <= n; i++) {
				Collections.sort(dske[i]);
				System.out.print(i + ": ");
				for (Integer e : dske[i])
					System.out.print(e + " ");
				System.out.println();
			}
		}
	}
}
