package org.emp;
//QUESTION 1: Create an object for employee class and call above methods also follow the all coding standards.
public class Employee {
//     Methods   :empId(),empName(),empDob(),empPhone(),empEmail(),empAddress()
	private void empId() {
		System.out.println("Employee ID is 52066102");
	}
	
	private void empName() {
		System.out.println("Employee Name is ANAND RAJ D");
	}
	private void empDob() {
		System.out.println("Employee DOB is 01/06/1995");
	}
	private void empEmail() {
		System.out.println("Employee Email is sv.avinash72@gmail.com");
	}
	private void empAddress() {
		System.out.println("Employee Address is Tiruvottiyur");
	}
	public static void main(String[] args) {
		Employee details=new Employee();
		details.empId();
		details.empName();
		details.empDob();
		details.empEmail();
		details.empAddress();
	}
}
