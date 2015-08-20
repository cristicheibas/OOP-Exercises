package oop_exercise8;

/**Subclass of GraphicObject has its' own declared constructor and area calculator
 * @author ccheibas
 *
 */
public class Rectangle extends GraphicObject {
	float sidea;
	float sideb;
	
	Rectangle(float a, float b) {
		super(a, b);
		sidea=a;
		sideb=b;
	}
	
	public float calculateArea (){
		return sidea*sideb;
	}
}
