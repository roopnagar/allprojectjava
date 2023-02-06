package jpappwithannotation.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;

import jpappwithannotation.entities.Department;
import jpappwithannotation.utility.HibernateUtility;

public class DepartmentDAOImpl implements DepartmentDAO {
	
	Session session = HibernateUtility.getSessionFactory().openSession();

	public List<Department> getAllDepartment() {
		
		return session.createQuery("select d from Department d",Department.class).getResultList();
	}

	public Department getDepartmentById(Integer deptNo) {
		session.beginTransaction();
        Department dept = session.get(Department.class, deptNo);
        session.getTransaction().commit();
		return dept;
	}

	public void addDepartment(Department department) {
		session.beginTransaction();
        session.persist(department);
        session.getTransaction().commit();
		
	}

	public Department updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteDepartment(Integer deptNo) {
		session.getTransaction().begin();
        Department d = new Department();
        d.setDeptNo(deptNo);
        session.delete(d);
        session.getTransaction().commit();
		
	}

	public Department getDepartmentByName(String deptName) {
		TypedQuery query = session.getNamedQuery("findDepartmentByName");
        query.setParameter("name",deptName);
        
        Department department =(Department) query.getSingleResult();
		return department;
	}

	public Integer updateDepartmentUsingQuery(Department department) {
		 String query = "Update Department SET deptname=:dName WHERE deptNo=:deptId";
	        session.getTransaction().begin();
	        Query q = session.createQuery(query);
	        q.setParameter("dName", department.getDeptName());
	        q.setParameter("dName", department.getDeptNo());
	        int row = q.executeUpdate();
	        session.getTransaction().commit();
	        if( row > 0 ) {
	            return row;
	        }
	        return null;
	}

	public void deleteDepartmentByName(String deptName) {
		String query = "DELETE Department WHERE deptName=:dName";
		session.getTransaction().begin();
		Query q = session.createQuery(query);
		q.setParameter("dName",deptName);
		int row = q.executeUpdate();
		session.getTransaction().commit();
		
	}

}