package oop_exercise5;
//adding a change for gerrit push
/**
 * A class creating a 3D or 2D point and ways of manipulating it
 * @author ccheibas
 *
 */

public class Point {
	private int x;
	private int y;
	private int z;
	Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setX(int var) {
		this.x = var;
	}
	public void setY(int var) {
		this.y = var;
	}
	public void setZ(int var) {
		this.z = var;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getZ() {
		return this.z;
	}
}
