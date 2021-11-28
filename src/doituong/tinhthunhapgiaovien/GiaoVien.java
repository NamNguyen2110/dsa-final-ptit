package doituong.tinhthunhapgiaovien;

public class GiaoVien {
    private String maGach;
    private String ten;
    private int bacLuong, heSo, phuCap, tong;

    public GiaoVien(String maGach, String ten, int bacLuong) {
        this.maGach = maGach;
        this.ten = ten;
        this.bacLuong = bacLuong;
        this.heSo = Integer.parseInt(maGach.substring(maGach.length() - 2));
        this.phuCap = phuCap();
        this.tong = bacLuong * heSo + phuCap;
    }

    private int phuCap() {
        String cv = maGach.substring(0, maGach.length() - 2);
        int p = 0;
        switch (cv) {
            case "HT":
                p = 2000000;
                break;
            case "HP":
                p = 900000;
                break;
            case "GV":
                p = 500000;
                break;
        }
        return p;
    }

    @Override
    public String toString() {
        return maGach + " " + ten + " " + heSo + " " + phuCap + " " + tong;
    }
}
