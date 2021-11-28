package hoa.timThuKhoaKiThi;

public class ThiSinh implements Comparable<ThiSinh> {
	private String hoten, ngaysinh;
	private int ma;
	private float d1, d2, d3, tong;
	private static int id = 1;

	public ThiSinh(String hoten, String ngaysinh, float d1, float d2, float d3) {
		this.ma = id++;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.tong = d1 + d2 + d3;
	}

	@Override
	public String toString() {
		return ma + " " + hoten + " " + ngaysinh + " " + tong;
	}

	public float getTong() {
		return tong;
	}

	@Override
	public int compareTo(ThiSinh o) {
		// TODO Auto-generated method stub
		if (this.tong > o.tong)
			return -1;
		if (this.tong < o.tong)
			return 1;
		return 0;
	}

}
