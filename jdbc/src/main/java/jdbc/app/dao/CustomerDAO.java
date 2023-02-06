package jdbc.app.dao;

import java.util.List;

import jdbc.app.dto.Customer;

public interface CustomerDAO {
	//create
    public Integer addCustomer(Customer customer);
    
    //retrieve
    public Customer getCustomerById(Integer customerId);
    
    ////retrieve all customers
   
    
    //update
    public Integer updateCustomer(Customer customer);
    
    //delete
    public Integer deleteCustomer(Integer customer);
    
    public String deleteCustomerById(Integer customerId);

	public List<Customer> getCustomers();

	

}
