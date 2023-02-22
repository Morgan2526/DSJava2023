
public class InstrumentTest {
	public static void main(String[] args) {

	}
}

abstract class Instrument{
	abstract void use();
}

abstract class MusicalInstrument extends Instrument {
	abstract void play();
}

abstract class StringBasedInstrument extends MusicalInstrument{
	abstract void tuneStrings();
}

class Guitar extends StringBasedInstrument{
	void play() {
		System.out.println("Playing strings of guitar.........");
	}
	void tuneStrings() {
		System.out.println("Tuning of guitar strings...........");
	}
	
	void pluck() {
		System.out.println("Plucking the strings of guitar......");
	}

	void use() {
	
	}
}

class ElectricGuitar extends Guitar{
	void preset() {
		System.out.println("Switching on the presets.....");
	}
	void powerOn() {
		System.out.println("Powering on.....");
	}
	void powerOff() {
		System.out.println("Powering off.....");
	}
}