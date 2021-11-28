package hoa.sapXepDonHang;

public class DonHang implements Comparable<DonHang> {
	private String tenmh, stt, ma;
	private int loai, soluong;
	private float tong, giamgia, thanhtien, dongia;

	public DonHang(String tenmh, String ma, float dongia, int soluong) {
		this.tenmh = tenmh;
		this.ma = ma;
		this.soluong = soluong;
		this.dongia = dongia;
		this.stt = ma.substring(1, 4);
		this.loai = ma.charAt(4) - '0';
	}

	public void tinhTien() {
		if (loai == 1)
			giamgia = (float) 0.5;
		else
			giamgia = (float) 0.3;
		tong = dongia * soluong;
		thanhtien = tong * (1 - giamgia);
	}

	@Override
	public String toString() {
		return tenmh + " " + ma + " " + stt + " " + (int) (tong * giamgia) + " " + (int) thanhtien;
	}

	@Override
	public int compareTo(DonHang o) {
		// TODO Auto-generated method stub
		return this.stt.compareTo(o.stt);
	}
}
