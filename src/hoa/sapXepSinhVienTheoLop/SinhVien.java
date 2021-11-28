package hoa.sapXepSinhVienTheoLop;

public class SinhVien implements Comparable<SinhVien> {
	private String ma, ten, lop, email;

	public SinhVien(String ma, String ten, String lop, String email) {
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.email = email;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + lop + " " + email;
	}

	@Override
	public int compareTo(SinhVien o) {
		if (this.lop.equals(o.lop)) {
			if (this.ma.compareTo(o.ma) < 0)
				return -1;
			else
				return 1;
		} else if (this.lop.compareTo(o.lop) < 0)
			return -1;
		else
			return 1;
	}
}
