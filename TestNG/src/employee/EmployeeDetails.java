package employee;

/*
 * EmployeeDetails class is used to:
	get/set the value of employee's name.
	get/set the value of employee's monthly salary.
	get/set the value of employee's age.
 */

public class EmployeeDetails {
	
	private String name;
	private double monthlySalary;
	private int age;
	
	public String getName() {
		 return name;
	}
	
	public void setName(String name) {
		 this.name = name;
	}
	
	public double getMonthlySalary() {
		 return monthlySalary;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		 this.monthlySalary = monthlySalary;
	}
	
	public int getAge() {
		 return age;
	}
	
	public void setAge(int age) {
		 this.age = age;
	}

}
