
public class Greeting {
	public static void main(String[] args) {
		newclass n=new newclass();
		n.getclass(1);
		newclass n2=new newclass();
		n2.getclass(2);
		gift g=new gift();
		boolean b=g.rejecting();
		
		// TODO Auto-generated method stub
		System.out.println("Hello World ! Its Prem");
		System.out.println("1.Java is WORA");
		System.out.println("2.Java is Simple ");
		System.out.println("\tbecause of ");
		System.out.println("\t\tno use of pointers");
		System.out.println("\t\tno memeory management");
		System.out.println("\t\tno need to understand hardware details");
		System.out.println("3.Java is OPPS ");
	}

}

class newclass{
	void getclass(int i)
	{
		System.out.println("new class"+i+" is generated");
	}
}

class joker{
	void gigling()
	{
		System.out.println("jonekr is gigling and cracking jokes");
	}
}

class gift{
	boolean bob;
	boolean accepting()
	{
		bob=true;
		System.out.println("accepted the gift!");
		return bob;
	}
	boolean rejecting()
	{	bob= false;
		System.out.println("dont reject the gift accept the gift and forward it please!");
		return bob;
	}
}