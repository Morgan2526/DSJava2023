
public class ExamExceptionTest {

	public static void main(String[] args) {
		Person person = new Person();
		try {
		person.writeExam();
		}
		catch(NotHealthy e)//its mandatory as it is checked and the runtime exception are not mandatory
		{
			System.out.println("handeler1 :"+e);
		}
		catch(AllAnswerDontKnowException e)
		{
			System.out.println("Handler1 : "+e );
		}
		catch(InvigilatorCaughtMeException e) {
			System.out.println("Handler2 : "+e );
		}
		catch(RanOutOfInkInPenExecption e) {
			System.out.println("Handler3 : "+e);
		}
		
	}
	
}

class Person{
	void writeExam() throws NotHealthy{
		System.out.println("Inside the examination Hall");
		double d = Math.random()%10;
		if(d>0.5 && d<0.7) {
			NotHealthy rte = new NotHealthy("i am not well hence Not ATTENDING THE EXAMINATION.......");
			throw rte;
		}
		for(int i=1;i<=20;i++)
		{
			System.out.println("attempting question ......"+i);
			
			if(d<0.10) {
				AllAnswerDontKnowException rte  = new AllAnswerDontKnowException("I dont know this question's paper's answers.......");
				throw rte;
				//System.out.println();
				
			}
			else if(d>0.11 && d<0.2) {
				InvigilatorCaughtMeException rte  = new InvigilatorCaughtMeException("Invigilator caught me cheating........");
				throw rte;
				//System.out.println("attempting question ..."+i);
			}
			else if(d>0.21 && d<0.3) {
				RanOutOfInkInPenExecption rte = new RanOutOfInkInPenExecption("I ran out of ink ..........");
				throw rte;
			}
			
		}
		
		System.out.println("examination is finished ...........");
		
	}
}


class AllAnswerDontKnowException extends RuntimeException{

	public AllAnswerDontKnowException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class InvigilatorCaughtMeException extends RuntimeException{

	public InvigilatorCaughtMeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class RanOutOfInkInPenExecption extends RuntimeException{

	public RanOutOfInkInPenExecption(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}


//exception is the checked exception and it is mandatory to check this exception..
class NotHealthy extends Exception{

	public NotHealthy(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}


