package doituong.J04005;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThiSinh {
    private String name;
    private LocalDate birth;
    private float diem1;
    private float diem2;
    private float diem3;

    public ThiSinh(String name, LocalDate birth, float diem1, float diem2, float diem3) {
        this.name = name;
        this.birth = birth;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public String toString() {
        return name + " " + this.birth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " " + (this.diem1 + this.diem2 + this.diem3);
    }
}
