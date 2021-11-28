package hoa.tichMaTranVaChuyenViCuaNo;

import java.util.Scanner;

public class Matrix {
	private int n, m, arr[][];

	public Matrix(int n, int m) {
		// TODO Auto-generated constructor stub
		this.n = n;
		this.m = m;
	}

	public Matrix(int n, int m, int[][] arr) {
		this.n = n;
		this.m = m;
		this.arr = arr;
	}

	public void nextMatrix(Scanner sc) {
		// TODO Auto-generated method stub
		arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				arr[i][j] = sc.nextInt();
		}
	}

	public Matrix trans() {
		// TODO Auto-generated method stub
		int[][] cv = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				cv[j][i] = arr[i][j];
		}
		return new Matrix(m, n, cv);
	}

	public Matrix mul(Matrix b) {
		// TODO Auto-generated method stub
		int c[][] = new int[m][b.n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < b.n; j++) {
				c[i][j] = 0;
				for (int k = 0; k < n; k++) {
					c[i][j] = c[i][j] + arr[i][k] * b.arr[k][j];
				}
			}
		}
		return new Matrix(m, b.n, c);
	}

	@Override
	public String toString() {
		String rs = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				rs += arr[i][j] + " ";
			rs += "\n";
		}
		return rs;
	}

}
