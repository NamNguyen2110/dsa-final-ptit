package doituong.danhsachsinhvien1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien {
    private String maSV;
    private String ten;
    private Date date;
    private String lop;
    private float diem;

    public SinhVien(int ma, String ten, String lop, String date, float diem) throws ParseException {
        this.maSV = "B20DCCN" + String.format("%03d", ma);
        this.ten = ten(ten);
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.lop = lop;
        this.diem = diem;
    }

    public String ten(String a) {
        StringBuilder builder = new StringBuilder();
        StringTokenizer buffer = new StringTokenizer(a);
        while (buffer.hasMoreTokens()) {
            String b = buffer.nextToken();
            builder.append(Character.toUpperCase(b.charAt(0)));
            for (int i = 1; i < b.length(); i++) {
                builder.append(Character.toLowerCase(b.charAt(i)));
            }
            builder.append(" ");
        }
        return builder.toString().trim();
    }

    @Override
    public String toString() {
        return maSV + " " + ten +
                " " + lop +
                " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + String.format("%.2f", diem);
    }
}
