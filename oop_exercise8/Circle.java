package oop_exercise8;

/**Subclass of GraphicObject has its' own declared constructor and area calculator
 * @author ccheibas
 *
 */

public class Circle extends GraphicObject {
	float radius;
	
	Circle(float r) {
		super(r);
		this.radius = r;
	}
	
	public float calculateArea (){
		return radius*radius*(float)(Math.PI);
	}

}
