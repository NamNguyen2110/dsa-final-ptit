package hoa.lietKeSinhVienTheoLop;

public class SinhVien {
	private String ma, ten, lop, email;

	public SinhVien(String ma, String ten, String lop, String email) {
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.email = email;
	}

	public String getLop() {
		return this.lop;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + lop + " " + email;
	}
}
