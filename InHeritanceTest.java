//
//public class InHeritanceTest {
//	public static void main(String[] args) {
//		Person p =new Person("Prem", "Nippani", "01fe19bcs083");
//		System.out.println(p);
//		System.out.println("-------------------------");
//		Student s =new Student("Ridham", "Udhampur", "01fe19bcs088", 215, 12, 21);
//		System.out.println(s);
//		System.out.println("-------------------------");
//		Employee E =new Employee("Mansi", "Khanapur", "01fe19bcs083", 210, 12, 21, 2110, "Dassault Systems");
//		System.out.println(E);
//		System.out.println("-------------------------");
//	}
//}
//
//
//
//class Person{
//	String name;
//	String city;
//	String adharCard;
//	
//	public Person(String name, String city, String adharCard) {
//		super();
//		this.name = name;
//		this.city = city;
//		this.adharCard = adharCard;
//	}
//
//	
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", city=" + city + ", adharCard=" + adharCard + "]";
//	}
//
//
//	Person()
//	{
//		super();
//		System.out.println("Person() constr called....");
//	}
//}
//
//class Student extends Person{
//	
//	int rollNumber;
//	int standardClass;
//	int marks;
//	
//	
//	public Student(String name, String city, String adharCard, int rollNumber, int standardClass, int marks) {
//		super(name, city, adharCard);
//		this.rollNumber = rollNumber;
//		this.standardClass = standardClass;
//		this.marks = marks;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", city=" + city + ", adharCard=" + adharCard + ", rollNumber=" + rollNumber
//				+ ", standardClass=" + standardClass + ", marks=" + marks + "]";
//	}
//
//
//	Student()
//	{
//		super();
//		System.out.println("Student() constr called....");
//	}
//}
//
//class Employee extends Student{
//	
//	int empId;
//	String company;
//	
//	public Employee(String name, String city, String adharCard, int rollNumber, int standardClass, int marks, int empId,
//			String company) {
//		super(name, city, adharCard, rollNumber, standardClass, marks);
//		this.empId = empId;
//		this.company = company;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [rollNumber=" + rollNumber + ", standardClass=" + standardClass + ", marks=" + marks
//				+ ", name=" + name + ", city=" + city + ", adharCard=" + adharCard + ", empId=" + empId + ", company="
//				+ company + "]";
//	}
//
//	Employee()
//	{
//		super();
//		System.out.println("Employee() constr called....");
//	}
//}