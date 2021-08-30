package Departments;

// Parent class superDepartment having 4 methods

public class superDepartment {
	
	// Method 1
	public String departmentName() {
		String deptName = "Super Department";
		return (deptName);
	}
	
	// Method 2
	public String getTodaysWork() {
		String work = "No Work as of now";  
		return (work);
	}
	
	// Method 3
	public String getWorkDeadline() {
		String deadline = "Nil";
		return (deadline);
	}
	
	// Method 4
	public String isTodayAHoliday() {
		String holiday = "Today is not a holiday";
		return (holiday);
	}
}