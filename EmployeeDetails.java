package Assingment3;

public class EmployeeDetails {
	public void details(String empName,int empId) {
		System.out.println(" Emp Name: "+empName);
		System.out.println(" Emp I'd: "+empId);
	}
	public void getEmpAddress(String empAddress) {
		System.out.println(" Emp Address: "+empAddress);
	}
	public void getEmpSalary(double empSalary) {
		System.out.println(" Emp Salary: "+empSalary);
	}
	public void empMobileNumber(long empMobileNumber) {
		System.out.println(" Emp Mobile Number: "+empMobileNumber);
	}
	public static void main(String[] args) {
		EmployeeDetails object= new EmployeeDetails();
		object.details("Almaz", 002);
		object.getEmpAddress("Chennai");
		object.getEmpSalary(30000);
		object.empMobileNumber(9876543210l);
		}
	
}
