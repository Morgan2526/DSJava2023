
public class TypesOfFunctions {

		public static void main(String[] args) {
			Functions f= new Functions();
			f.display();
			f.add(5, 6);
			int ans=f.add1(11,12);
			System.out.println("ans :"+ans);
			
			int answer = f.add2();
			System.out.println("answer : "+answer);
		}
}


class Functions{
	//fu8nction without any arguements and no return type
	void display()
	{
		System.out.println("type 1 : void return type display(NO ARGUEMENTS)");
	}
	//function without a return type and argurement type of int 
	void add(int a,int b)
	{
		System.out.println("the result is :"+(a+b));
	}
	
	//function with both return type and arugement
	int add1(int a, int b)
	{
		return a+b;
	}
	//function with no arguemenmts but a return type
	int add2()
	{
		return 50+6;
	}
}