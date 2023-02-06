package springexamplewithannotation.models;

import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	private Integer customerId;
	private String customerName;
	private Address address;

	public Customer() {
		super();
	}

	public Customer(Integer customerId, String customerName, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
