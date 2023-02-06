package ecomap.dao;

import java.util.List;

import org.hibernate.Session;

import ecomap.entities.Customer;
import ecomap.entities.Order;
import ecomap.utility.EcomapUtility;

public class EcomapDAOImpl implements EcomapDAO {

	Session session = EcomapUtility.getSessionFactory().openSession();

	public void addOrder(Order order) {
		// TODO Auto-generated method stub

	}

	public Customer getCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
