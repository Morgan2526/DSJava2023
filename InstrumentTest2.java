
public class InstrumentTest2 {

	public static void main(String[] args) {
		
		
	}

}

abstract class InstrumentOne{
	abstract void use();
}

abstract class MedicalInstrument extends InstrumentOne {
	abstract void steralize();
}

abstract class SharpInstrument extends MedicalInstrument{
	abstract void cut();
}

class Blade extends SharpInstrument{
	void steralize() {
		System.out.println("Steralizing the cutter.........");
	}
	void cut() {
		System.out.println("cutting something...........");
	}
	
	void slice() {
		System.out.println("slicing something......");
	}

	void use() {
	
	}
}

class OneInchBlade extends Blade{
	void performComplicatedSurgery() {
		System.out.println("used in performing detailed surgery.....");
	}
	
}