import java.time.LocalDate;

public class DatatypeTest {

	public static void main(String[] args) {
		byte i=127;
		LocalDate  date=LocalDate.of(2021,3,30);
		LocalDate now = LocalDate.now();
		
		System.out.println(date+"  "+now);
	}
}
