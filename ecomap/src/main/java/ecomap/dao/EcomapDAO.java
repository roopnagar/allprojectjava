package ecomap.dao;

import java.util.List;

import ecomap.entities.Customer;
import ecomap.entities.Order;


public interface EcomapDAO {
	public void addOrder(Order order);

	// retrieve
	public Customer getCustomerById(Integer customerId);

	//// retrieve all customers
	public List<Customer> getCustomers();

	// update
	public Integer updateCustomer(Customer customer);

	// delete
	public Integer deleteCustomer(Integer id);

	

}
