package oop_exercise8;


/**The abstract superclass GraphicObject with two abstract constructors and has its' own declared constructor and area calculator
 * @author ccheibas
 * I have decided to overload the constructors to make it look better and
 * override the calculateArea function depending on shape and formula.
 */
abstract class GraphicObject {
	
	GraphicObject(float r){ //circle constructor	
	}
	
	GraphicObject(float a,float b){//rectangle constructor
	}
	
	public float calculateArea(){//area calculator
		return 0;
	}
}
