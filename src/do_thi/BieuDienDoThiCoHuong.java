package do_thi;

import java.util.ArrayList;
import java.util.Scanner;

public class BieuDienDoThiCoHuong {
	static int n, m;
	static ArrayList<Integer> dske[] = new ArrayList[1001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				dske[i] = new ArrayList<Integer>();
			}
			for (int i = 0; i < m; i++) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				dske[u].add(v);
			}
			for (int i = 1; i <= n; i++) {
				System.out.print(i + ": ");
				for (int j = 0; j < dske[i].size(); j++)
					System.out.print(dske[i].get(j) + " ");
				System.out.println();
			}
		}
	}
}
