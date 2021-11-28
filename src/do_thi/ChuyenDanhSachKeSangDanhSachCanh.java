package do_thi;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenDanhSachKeSangDanhSachCanh {
	static int n;
	static ArrayList<Integer> dske[] = new ArrayList[51];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= n; i++) {
			dske[i] = new ArrayList<Integer>();
			String s = sc.nextLine();
			Scanner in = new Scanner(s);
			while (in.hasNextInt()) {
				dske[i].add(in.nextInt());
			}
		}

		boolean dain[][] = new boolean[51][51];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < dske[i].size(); j++) {
				if (!dain[dske[i].get(j)][i] && !dain[i][dske[i].get(j)]) {
					System.out.println(i + " " + dske[i].get(j));
					dain[dske[i].get(j)][i] = true;
					dain[i][dske[i].get(j)] = true;
				}
			}
		}
	}
}
