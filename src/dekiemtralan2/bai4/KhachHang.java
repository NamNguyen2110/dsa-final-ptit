package dekiemtralan2.bai4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class KhachHang implements Comparable<KhachHang> {
    private String ma;
    private String ten;
    private String sex;
    private Date date;
    private String diaChi;

    public KhachHang(int ma, String ten, String sex, String date, String diaChi) throws ParseException {
        this.ma = "KH" + String.format("%03d", ma);
        this.ten = chuanHoa(ten);
        this.sex = sex;
        this.date = new SimpleDateFormat("dd/mm/yyyy").parse(date);
        this.diaChi = diaChi;
    }

    public String chuanHoa(String ten) {
        StringBuilder builder = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(ten.trim());
        while (tokenizer.hasMoreTokens()) {
            String t = tokenizer.nextToken();
            builder.append(Character.toUpperCase(t.charAt(0)));
            for (int i = 1; i < t.length(); i++) {
                builder.append(Character.toLowerCase(t.charAt(i)));
            }
            builder.append(" ");
        }
        return builder.toString().trim();
    }

    @Override
    public int compareTo(KhachHang o) {
        return this.date.compareTo(o.date);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sex + " " + diaChi + " " + new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}
