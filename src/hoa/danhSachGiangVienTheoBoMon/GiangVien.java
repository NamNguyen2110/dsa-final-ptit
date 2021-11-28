package hoa.danhSachGiangVienTheoBoMon;

public class GiangVien {
	private String ma, hoten, bm;

	public GiangVien(int id, String hoten, String bm) {
		this.ma = "GV" + String.format("%02d", id);
		this.hoten = hoten;
		this.bm = bm;
	}

	public String getBoMon() {
		return this.bm;
	}

	private String getMaBoMon() {
		String a[] = bm.trim().split("\\s");
		String s = "";
		for (int i = 0; i < a.length; i++) {
			s += Character.toUpperCase(a[i].charAt(0));
		}
		return s;
	}

	@Override
	public String toString() {
		return ma + " " + hoten + " " + getMaBoMon();
	}

}
