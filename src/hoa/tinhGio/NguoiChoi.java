package hoa.tinhGio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NguoiChoi implements Comparable<NguoiChoi> {
	private String ma, hoten;
	private Date start, finish;
	private int h, m;

	public NguoiChoi(String ma, String hoten, String start, String finish) throws ParseException {
		super();
		this.ma = ma;
		this.hoten = hoten;
		this.start = new SimpleDateFormat("hh:mm").parse(start);
		this.finish = new SimpleDateFormat("hh:mm").parse(finish);
	}

	@Override
	public String toString() {
		return ma + " " + hoten + " " + h + " gio " + m + " phut";
	}

	public void tinhThoiGian() {
		long d = (finish.getTime() - start.getTime()) / 1000 / 60;
		h = (int) d / 60;
		m = (int) d % 60;
	}

	@Override
	public int compareTo(NguoiChoi o) {
		int c = o.h - this.h;
		if (c == 0)
			c = o.m - this.m;
		return c;
	}

}
