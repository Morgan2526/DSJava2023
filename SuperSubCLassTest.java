
public class SuperSubCLassTest {
	
	public static void main(String[] args) {
		Penguin penguin = new Penguin();
		KingFisher kingFisher = new KingFisher();
		
		penguin.fly();
		penguin.swim();
		kingFisher.fly();
		Birds bird = penguin;
		bird.fly();
		//this is not available because of object slicing
		//bird.swim();
	}

}


class Animal{
	void eat(){
		System.out.println("animal is eating ......");
	}
	void sleep()
	{
		System.out.println("animal is sleeping ........");
	}
	void reProduce() {
		System.out.println("animal is Reproducing...........");
	}
	void fear()
	{
		System.out.println("animal is feared............");
	}
}


class Birds extends Animal {
	void fly() {
		System.out.println("Bird is flying......");
	}
	void giveEggs() {
		System.out.println("bird is giving eggs............");
	}
	void migrate() {
		System.out.println("birds can migrate from one geographic location to another!.............");
	}
	void feedFoodToChildren(){
		System.out.println("birds feed food to their yound ones.........");
	}
}


final class KingFisher extends Birds{
	void huntToGetFish() {
		System.out.println("KingFisher will dive in water to hunt for fishes..................");
	}
	void fly() {
		System.out.println("KingFisher is flying......");
	}
	void giveEggs() {
		System.out.println("KingFisher is giving eggs............");
	}
	
	//functions can also be made finals and will be not allowed to change or override
	final void migrate() {
		System.out.println("KingFisher can migrate from one geographic location to another!.............");
	}
	void feedFoodToChildren(){
		System.out.println("KingFisher feed food to their yound ones.........");
	}
	void eat(){
		System.out.println("KingFisher is eating ......");
	}
	void sleep()
	{
		System.out.println("KingFisher is sleeping ........");
	}
	void reProduce() {
		System.out.println("KingFisher is Reproducing...........");
	}
	void fear()
	{
		System.out.println("KingFisher is feared............");
	}
	
}
//no extension further of this class penguin
final class Penguin extends Birds{
	final void swim() {
		System.out.println("penguin is swimming..........");
	}
	final void fly() {
		System.out.println("Penguin can't fly but swim...........");
	}

	void giveEggs() {
		System.out.println("Penguin is giving eggs............");
	}
	void migrate() {
		System.out.println("Penguin can't migrate from one geographic location to another!.............");
	}
	void feedFoodToChildren(){
		System.out.println("Penguin feed food to their yound ones.........");
	}
	void eat(){
		System.out.println("Penguin is eating ......");
	}
	void sleep()
	{
		System.out.println("Penguin is sleeping ........");
	}
	void reProduce() {
		System.out.println("Penguin is Reproducing...........");
	}
	void fear()
	{
		System.out.println("Penguin is feared............");
	}
	
}

//error
//class ChildPenguin extends Penguin{
//	//The type ChildPenguin cannot subclass the final class Penguin
//}

class Mammal extends Animal{
	void giveBirth() {
		System.out.println("Mammal is  giving birth.........");
	}
	void walk() {
		System.out.println("Mammal is walking.............");
	}
}

class Human extends Mammal{
	void think()
	{
		System.out.println("Human is thinking....");
	}
	
	void walk() {
		System.out.println("Human is walking........");
	}

	
	void giveBirth() {
		System.out.println("Human is giving birth........");
	}

	
	void eat() {
		System.out.println("Human is eating........");
	}

	
	void sleep() {
		System.out.println("Human is sleeping........");
	}

	
	void reProduce() {
		System.out.println("Human is reproducing........");
	}

	
	void fear() {
		System.out.println("Human is fearing........");
	}
}


class Whale extends Mammal
{
	void swim()
	{
		System.out.println("whale is a mammal and can swim......");
	}
	
	
	void giveBirth() {
		System.out.println("whale is giving birth........");
	}


	void eat() {
		System.out.println("whale is eating........");
	}

	
	void sleep() {
		System.out.println("whale is sleeping........");
	}

	
	void reProduce() {
		System.out.println("whale is reproducing........");
	}

	
	void fear() {
		System.out.println("whale is fearing........");
	}
}