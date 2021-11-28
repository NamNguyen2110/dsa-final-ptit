package doituong.J05079;

public class LopHoc implements Comparable<LopHoc> {
    private String ma;
    private String ten;
    private String nhom;
    private String gv;

    public LopHoc() {
    }

    public LopHoc(String ma, String ten, String nhom, String gv) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.gv = gv;
    }

    @Override
    public String toString() {
        return nhom + " " + gv;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getGv() {
        return gv;
    }

    public void setGv(String gv) {
        this.gv = gv;
    }

    @Override
    public int compareTo(LopHoc o) {
        return this.getMa().compareTo(o.getMa());
    }
}
