package Session9.Assignments4;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class empTester {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		ts.add(new Employee("Rahib", "Cyber Consultant", 60000.00));
		ts.add(new Employee("Alex", "Java Developer", 55000.00));
		ts.add(new Employee("Zair", "HR", 45000.00));
		ts.add(new Employee("Danial", "Marketing Advisor", 50000.00));
		
		System.out.println(ts.toString());
	}
}