
public class AbstractTest1 {

	public static void main(String[] args) {
		Circle c1=new Circle(12);
		c1.calculateArea();
		c1.perimeter();
	}

}

/*
 * purpose 1.once you create a abstract class we can't create a object of a
 * abstract class 2. it can have everything but cannot create a object 3.they
 * are used by the child classes
 */

abstract class GeometricShape {
	float area;
	float perimeter;
	abstract void calculateArea();
	abstract void perimeter();
}

class Circle extends GeometricShape {
	float radius;
	static final float PI= 3.14f;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	void calculateArea() {
		area = PI*radius*radius;
		System.out.println("area :"+area);
	}
	void perimeter() {
		perimeter= 2*PI*radius;
		System.out.println("perimeter :"+perimeter);
	}

}

class Square extends GeometricShape{

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void perimeter() {
		// TODO Auto-generated method stub
		
	}
	
}

class Ellipse extends Circle{
	float radius2;

	public Ellipse(float radius, float radius2) {
		super(radius);
		this.radius2 = radius2;
	}
	
	
}
