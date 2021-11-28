package do_thi;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
	static int n, m;
	static ArrayList<Integer> dske[] = new ArrayList[1001];
	static boolean chuaxet[] = new boolean[1001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			int s = sc.nextInt();
			for (int i = 0; i <= n; i++) {
				dske[i] = new ArrayList<Integer>();
				chuaxet[i] = true;
			}
			for (int i = 1; i <= m; i++) {
				int u = sc.nextInt(), v = sc.nextInt();
				dske[u].add(v);
				dske[v].add(u);
			}
			dfs(s);
			System.out.println();
		}
	}

	private static void dfs(int u) {
		// TODO Auto-generated method stub
		System.out.print(u + " ");
		chuaxet[u] = false;
		for (Integer v : dske[u]) {
			if (chuaxet[v])
				dfs(v);
		}
	}
}
