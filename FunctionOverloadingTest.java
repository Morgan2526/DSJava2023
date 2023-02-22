
public class FunctionOverloadingTest {

	public static void main(String[] args) {
		PhoneBooth pb=new PhoneBooth();
		pb.dial();
		Phone p=new Phone();
		p.dial();
		p.dial((byte)127);
		p.dial(9353838781l);
		p.dial("Prem");
		p.dial((byte)12, 9353838781l);
		p.dial(9590888876l,(byte)91);
		
		
	}
}


class Phone
{
	void dial()
	{
		System.out.println("dail():dailing nowhere!....");
	}
	
	void dial(byte b) {
		System.out.println("dail(byte):dialing intercom....."+b);
	}
	
	void dial(String name) {
		System.out.println("dial(name):dialing by name....."+name);
	}
	void dial(long phoneNumber) {
		System.out.println("dial(phonenumber):dial by a mobile: "+phoneNumber);
	}
	
	void dial(byte countryCode,long phoneNumber) {
		System.out.println("dial(byte,long):dial to a country of code "+countryCode+" to a mobile number "+phoneNumber);
	}
	
	void dial(long phoneNumber,byte countryCode) {
		System.out.println("dial(long, byte):dial to a country of code "+countryCode+" to a mobile number "+phoneNumber);
	}
}

class PhoneBooth extends Phone{
	
	void dial()
	{
		System.out.println("dail() of PhoneBooth :dailing nowhere!....");
	}
	
}