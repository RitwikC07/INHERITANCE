package inheritance;
 public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Amit", 5000000, 2019, "1234ghij");
		Person person = new Person("Ritwik");
		System.out.println(employee);
		System.out.println(person);
	}
}
