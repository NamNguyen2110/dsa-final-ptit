package hoa.danhSachSinhVien1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
	private String ma, ten, lop;
	private Date ngaysinh;
	private Float gpa;

	public SinhVien(int id, String ten, String lop, String ns, Float gpa) throws ParseException {
		this.ma = "B20DCCN" + String.format("%03d", id);
		this.ten = ten;
		this.lop = lop;
		this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " "
				+ String.format("%.2f", gpa);
	}
}
