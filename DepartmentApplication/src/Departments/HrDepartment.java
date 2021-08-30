package Departments;

// Child class HrDepartment containing 4 methods

public class HrDepartment extends superDepartment {
	
	// Method 1 overriding method 1 of parent class
	public String departmentName() {
		String deptName = "Welcome to HR Department";
		return (deptName);
	}
	
	// Method 2 overriding method 2 of parent class
	public String getTodaysWork() {
		String work = "Fill today’s worksheet and mark your attendance";
		return (work);
	}
	
	// Method 3 overriding method 3 of parent class
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		return (deadline);
	}
	
	// Method 4
	public String doActivity() {
		String activity = "team Lunch";
		return (activity);
	}
}