package driver;

import Departments.adminDepartment;
import Departments.HrDepartment;
import Departments.techDepartment;

// Driving class Main to create objects and generate output
public class Main {

	public static void main(String[] args) {

		// Creating an object for each of the classes

		adminDepartment admin = new adminDepartment();
		HrDepartment hr = new HrDepartment();
		techDepartment tech = new techDepartment();

		// Calling the methods of each class to generate output

		System.out.println(admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println("\n");       // Leave space between output of each department
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("\n");     
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}
}