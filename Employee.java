package Session9.Assignments4;

public class Employee implements Comparable<Employee>{
	private String name, designation;
	private double salary;

	public Employee(String name, String designation, double salary){
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee: " + name + ", Designation: " + designation + ", salary: " + salary + "\n";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(salary > o.salary){
			return -1;
		}
		else if(salary < o.salary){
			return 1;
		}
		else{
			if(name.compareToIgnoreCase(o.name) == 0){
				return designation.compareToIgnoreCase(o.designation);
			}else{
				return name.compareToIgnoreCase(o.name);
			}
		}
	}

}