package doituong.khaibaolopsinhvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien {
    private String masv;
    private String ten;
    private String lop;
    private Date date;
    private float gpa;

    public SinhVien(String masv, String ten, String lop, String date, float gpa) throws ParseException {
        this.masv = masv;
        this.ten = ten(ten);
        this.lop = lop;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return masv + " " +
                ten + " " + " " +
                lop + " " + " " +
                new SimpleDateFormat("dd/MM/yyyy").format(date) + " " +
                String.format("%.2f", gpa);
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
        return builder.toString();
    }
}
