package ecomap.app;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import ecomap.entities.Customer;
import ecomap.entities.Order;
import ecomap.entities.Product;
import ecomap.utility.EcomapUtility;

public class MainApp {

	public static void main(String[] args) {

		Session session = EcomapUtility.getSessionFactory().openSession();

		Customer cust = new Customer();
		cust.setName("Marques Nikolaus");
		cust.setTier(1);

		Order ord = new Order();
		ord.setDelivery_date(LocalDate.of(2021, 02, 28));
		ord.setOrderDate(LocalDate.of(2021, 02, 28));
		ord.setStatus("NEW");
		ord.setCustomer(cust);

		Product pro = new Product();
		pro.setName("omnis quod consequatur");
		pro.setCategory("Games");
		pro.setPrice(184.83);
		Set<Product> productSet = new HashSet<Product>();
		productSet.add(pro);
		ord.setProducts(productSet);
		ord.setCustomer(cust);

		session.beginTransaction();
		session.persist(ord);
		session.getTransaction().commit();

	}

}
