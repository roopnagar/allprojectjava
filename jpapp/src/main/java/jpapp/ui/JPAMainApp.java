package jpapp.ui;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import jpapp.entity.Department;
import jpapp.entity.Employee;
import jpapp.utility.HibernateUtility;

public class JPAMainApp {

	public static void main(String[] args) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		

		Department dep = new Department();
		Department dept = new Department();

		dep.setDeptName("Marketing");
		dept.setDeptName("IT");
		
		
		session.beginTransaction();
		Employee emp2 = new Employee();
		emp2.setFirstName("Roop");
		emp2.setLastName("Nagar");
		emp2.setSalary(100000);
		emp2.setDepartment(dept);

		Employee emp1 = new Employee();
		emp1.setFirstName("Rohan");
		emp1.setLastName("Bisht");
		emp1.setSalary(50000);
		emp1.setDepartment(dep);

//		Employee employee = session.find(Employee.class, 3);
//		System.out.println(employee);

		

		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(emp2);
		
		empSet.add(emp1);
		
		dep.setEmployee(empSet);
		session.persist(dep);

		session.getTransaction().commit();
	}

}
