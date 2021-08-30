package Departments;

//Child class adminDepartment containing 3 methods

public class adminDepartment extends superDepartment {
	
	// Method 1 overriding method 1 of parent class
	public String departmentName() {
		String deptName = "Welcome to Admin Department";
		return (deptName);
	}
	
	// Method 2 overriding method 2 of parent class
	public String getTodaysWork() {
		String work = "Complete your documents Submission";
		return (work);
	}
	
	// Method 3 overriding method 3 of parent class
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return (deadline);
	}
}