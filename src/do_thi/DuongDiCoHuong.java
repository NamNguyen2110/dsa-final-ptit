package do_thi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DuongDiCoHuong {
	static int n, m;
	static ArrayList<Integer> dske[] = new ArrayList[1001];
	static boolean chuaxet[] = new boolean[1001];
	static int truoc[] = new int[1001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			n = sc.nextInt();
			m = sc.nextInt();
			int s = sc.nextInt(), t = sc.nextInt();
			for (int i = 0; i <= n; i++) {
				dske[i] = new ArrayList<Integer>();
				chuaxet[i] = true;
				truoc[i] = 0;
			}
			for (int i = 1; i <= m; i++) {
				int u = sc.nextInt(), v = sc.nextInt();
				dske[u].add(v);
			}
			bfs(s);
			if (chuaxet[t])
				System.out.println(-1);
			else {
				Stack<Integer> st = new Stack<Integer>();
				st.push(t);
				while (st.peek() != s) {
					st.push(truoc[st.peek()]);
				}
				while (st.size() > 1) {
					System.out.print(st.peek() + " -> ");
					st.pop();
				}
				System.out.print(t);
				System.out.println();
			}
		}
	}

	private static void bfs(int u) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(u);
		chuaxet[u] = false;
		while (!q.isEmpty()) {
			int v = q.poll();
			for (Integer i : dske[v]) {
				if (chuaxet[i]) {
					q.add(i);
					chuaxet[i] = false;
					truoc[i] = v;
				}
			}
		}
	}
}
