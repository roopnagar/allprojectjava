package jpappwithannotation.service;

import java.util.List;

import jpappwithannotation.dao.DepartmentDAO;
import jpappwithannotation.dao.DepartmentDAOImpl;
import jpappwithannotation.entities.Department;

public class DepartmentServiceImpl implements DepartmentService {
	
	DepartmentDAO departmentDao = new DepartmentDAOImpl();

	public List<Department> getAllDepartment() {
		
		return departmentDao.getAllDepartment();
	}

	public Department getDepartmentById(Integer deptNo) {
		return departmentDao.getDepartmentById(deptNo);
	}

	public void addDepartment(Department department) {
		departmentDao.addDepartment(department);

	}

	public Department updateDepartment(Department department) {
		return departmentDao.updateDepartment(department);
	}

	public void deleteDepartment(Integer deptNo) {
		departmentDao.deleteDepartment(deptNo);

	}

	public Department getDepartmentByName(String deptName) {
		return departmentDao.getDepartmentByName(deptName);
	}

	public Integer updateDepartmentUsingQuery(Department department) {
		return departmentDao.updateDepartmentUsingQuery(department);
	}

	public void deleteDepartmentByName(String deptName) {
		departmentDao.deleteDepartmentByName(deptName);

	}

}
