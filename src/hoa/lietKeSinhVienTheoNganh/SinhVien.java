package hoa.lietKeSinhVienTheoNganh;

import java.util.HashMap;
import java.util.Map;

public class SinhVien {
	private String ma, ten, lop, email;
	private static final Map<String, String> nganh;
	static {
		nganh = new HashMap<String, String>();
		nganh.put("DCKT", "ke toan");
		nganh.put("DCCN", "cong nghe thong tin");
		nganh.put("DCAT", "an toan thong tin");
		nganh.put("DCVT", "vien thong");
		nganh.put("DCDT", "dien tu");
	}

	public SinhVien(String ma, String ten, String lop, String email) {
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.email = email;
	}

	public String getNganh() {
		String n = ma.substring(3, 7);
		return nganh.get(n);
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + lop + " " + email;
	}
}
