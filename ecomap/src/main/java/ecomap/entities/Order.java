package ecomap.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_info")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	@Column(name = "status")
	private String status;
	@Column(name = "order_date")
	private LocalDate orderDate;
	@Column(name = "delivery_date")
	private LocalDate delivery_date;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "product_orders", joinColumns = { @JoinColumn(name = "orderId") }, inverseJoinColumns = {
			@JoinColumn(name = "productId") })
	@Column(name = "products")
	private Set<Product> products;
	@ManyToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "customer")
	private Customer customer;

	public Order() {
		super();
	}

	public Order(Long id, String status, LocalDate orderDate, LocalDate delivery_date, Set<Product> products,
			Customer customer) {
		super();
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.delivery_date = delivery_date;
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

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(LocalDate delivery_date) {
		this.delivery_date = delivery_date;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
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
		return "Order [id=" + id + ", status=" + status + ", orderDate=" + orderDate + ", delivery_date="
				+ delivery_date + ", products=" + products + ", customer=" + customer + "]";
	}

}
