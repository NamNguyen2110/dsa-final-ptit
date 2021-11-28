package hoa.bangDiemHocSinh;

import java.text.DecimalFormat;

public class HocSinh implements Comparable<HocSinh> {
	private String hoten, hl, ma;
	private float toan, tv, nn, vl, hh, sh, ls, d, gd, cn, tb;

	public HocSinh(int id, String hoten, float toan, float tv, float nn, float vl, float hh, float sh, float ls,
			float d, float gd, float cn) {
		this.ma = "HS" + String.format("%02d", id);
		this.hoten = hoten;
		this.toan = toan;
		this.tv = tv;
		this.nn = nn;
		this.vl = vl;
		this.hh = hh;
		this.sh = sh;
		this.ls = ls;
		this.d = d;
		this.gd = gd;
		this.cn = cn;
	}

	public void tinhHLvsTB() {
		tb = (float) (Math.round((toan * 2 + tv * 2 + nn + vl + hh + sh + ls + d + gd + cn) / 12 * 10.0) / 10.0);
		if (tb >= 9)
			hl = "XUAT SAC";
		else if (tb >= 8 && tb <= 8.9)
			hl = "GIOI";
		else if (tb >= 7 && tb <= 7.9)
			hl = "KHA";
		else if (tb >= 6 && tb <= 6.9)
			hl = "TB";
		else
			hl = "YEU";
	}

	@Override
	public String toString() {
		return ma + " " + hoten + " " + tb + " " + hl;
	}

	@Override
	public int compareTo(HocSinh o) {
		// TODO Auto-generated method stub
		if (o.tb == this.tb) {
			if (o.ma.compareTo(this.ma) < 0)
				return 1;
			else
				return -1;
		} else if (o.tb > this.tb)
			return 1;
		else
			return -1;
	}

}
