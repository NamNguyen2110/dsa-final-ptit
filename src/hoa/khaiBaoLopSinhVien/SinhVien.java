package hoa.khaiBaoLopSinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
	private String masv, hoten, lop;
	private Date ngaysinh;
	private float gpa;

	public SinhVien(String hoten, String lop, String ngaysinh, float gpa) throws ParseException {
		this.masv = "B20DCCN001";
		this.hoten = hoten;
		this.lop = lop;
		this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return masv + " " + hoten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " "
				+ String.format("%.2f", gpa);
	}

}
