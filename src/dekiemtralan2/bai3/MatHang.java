package dekiemtralan2.bai3;

public class MatHang implements Comparable<MatHang> {
    private String ma;
    private String ten;
    private String donvi;
    private long giaMua;
    private long giaBan;
    private int loiNhuan;

    public MatHang(int id, String ten, String donvi, int giaMua, int giaBan) {
        this.ma = "MH" + String.format("%03d", id);
        this.ten = ten;
        this.donvi = donvi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donvi + " " + giaMua + " " + giaBan + " " + loiNhuan;
    }

    @Override
    public int compareTo(MatHang o) {
        if (this.loiNhuan == o.loiNhuan) {
            if (o.ma.compareTo(this.ma) < 0) {
                return 1;
            } else return -1;
        } else if (o.loiNhuan > this.loiNhuan) {
            return 1;
        } else return -1;

    }


}
