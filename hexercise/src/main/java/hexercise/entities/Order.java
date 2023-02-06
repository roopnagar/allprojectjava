package hexercise.entities;

import java.time.LocalDate;
import java.util.List;

public class Order {
	
	private Long id;
	private String status;
	private LocalDate orderdate;
	private LocalDate deliverydate;
	private List<Product> products;
	private Customer customer;
	public Order() {
		super();
	}
	public Order(Long id, String status, LocalDate orderdate, LocalDate deliverydate, List<Product> products,
			Customer customer) {
		super();
		this.id = id;
		this.status = status;
		this.orderdate = orderdate;
		this.deliverydate = deliverydate;
		this.products = products;
		this.customer = customer;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}
	public LocalDate getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(LocalDate deliverydate) {
		this.deliverydate = deliverydate;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + ", orderdate=" + orderdate + ", deliverydate=" + deliverydate
				+ ", products=" + products + ", customer=" + customer + "]";
	}

}
