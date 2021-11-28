package dekiemtralan2.triangle;

public class Triangle {
    private Point a, b, c;

    public Triangle(String t) {
        String[] t1 = t.split(" ");
        int[] t3 = new int[t1.length];
        for (int i = 0; i < t1.length; i++) {
            t3[i] = Integer.parseInt(t1[i]);
        }
        Point a1 = new Point(t3[0], t3[1]);
        Point a2 = new Point(t3[2], t3[3]);
        Point a3 = new Point(t3[4], t3[5]);
        this.a = a1;
        this.b = a2;
        this.c = a3;
    }

    public boolean valid() {
        float ar = a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY())
                + c.getX() * (a.getY() - b.getY());
        if (ar == 0)
            return false;
        return true;
    }

    public float getPerimeter() {
        float p = a.tinhKC(b) + b.tinhKC(c) + c.tinhKC(a);
        return (float) (Math.round(p * 1000) / 1000.0);
    }
}
