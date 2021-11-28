package do_thi;

import java.util.ArrayList;
import java.util.Scanner;

public class KiemTraTinhLienThongManh {
	static int n, m;
	static ArrayList<Integer> dske[] = new ArrayList[1005];
	static boolean chuaxet[] = new boolean[1005];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			for (int i = 0; i <= 1000; i++) {
				dske[i] = new ArrayList<Integer>();
				chuaxet[i] = true;
			}
			for (int i = 1; i <= m; i++) {
				int u = sc.nextInt(), v = sc.nextInt();
				dske[u].add(v);
				dske[v].add(u);
			}
			boolean check = true;
			dfs(1);
			for (int i = 1; i <= n; i++) {
				if (chuaxet[i]) {
					check = false;
					break;
				}
			}
			if (check)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	private static void dfs(int u) {
		// TODO Auto-generated method stub
		chuaxet[u] = false;
		for (Integer v : dske[u]) {
			if (chuaxet[v])
				dfs(v);
		}
	}
}
