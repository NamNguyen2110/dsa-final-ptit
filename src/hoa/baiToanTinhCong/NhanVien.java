package hoa.baiToanTinhCong;

public class NhanVien {
	private String ma, hoten, cvu;
	private float luongcb, luongthang, thuong, phucap, thunhap;
	private int songaycong;

	public NhanVien(int id, String hoten, float luongcb, int songaycong, String cvu) {
		this.ma = "NV" + String.format("%02d", id);
		this.hoten = hoten;
		this.cvu = cvu;
		this.luongcb = luongcb;
		this.songaycong = songaycong;
	}

	public void tinhThuNhap() {
		if (songaycong >= 25)
			thuong = (float) 0.2;
		else if (songaycong >= 22 && songaycong < 25)
			thuong = (float) 0.1;
		else
			thuong = 0;
		if (cvu.equals("GD"))
			phucap = 250000;
		else if (cvu.equals("PGD"))
			phucap = 200000;
		else if (cvu.equals("TP"))
			phucap = 180000;
		else
			phucap = 150000;
		luongthang = luongcb * songaycong;
		thuong = luongthang * thuong;
		thunhap = luongthang + thuong + phucap;
	}

	@Override
	public String toString() {
		return ma + " " + hoten + " " + (int) luongthang + " " + (int) thuong + " " + (int) phucap + " "
				+ (int) thunhap;
	}

}
