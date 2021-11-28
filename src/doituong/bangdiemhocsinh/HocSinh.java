package doituong.bangdiemhocsinh;

public class HocSinh implements Comparable<HocSinh> {
    private String ma;
    private String ten;
    private float toan, tiengViet, ngoaiNgu, vatLy, hoaHoc, sinhHoc, lichSu, dia, gdcn, cn;
    private float tb;
    private String xepLoai;

    public HocSinh(int id, String ten, float toan, float tiengViet, float ngoaiNgu, float vatLy, float hoaHoc, float sinhHoc, float lichSu, float dia, float gdcn, float cn) {
        this.ma = "HS" + String.format("%02d", id);
        this.ten = ten;
        this.toan = toan;
        this.tiengViet = tiengViet;
        this.ngoaiNgu = ngoaiNgu;
        this.vatLy = vatLy;
        this.hoaHoc = hoaHoc;
        this.sinhHoc = sinhHoc;
        this.lichSu = lichSu;
        this.dia = dia;
        this.gdcn = gdcn;
        this.cn = cn;
        this.tb = (float) (Math.round((toan * 2 + tiengViet * 2 + ngoaiNgu + vatLy + hoaHoc + sinhHoc + lichSu + dia + gdcn + cn) / 12 * 10.0) / 10.0);
        this.xepLoai = xepLoai(tb);
    }

    public String xepLoai(float tb) {
        String xepLoai = null;
        if (tb >= 9) {
            xepLoai = "XUAT SAC";
        }
        if (tb >= 8 && tb <= 8.9) {
            xepLoai = "GIOI";
        }
        if (tb >= 7 && tb <= 7.9) {
            xepLoai = "KHA";
        }
        if (tb >= 5 && tb <= 6.9) {
            xepLoai = "YEU";
        }
        return xepLoai;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tb + " " + xepLoai;
    }

    @Override
    public int compareTo(HocSinh o) {
        if (o.tb == this.tb) {
            if (o.ma.compareTo(this.ma) < 0)
                return 1;
            else
                return -1;
        } else if (o.tb > this.tb)
            return 1;
        else
            return -1;
    }
}
