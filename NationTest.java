
public class NationTest {

	public static void main(String[] args) {


		Nation India = new Nation();

		India.setNation("India", "Maharashtra", 2561.09f, "Prem", 'm', 9353838781l);
		//System.out.println(India);

		Nation India1 = new Nation();
		India1.setNation("India", "Karnataka", 21.09f, "Basavaraj", 'M', 9876543121l);
		India.display();
		India1.display();
		//System.out.println(India1);
	}

}

class Person {
	private String name;
	private char gender;
	private long phoneNumber;

	public void setPerson(String name, char gender, long phoneNumber) {
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}
	String getName()
	{
		return name;
	}
	char getGender()
	{
		return gender;
	}
	long getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void display()
	{
		
	}


}


class ChiefMinister extends Person{
	public void administrate()
	{
		System.out.println("administrating ......");
	}
	
	public void display()
	{
		System.out.println("--------------CM Details -------------");
		System.out.println("Name of CM:          "+getName() );
		System.out.println("gender of CM:        "+getGender());
		System.out.println("PhoneNumber of CM:   "+getPhoneNumber());
	}

}
		
class State {
	private String Name;
	private float area;
	private ChiefMinister CM = new ChiefMinister();
	public void setState(String stateName, float area, String name, char gender, long phonNumber) {
		this.area = area;
		this.Name = stateName;
		this.CM.setPerson(name, gender, phonNumber);
	}
	
	public void dislpay()
	{
		System.out.println("-----------State-------------");
		System.out.println("Name Of State:       "+this.Name);
		System.out.println("Size of State:       "+this.area);
		CM.display();
		
	}


}

class Nation {
	private State state = new State();
	private String name;

	public void setNation(String countryName, String stateName, float area, String name, char gender, long phonNumber) {
		this.name = countryName;
		this.state.setState(stateName, area, name, gender, phonNumber);
	}
	public void display()
	{
		System.out.println("---------------Country Details --------------");
		System.out.println("Country Name:        "+name);
		state.dislpay();
	}


}
