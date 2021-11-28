package do_thi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DemSoThanhPhanLienThong {
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
			int dem = 0;
			for (int i = 1; i <= n; i++) {
				if (chuaxet[i]) {
					dem++;
					bfs(i);
				}
			}
			System.out.println(dem);
		}
	}

	private static void bfs(int u) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(u);
		chuaxet[u] = false;
		while (!q.isEmpty()) {
			int v = q.poll();
			for (Integer x : dske[v]) {
				if (chuaxet[x]) {
					q.add(x);
					chuaxet[x] = false;
				}
			}
		}
	}
}
