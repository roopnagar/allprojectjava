package jdbc.app.service;

import java.util.List;

import jdbc.app.dao.CustomerDAO;
import jdbc.app.dao.CustomerDAOImpl;
import jdbc.app.dto.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO customerDao = new CustomerDAOImpl();

	public Customer getCustomerById(Integer customerId) {
		
		return customerDao.getCustomerById(customerId);
	}

	public List<Customer> getCustomers() {
		
		return customerDao.getCustomers();
	}

	public Integer addCustomer(Customer customer) {
		
		return customerDao.addCustomer(customer);
	}

	public Integer deleteCustomer(Integer customer) {
		
		return customerDao.deleteCustomer(customer);
	}

	public Integer updateCustomer(Customer customer) {
		
		return customerDao.updateCustomer(customer);
	}
	
	public List<Customer> getAllCustomer(){
		return null;
	}

}
