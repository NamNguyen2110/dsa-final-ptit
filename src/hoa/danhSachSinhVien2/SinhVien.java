package hoa.danhSachSinhVien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
	private String ma, ten, lop;
	private Date ngaysinh;
	private Float gpa;

	public SinhVien(int id, String ten, String lop, String ns, Float gpa) throws ParseException {
		this.ma = "B20DCCN" + String.format("%03d", id);
		this.ten = chuanHoaTen(ten);
		this.lop = lop;
		this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
		this.gpa = gpa;
	}

	private String chuanHoaTen(String ten) {
		String a[] = ten.trim().toLowerCase().split("\\s+");
		String s = "";
		for (int i = 0; i < a.length; i++) {
			s += Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1);
			s += " ";
		}
		return s.trim();
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " "
				+ String.format("%.2f", gpa);
	}
}
