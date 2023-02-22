
public class OverridingTest {
	public static void main(String[] args) {
		Grandfather grandFather=new Grandfather();
		grandFather.wakeup();
		grandFather.doWork();
		System.out.println("...............................");
		Father father = new Father();
		father.wakeup();
		father.doWork();
		System.out.println("...............................");
		Child child = new Child();
		child.wakeup();
		child.doWork();
	}
}


class Grandfather{
	int gold=4;
	int land=10;
	
	void wakeup()
	{
		System.out.println("Grandfather wakes up at 5:30 am");
	}
	
	void doWork()
	{
		System.out.println("GrandaFather does farming .....");
	}
	
}


class Father extends Grandfather{
	
	void wakeup()
	{
		System.out.println("Father wakes up at 6.30 am");
	}
	
	void doWork()
	{
		System.out.println("Father does farming and goes to job.....");
	}
}


class Child extends Father{
	void wakeup()
	{
		System.out.println("Child wakes up at 7:30 am...");
	}
	
	void doWork()
	{
		System.out.println("Child goes to the job....");
	}
}