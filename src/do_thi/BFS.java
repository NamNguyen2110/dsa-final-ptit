package do_thi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
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
			bfs(s);
			System.out.println();
		}
	}

	private static void bfs(int u) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(u);
		chuaxet[u] = false;
		while (!q.isEmpty()) {
			int v = q.poll();
			System.out.print(v + " ");
			for (Integer x : dske[v]) {
				if (chuaxet[x]) {
					q.add(x);
					chuaxet[x] = false;
				}
			}
		}
	}
}
