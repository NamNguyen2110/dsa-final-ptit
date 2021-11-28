package do_thi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DuongDiTheoDFSVoiDoThiVoHuong {
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
				dske[v].add(u);
			}
			dfs(s);
			if (chuaxet[t])
				System.out.println(-1);
			else {
				Stack<Integer> st = new Stack<Integer>();
				st.push(t);
				while (st.peek() != s) {
					st.push(truoc[st.peek()]);
				}
				while (!st.empty()) {
					System.out.print(st.peek() + " ");
					st.pop();
				}
				System.out.println();
			}
		}
	}

	private static void dfs(int u) {
		// TODO Auto-generated method stub
		chuaxet[u] = false;
		for (Integer v : dske[u]) {
			if (chuaxet[v]) {
				dfs(v);
				truoc[v] = u;
			}

		}
	}
}
