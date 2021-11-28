package doituong.khaibaolopnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien {
    private String ma;
    private String ten;
    private String gioiTinh;
    private Date date;
    private String diaChi;
    private String mst;
    private Date date1;

    public NhanVien(String ma, String ten, String gioiTinh, String date, String diaChi, String mst, String date1) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.diaChi = diaChi;
        this.mst = mst;
        this.date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
    }

    @Override
    public String toString() {
        return ma + " " +
                ten + " " +
                gioiTinh + " " +
                new SimpleDateFormat("dd/MM/yyyy").format(date) + " " +
                diaChi + " " +
                mst + " " +
                new SimpleDateFormat("dd/MM/yyyy").format(date1) + " ";
    }
}
