package test;

public class Point {
	private float x;
	private float y;

	public Point() {
		this.x = 0.0f;
		this.y = 0.0f;
	}

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

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float[] getXY() {
		float[] result = new float[2];
		result[0] = this.x;
		result[1] = this.y;
		return result;
	}

	public String toString() {
		return String.format("(%.1f ; %.1f)", this.x, this.y);
	}
}
