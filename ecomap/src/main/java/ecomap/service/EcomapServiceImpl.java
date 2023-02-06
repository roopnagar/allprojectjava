package ecomap.service;

import java.util.List;

import ecomap.dao.EcomapDAO;
import ecomap.dao.EcomapDAOImpl;
import ecomap.entities.Customer;
import ecomap.entities.Order;

public class EcomapServiceImpl implements EcomapService {
	private EcomapDAO ecomapDao = new EcomapDAOImpl();

	public void addOrder(Order order) {
		ecomapDao.addOrder(order);

	}

	public Customer getCustomerById(Integer customerId) {
		return ecomapDao.getCustomerById(customerId);
	}

	public List<Customer> getCustomers() {
		
		return ecomapDao.getCustomers();
	}

	public Integer updateCustomer(Customer customer) {
		return ecomapDao.updateCustomer(customer);
	}

	public Integer deleteCustomer(Integer customer) {
		return ecomapDao.deleteCustomer(customer);
	}

}
