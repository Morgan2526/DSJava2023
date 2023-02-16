

public class BankTest {

	public static void main(String[] args) {
		BankAccount bAccount=new BankAccount();
		BankAccount bAccount1=new BankAccount();
		BankAccount bAccount2=new BankAccount();
		BankAccount bAccount3=new BankAccount();
		BankAccount bAccount4=new BankAccount();

		bAccount.deposit(200);
		bAccount1.deposit(250);
		bAccount2.deposit(300);
		bAccount3.deposit(699);
		bAccount4.deposit(720);
		bAccount.fundTransfer();
	}

}


class BankAccount{
	
	int accountNumber;
	float bankBalance;
	String accountHolder;
	void withdraw()
	{
		System.out.println("Withdrawing Money.....");
	}
	
	void deposit(float amount)
	{
		System.out.println("Depositing money to your account....."+amount);
	}
	
	void fundTransfer()
	{
		System.out.println("tansfering money......");
	}
}
