
public class GeometryTest {

	public static void main(String[] args) {
		Cuboid cuboid = new Cuboid(3, 4, 5);
		cuboid.getThreeDArea();
		
		Square square = new Square(5);
		
		GetVolume cuboidArea= new Cuboid(3,4,5);
		cuboidArea.calcVolume();
		
		GetSomeArea getarea = new GetSomeArea();
		//The method getSomeArea(GetVolume, GetThreeDArea) in the type GetSomeArea is not applicable 
		//for the arguments (Square, Cuboid)
		//getarea.getSomeArea(square, cuboid);
		getarea.getSomeArea(cuboid, cuboid);
		
	}
	
}


class GetSomeArea{
	void getSomeArea(GetVolume x,GetThreeDArea y)
	{
		x.calcVolume();
		y.getThreeDArea();
	}
}

interface GetArea{
	void calcArea();
}

interface GetPerimeter{
	void calcPerimeter();
}


class GeometricShape implements GetArea,GetPerimeter{

	public void calcPerimeter() {

	}

	public void calcArea() {

	}
	
}

class Square extends GeometricShape{
	
	private int side;
	
	 public Square(int side) {
		super();
		this.side = side;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public void calcPerimeter()
	{
		System.out.println("the perimeter of square : "+(4*side));
	}
	 public void calcArea() {
		 System.out.println("the Area of square : "+(side*side));
	 }
}

interface GetVolume{
	void calcVolume();
}

interface GetThreeDArea extends GetVolume{
	void getThreeDArea();
}

class Cuboid extends Square implements GetVolume,GetThreeDArea{
     private int side2;
     private int side3;
	public Cuboid(int side, int side2, int side3) {
		super(side);
		this.side2 = side2;
		this.side3 = side3;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int side3) {
		this.side3 = side3;
	}
     
	public void calcVolume() {
		System.out.println("the volume of the cuboid is : "+(getSide()*side2*side3));
	}

	public void getThreeDArea() {
		System.out.println("the surface area of cube is :"+(2*((getSide()*side2)+(side2*side3)+(side3*getSide()))));
		
	}
	
}

