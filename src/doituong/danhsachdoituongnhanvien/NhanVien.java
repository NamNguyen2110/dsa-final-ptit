package doituong.danhsachdoituongnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien>{
    private String ma;
    private String ten;
    private String sex;
    private Date date1;
    private String diaChi;
    private String mst;
    private Date date2;

    public NhanVien(int ma, String ten, String sex, String date1, String diaChi, String mst, String date2) throws ParseException {
        this.ma = String.format("%05d", ma);
        this.ten = ten;
        this.sex = sex;
        this.date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
        this.diaChi = diaChi;
        this.mst = mst;
        this.date2 = new SimpleDateFormat("dd/MM/yyyy").parse(date2);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sex + " " +
                new SimpleDateFormat("dd/MM/yyyy").format(date1) +
                " " + diaChi + " " + mst + " " + new SimpleDateFormat("dd/MM/yyyy").format(date2);
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.date1.compareTo(o.date1);
    }
}
