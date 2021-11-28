package hoa.danhSachDoiTuongNhanVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien> {
	private String ma, hoten, gioitinh, diachi, msthue;
	private Date ngaysinh, ngayky;

	public NhanVien(int id, String hoten, String gioitinh, String ngaysinh, String diachi, String msthue, String ngayky)
			throws ParseException {
		this.ma = String.format("%05d", id);
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.msthue = msthue;
		this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
		this.ngayky = new SimpleDateFormat("dd/MM/yyyy").parse(ngayky);
	}

	@Override
	public String toString() {
		return ma + " " + hoten + " " + gioitinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " "
				+ diachi + " " + msthue + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayky);
	}

	@Override
	public int compareTo(NhanVien o) {
		// TODO Auto-generated method stub
		return this.ngaysinh.compareTo(o.ngaysinh);
	}

}
