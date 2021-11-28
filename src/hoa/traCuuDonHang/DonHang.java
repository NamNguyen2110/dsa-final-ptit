package hoa.traCuuDonHang;

public class DonHang {
	private String tenmh, stt, ma;
	private int loai, soluong, dongia;
	private float tong, giamgia, thanhtien;

	public DonHang(String tenmh, String ma, int dongia, int soluong) {
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

}
