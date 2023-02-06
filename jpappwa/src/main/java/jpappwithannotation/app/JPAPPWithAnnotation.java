package jpappwithannotation.app;

import jpappwithannotation.entities.Department;
import jpappwithannotation.service.DepartmentService;
import jpappwithannotation.service.DepartmentServiceImpl;

public class JPAPPWithAnnotation {

	public static void main(String[] args) {
		DepartmentService departmentService = new DepartmentServiceImpl();

		// Create
		Department department = new Department();
		department.setDeptName("Mech");
		departmentService.addDepartment(department);

		// Retrieve
		Department dept = departmentService.getDepartmentById(1);
		System.out.println(dept);
		// Retrieve All Department
		System.out.println(departmentService.getAllDepartment());

	}

}
