
public class KiteTest {

	public static void main(String[] args) {
		Kite k1=new Kite(200, "Prem", true,"red");
		Kite k2= new Kite(30, "Ridham", true, "blue");
		Kite.printKites();
		System.out.println(Kite.kiteCount);
		Kite winner = k2.kiteFight(k1);
		System.out.println("the winner of this kite fight is: "+winner.getKiteOwner()+" \n The Number of kites in the sky are:  "+Kite.kiteCount);
		Kite k3=new  Kite(35, "KadamBahi", true, "pink");
		System.out.println("The Number of kites in the sky are:  "+Kite.kiteCount);
	}

}


class Kite{
	//created only once "pre-loaded"
	//it is the data of class and not objects
	static int kiteCount=0;
	
	//belong to each object instance
	private int kiteLength;
	 private String kiteOwner;
	 private boolean flying;//true false
	 private String kiteColor;
	 
	 
	 
	
	public Kite() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Kite(int kiteLength, String kiteOwner, boolean flying, String kiteColor) {
		super();
		this.kiteLength = kiteLength;
		this.kiteOwner = kiteOwner;
		this.flying = flying;
		this.kiteColor = kiteColor;
		kiteCount++;
	}
	
	


	public static void printKites()
	{
		System.out.println("No. of kites :"+kiteCount);
	}

	public int getKiteLength() {
		return kiteLength;
	}
	public void setKiteLength(int kiteLength) {
		this.kiteLength = kiteLength;
	}
	public String getKiteOwner() {
		return kiteOwner;
	}
	public void setKiteOwner(String kiteOwner) {
		this.kiteOwner = kiteOwner;
	}
	public boolean isFlying() {
		return flying;
	}
	public void setFlying(boolean flying) {
		this.flying = flying;
	}
	public String getKiteColor() {
		return kiteColor;
	}
	public void setKiteColor(String kiteColor) {
		this.kiteColor = kiteColor;
	}
	@Override
	public String toString() {
		return "Kite [kiteLength=" + kiteLength + ", kiteOwner=" + kiteOwner + ", flying=" + flying + ", kiteColor="
				+ kiteColor + "]";
	}
	
	Kite kiteFight(Kite x) {
		Kite winner=new Kite();
		System.out.println(this.kiteOwner+" began the kite fight with "+x.kiteOwner);
		
		for(int i=1;i<=20;i++)
		{
			double d=Math.random()%100;
			if(d<0.10)
			{
				kiteCount--;
				this.flying=false;
				break;
				
			}
			else if(d>0.95)
			{
				kiteCount--;
				x.flying=false;
				break;
			}
			else if(d>0.50 && d<0.75) {
				kiteCount--;
				kiteCount--;
				x.flying=false;
				this.flying=false;
				break;
			}
		}
		
		if(this.flying) {
			return this;
		}
		else if(x.flying) {
			return x;
		}
		else {
			winner.setKiteOwner("none");
			return winner;
		}
	}
	
}