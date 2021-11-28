package hoa.tinhThuNhapGiaoVien;

public class GiaoVien {
	private String mangach, hoten;
	private int bacluong, heso, phucap, tong;

	public GiaoVien(String mangach, String hoten, int bacluong) {
		this.mangach = mangach;
		this.hoten = hoten;
		this.bacluong = bacluong;
		this.heso = Integer.parseInt(mangach.substring(mangach.length() - 2));
		this.phucap = phuCap();
		this.tong = bacluong * heso + phucap;
	}

	private int phuCap() {
		String cv = mangach.substring(0, mangach.length() - 2);
		if (cv.equals("HT"))
			return 2000000;
		else if (cv.equals("HP"))
			return 900000;
		else
			return 500000;
	}

	@Override
	public String toString() {
		return mangach + " " + hoten + " " + heso + " " + phucap + " " + tong;
	}

}
