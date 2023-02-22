
public class AirConditionerTest {

	public static void main(String[] args) {
		Fan fan=new Fan(1, "Medium", "Burgandy", "Oracle");
		
		fan.increaseSpeed(4);
		fan.decreaseSpeed(3);
		fan.display();
		System.out.println(fan);
		System.out.println("------------------------------------");

		
		
		
		
		AirConditioner ac1=new AirConditioner(2, "Large", "red", "Samsung", 25.05f);

		ac1.increaseSpeed(3);
		ac1.increaseTemprature(25.5);
		ac1.enSwing(4);
		ac1.displayAc();
		System.out.println(ac1);
		
		
//		AirConditioner ac2=new AirConditioner("small", "blue", "bluestar", 30.9,3);
//		ac2.decreaseTemprature(23.4);
//		ac2.decreaseSpeed(2);
//		ac2.deSwing();
//		ac2.displayAc();
//		System.out.println(ac2);
//		
//
//		AirConditioner ac3=new AirConditioner(4,"large");
//		ac3.increaseSpeed(9);
//		ac3.increaseTemprature(35.5);
//		ac3.enSwing(3);
//		ac3.displayAc();
//		System.out.println(ac3);

	}

}


class Fan{
	protected int Id;
	protected String size;
	protected String color;
	protected String company;
	
	public Fan(int id, String size, String color, String company) {

		Id = id;
		this.size = size;
		this.color = color;
		this.company = company;
	}
	
	
	void increaseSpeed(int level)
	{
		System.out.println("the speed of "+Id+" is increased and is at level "+level);
	}
	void decreaseSpeed(int level)
	{
		System.out.println("the speed of "+Id+" is increased and is at level "+level);
	}
	
	
	void display() {
		System.out.println("------------------------------------");
		System.out.println("Fan Id               :"+Id);
		System.out.println("Fan size             :"+size);
		System.out.println("Fan color            :"+color);
		System.out.println("Fan company          :"+company);
		System.out.println("------------------------------------\n");
	}


	@Override
	public String toString() {
		return "Fan [Id=" + Id + ", size=" + size + ", color=" + color + ", company=" + company + "]";
	}
	
	
}




class AirConditioner extends Fan{
	private float capacity;

	public AirConditioner(int id, String size, String color, String company,float capacity) {
		super(id, size, color, company);
		Id = id;
		this.size = size;
		this.color = color;
		this.company = company;
		this.capacity = capacity;
	}

	

	
	

	void increaseTemprature(double d)
	{
		System.out.println("the temprature of "+Id+" increased to ...."+d);
	}
	
	void decreaseTemprature(double d)
	{ 
		System.out.println("the temprature of "+Id+" decreased to ....."+d);
	}
	
	void enSwing()
	{
		System.out.println("the A/c "+Id+" is in swing mode!");
	}
	
	void enSwing(int level)
	{
		System.out.println("the A/c "+Id+" is in swing mode! at level"+level);
	}
	
	void deSwing()
	{
		System.out.println("the A/c "+Id+" is not swinging !");
	}
	
	void increaseSpeed(int level)
	{
		System.out.println("the speed of "+Id+" is increased and is at level "+level);
	}
	void decreaseSpeed(int level)
	{
		System.out.println("the speed of "+Id+" is increased and is at level "+level);
	}
	
	
	void displayAc()
	{
		System.out.println("------------------------------------");
		System.out.println("A/c Id               :"+Id);
		System.out.println("A/c size             :"+size);
		System.out.println("A/c color            :"+color);
		System.out.println("A/c capacity         :"+capacity);
		System.out.println("A/c company          :"+company);
		System.out.println("------------------------------------\n");

	}

	@Override
	public String toString() {
		return "AirConditioner [capacity=" + capacity + ", Id=" + Id + ", size=" + size + ", color=" + color
				+ ", company=" + company + "]";
	}
	
	
	
}
