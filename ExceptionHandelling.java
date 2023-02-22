import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class ExceptionHandelling {

	public static void main(String[] args) {
		
		try {
		FileInputStream file = new FileInputStream("x.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found!"
					+ "");
		}
		
		//String str = null;
		String str = "dassault systems at pune IT09 Rajive Gandhi IT park";
		//String str = "dassault";
		try {
			
			int array[] = {10,20,30,40,50};
			
			System.out.println("The Array is : "+ Arrays.toString(array));
			
			System.out.println("the array element at 3:"+array[22]);
		System.out.println("the string is " +str);
		System.out.println("the strAt  :"+ str.charAt(9));
		System.out.println("the substring at: "+str.substring(9, 15));
		System.out.println("str up: "+str.toUpperCase());
		System.out.println("str to low: "+str.toLowerCase());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("the array index is out of bounds......");
		}
		catch(NullPointerException e)
		{
			System.out.println("The string is Null.........");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("the index querryed is out of bounds...............");
		}
	}
	
}

