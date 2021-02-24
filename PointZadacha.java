package test;

public class PointZadacha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(5, 0);
		MovablePoint p2 = new MovablePoint(0, -9.1f, 1, 15.6f);
		p2 = p2.move();
		System.out.println(p1.toString());
		System.out.println(p2.toString());

	}

}
