package oop_exercise8;

/**
 *Subclass of GraphicObject used to calculate the area of a circle
 * @author ccheibas
 */

public class Circle extends GraphicObject {
	float radius;
	
	Circle(float r) {
		this.radius = r;
	}
	
	public float calculateArea () {
		return radius * radius * (float)(Math.PI);
	}

}
