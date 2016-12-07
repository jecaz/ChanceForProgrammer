package employee_test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import employee.EmpBusinessLogic;
import employee.EmployeeDetails;

public class TestNGEmployeeDetails {

	EmpBusinessLogic empBusinessLogic;
	EmployeeDetails employee;
	
	@BeforeTest
	public void before(){
		empBusinessLogic = new EmpBusinessLogic();
		employee = new EmployeeDetails();
	}
	
  @Test(priority = 1)
  public void testCalculateAppriasal() {
	  employee.setName("Rajeev");
	  employee.setAge(25);
	  employee.setMonthlySalary(8000);
	  double appraisal = empBusinessLogic.calculateAppraisal(employee);
	  Assert.assertEquals(500, appraisal, 0.0, "500");
  }
  
  //test to check yearly salary
  @Test(priority = 0)
  public void testCalculateYearlySalary() {
	  employee.setName("Rajeev");
	  employee.setAge(25);	
	  employee.setMonthlySalary(8000);
	  double salary = empBusinessLogic.calculateYearlySalary(employee);
	  // Assert.assertEquals(95000, salary, 1000.0, "8000");
	  Assert.assertEquals(96000, salary, 0.0, "8000");
  }
  
}
