
public class ExceptionTest {

	public static void main(String[] args) {
		Calculator calci = new Calculator();
		System.out.println(calci.division(100,0));
	}
	
}


class Calculator{
	float division(int x,int y)
	{
		float z=0.0f;
		
		try {
			z=x/y;
		}
		catch(ArithmeticException e)
		{

			System.out.println("not a number");
		}
		return z;
	}
	
	
	
}