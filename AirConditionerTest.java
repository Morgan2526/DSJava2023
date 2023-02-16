
public class AirConditionerTest {

	public static void main(String[] args) {
		AirConditioner ac1=new AirConditioner("large", "red", "samsung", 27.9,2);

		ac1.increaseSpeed(3);
		ac1.increaseTemprature(25.5);
		ac1.enSwing();
		ac1.displayAc();
		System.out.println(ac1);
		
		AirConditioner ac2=new AirConditioner("small", "blue", "bluestar", 30.9,3);
		ac2.decreaseTemprature(23.4);
		ac2.decreaseSpeed(2);
		ac2.deSwing();
		ac2.displayAc();
		System.out.println(ac2);

	}

}


class AirConditioner{
	private int acId;
	private String size;
	private String color;
	private float capacity;
	private String company;
	
	AirConditioner(String size,String color,String company,double capacity,int acId)
	{
		this.acId=acId;
		this.size=size;
		this.color=color;
		this.company=company;
		this.capacity=(float) capacity;
	}
	
	void increaseTemprature(double d)
	{
		System.out.println("the temprature of "+acId+" increased to ...."+d);
	}
	
	void decreaseTemprature(double d)
	{ 
		System.out.println("the temprature of "+acId+" decreased to ....."+d);
	}
	
	void enSwing()
	{
		System.out.println("the A/c "+acId+" is in swing mode!");
	}
	
	void deSwing()
	{
		System.out.println("the A/c "+acId+" is not swinging !");
	}
	
	void increaseSpeed(int level)
	{
		System.out.println("the speed of "+acId+" is increased and is at level "+level);
	}
	void decreaseSpeed(int level)
	{
		System.out.println("the speed of "+acId+" is increased and is at level "+level);
	}
	
	
	void displayAc()
	{
		System.out.println("------------------------------------");
		System.out.println("A/c Id               :"+acId);
		System.out.println("A/c size             :"+size);
		System.out.println("A/c color            :"+color);
		System.out.println("A/c capacity         :"+capacity);
		System.out.println("A/c company          :"+company);
		System.out.println("------------------------------------\n");

	}

	@Override
	public String toString() {
		return "AirConditioner [acId=" + acId + ", size=" + size + ", color=" + color + ", capacity=" + capacity
				+ ", company=" + company + "]\n";
	}
	
	
	
}
