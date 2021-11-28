package hoa.diemDanh1;

public class SinhVien {
	private String ma, hoten, lop, ghichu = "", dldd;
	private int cc;

	public SinhVien(String ma, String hoten, String lop) {
		this.ma = ma;
		this.hoten = hoten;
		this.lop = lop;
	}

	public void setDldd(String s) {
		this.dldd = s;
	}

	public String getMa() {
		return this.ma;
	}

	@Override
	public String toString() {
		return ma + " " + hoten + " " + lop + " " + cc + " " + ghichu;
	}

	public void tinhCC() {
		int m = 0, v = 0;
		for (int i = 0; i < 10; i++) {
			if (dldd.charAt(i) == 'm')
				m++;
			else if (dldd.charAt(i) == 'v')
				v++;
		}
		cc = 10 - v * 2 - m;
		if (cc <= 0) {
			cc = 0;
			ghichu = "KDDK";
		}
	}
}
