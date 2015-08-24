package oop_exercise8;
//adding a change for gerrit push
/**
 * Subclass of GraphicObject used to calculate the area of a rectangle
 * @author ccheibas
 */
public class Rectangle extends GraphicObject {
	float sidea;
	float sideb;
	
	Rectangle(float a, float b) {
		sidea=a;
		sideb=b;
	}
	
	public float calculateArea () {
		return sidea * sideb;
	}
}
