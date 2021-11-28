package dekiemtralan2.triangle;

import java.util.Scanner;

public class Point {
	private float x, y;

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return this.x;
	}

	public float getY() {
		return this.y;
	}

	public float tinhKC(Point o) {
		return (float) Math.sqrt(Math.pow((o.x - this.x), 2) + Math.pow((o.y - this.y), 2));
	}

	public static Point nextPoint(Scanner sc) {
		return new Point(sc.nextFloat(), sc.nextFloat());
	}

}
