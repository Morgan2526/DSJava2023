
public class FinalFieldTest {
	
	public static void main(String[] args) {
		final float PI= 3.14f;
		System.out.println("PI : "+PI);
		
		Sun sun= new Sun();
		sun.calculateDistance();
	}	
	
}

class Sun{
	final float SPEED_OF_LIGHT = 186000.519f;
	final int TIME_TO_REACH_EARTH = 480;
	void calculateDistance()
	{
		double distance = SPEED_OF_LIGHT*TIME_TO_REACH_EARTH;
		System.out.println("the distance : "+distance);
	}
}
