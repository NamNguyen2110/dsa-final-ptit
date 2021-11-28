package hoa.tinhTien;

public class HoaDon implements Comparable<HoaDon> {
	private String ma, ten;
	private int soluong;
	private long dongia, chietkhau, tong;

	public HoaDon(String ma, String ten, int soluong, long dongia, long chietkhau) {
		this.ma = ma;
		this.ten = ten;
		this.soluong = soluong;
		this.dongia = dongia;
		this.chietkhau = chietkhau;
		this.tong = dongia * soluong - chietkhau;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + soluong + " " + dongia + " " + chietkhau + " " + tong;
	}

	@Override
	public int compareTo(HoaDon o) {
		// TODO Auto-generated method stub
		if (this.tong > o.tong)
			return -1;
		return 1;
	}

}
