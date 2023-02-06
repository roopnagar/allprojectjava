package springexample.dependencyinjection;

public class Customer {
	
	private Integer customerId;
	private String customerName;
	private IAddress iaddress;
	public Customer() {
		super();
	}
	public Customer(Integer customerId, String customerName, IAddress iaddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.iaddress = iaddress;
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
	public IAddress getIaddress() {
		return iaddress;
	}
	public void setIaddress(IAddress iaddress) {
		this.iaddress = iaddress;
	}
	
	
}
