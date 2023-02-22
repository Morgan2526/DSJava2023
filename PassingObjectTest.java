
public class PassingObjectTest {
	public static void main(String[] args) {
		Curd c1 = new Curd("Cow", "thick", "White", "Sour", 200);
		
		Sugar sugar = new Sugar("White", "Crystal", 100, "very sweet");
		
		Kitchen myKitchen=new Kitchen();
		
		Lassi myLassi=myKitchen.makeLassi(c1, sugar);
		System.out.println("the lassi is ready...."+myLassi);
		
	}
}

class Lassi{
	int quantity;
	String flavour;
	String density;
	public Lassi(int quantity, String flavour, String density) {
		super();
		this.quantity = quantity;
		this.flavour = flavour;
		this.density = density;
	}
	public Lassi() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Lassi : quantity=" + quantity + ", flavour=" + flavour + ", density=" + density ;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	
}

class Kitchen{
	
	Lassi makeLassi(Curd x,Sugar s)
	{
		System.out.println("What is the quantity of ther lassi?\n"+(x.getQuantity()+s.getQuantity()));
		Lassi lassi = new Lassi();
		
		lassi.setQuantity(x.getQuantity()+s.getQuantity());
		lassi.setFlavour(s.getTaste());
		lassi.setDensity(x.getDensity());
		return lassi;
	}
	
}

class Sugar{
	String color;
	String type;
	int quantity;
	String taste;
	public Sugar(String color, String type, int quantity, String taste) {
		super();
		this.color = color;
		this.type = type;
		this.quantity = quantity;
		this.taste = taste;
	}
	@Override
	public String toString() {
		return "Sugar [color=" + color + ", type=" + type + ", quantity=" + quantity + ", taste=" + taste + "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
}
		
		class Curd{
			
			String type;
			String density;
			String color;
			String taste;
			int quantity;
			public Curd(String type, String density, String color, String taste, int quantity) {
				super();
				this.type = type;
				this.density = density;
				this.color = color;
				this.taste = taste;
				this.quantity = quantity;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			public String getDensity() {
				return density;
			}
			public void setDensity(String density) {
				this.density = density;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public String getTaste() {
				return taste;
			}
			public void setTaste(String taste) {
				this.taste = taste;
			}
			public int getQuantity() {
				return quantity;
			}
			public void setQuantity(int quantity) {
				this.quantity = quantity;
			}
			@Override
			public String toString() {
				return "Curd [type=" + type + ", density=" + density + ", color=" + color + ", taste=" + taste
						+ ", quantity=" + quantity + "]";
			}
			
		}

