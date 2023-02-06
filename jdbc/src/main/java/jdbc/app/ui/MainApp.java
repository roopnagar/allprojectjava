package jdbc.app.ui;

import java.time.LocalDate;


import jdbc.app.dto.Customer;
import jdbc.app.service.CustomerService;
import jdbc.app.service.CustomerServiceImpl;

public class MainApp {

	public static void main(String[] args) {


		CustomerService customerService = new CustomerServiceImpl();
		System.out.println(customerService.getCustomers());
		
		Customer customer1 = new Customer(3,"Roop",LocalDate.of(1991, 04, 30),999999999L,"r@gmail.com");
		
		Integer numberOfRowAdd = customerService.addCustomer(customer1);
		
		
		
		System.out.println(numberOfRowAdd);
		
		
		
		

	}

}
