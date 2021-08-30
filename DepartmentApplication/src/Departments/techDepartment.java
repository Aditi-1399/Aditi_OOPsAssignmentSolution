package Departments;

// Child class techDepartment containing 4 methods

public class techDepartment extends superDepartment {
	
	// Method 1 overriding method 1 of parent class
	public String departmentName() {
		String deptName = "Welcome to Tech Department";
		return (deptName);
	}
	
	// Method 2 overriding method 2 of parent class
	public String getTodaysWork() {
		String work = "Complete coding of module 1";
		return (work);
	}
	
	// Method 3 overriding method 3 of parent class
	public String getWorkDeadline() {
		String deadline = "Complete by EOD"; 
		return (deadline);
	}
	
	// Method 4 
	public String getTechStackInformation() {
		String info = "Core Java";
		return (info);
	}
}
