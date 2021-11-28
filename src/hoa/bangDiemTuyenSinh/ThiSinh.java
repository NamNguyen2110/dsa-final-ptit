package hoa.bangDiemTuyenSinh;

import java.util.HashMap;
import java.util.Map;

public class ThiSinh {
	private String ma, hoten, trangthai;
	private float toan, ly, hoa, uutien, tongdiem;
	private static Map<String, Float> diemuutien;
	static {
		diemuutien = new HashMap<String, Float>();
		diemuutien.put("KV1", (float) 0.5);
		diemuutien.put("KV2", (float) 1.0);
		diemuutien.put("KV3", (float) 2.5);
	}

	public ThiSinh(String ma, String hoten, float toan, float ly, float hoa) {
		this.ma = ma;
		this.hoten = hoten;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}

	public void xetDiem() {
		String kv = ma.substring(0, 3);
		uutien = diemuutien.get(kv);
		tongdiem = toan * 2 + ly + hoa;
		if (tongdiem + uutien >= 24)
			trangthai = "TRUNG TUYEN";
		else
			trangthai = "TRUOT";
	}

	private String formatDiem(float diem) {
		if (diem == (int) diem)
			return String.format("%d", (int) diem);
		return String.format("%s", diem);
	}

	@Override
	public String toString() {
		return ma + " " + hoten + " " + formatDiem(uutien) + " " + formatDiem(tongdiem) + " " + trangthai;
	}
}
