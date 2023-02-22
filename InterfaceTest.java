
public class InterfaceTest {
	public static void main(String[] args) {
		
		Human x= new Human();
		
		x.eat();
		x.fear();
		x.feel();
		x.reProduce();
		x.walk();
		x.think();
		x.giveBirth();
		x.sleep();
		
		
		//if we assign the Human objects to some of the interfaces then the interface refence
		//object is only concerned with the function in the interface
		
		
		Sleeping human = new Human();
		human.sleep();
		Whale whale = new Whale();
		
		//the uses of this is ....
		BedRoom getrest = new BedRoom();
		
		getrest.getSomeRestBoth(x, whale);
		
	}
}


class BedRoom{
	void getSomeRest(Human x,Whale y)
	{
		//so we cannot allow human to eat on bed or whale to enter bedroom
		x.eat();
		x.think();
		x.sleep();
		
		y.eat();
		y.sleep();
	}
	
	//sooo
	
	void getSomeRestBoth(Sleeping x,SleepWhileSwimming y)
	{
		x.sleep();
		y.sleepingWhileSwimming();
	}
}


interface Eating{
	void eat() ;
}

interface Sleeping{
	void sleep();
}

interface Reproducing{
	void reProduce();
}

interface Fearing{
	void fear();
}

class Animal implements Eating,Sleeping,Reproducing,Fearing{
	public void eat(){
		System.out.println("animal is eating ......");
	}
	public void sleep()
	{
		System.out.println("animal is sleeping ........");
	}
	public void reProduce() {
		System.out.println("animal is Reproducing...........");
	}
	public void fear()
	{
		System.out.println("animal is feared............");
	}
}


class Mammal extends Animal{
	void giveBirth() {
		System.out.println("Mammal is  giving birth.........");
	}
	void walk() {
		System.out.println("Mammal is walking.............");
	}
}


interface Thinking{
	void think();
}
interface Feeling{
	void feel();
}

class Human extends Mammal implements Thinking,Feeling{
	public void think()
	{
		System.out.println("Human is thinking....");
	}
	
	void walk() {
		System.out.println("Human is walking........");
	}

	
	void giveBirth() {
		System.out.println("Human is giving birth........");
	}

	
	public void eat() {
		System.out.println("Human is eating........");
	}

	
	public void sleep() {
		System.out.println("Human is sleeping........");
	}

	
	public void reProduce() {
		System.out.println("Human is reproducing........");
	}

	
	public void fear() {
		System.out.println("Human is fearing........");
	}

	@Override
	public void feel() {
		System.out.println("Human is Feeling........");
		
	}
}


interface Swimming{
	void swim();
}
interface SleepWhileSwimming extends Swimming{
	void sleepingWhileSwimming();
}

class Whale extends Mammal implements SleepWhileSwimming//or we can give both interfaces else only one child interface
{
	public void swim()
	{
		System.out.println("whale is a mammal and can swim......");
	}
	
	public void sleepingWhileSwimming() {
		System.out.println("whale is a mammal and can sleep while swimming......");
	}
	
	void giveBirth() {
		System.out.println("whale is giving birth........");
	}


	public void eat() {
		System.out.println("whale is eating........");
	}

	
	public void sleep() {
		System.out.println("whale is sleeping........");
	}

	
	public void reProduce() {
		System.out.println("whale is reproducing........");
	}

	
	public void fear() {
		System.out.println("whale is fearing........");
	}
}